package com.robinhood.shared.common.agreementview;

import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.AnimationModifier;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.foundation.Background3;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.p011ui.unit.IntSize;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.markdown.compose.MarkdownStyle;
import com.robinhood.android.wires.p278ui.WiresInvalidAccountContentComposable;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoButtons;
import com.robinhood.compose.bento.component.BentoDivider;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.text.BentoMarkdownText;
import com.robinhood.compose.bento.component.text.BentoMarkdownText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.utils.extensions.ResourceTypes;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContextImpl6;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: MarkdownTextAgreement.kt */
@Metadata(m3635d1 = {"\u00000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001ac\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u0007¢\u0006\u0002\u0010\u0010¨\u0006\u0011²\u0006\n\u0010\u0012\u001a\u00020\u0005X\u008a\u008e\u0002²\u0006\n\u0010\u0013\u001a\u00020\u0005X\u008a\u0084\u0002"}, m3636d2 = {"MarkdownTextAgreement", "", "markdownText", "", "loading", "", "onAgreeClicked", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", WiresInvalidAccountContentComposable.SecondaryButtonTag, "Lcom/robinhood/shared/common/agreementview/SecondaryButton;", "overrideButtonText", "buttonDisclosureText", ResourceTypes.STYLE, "Lcom/robinhood/android/markdown/compose/MarkdownStyle;", "(Ljava/lang/String;ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Lcom/robinhood/shared/common/agreementview/SecondaryButton;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/android/markdown/compose/MarkdownStyle;Landroidx/compose/runtime/Composer;II)V", "lib-agreement-view_externalDebug", "hasScrolledToBottom", "canScrollForward"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.common.agreementview.MarkdownTextAgreementKt, reason: use source file name */
/* loaded from: classes26.dex */
public final class MarkdownTextAgreement {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MarkdownTextAgreement$lambda$14(String str, boolean z, Function0 function0, Modifier modifier, MarkdownTextAgreement7 markdownTextAgreement7, String str2, String str3, MarkdownStyle markdownStyle, int i, int i2, Composer composer, int i3) {
        MarkdownTextAgreement(str, z, function0, modifier, markdownTextAgreement7, str2, str3, markdownStyle, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0365  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x03ad  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x03b9  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x03bd  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x03ea  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0408  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x043d  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x044b  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0462  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x047c  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x048e  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x04af  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x04b2  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x04cd  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0515  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0543  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x056d  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0586  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0599  */
    /* JADX WARN: Removed duplicated region for block: B:216:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0113  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void MarkdownTextAgreement(final String markdownText, boolean z, final Function0<Unit> onAgreeClicked, Modifier modifier, MarkdownTextAgreement7 markdownTextAgreement7, String str, String str2, MarkdownStyle markdownStyle, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        final MarkdownTextAgreement7 markdownTextAgreement72;
        int i5;
        String str3;
        int i6;
        String str4;
        MarkdownStyle style;
        final String str5;
        Object objRememberedValue;
        Composer.Companion companion;
        final CoroutineScope coroutineScope;
        final ScrollState scrollStateRememberScrollState;
        Object objRememberedValue2;
        SnapshotState snapshotState;
        Object objRememberedValue3;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        int currentCompositeKeyHash2;
        Composer composerM6388constructorimpl2;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2;
        MarkdownTextAgreement7 markdownTextAgreement73;
        boolean zChangedInstance;
        Object objRememberedValue4;
        int currentCompositeKeyHash3;
        Composer composerM6388constructorimpl3;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3;
        Composer composer2;
        boolean z2;
        boolean z3;
        String strStringResource;
        float fM21590getDefaultD9Ej5fM;
        boolean zChangedInstance2;
        Object objRememberedValue5;
        final SnapshotState snapshotState2;
        SnapshotState snapshotState3;
        final boolean z4;
        Continuation continuation;
        boolean zChanged;
        Object objRememberedValue6;
        final String str6;
        final String str7;
        final MarkdownStyle markdownStyle2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        int i7;
        Intrinsics.checkNotNullParameter(markdownText, "markdownText");
        Intrinsics.checkNotNullParameter(onAgreeClicked, "onAgreeClicked");
        Composer composerStartRestartGroup = composer.startRestartGroup(945412118);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(markdownText) ? 4 : 2) | i;
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
            i3 |= composerStartRestartGroup.changedInstance(onAgreeClicked) ? 256 : 128;
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
            if (i4 != 0) {
                if ((i & 24576) == 0) {
                    markdownTextAgreement72 = markdownTextAgreement7;
                    i3 |= composerStartRestartGroup.changed(markdownTextAgreement72) ? 16384 : 8192;
                }
                i5 = i2 & 32;
                if (i5 != 0) {
                    i3 |= 196608;
                    str3 = str;
                } else {
                    str3 = str;
                    if ((i & 196608) == 0) {
                        i3 |= composerStartRestartGroup.changed(str3) ? 131072 : 65536;
                    }
                }
                i6 = i2 & 64;
                if (i6 != 0) {
                    i3 |= 1572864;
                    str4 = str2;
                } else {
                    str4 = str2;
                    if ((i & 1572864) == 0) {
                        i3 |= composerStartRestartGroup.changed(str4) ? 1048576 : 524288;
                    }
                }
                if ((i & 12582912) == 0) {
                    if ((i2 & 128) != 0) {
                        i7 = 4194304;
                        i3 |= i7;
                    } else {
                        if ((16777216 & i) == 0 ? composerStartRestartGroup.changed(markdownStyle) : composerStartRestartGroup.changedInstance(markdownStyle)) {
                            i7 = 8388608;
                        }
                        i3 |= i7;
                    }
                }
                if ((4793491 & i3) == 4793490 && composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.skipToGroupEnd();
                    Modifier modifier4 = modifier2;
                    str6 = str4;
                    modifier3 = modifier4;
                    z4 = z;
                    str7 = str3;
                    markdownStyle2 = markdownStyle;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                        if (i8 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i4 != 0) {
                            markdownTextAgreement72 = null;
                        }
                        if (i5 != 0) {
                            str3 = null;
                        }
                        if (i6 != 0) {
                            str4 = null;
                        }
                        if ((i2 & 128) == 0) {
                            i3 &= -29360129;
                            style = BentoMarkdownText.INSTANCE.getStyle(composerStartRestartGroup, BentoMarkdownText.$stable);
                        }
                        int i9 = i3;
                        str5 = str4;
                        String str8 = str3;
                        Modifier modifier5 = modifier2;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(945412118, i9, -1, "com.robinhood.shared.common.agreementview.MarkdownTextAgreement (MarkdownTextAgreement.kt:48)");
                        }
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        companion = Composer.INSTANCE;
                        if (objRememberedValue == companion.getEmpty()) {
                            objRememberedValue = EffectsKt.createCompositionCoroutineScope(CoroutineContextImpl6.INSTANCE, composerStartRestartGroup);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        coroutineScope = (CoroutineScope) objRememberedValue;
                        scrollStateRememberScrollState = ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1);
                        composerStartRestartGroup.startReplaceGroup(1849434622);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue2 == companion.getEmpty()) {
                            objRememberedValue2 = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        snapshotState = (SnapshotState) objRememberedValue2;
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.startReplaceGroup(1849434622);
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue3 == companion.getEmpty()) {
                            objRememberedValue3 = SnapshotStateKt.derivedStateOf(new Function0() { // from class: com.robinhood.shared.common.agreementview.MarkdownTextAgreementKt$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Boolean.valueOf(scrollStateRememberScrollState.getCanScrollForward());
                                }
                            });
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        }
                        SnapshotState4 snapshotState4 = (SnapshotState4) objRememberedValue3;
                        composerStartRestartGroup.endReplaceGroup();
                        Arrangement arrangement = Arrangement.INSTANCE;
                        Arrangement.Vertical top = arrangement.getTop();
                        Alignment.Companion companion2 = Alignment.INSTANCE;
                        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion2.getStart(), composerStartRestartGroup, 0);
                        currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier5);
                        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion3.getConstructor();
                        if (composerStartRestartGroup.getApplier() == null) {
                            Composables.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                        MarkdownStyle markdownStyle3 = style;
                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                        setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                        Column6 column6 = Column6.INSTANCE;
                        Modifier.Companion companion4 = Modifier.INSTANCE;
                        Modifier modifierM21619defaultFillMaxWidthPadding3ABfNKs$default = PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(ScrollKt.verticalScroll$default(Column5.weight$default(column6, companion4, 1.0f, false, 2, null), scrollStateRememberScrollState, false, null, false, 14, null), 0.0f, 1, null);
                        MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), composerStartRestartGroup, 0);
                        currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM21619defaultFillMaxWidthPadding3ABfNKs$default);
                        Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                        if (composerStartRestartGroup.getApplier() == null) {
                            Composables.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.useNode();
                        } else {
                            composerStartRestartGroup.createNode(constructor2);
                        }
                        composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                        Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy2, companion3.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                        setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                        if (!composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                            composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                            composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
                        BentoMarkdownText2.BentoMarkdownText(markdownText, (Modifier) null, markdownStyle3, (Function0<Unit>) null, (Function1<? super String, Unit>) null, composerStartRestartGroup, (i9 & 14) | (MarkdownStyle.$stable << 6) | ((i9 >> 15) & 896), 26);
                        composerStartRestartGroup.endNode();
                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                        int i10 = BentoTheme.$stable;
                        markdownTextAgreement73 = markdownTextAgreement72;
                        BentoDivider.m20635BentoHorizontalDivideraMcp0Q(null, Color.m6705copywmQWz5c$default(bentoTheme.getColors(composerStartRestartGroup, i10).m21373getBg30d7_KjU(), !MarkdownTextAgreement$lambda$5(snapshotState4) ? 1.0f : 0.0f, 0.0f, 0.0f, 0.0f, 14, null), 0.0f, composerStartRestartGroup, 0, 5);
                        composerStartRestartGroup.startReplaceGroup(-1633490746);
                        zChangedInstance = composerStartRestartGroup.changedInstance(coroutineScope) | composerStartRestartGroup.changed(scrollStateRememberScrollState);
                        objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                        if (!zChangedInstance || objRememberedValue4 == companion.getEmpty()) {
                            objRememberedValue4 = new Function2() { // from class: com.robinhood.shared.common.agreementview.MarkdownTextAgreementKt$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return MarkdownTextAgreement.MarkdownTextAgreement$lambda$12$lambda$8$lambda$7(coroutineScope, scrollStateRememberScrollState, (IntSize) obj, (IntSize) obj2);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        Modifier modifierM4872backgroundbw27NRU$default = Background3.m4872backgroundbw27NRU$default(AnimationModifier.animateContentSize$default(companion4, null, (Function2) objRememberedValue4, 1, null), bentoTheme.getColors(composerStartRestartGroup, i10).m21371getBg0d7_KjU(), null, 2, null);
                        MeasurePolicy measurePolicyColumnMeasurePolicy3 = Column2.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), composerStartRestartGroup, 0);
                        currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM4872backgroundbw27NRU$default);
                        Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
                        if (composerStartRestartGroup.getApplier() == null) {
                            Composables.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.useNode();
                        } else {
                            composerStartRestartGroup.createNode(constructor3);
                        }
                        composerM6388constructorimpl3 = Updater.m6388constructorimpl(composerStartRestartGroup);
                        Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyColumnMeasurePolicy3, companion3.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion3.getSetResolvedCompositionLocals());
                        setCompositeKeyHash3 = companion3.getSetCompositeKeyHash();
                        if (!composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                            composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                            composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion3.getSetModifier());
                        composerStartRestartGroup.startReplaceGroup(1617212805);
                        if (str5 == null) {
                            z2 = true;
                            AnimatedVisibilityKt.AnimatedVisibility(column6, MarkdownTextAgreement$lambda$1(snapshotState), (Modifier) null, EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null), EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null), (String) null, ComposableLambda3.rememberComposableLambda(-1576856128, true, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: com.robinhood.shared.common.agreementview.MarkdownTextAgreementKt$MarkdownTextAgreement$1$3$1
                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer3, Integer num) {
                                    invoke(animatedVisibilityScope, composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer3, int i11) {
                                    Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1576856128, i11, -1, "com.robinhood.shared.common.agreementview.MarkdownTextAgreement.<anonymous>.<anonymous>.<anonymous> (MarkdownTextAgreement.kt:95)");
                                    }
                                    Modifier.Companion companion5 = Modifier.INSTANCE;
                                    BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                                    int i12 = BentoTheme.$stable;
                                    BentoText2.m20747BentoText38GnDrw(str5, PaddingKt.m21621defaultFillMaxWidthPaddingVpY3zN4$default(companion5, bentoTheme2.getSpacing(composer3, i12).m21590getDefaultD9Ej5fM(), 0.0f, 2, null), Color.m6701boximpl(bentoTheme2.getColors(composer3, i12).m21426getFg20d7_KjU()), null, null, null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, null, composer3, 0, 0, 16312);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composerStartRestartGroup, 54), composerStartRestartGroup, 1600518, 18);
                            composer2 = composerStartRestartGroup;
                        } else {
                            composer2 = composerStartRestartGroup;
                            z2 = true;
                        }
                        composer2.endReplaceGroup();
                        if (MarkdownTextAgreement$lambda$1(snapshotState)) {
                            z3 = false;
                            composer2.startReplaceGroup(-1404843693);
                            strStringResource = StringResources_androidKt.stringResource(C11048R.string.general_action_review, composer2, 0);
                            composer2.endReplaceGroup();
                        } else {
                            composer2.startReplaceGroup(-1404961090);
                            if (str8 == null) {
                                z3 = false;
                                strStringResource = StringResources_androidKt.stringResource(C11048R.string.general_action_agree, composer2, 0);
                            } else {
                                z3 = false;
                                strStringResource = str8;
                            }
                            composer2.endReplaceGroup();
                        }
                        float fM21590getDefaultD9Ej5fM2 = bentoTheme.getSpacing(composer2, i10).m21590getDefaultD9Ej5fM();
                        if (markdownTextAgreement73 == null) {
                            composer2.startReplaceGroup(-1404576473);
                            fM21590getDefaultD9Ej5fM = bentoTheme.getSpacing(composer2, i10).m21593getSmallD9Ej5fM();
                            composer2.endReplaceGroup();
                        } else {
                            composer2.startReplaceGroup(-1404499035);
                            fM21590getDefaultD9Ej5fM = bentoTheme.getSpacing(composer2, i10).m21590getDefaultD9Ej5fM();
                            composer2.endReplaceGroup();
                        }
                        Modifier modifierM21620defaultFillMaxWidthPaddingVpY3zN4 = PaddingKt.m21620defaultFillMaxWidthPaddingVpY3zN4(companion4, fM21590getDefaultD9Ej5fM2, fM21590getDefaultD9Ej5fM);
                        composer2.startReplaceGroup(-1224400529);
                        zChangedInstance2 = ((i9 & 896) != 256 ? z2 : z3) | composer2.changedInstance(coroutineScope) | composer2.changed(scrollStateRememberScrollState);
                        objRememberedValue5 = composer2.rememberedValue();
                        if (!zChangedInstance2 || objRememberedValue5 == companion.getEmpty()) {
                            snapshotState2 = snapshotState;
                            objRememberedValue5 = new Function0() { // from class: com.robinhood.shared.common.agreementview.MarkdownTextAgreementKt$$ExternalSyntheticLambda2
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return MarkdownTextAgreement.MarkdownTextAgreement$lambda$12$lambda$11$lambda$10$lambda$9(onAgreeClicked, coroutineScope, snapshotState2, scrollStateRememberScrollState);
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue5);
                        } else {
                            snapshotState2 = snapshotState;
                        }
                        composer2.endReplaceGroup();
                        Composer composer3 = composer2;
                        snapshotState3 = snapshotState2;
                        BentoButtonKt.m20586BentoButtonEikTQX8((Function0) objRememberedValue5, strStringResource, modifierM21620defaultFillMaxWidthPaddingVpY3zN4, null, null, false, z, null, null, null, null, false, null, composer3, (i9 << 15) & 3670016, 0, 8120);
                        z4 = z;
                        composerStartRestartGroup = composer3;
                        composerStartRestartGroup.startReplaceGroup(1617266071);
                        markdownTextAgreement72 = markdownTextAgreement73;
                        if (markdownTextAgreement72 == null) {
                            continuation = null;
                            AnimatedVisibilityKt.AnimatedVisibility(column6, MarkdownTextAgreement$lambda$1(snapshotState3), (Modifier) null, EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null), EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null), (String) null, ComposableLambda3.rememberComposableLambda(424334249, true, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: com.robinhood.shared.common.agreementview.MarkdownTextAgreementKt$MarkdownTextAgreement$1$3$3
                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer4, Integer num) {
                                    invoke(animatedVisibilityScope, composer4, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer4, int i11) {
                                    Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(424334249, i11, -1, "com.robinhood.shared.common.agreementview.MarkdownTextAgreement.<anonymous>.<anonymous>.<anonymous> (MarkdownTextAgreement.kt:138)");
                                    }
                                    BentoButtonKt.m20586BentoButtonEikTQX8(markdownTextAgreement72.getOnClick(), markdownTextAgreement72.getButtonText(), PaddingKt.m21621defaultFillMaxWidthPaddingVpY3zN4$default(Modifier.INSTANCE, 0.0f, BentoTheme.INSTANCE.getSpacing(composer4, BentoTheme.$stable).m21590getDefaultD9Ej5fM(), 1, null), null, BentoButtons.Type.Secondary, !z4, false, null, null, null, null, false, null, composer4, 24576, 0, 8136);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composerStartRestartGroup, 54), composerStartRestartGroup, 1600518, 18);
                            composerStartRestartGroup = composerStartRestartGroup;
                        } else {
                            continuation = null;
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endNode();
                        Boolean boolValueOf = Boolean.valueOf(MarkdownTextAgreement$lambda$5(snapshotState4));
                        composerStartRestartGroup.startReplaceGroup(-1633490746);
                        zChanged = composerStartRestartGroup.changed(scrollStateRememberScrollState);
                        objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                        if (!zChanged || objRememberedValue6 == companion.getEmpty()) {
                            objRememberedValue6 = new MarkdownTextAgreement6(scrollStateRememberScrollState, snapshotState3, continuation);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        EffectsKt.LaunchedEffect(boolValueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue6, composerStartRestartGroup, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        str6 = str5;
                        str7 = str8;
                        markdownStyle2 = markdownStyle3;
                        modifier3 = modifier5;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        if ((i2 & 128) != 0) {
                            i3 &= -29360129;
                        }
                    }
                    style = markdownStyle;
                    int i92 = i3;
                    str5 = str4;
                    String str82 = str3;
                    Modifier modifier52 = modifier2;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                    }
                    coroutineScope = (CoroutineScope) objRememberedValue;
                    scrollStateRememberScrollState = ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1);
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 == companion.getEmpty()) {
                    }
                    snapshotState = (SnapshotState) objRememberedValue2;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue3 == companion.getEmpty()) {
                    }
                    SnapshotState4 snapshotState42 = (SnapshotState4) objRememberedValue3;
                    composerStartRestartGroup.endReplaceGroup();
                    Arrangement arrangement2 = Arrangement.INSTANCE;
                    Arrangement.Vertical top2 = arrangement2.getTop();
                    Alignment.Companion companion22 = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyColumnMeasurePolicy4 = Column2.columnMeasurePolicy(top2, companion22.getStart(), composerStartRestartGroup, 0);
                    currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier4 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier52);
                    ComposeUiNode.Companion companion32 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor4 = companion32.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                    }
                    composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                    MarkdownStyle markdownStyle32 = style;
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy4, companion32.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap4, companion32.getSetResolvedCompositionLocals());
                    setCompositeKeyHash = companion32.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl.getInserting()) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier4, companion32.getSetModifier());
                        Column6 column62 = Column6.INSTANCE;
                        Modifier.Companion companion42 = Modifier.INSTANCE;
                        Modifier modifierM21619defaultFillMaxWidthPadding3ABfNKs$default2 = PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(ScrollKt.verticalScroll$default(Column5.weight$default(column62, companion42, 1.0f, false, 2, null), scrollStateRememberScrollState, false, null, false, 14, null), 0.0f, 1, null);
                        MeasurePolicy measurePolicyColumnMeasurePolicy22 = Column2.columnMeasurePolicy(arrangement2.getTop(), companion22.getStart(), composerStartRestartGroup, 0);
                        currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap22 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier22 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM21619defaultFillMaxWidthPadding3ABfNKs$default2);
                        Function0<ComposeUiNode> constructor22 = companion32.getConstructor();
                        if (composerStartRestartGroup.getApplier() == null) {
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                        }
                        composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                        Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy22, companion32.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap22, companion32.getSetResolvedCompositionLocals());
                        setCompositeKeyHash2 = companion32.getSetCompositeKeyHash();
                        if (!composerM6388constructorimpl2.getInserting()) {
                            composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                            composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier22, companion32.getSetModifier());
                            BentoMarkdownText2.BentoMarkdownText(markdownText, (Modifier) null, markdownStyle32, (Function0<Unit>) null, (Function1<? super String, Unit>) null, composerStartRestartGroup, (i92 & 14) | (MarkdownStyle.$stable << 6) | ((i92 >> 15) & 896), 26);
                            composerStartRestartGroup.endNode();
                            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                            int i102 = BentoTheme.$stable;
                            markdownTextAgreement73 = markdownTextAgreement72;
                            BentoDivider.m20635BentoHorizontalDivideraMcp0Q(null, Color.m6705copywmQWz5c$default(bentoTheme2.getColors(composerStartRestartGroup, i102).m21373getBg30d7_KjU(), !MarkdownTextAgreement$lambda$5(snapshotState42) ? 1.0f : 0.0f, 0.0f, 0.0f, 0.0f, 14, null), 0.0f, composerStartRestartGroup, 0, 5);
                            composerStartRestartGroup.startReplaceGroup(-1633490746);
                            zChangedInstance = composerStartRestartGroup.changedInstance(coroutineScope) | composerStartRestartGroup.changed(scrollStateRememberScrollState);
                            objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                            if (!zChangedInstance) {
                                objRememberedValue4 = new Function2() { // from class: com.robinhood.shared.common.agreementview.MarkdownTextAgreementKt$$ExternalSyntheticLambda1
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        return MarkdownTextAgreement.MarkdownTextAgreement$lambda$12$lambda$8$lambda$7(coroutineScope, scrollStateRememberScrollState, (IntSize) obj, (IntSize) obj2);
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                                composerStartRestartGroup.endReplaceGroup();
                                Modifier modifierM4872backgroundbw27NRU$default2 = Background3.m4872backgroundbw27NRU$default(AnimationModifier.animateContentSize$default(companion42, null, (Function2) objRememberedValue4, 1, null), bentoTheme2.getColors(composerStartRestartGroup, i102).m21371getBg0d7_KjU(), null, 2, null);
                                MeasurePolicy measurePolicyColumnMeasurePolicy32 = Column2.columnMeasurePolicy(arrangement2.getTop(), companion22.getStart(), composerStartRestartGroup, 0);
                                currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                CompositionLocalMap currentCompositionLocalMap32 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier32 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM4872backgroundbw27NRU$default2);
                                Function0<ComposeUiNode> constructor32 = companion32.getConstructor();
                                if (composerStartRestartGroup.getApplier() == null) {
                                }
                                composerStartRestartGroup.startReusableNode();
                                if (composerStartRestartGroup.getInserting()) {
                                }
                                composerM6388constructorimpl3 = Updater.m6388constructorimpl(composerStartRestartGroup);
                                Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyColumnMeasurePolicy32, companion32.getSetMeasurePolicy());
                                Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap32, companion32.getSetResolvedCompositionLocals());
                                setCompositeKeyHash3 = companion32.getSetCompositeKeyHash();
                                if (!composerM6388constructorimpl3.getInserting()) {
                                    composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                    composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                                    Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier32, companion32.getSetModifier());
                                    composerStartRestartGroup.startReplaceGroup(1617212805);
                                    if (str5 == null) {
                                    }
                                    composer2.endReplaceGroup();
                                    if (MarkdownTextAgreement$lambda$1(snapshotState)) {
                                    }
                                    float fM21590getDefaultD9Ej5fM22 = bentoTheme2.getSpacing(composer2, i102).m21590getDefaultD9Ej5fM();
                                    if (markdownTextAgreement73 == null) {
                                    }
                                    Modifier modifierM21620defaultFillMaxWidthPaddingVpY3zN42 = PaddingKt.m21620defaultFillMaxWidthPaddingVpY3zN4(companion42, fM21590getDefaultD9Ej5fM22, fM21590getDefaultD9Ej5fM);
                                    composer2.startReplaceGroup(-1224400529);
                                    zChangedInstance2 = ((i92 & 896) != 256 ? z2 : z3) | composer2.changedInstance(coroutineScope) | composer2.changed(scrollStateRememberScrollState);
                                    objRememberedValue5 = composer2.rememberedValue();
                                    if (zChangedInstance2) {
                                        snapshotState2 = snapshotState;
                                        objRememberedValue5 = new Function0() { // from class: com.robinhood.shared.common.agreementview.MarkdownTextAgreementKt$$ExternalSyntheticLambda2
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                return MarkdownTextAgreement.MarkdownTextAgreement$lambda$12$lambda$11$lambda$10$lambda$9(onAgreeClicked, coroutineScope, snapshotState2, scrollStateRememberScrollState);
                                            }
                                        };
                                        composer2.updateRememberedValue(objRememberedValue5);
                                        composer2.endReplaceGroup();
                                        Composer composer32 = composer2;
                                        snapshotState3 = snapshotState2;
                                        BentoButtonKt.m20586BentoButtonEikTQX8((Function0) objRememberedValue5, strStringResource, modifierM21620defaultFillMaxWidthPaddingVpY3zN42, null, null, false, z, null, null, null, null, false, null, composer32, (i92 << 15) & 3670016, 0, 8120);
                                        z4 = z;
                                        composerStartRestartGroup = composer32;
                                        composerStartRestartGroup.startReplaceGroup(1617266071);
                                        markdownTextAgreement72 = markdownTextAgreement73;
                                        if (markdownTextAgreement72 == null) {
                                        }
                                        composerStartRestartGroup.endReplaceGroup();
                                        composerStartRestartGroup.endNode();
                                        composerStartRestartGroup.endNode();
                                        Boolean boolValueOf2 = Boolean.valueOf(MarkdownTextAgreement$lambda$5(snapshotState42));
                                        composerStartRestartGroup.startReplaceGroup(-1633490746);
                                        zChanged = composerStartRestartGroup.changed(scrollStateRememberScrollState);
                                        objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                                        if (!zChanged) {
                                            objRememberedValue6 = new MarkdownTextAgreement6(scrollStateRememberScrollState, snapshotState3, continuation);
                                            composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                                            composerStartRestartGroup.endReplaceGroup();
                                            EffectsKt.LaunchedEffect(boolValueOf2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue6, composerStartRestartGroup, 0);
                                            if (ComposerKt.isTraceInProgress()) {
                                            }
                                            str6 = str5;
                                            str7 = str82;
                                            markdownStyle2 = markdownStyle32;
                                            modifier3 = modifier52;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                Composer composer4 = composerStartRestartGroup;
                final MarkdownTextAgreement7 markdownTextAgreement74 = markdownTextAgreement72;
                scopeUpdateScopeEndRestartGroup = composer4.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.common.agreementview.MarkdownTextAgreementKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return MarkdownTextAgreement.MarkdownTextAgreement$lambda$14(markdownText, z4, onAgreeClicked, modifier3, markdownTextAgreement74, str7, str6, markdownStyle2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 24576;
            markdownTextAgreement72 = markdownTextAgreement7;
            i5 = i2 & 32;
            if (i5 != 0) {
            }
            i6 = i2 & 64;
            if (i6 != 0) {
            }
            if ((i & 12582912) == 0) {
            }
            if ((4793491 & i3) == 4793490) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i8 != 0) {
                    }
                    if (i4 != 0) {
                    }
                    if (i5 != 0) {
                    }
                    if (i6 != 0) {
                    }
                    if ((i2 & 128) == 0) {
                        style = markdownStyle;
                    }
                    int i922 = i3;
                    str5 = str4;
                    String str822 = str3;
                    Modifier modifier522 = modifier2;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                    }
                    coroutineScope = (CoroutineScope) objRememberedValue;
                    scrollStateRememberScrollState = ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1);
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 == companion.getEmpty()) {
                    }
                    snapshotState = (SnapshotState) objRememberedValue2;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue3 == companion.getEmpty()) {
                    }
                    SnapshotState4 snapshotState422 = (SnapshotState4) objRememberedValue3;
                    composerStartRestartGroup.endReplaceGroup();
                    Arrangement arrangement22 = Arrangement.INSTANCE;
                    Arrangement.Vertical top22 = arrangement22.getTop();
                    Alignment.Companion companion222 = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyColumnMeasurePolicy42 = Column2.columnMeasurePolicy(top22, companion222.getStart(), composerStartRestartGroup, 0);
                    currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap42 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier42 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier522);
                    ComposeUiNode.Companion companion322 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor42 = companion322.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                    }
                    composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                    MarkdownStyle markdownStyle322 = style;
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy42, companion322.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap42, companion322.getSetResolvedCompositionLocals());
                    setCompositeKeyHash = companion322.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl.getInserting()) {
                    }
                }
            }
            Composer composer42 = composerStartRestartGroup;
            final MarkdownTextAgreement7 markdownTextAgreement742 = markdownTextAgreement72;
            scopeUpdateScopeEndRestartGroup = composer42.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 16;
        if (i4 != 0) {
        }
        markdownTextAgreement72 = markdownTextAgreement7;
        i5 = i2 & 32;
        if (i5 != 0) {
        }
        i6 = i2 & 64;
        if (i6 != 0) {
        }
        if ((i & 12582912) == 0) {
        }
        if ((4793491 & i3) == 4793490) {
        }
        Composer composer422 = composerStartRestartGroup;
        final MarkdownTextAgreement7 markdownTextAgreement7422 = markdownTextAgreement72;
        scopeUpdateScopeEndRestartGroup = composer422.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void MarkdownTextAgreement$lambda$2(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MarkdownTextAgreement$lambda$12$lambda$8$lambda$7(CoroutineScope coroutineScope, ScrollState scrollState, IntSize intSize, IntSize intSize2) {
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new MarkdownTextAgreement2(scrollState, null), 3, null);
        return Unit.INSTANCE;
    }

    private static final boolean MarkdownTextAgreement$lambda$1(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    private static final boolean MarkdownTextAgreement$lambda$5(SnapshotState4<Boolean> snapshotState4) {
        return snapshotState4.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MarkdownTextAgreement$lambda$12$lambda$11$lambda$10$lambda$9(Function0 function0, CoroutineScope coroutineScope, SnapshotState snapshotState, ScrollState scrollState) {
        if (!MarkdownTextAgreement$lambda$1(snapshotState)) {
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new MarkdownTextAgreement4(scrollState, null), 3, null);
        } else {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }
}
