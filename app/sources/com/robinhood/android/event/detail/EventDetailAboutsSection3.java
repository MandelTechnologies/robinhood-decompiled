package com.robinhood.android.event.detail;

import android.content.Context;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.text.InlineTextContent;
import androidx.compose.foundation.text.InlineTextContent2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.AnnotatedString;
import androidx.compose.p011ui.text.Placeholder;
import androidx.compose.p011ui.text.PlaceholderVerticalAlign;
import androidx.compose.p011ui.unit.TextUnit2;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.eventcontracts.sharedeventui.PlaceholderUtils;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.markdown.compose.MarkdownStyle;
import com.robinhood.android.utils.web.WebUtils;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.text.BentoMarkdownText;
import com.robinhood.compose.bento.component.text.BentoMarkdownText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.bento.util.ModifiersKt;
import kotlin.Metadata;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableMap3;
import kotlinx.collections.immutable.extensions2;

/* compiled from: EventDetailAboutsSection.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a/\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0007¢\u0006\u0002\u0010\t\u001a\r\u0010\n\u001a\u00020\u0003H\u0003¢\u0006\u0002\u0010\u000b\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"faqInlineContentId", "", "EventDetailAboutsSection", "", "aboutText", "onFaqClick", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "EventTitlePreview", "(Landroidx/compose/runtime/Composer;I)V", "feature-event-detail_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.event.detail.EventDetailAboutsSectionKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class EventDetailAboutsSection3 {
    private static final String faqInlineContentId = "event_detail_page_faq";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EventDetailAboutsSection$lambda$4(String str, Function0 function0, Modifier modifier, int i, int i2, Composer composer, int i3) {
        EventDetailAboutsSection(str, function0, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EventTitlePreview$lambda$5(int i, Composer composer, int i2) {
        EventTitlePreview(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:78:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void EventDetailAboutsSection(final String str, final Function0<Unit> onFaqClick, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        Modifier modifier3;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        BentoTheme bentoTheme;
        int i4;
        Modifier modifier4;
        Composer composer2;
        final Modifier modifier5;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(onFaqClick, "onFaqClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(-698274171);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onFaqClick) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i3 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                modifier3 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-698274171, i3, -1, "com.robinhood.android.event.detail.EventDetailAboutsSection (EventDetailAboutsSection.kt:38)");
                }
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier3);
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
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                Column6 column6 = Column6.INSTANCE;
                String strStringResource = StringResources_androidKt.stringResource(C16095R.string.event_detail_about_header, composerStartRestartGroup, 0);
                AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
                builder.append(strStringResource);
                builder.append(PlaceholderUtils.XXShortPlaceholderText);
                InlineTextContent2.appendInlineContent$default(builder, faqInlineContentId, null, 2, null);
                AnnotatedString annotatedString = builder.toAnnotatedString();
                ImmutableMap3 immutableMap3PersistentMapOf = extensions2.persistentMapOf(Tuples4.m3642to(faqInlineContentId, new InlineTextContent(new Placeholder(TextUnit2.getEm(1), TextUnit2.getEm(1), PlaceholderVerticalAlign.INSTANCE.m7577getCenterJ6kI3mc(), null), ComposableLambda3.rememberComposableLambda(-112247889, true, new Function3<String, Composer, Integer, Unit>() { // from class: com.robinhood.android.event.detail.EventDetailAboutsSectionKt$EventDetailAboutsSection$1$2
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(String str2, Composer composer3, Integer num) {
                        invoke(str2, composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(String it, Composer composer3, int i6) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        if ((i6 & 17) == 16 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-112247889, i6, -1, "com.robinhood.android.event.detail.EventDetailAboutsSection.<anonymous>.<anonymous> (EventDetailAboutsSection.kt:55)");
                        }
                        Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                        Alignment center = Alignment.INSTANCE.getCenter();
                        Function0<Unit> function0 = onFaqClick;
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
                        int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer3, 0);
                        CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer3, modifierFillMaxSize$default);
                        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
                        if (composer3.getApplier() == null) {
                            Composables.invalidApplier();
                        }
                        composer3.startReusableNode();
                        if (composer3.getInserting()) {
                            composer3.createNode(constructor2);
                        } else {
                            composer3.useNode();
                        }
                        Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer3);
                        Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, companion2.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion2.getSetCompositeKeyHash();
                        if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                            composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                            composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion2.getSetModifier());
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size24(ServerToBentoAssetMapper2.INFO_24), StringResources_androidKt.stringResource(C11048R.string.general_action_learn_more, composer3, 0), BentoTheme.INSTANCE.getColors(composer3, BentoTheme.$stable).m21425getFg0d7_KjU(), null, function0, false, composer3, BentoIcon4.Size24.$stable, 40);
                        composer3.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54))));
                bentoTheme = BentoTheme.INSTANCE;
                i4 = BentoTheme.$stable;
                BentoText2.m20748BentoTextQnj7Zds(annotatedString, null, null, null, null, null, null, 0, false, 0, 0, immutableMap3PersistentMapOf, null, bentoTheme.getTypography(composerStartRestartGroup, i4).getDisplayCapsuleMedium(), composerStartRestartGroup, 0, 0, 6142);
                if (str == null && str.length() != 0) {
                    composerStartRestartGroup.startReplaceGroup(-1521442633);
                    final Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                    MarkdownStyle markdownStyleM21100withTextStylesYhh7B2I = BentoMarkdownText.INSTANCE.m21100withTextStylesYhh7B2I(bentoTheme.getTypography(composerStartRestartGroup, i4).getTextM(), 0, 0L, 0L, false, composerStartRestartGroup, BentoMarkdownText.$stable << 15, 30);
                    composer2 = composerStartRestartGroup;
                    Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, bentoTheme.getSpacing(composer2, i4).m21593getSmallD9Ej5fM(), 0.0f, 0.0f, 13, null);
                    composer2.startReplaceGroup(5004770);
                    boolean zChangedInstance = composer2.changedInstance(context);
                    Object objRememberedValue = composer2.rememberedValue();
                    if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function1() { // from class: com.robinhood.android.event.detail.EventDetailAboutsSectionKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return EventDetailAboutsSection3.EventDetailAboutsSection$lambda$3$lambda$2$lambda$1(context, (String) obj);
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue);
                    }
                    composer2.endReplaceGroup();
                    modifier4 = modifier3;
                    BentoMarkdownText2.BentoMarkdownText(str, modifierM5146paddingqDBjuR0$default, markdownStyleM21100withTextStylesYhh7B2I, (Function0<Unit>) null, (Function1<? super String, Unit>) objRememberedValue, composer2, (i3 & 14) | (MarkdownStyle.$stable << 6), 8);
                    composer2.endReplaceGroup();
                } else {
                    modifier4 = modifier3;
                    composerStartRestartGroup.startReplaceGroup(-1521011578);
                    BentoText2.m20747BentoText38GnDrw(PlaceholderUtils.getXLongPlaceholderText(), ModifiersKt.bentoPlaceholder$default(PaddingKt.m5146paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i4).m21590getDefaultD9Ej5fM(), 0.0f, 0.0f, 13, null), true, null, 2, null), null, null, null, null, null, 0, false, 0, 0, null, 0, null, composerStartRestartGroup, 0, 0, 16380);
                    composer2 = composerStartRestartGroup;
                    composer2.endReplaceGroup();
                }
                composer2.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier5 = modifier4;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                composer2 = composerStartRestartGroup;
                modifier5 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.event.detail.EventDetailAboutsSectionKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return EventDetailAboutsSection3.EventDetailAboutsSection$lambda$4(str, onFaqClick, modifier5, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 384;
        modifier2 = modifier;
        if ((i3 & 147) == 146) {
            if (i5 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier3);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
            }
            composerStartRestartGroup.startReusableNode();
            if (!composerStartRestartGroup.getInserting()) {
            }
            composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy2, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
            setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (!composerM6388constructorimpl.getInserting()) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion2.getSetModifier());
                Column6 column62 = Column6.INSTANCE;
                String strStringResource2 = StringResources_androidKt.stringResource(C16095R.string.event_detail_about_header, composerStartRestartGroup, 0);
                AnnotatedString.Builder builder2 = new AnnotatedString.Builder(0, 1, null);
                builder2.append(strStringResource2);
                builder2.append(PlaceholderUtils.XXShortPlaceholderText);
                InlineTextContent2.appendInlineContent$default(builder2, faqInlineContentId, null, 2, null);
                AnnotatedString annotatedString2 = builder2.toAnnotatedString();
                ImmutableMap3 immutableMap3PersistentMapOf2 = extensions2.persistentMapOf(Tuples4.m3642to(faqInlineContentId, new InlineTextContent(new Placeholder(TextUnit2.getEm(1), TextUnit2.getEm(1), PlaceholderVerticalAlign.INSTANCE.m7577getCenterJ6kI3mc(), null), ComposableLambda3.rememberComposableLambda(-112247889, true, new Function3<String, Composer, Integer, Unit>() { // from class: com.robinhood.android.event.detail.EventDetailAboutsSectionKt$EventDetailAboutsSection$1$2
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(String str2, Composer composer3, Integer num) {
                        invoke(str2, composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(String it, Composer composer3, int i6) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        if ((i6 & 17) == 16 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-112247889, i6, -1, "com.robinhood.android.event.detail.EventDetailAboutsSection.<anonymous>.<anonymous> (EventDetailAboutsSection.kt:55)");
                        }
                        Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                        Alignment center = Alignment.INSTANCE.getCenter();
                        Function0<Unit> function0 = onFaqClick;
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
                        int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer3, 0);
                        CompositionLocalMap currentCompositionLocalMap22 = composer3.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier22 = ComposedModifier2.materializeModifier(composer3, modifierFillMaxSize$default);
                        ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor22 = companion22.getConstructor();
                        if (composer3.getApplier() == null) {
                            Composables.invalidApplier();
                        }
                        composer3.startReusableNode();
                        if (composer3.getInserting()) {
                            composer3.createNode(constructor22);
                        } else {
                            composer3.useNode();
                        }
                        Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer3);
                        Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, companion22.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap22, companion22.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion22.getSetCompositeKeyHash();
                        if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                            composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                            composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier22, companion22.getSetModifier());
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size24(ServerToBentoAssetMapper2.INFO_24), StringResources_androidKt.stringResource(C11048R.string.general_action_learn_more, composer3, 0), BentoTheme.INSTANCE.getColors(composer3, BentoTheme.$stable).m21425getFg0d7_KjU(), null, function0, false, composer3, BentoIcon4.Size24.$stable, 40);
                        composer3.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54))));
                bentoTheme = BentoTheme.INSTANCE;
                i4 = BentoTheme.$stable;
                BentoText2.m20748BentoTextQnj7Zds(annotatedString2, null, null, null, null, null, null, 0, false, 0, 0, immutableMap3PersistentMapOf2, null, bentoTheme.getTypography(composerStartRestartGroup, i4).getDisplayCapsuleMedium(), composerStartRestartGroup, 0, 0, 6142);
                if (str == null) {
                    modifier4 = modifier3;
                    composerStartRestartGroup.startReplaceGroup(-1521011578);
                    BentoText2.m20747BentoText38GnDrw(PlaceholderUtils.getXLongPlaceholderText(), ModifiersKt.bentoPlaceholder$default(PaddingKt.m5146paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i4).m21590getDefaultD9Ej5fM(), 0.0f, 0.0f, 13, null), true, null, 2, null), null, null, null, null, null, 0, false, 0, 0, null, 0, null, composerStartRestartGroup, 0, 0, 16380);
                    composer2 = composerStartRestartGroup;
                    composer2.endReplaceGroup();
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier5 = modifier4;
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EventDetailAboutsSection$lambda$3$lambda$2$lambda$1(Context context, String uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        WebUtils.viewUrl$default(context, uri, 0, 4, (Object) null);
        return Unit.INSTANCE;
    }

    private static final void EventTitlePreview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1563827591);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1563827591, i, -1, "com.robinhood.android.event.detail.EventTitlePreview (EventDetailAboutsSection.kt:95)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, EventDetailAboutsSection.INSTANCE.getLambda$172443697$feature_event_detail_externalDebug(), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.event.detail.EventDetailAboutsSectionKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return EventDetailAboutsSection3.EventTitlePreview$lambda$5(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
