package com.robinhood.shared.support.supportchat.p396ui;

import android.net.Uri;
import androidx.compose.foundation.Background3;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.Clip;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.text.TextLayoutResult;
import androidx.compose.p011ui.text.style.TextOverflow;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.BentoRichText;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.models.serverdriven.p347db.RichText;
import com.robinhood.shared.support.supportchat.p396ui.models.UiChatMessage;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

/* compiled from: SelectionMessageView.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u001f\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0002\u0010\u0006\u001a\r\u0010\u0007\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\b\u001a\r\u0010\t\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\b¨\u0006\n"}, m3636d2 = {"SelectionMessageView", "", "message", "Lcom/robinhood/shared/support/supportchat/ui/models/UiChatMessage$Regular$SelectionMessage;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/shared/support/supportchat/ui/models/UiChatMessage$Regular$SelectionMessage;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "PreviewSelectionMessageView", "(Landroidx/compose/runtime/Composer;I)V", "PreviewSelectionMessageViewNight", "lib-support-chat_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.support.supportchat.ui.SelectionMessageViewKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class SelectionMessageView4 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewSelectionMessageView$lambda$8(int i, Composer composer, int i2) {
        PreviewSelectionMessageView(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewSelectionMessageViewNight$lambda$9(int i, Composer composer, int i2) {
        PreviewSelectionMessageViewNight(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SelectionMessageView$lambda$7(UiChatMessage.Regular.SelectionMessage selectionMessage, Modifier modifier, int i, int i2, Composer composer, int i3) {
        SelectionMessageView(selectionMessage, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0388  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0393  */
    /* JADX WARN: Removed duplicated region for block: B:113:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x02d6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void SelectionMessageView(final UiChatMessage.Regular.SelectionMessage message, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        final Modifier modifier2;
        RichText subtitle;
        String string2;
        RichText subtitle2;
        List<RichText.Attribute> listEmptyList;
        String trailingContent;
        String str;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        String str2;
        List<RichText.Attribute> list;
        int i4;
        int currentCompositeKeyHash2;
        Composer composerM6388constructorimpl2;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2;
        Modifier.Companion companion;
        String string3;
        String text;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(message, "message");
        Composer composerStartRestartGroup = composer.startRestartGroup(-984385736);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = i | (composerStartRestartGroup.changedInstance(message) ? 4 : 2);
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 == 0) {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i3 & 19) == 18 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier3 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-984385736, i3, -1, "com.robinhood.shared.support.supportchat.ui.SelectionMessageView (SelectionMessageView.kt:33)");
                }
                RoundedCornerShape userSelectionMessageBubbleShape = ChatMessageComposable.getUserSelectionMessageBubbleShape();
                subtitle = message.getSubtitle();
                if (subtitle != null || (text = subtitle.getText()) == null || (string2 = StringsKt.trim(text).toString()) == null || StringsKt.isBlank(string2)) {
                    string2 = null;
                    subtitle2 = message.getSubtitle();
                    if (subtitle2 == null || (listEmptyList = subtitle2.getAttributes()) == null) {
                        listEmptyList = CollectionsKt.emptyList();
                    }
                    ServerToBentoAssetMapper2 serverToBentoAssetMapper2FromServerValue = ServerToBentoAssetMapper2.INSTANCE.fromServerValue(message.getIconUrl());
                    trailingContent = message.getTrailingContent();
                    if (trailingContent != null || (string3 = StringsKt.trim(trailingContent).toString()) == null || StringsKt.isBlank(string3)) {
                        str = null;
                        float fM7995constructorimpl = (string2 == null || string2.length() == 0) ? C2002Dp.m7995constructorimpl(12) : C2002Dp.m7995constructorimpl(16);
                        Modifier modifierClip = Clip.clip(SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null), userSelectionMessageBubbleShape);
                        float fM7995constructorimpl2 = C2002Dp.m7995constructorimpl(1);
                        Modifier modifier4 = modifier3;
                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                        int i6 = BentoTheme.$stable;
                        List<RichText.Attribute> list2 = listEmptyList;
                        float f = 16;
                        Modifier modifierTestTag = TestTag3.testTag(PaddingKt.m5143paddingVpY3zN4(Background3.m4872backgroundbw27NRU$default(BorderKt.m4876borderxT4_qwU(modifierClip, fM7995constructorimpl2, bentoTheme.getColors(composerStartRestartGroup, i6).m21373getBg30d7_KjU(), userSelectionMessageBubbleShape), bentoTheme.getColors(composerStartRestartGroup, i6).m21371getBg0d7_KjU(), null, 2, null), C2002Dp.m7995constructorimpl(f), fM7995constructorimpl), "SelectionMessage");
                        Alignment.Companion companion2 = Alignment.INSTANCE;
                        Alignment.Vertical centerVertically = companion2.getCenterVertically();
                        Arrangement arrangement = Arrangement.INSTANCE;
                        MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(arrangement.getStart(), centerVertically, composerStartRestartGroup, 48);
                        currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierTestTag);
                        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion3.getConstructor();
                        if (composerStartRestartGroup.getApplier() == null) {
                            Composables.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.useNode();
                        } else {
                            composerStartRestartGroup.createNode(constructor);
                        }
                        composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                        setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                        if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                        Row6 row6 = Row6.INSTANCE;
                        composerStartRestartGroup.startReplaceGroup(-1739008173);
                        if (serverToBentoAssetMapper2FromServerValue != null) {
                            list = list2;
                            str2 = string2;
                            i4 = 0;
                        } else {
                            str2 = string2;
                            list = list2;
                            i4 = 0;
                            BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size24(serverToBentoAssetMapper2FromServerValue), null, bentoTheme.getColors(composerStartRestartGroup, i6).m21425getFg0d7_KjU(), TestTag3.testTag(PaddingKt.m5146paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, C2002Dp.m7995constructorimpl(f), 0.0f, 11, null), "SelectionMessageIcon"), null, false, composerStartRestartGroup, BentoIcon4.Size24.$stable | 48, 48);
                            Unit unit = Unit.INSTANCE;
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        Modifier.Companion companion4 = Modifier.INSTANCE;
                        Modifier modifierWeight$default = Row5.weight$default(row6, companion4, 1.0f, false, 2, null);
                        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), composerStartRestartGroup, i4);
                        currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, i4);
                        CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierWeight$default);
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
                        Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                        setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                        if (!composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                            composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                            composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
                        Column6 column6 = Column6.INSTANCE;
                        BentoText2.m20747BentoText38GnDrw(message.getTitle(), null, Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i6).m21425getFg0d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i6).getTextM(), composerStartRestartGroup, 0, 0, 8186);
                        composerStartRestartGroup = composerStartRestartGroup;
                        composerStartRestartGroup.startReplaceGroup(-1949574513);
                        if (str2 != null) {
                            companion = companion4;
                        } else {
                            companion = companion4;
                            BentoRichText.m15948BentoRichText0sCZWFg(new RichText(str2, list), TestTag3.testTag(companion, "SelectionMessageSubtitle"), bentoTheme.getTypography(composerStartRestartGroup, i6).getTextS(), bentoTheme.getColors(composerStartRestartGroup, i6).m21426getFg20d7_KjU(), 0L, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (Function1<? super Uri, Unit>) null, composerStartRestartGroup, 0, 1008);
                            composerStartRestartGroup = composerStartRestartGroup;
                            Unit unit2 = Unit.INSTANCE;
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.startReplaceGroup(-1738976887);
                        if (str != null) {
                            Spacer2.Spacer(SizeKt.m5174width3ABfNKs(companion, C2002Dp.m7995constructorimpl(8)), composerStartRestartGroup, 6);
                            Composer composer2 = composerStartRestartGroup;
                            BentoText2.m20747BentoText38GnDrw(str, TestTag3.testTag(PaddingKt.m5144paddingVpY3zN4$default(row6.align(companion, companion2.getTop()), 0.0f, C2002Dp.m7995constructorimpl(10), 1, null), "SelectionMessageTrailing"), Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i6).m21425getFg0d7_KjU()), null, null, null, null, TextOverflow.INSTANCE.m7959getEllipsisgIe3tQ8(), false, 1, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i6).getTextM(), composer2, 817889280, 0, 7544);
                            composerStartRestartGroup = composer2;
                            Unit unit3 = Unit.INSTANCE;
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier2 = modifier4;
                    } else {
                        String lowerCase = string3.toLowerCase(Locale.ROOT);
                        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                        if (!Intrinsics.areEqual(lowerCase, "null")) {
                            str = string3;
                        }
                        if (string2 == null) {
                            Modifier modifierClip2 = Clip.clip(SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null), userSelectionMessageBubbleShape);
                            float fM7995constructorimpl22 = C2002Dp.m7995constructorimpl(1);
                            Modifier modifier42 = modifier3;
                            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                            int i62 = BentoTheme.$stable;
                            List<RichText.Attribute> list22 = listEmptyList;
                            float f2 = 16;
                            Modifier modifierTestTag2 = TestTag3.testTag(PaddingKt.m5143paddingVpY3zN4(Background3.m4872backgroundbw27NRU$default(BorderKt.m4876borderxT4_qwU(modifierClip2, fM7995constructorimpl22, bentoTheme2.getColors(composerStartRestartGroup, i62).m21373getBg30d7_KjU(), userSelectionMessageBubbleShape), bentoTheme2.getColors(composerStartRestartGroup, i62).m21371getBg0d7_KjU(), null, 2, null), C2002Dp.m7995constructorimpl(f2), fM7995constructorimpl), "SelectionMessage");
                            Alignment.Companion companion22 = Alignment.INSTANCE;
                            Alignment.Vertical centerVertically2 = companion22.getCenterVertically();
                            Arrangement arrangement2 = Arrangement.INSTANCE;
                            MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(arrangement2.getStart(), centerVertically2, composerStartRestartGroup, 48);
                            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierTestTag2);
                            ComposeUiNode.Companion companion32 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor3 = companion32.getConstructor();
                            if (composerStartRestartGroup.getApplier() == null) {
                            }
                            composerStartRestartGroup.startReusableNode();
                            if (composerStartRestartGroup.getInserting()) {
                            }
                            composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy2, companion32.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap3, companion32.getSetResolvedCompositionLocals());
                            setCompositeKeyHash = companion32.getSetCompositeKeyHash();
                            if (!composerM6388constructorimpl.getInserting()) {
                                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier3, companion32.getSetModifier());
                                Row6 row62 = Row6.INSTANCE;
                                composerStartRestartGroup.startReplaceGroup(-1739008173);
                                if (serverToBentoAssetMapper2FromServerValue != null) {
                                }
                                composerStartRestartGroup.endReplaceGroup();
                                Modifier.Companion companion42 = Modifier.INSTANCE;
                                Modifier modifierWeight$default2 = Row5.weight$default(row62, companion42, 1.0f, false, 2, null);
                                MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement2.getTop(), companion22.getStart(), composerStartRestartGroup, i4);
                                currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, i4);
                                CompositionLocalMap currentCompositionLocalMap22 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier22 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierWeight$default2);
                                Function0<ComposeUiNode> constructor22 = companion32.getConstructor();
                                if (composerStartRestartGroup.getApplier() == null) {
                                }
                                composerStartRestartGroup.startReusableNode();
                                if (composerStartRestartGroup.getInserting()) {
                                }
                                composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy2, companion32.getSetMeasurePolicy());
                                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap22, companion32.getSetResolvedCompositionLocals());
                                setCompositeKeyHash2 = companion32.getSetCompositeKeyHash();
                                if (!composerM6388constructorimpl2.getInserting()) {
                                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                    Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier22, companion32.getSetModifier());
                                    Column6 column62 = Column6.INSTANCE;
                                    BentoText2.m20747BentoText38GnDrw(message.getTitle(), null, Color.m6701boximpl(bentoTheme2.getColors(composerStartRestartGroup, i62).m21425getFg0d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composerStartRestartGroup, i62).getTextM(), composerStartRestartGroup, 0, 0, 8186);
                                    composerStartRestartGroup = composerStartRestartGroup;
                                    composerStartRestartGroup.startReplaceGroup(-1949574513);
                                    if (str2 != null) {
                                    }
                                    composerStartRestartGroup.endReplaceGroup();
                                    composerStartRestartGroup.endNode();
                                    composerStartRestartGroup.startReplaceGroup(-1738976887);
                                    if (str != null) {
                                    }
                                    composerStartRestartGroup.endReplaceGroup();
                                    composerStartRestartGroup.endNode();
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    modifier2 = modifier42;
                                }
                            }
                        }
                    }
                } else {
                    String lowerCase2 = string2.toLowerCase(Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
                    if (Intrinsics.areEqual(lowerCase2, "null")) {
                    }
                    subtitle2 = message.getSubtitle();
                    if (subtitle2 == null) {
                        listEmptyList = CollectionsKt.emptyList();
                        ServerToBentoAssetMapper2 serverToBentoAssetMapper2FromServerValue2 = ServerToBentoAssetMapper2.INSTANCE.fromServerValue(message.getIconUrl());
                        trailingContent = message.getTrailingContent();
                        if (trailingContent != null) {
                            str = null;
                            if (string2 == null) {
                            }
                        }
                    }
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.support.supportchat.ui.SelectionMessageViewKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return SelectionMessageView4.SelectionMessageView$lambda$7(message, modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        modifier2 = modifier;
        if ((i3 & 19) == 18) {
            if (i5 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            RoundedCornerShape userSelectionMessageBubbleShape2 = ChatMessageComposable.getUserSelectionMessageBubbleShape();
            subtitle = message.getSubtitle();
            if (subtitle != null) {
                string2 = null;
                subtitle2 = message.getSubtitle();
                if (subtitle2 == null) {
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    private static final void PreviewSelectionMessageView(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1525300648);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1525300648, i, -1, "com.robinhood.shared.support.supportchat.ui.PreviewSelectionMessageView (SelectionMessageView.kt:107)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, SelectionMessageView.INSTANCE.getLambda$1633236384$lib_support_chat_externalDebug(), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.support.supportchat.ui.SelectionMessageViewKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SelectionMessageView4.PreviewSelectionMessageView$lambda$8(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void PreviewSelectionMessageViewNight(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(26250452);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(26250452, i, -1, "com.robinhood.shared.support.supportchat.ui.PreviewSelectionMessageViewNight (SelectionMessageView.kt:134)");
            }
            BentoTheme2.BentoTheme(Boolean.FALSE, null, null, null, null, null, null, null, SelectionMessageView.INSTANCE.getLambda$794420876$lib_support_chat_externalDebug(), composerStartRestartGroup, 100663302, EnumC7081g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.support.supportchat.ui.SelectionMessageViewKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SelectionMessageView4.PreviewSelectionMessageViewNight$lambda$9(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
