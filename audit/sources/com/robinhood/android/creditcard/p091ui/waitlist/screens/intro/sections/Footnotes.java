package com.robinhood.android.creditcard.p091ui.waitlist.screens.intro.sections;

import android.content.Context;
import androidx.compose.foundation.Background3;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.ColorFilter;
import androidx.compose.p011ui.layout.ContentScale;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.TextStyle;
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
import coil.compose.SingletonAsyncImagePainter;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.creditcard.C12201R;
import com.robinhood.android.creditcard.p091ui.waitlist.screens.intro.sections.Footnotes;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.utils.web.WebUtils;
import com.robinhood.compose.bento.component.BentoDivider;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.BentoTextWithLink;
import com.robinhood.compose.bento.theme.BentoColor;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p479j$.time.Year;

/* compiled from: Footnotes.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\f\u001a\u0017\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u0001¢\u0006\u0002\u0010\u0004\u001a'\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u0003¢\u0006\u0002\u0010\t\u001a7\u0010\n\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00072\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u0003¢\u0006\u0002\u0010\r\"\u000e\u0010\u000e\u001a\u00020\u000fX\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0010\u001a\u00020\u000fX\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0011\u001a\u00020\u000fX\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0012\u001a\u00020\u000fX\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0013\u001a\u00020\u000fX\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0014\u001a\u00020\u000fX\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0015\u001a\u00020\u000fX\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0016\u001a\u00020\u000fX\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0017\u001a\u00020\u000fX\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0018\u001a\u00020\u000fX\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0019\u001a\u00020\u000fX\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001a\u001a\u00020\u000fX\u0086T¢\u0006\u0002\n\u0000¨\u0006\u001b"}, m3636d2 = {"Footnotes", "", "modifier", "Landroidx/compose/ui/Modifier;", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "FootnoteRow", InquiryField.FloatField.TYPE2, "", "stringId", "(IILandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "FootnoteRowWithUrl", "urlTextId", "urlId", "(IIIILandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "FOOTNOTES_ROOT_TEST_TAG", "", "FOOTNOTES_NOTE1_TEST_TAG", "FOOTNOTES_NOTE2_TEST_TAG", "FOOTNOTES_ROW1_TEST_TAG", "FOOTNOTES_ROW_WITH_URL1_TEST_TAG", "FOOTNOTES_ROW_WITH_URL2_TEST_TAG", "FOOTNOTES_ROW_WITH_URL3_TEST_TAG", "FOOTNOTES_NOTE3_TEST_TAG", "FOOTNOTES_NOTE4_TEST_TAG", "FOOTNOTES_NOTE5_TEST_TAG", "FOOTNOTES_NOTE6_TEST_TAG", "FOOTNOTES_URL_LINK_TEST_TAG", "feature-credit-card_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.creditcard.ui.waitlist.screens.intro.sections.FootnotesKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class Footnotes {
    public static final String FOOTNOTES_NOTE1_TEST_TAG = "footnotes-note1-test-tag";
    public static final String FOOTNOTES_NOTE2_TEST_TAG = "footnotes-note2-test-tag";
    public static final String FOOTNOTES_NOTE3_TEST_TAG = "footnotes-note3-test-tag";
    public static final String FOOTNOTES_NOTE4_TEST_TAG = "footnotes-note4-test-tag";
    public static final String FOOTNOTES_NOTE5_TEST_TAG = "footnotes-note5-test-tag";
    public static final String FOOTNOTES_NOTE6_TEST_TAG = "footnotes-note6-test-tag";
    public static final String FOOTNOTES_ROOT_TEST_TAG = "footnotes-root-test-tag";
    public static final String FOOTNOTES_ROW1_TEST_TAG = "footnotes-row1-test-tag";
    public static final String FOOTNOTES_ROW_WITH_URL1_TEST_TAG = "footnotes-row-with-url1-test-tag";
    public static final String FOOTNOTES_ROW_WITH_URL2_TEST_TAG = "footnotes-row-with-url2-test-tag";
    public static final String FOOTNOTES_ROW_WITH_URL3_TEST_TAG = "footnotes-row-with-url3-test-tag";
    public static final String FOOTNOTES_URL_LINK_TEST_TAG = "footnotes-url-link-test-tag";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FootnoteRow$lambda$2(int i, int i2, Modifier modifier, int i3, int i4, Composer composer, int i5) {
        FootnoteRow(i, i2, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i3 | 1), i4);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FootnoteRowWithUrl$lambda$6(int i, int i2, int i3, int i4, Modifier modifier, int i5, int i6, Composer composer, int i7) {
        FootnoteRowWithUrl(i, i2, i3, i4, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i5 | 1), i6);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Footnotes$lambda$0(Modifier modifier, int i, int i2, Composer composer, int i3) {
        Footnotes(modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final void Footnotes(Modifier modifier, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        Composer composer2;
        final Modifier modifier3;
        Composer composerStartRestartGroup = composer.startRestartGroup(-95972910);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i3 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            Modifier modifier4 = i4 != 0 ? Modifier.INSTANCE : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-95972910, i3, -1, "com.robinhood.android.creditcard.ui.waitlist.screens.intro.sections.Footnotes (Footnotes.kt:44)");
            }
            Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            String strStringResource = StringResources_androidKt.stringResource(C12201R.string.waitlist_intro_footnote_coastal_privacy_url, composerStartRestartGroup, 0);
            long jM21139getCCGoldBG0d7_KjU = BentoColor.INSTANCE.m21139getCCGoldBG0d7_KjU();
            ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(-898285248, true, new C127451(modifier4, strStringResource, context), composerStartRestartGroup, 54);
            composer2 = composerStartRestartGroup;
            modifier3 = modifier4;
            BentoThemeOverlays.m21607CustomThemeOverlaywsPGbo(0L, jM21139getCCGoldBG0d7_KjU, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composableLambdaRememberComposableLambda, composer2, 805306368, 509);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
            modifier3 = modifier2;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.creditcard.ui.waitlist.screens.intro.sections.FootnotesKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return Footnotes.Footnotes$lambda$0(modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: Footnotes.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.creditcard.ui.waitlist.screens.intro.sections.FootnotesKt$Footnotes$1 */
    static final class C127451 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ String $coastalPrivacyUrl;
        final /* synthetic */ Context $context;
        final /* synthetic */ Modifier $modifier;

        C127451(Modifier modifier, String str, Context context) {
            this.$modifier = modifier;
            this.$coastalPrivacyUrl = str;
            this.$context = context;
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
                ComposerKt.traceEventStart(-898285248, i, -1, "com.robinhood.android.creditcard.ui.waitlist.screens.intro.sections.Footnotes.<anonymous> (Footnotes.kt:48)");
            }
            Arrangement arrangement = Arrangement.INSTANCE;
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i2 = BentoTheme.$stable;
            Arrangement.HorizontalOrVertical horizontalOrVerticalM5089spacedBy0680j_4 = arrangement.m5089spacedBy0680j_4(bentoTheme.getSpacing(composer, i2).m21593getSmallD9Ej5fM());
            Modifier modifierTestTag = TestTag3.testTag(PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(Background3.m4872backgroundbw27NRU$default(this.$modifier, BentoColor.INSTANCE.m21142getCCGoldBGLight0d7_KjU(), null, 2, null), 0.0f, composer, 0, 1), Footnotes.FOOTNOTES_ROOT_TEST_TAG);
            final String str = this.$coastalPrivacyUrl;
            final Context context = this.$context;
            Alignment.Companion companion = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(horizontalOrVerticalM5089spacedBy0680j_4, companion.getStart(), composer, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierTestTag);
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            BentoDivider.m20635BentoHorizontalDivideraMcp0Q(null, bentoTheme.getColors(composer, i2).m21425getFg0d7_KjU(), 0.0f, composer, 0, 5);
            Alignment.Vertical centerVertically = companion.getCenterVertically();
            Modifier.Companion companion3 = Modifier.INSTANCE;
            Modifier modifierM5144paddingVpY3zN4$default = androidx.compose.foundation.layout.PaddingKt.m5144paddingVpY3zN4$default(companion3, 0.0f, bentoTheme.getSpacing(composer, i2).m21592getMediumD9Ej5fM(), 1, null);
            MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(arrangement.getStart(), centerVertically, composer, 48);
            int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer, modifierM5144paddingVpY3zN4$default);
            Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
            if (composer.getApplier() == null) {
                Composables.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor2);
            } else {
                composer.useNode();
            }
            Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer);
            Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion2.getSetCompositeKeyHash();
            if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion2.getSetModifier());
            Row6 row6 = Row6.INSTANCE;
            BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size40(ServerToBentoAssetMapper2.ROBINHOOD_24), null, bentoTheme.getColors(composer, i2).m21425getFg0d7_KjU(), null, null, false, composer, BentoIcon4.Size40.$stable | 48, 56);
            BentoDivider.m20636BentoVerticalDivideraMcp0Q(androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(SizeKt.m5156height3ABfNKs(companion3, bentoTheme.getSpacing(composer, i2).m21596getXxlargeD9Ej5fM()), bentoTheme.getSpacing(composer, i2).m21591getLargeD9Ej5fM(), 0.0f, bentoTheme.getSpacing(composer, i2).m21591getLargeD9Ej5fM(), 0.0f, 10, null), bentoTheme.getColors(composer, i2).m21425getFg0d7_KjU(), 0.0f, composer, 0, 4);
            ImageKt.Image(SingletonAsyncImagePainter.m9120rememberAsyncImagePainterEHKIwbg(Integer.valueOf(C12201R.drawable.svg_visa_signature), null, null, null, 0, null, composer, 0, 62), (String) null, SizeKt.m5159requiredHeight3ABfNKs(SizeKt.m5166requiredWidth3ABfNKs(companion3, C2002Dp.m7995constructorimpl(62)), C2002Dp.m7995constructorimpl(38)), (Alignment) null, ContentScale.INSTANCE.getFillWidth(), 0.0f, (ColorFilter) null, composer, 25008, 104);
            composer.endNode();
            BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C12201R.string.waitlist_intro_footnote_p1, composer, 0), TestTag3.testTag(companion3, Footnotes.FOOTNOTES_NOTE1_TEST_TAG), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i2).getTextAnnotation(), composer, 48, 0, 8188);
            BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C12201R.string.waitlist_intro_footnote_p2, composer, 0), TestTag3.testTag(companion3, Footnotes.FOOTNOTES_NOTE2_TEST_TAG), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i2).getTextAnnotation(), composer, 48, 0, 8188);
            Footnotes.FootnoteRow(1, C12201R.string.waitlist_intro_footnote_1, TestTag3.testTag(companion3, Footnotes.FOOTNOTES_ROW1_TEST_TAG), composer, 390, 0);
            Footnotes.FootnoteRowWithUrl(2, C12201R.string.waitlist_intro_footnote_2, C12201R.string.waitlist_intro_footnote_fees_url_text, C12201R.string.waitlist_intro_footnote_fees_url, TestTag3.testTag(companion3, Footnotes.FOOTNOTES_ROW_WITH_URL1_TEST_TAG), composer, 24582, 0);
            Footnotes.FootnoteRowWithUrl(3, C12201R.string.waitlist_intro_footnote_3, C12201R.string.waitlist_intro_footnote_rewards_url_text, C12201R.string.waitlist_intro_footnote_rewards_url, TestTag3.testTag(companion3, Footnotes.FOOTNOTES_ROW_WITH_URL2_TEST_TAG), composer, 24582, 0);
            Footnotes.FootnoteRowWithUrl(4, C12201R.string.waitlist_intro_footnote_4, C12201R.string.waitlist_intro_footnote_visa_benefits_url_text, C12201R.string.waitlist_intro_footnote_visa_benefits_url, TestTag3.testTag(companion3, Footnotes.FOOTNOTES_ROW_WITH_URL3_TEST_TAG), composer, 24582, 0);
            String strStringResource = StringResources_androidKt.stringResource(C12201R.string.waitlist_intro_footnote_coastal_privacy_text, composer, 0);
            String strStringResource2 = StringResources_androidKt.stringResource(C12201R.string.waitlist_intro_footnote_coastal_privacy_text, composer, 0);
            long jM21425getFg0d7_KjU = bentoTheme.getColors(composer, i2).m21425getFg0d7_KjU();
            TextStyle textAnnotation = bentoTheme.getTypography(composer, i2).getTextAnnotation();
            Modifier modifierTestTag2 = TestTag3.testTag(ModifiersKt.autoLogEvents$default(companion3, new UserInteractionEventDescriptor(null, new Screen(Screen.Name.CC_WAITLIST_INTRO, null, null, null, 14, null), UserInteractionEventData.Action.OPEN_URL, new com.robinhood.rosetta.eventlogging.Context(0, 0, 0, null, null, null, str, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -65, -1, -1, -1, -1, -1, 16383, null), new Component(Component.ComponentType.LINK_BUTTON, null, null, 6, null), null, 33, null), false, false, false, true, false, null, 110, null), Footnotes.FOOTNOTES_NOTE3_TEST_TAG);
            composer.startReplaceGroup(-1633490746);
            boolean zChangedInstance = composer.changedInstance(context) | composer.changed(str);
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.creditcard.ui.waitlist.screens.intro.sections.FootnotesKt$Footnotes$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Footnotes.C127451.invoke$lambda$3$lambda$2$lambda$1(context, str);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            BentoTextWithLink.m20753BentoTextWithSubstringLinkXkG1Q0A(strStringResource, strStringResource2, (Function0) objRememberedValue, modifierTestTag2, jM21425getFg0d7_KjU, 0L, textAnnotation, 0, composer, 0, EnumC7081g.SDK_ASSET_ILLUSTRATION_SECURE_TOKENIZATION_VALUE);
            BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C12201R.string.waitlist_intro_footnote_vermont_disclosure, composer, 0), TestTag3.testTag(companion3, Footnotes.FOOTNOTES_NOTE4_TEST_TAG), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i2).getTextAnnotation(), composer, 48, 0, 8188);
            BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C12201R.string.waitlist_intro_footnote_address, composer, 0), TestTag3.testTag(companion3, Footnotes.FOOTNOTES_NOTE5_TEST_TAG), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i2).getTextAnnotation(), composer, 48, 0, 8188);
            BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C12201R.string.waitlist_intro_footnote_copyright, new Object[]{Integer.valueOf(Year.now().getValue())}, composer, 0), TestTag3.testTag(companion3, Footnotes.FOOTNOTES_NOTE6_TEST_TAG), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i2).getTextAnnotation(), composer, 48, 0, 8188);
            BoxKt.Box(SizeKt.m5156height3ABfNKs(SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null), C2002Dp.m7995constructorimpl(100)), composer, 6);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$3$lambda$2$lambda$1(Context context, String str) {
            WebUtils.viewUrl$default(context, str, 0, 4, (Object) null);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void FootnoteRow(final int i, final int i2, Modifier modifier, Composer composer, final int i3, final int i4) {
        int i5;
        Modifier modifier2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        Composer composer2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1014530977);
        if ((i4 & 1) != 0) {
            i5 = i3 | 6;
        } else if ((i3 & 6) == 0) {
            i5 = (composerStartRestartGroup.changed(i) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        if ((i4 & 2) != 0) {
            i5 |= 48;
        } else if ((i3 & 48) == 0) {
            i5 |= composerStartRestartGroup.changed(i2) ? 32 : 16;
        }
        int i6 = i4 & 4;
        if (i6 == 0) {
            if ((i3 & 384) == 0) {
                modifier2 = modifier;
                i5 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i5 & 147) != 146 && composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.skipToGroupEnd();
                composer2 = composerStartRestartGroup;
                modifier3 = modifier2;
            } else {
                if (i6 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1014530977, i5, -1, "com.robinhood.android.creditcard.ui.waitlist.screens.intro.sections.FootnoteRow (Footnotes.kt:172)");
                }
                Arrangement arrangement = Arrangement.INSTANCE;
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i7 = BentoTheme.$stable;
                Arrangement.HorizontalOrVertical horizontalOrVerticalM5089spacedBy0680j_4 = arrangement.m5089spacedBy0680j_4(bentoTheme.getSpacing(composerStartRestartGroup, i7).m21595getXsmallD9Ej5fM());
                Modifier modifierM5146paddingqDBjuR0$default = androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(modifier2, bentoTheme.getSpacing(composerStartRestartGroup, i7).m21593getSmallD9Ej5fM(), 0.0f, 0.0f, 0.0f, 14, null);
                Modifier modifier4 = modifier2;
                MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(horizontalOrVerticalM5089spacedBy0680j_4, Alignment.INSTANCE.getTop(), composerStartRestartGroup, 0);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5146paddingqDBjuR0$default);
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
                composer2 = composerStartRestartGroup;
                BentoText2.m20747BentoText38GnDrw(i + ".", null, null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i7).getTextAnnotation(), composer2, 0, 0, 8190);
                BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(i2, composer2, (i5 >> 3) & 14), null, Color.m6701boximpl(bentoTheme.getColors(composer2, i7).m21425getFg0d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer2, i7).getTextAnnotation(), composer2, 0, 0, 8186);
                composer2.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier4;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.creditcard.ui.waitlist.screens.intro.sections.FootnotesKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return Footnotes.FootnoteRow$lambda$2(i, i2, modifier3, i3, i4, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i5 |= 384;
        modifier2 = modifier;
        if ((i5 & 147) != 146) {
            if (i6 != 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            Arrangement arrangement2 = Arrangement.INSTANCE;
            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
            int i72 = BentoTheme.$stable;
            Arrangement.HorizontalOrVertical horizontalOrVerticalM5089spacedBy0680j_42 = arrangement2.m5089spacedBy0680j_4(bentoTheme2.getSpacing(composerStartRestartGroup, i72).m21595getXsmallD9Ej5fM());
            Modifier modifierM5146paddingqDBjuR0$default2 = androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(modifier2, bentoTheme2.getSpacing(composerStartRestartGroup, i72).m21593getSmallD9Ej5fM(), 0.0f, 0.0f, 0.0f, 14, null);
            Modifier modifier42 = modifier2;
            MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(horizontalOrVerticalM5089spacedBy0680j_42, Alignment.INSTANCE.getTop(), composerStartRestartGroup, 0);
            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5146paddingqDBjuR0$default2);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
            }
            composerStartRestartGroup.startReusableNode();
            if (!composerStartRestartGroup.getInserting()) {
            }
            composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy2, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
            setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (!composerM6388constructorimpl.getInserting()) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion2.getSetModifier());
                Row6 row62 = Row6.INSTANCE;
                composer2 = composerStartRestartGroup;
                BentoText2.m20747BentoText38GnDrw(i + ".", null, null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composerStartRestartGroup, i72).getTextAnnotation(), composer2, 0, 0, 8190);
                BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(i2, composer2, (i5 >> 3) & 14), null, Color.m6701boximpl(bentoTheme2.getColors(composer2, i72).m21425getFg0d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composer2, i72).getTextAnnotation(), composer2, 0, 0, 8186);
                composer2.endNode();
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier3 = modifier42;
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:60:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x03d7  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0400  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x040b  */
    /* JADX WARN: Removed duplicated region for block: B:90:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void FootnoteRowWithUrl(final int i, final int i2, final int i3, final int i4, Modifier modifier, Composer composer, final int i5, final int i6) {
        int i7;
        Modifier modifier2;
        final Context context;
        final String strStringResource;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        boolean zChangedInstance;
        Object objRememberedValue;
        Composer composer2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-283315338);
        if ((i6 & 1) != 0) {
            i7 = i5 | 6;
        } else if ((i5 & 6) == 0) {
            i7 = (composerStartRestartGroup.changed(i) ? 4 : 2) | i5;
        } else {
            i7 = i5;
        }
        if ((i6 & 2) != 0) {
            i7 |= 48;
        } else if ((i5 & 48) == 0) {
            i7 |= composerStartRestartGroup.changed(i2) ? 32 : 16;
        }
        if ((i6 & 4) != 0) {
            i7 |= 384;
        } else if ((i5 & 384) == 0) {
            i7 |= composerStartRestartGroup.changed(i3) ? 256 : 128;
        }
        if ((i6 & 8) != 0) {
            i7 |= 3072;
        } else if ((i5 & 3072) == 0) {
            i7 |= composerStartRestartGroup.changed(i4) ? 2048 : 1024;
        }
        int i8 = i6 & 16;
        if (i8 == 0) {
            if ((i5 & 24576) == 0) {
                modifier2 = modifier;
                i7 |= composerStartRestartGroup.changed(modifier2) ? 16384 : 8192;
            }
            if ((i7 & 9363) != 9362 && composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.skipToGroupEnd();
                composer2 = composerStartRestartGroup;
                modifier3 = modifier2;
            } else {
                if (i8 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-283315338, i7, -1, "com.robinhood.android.creditcard.ui.waitlist.screens.intro.sections.FootnoteRowWithUrl (Footnotes.kt:196)");
                }
                context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                strStringResource = StringResources_androidKt.stringResource(i4, composerStartRestartGroup, (i7 >> 9) & 14);
                Arrangement arrangement = Arrangement.INSTANCE;
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i9 = BentoTheme.$stable;
                Arrangement.HorizontalOrVertical horizontalOrVerticalM5089spacedBy0680j_4 = arrangement.m5089spacedBy0680j_4(bentoTheme.getSpacing(composerStartRestartGroup, i9).m21595getXsmallD9Ej5fM());
                Modifier modifierM5146paddingqDBjuR0$default = androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(modifier2, bentoTheme.getSpacing(composerStartRestartGroup, i9).m21593getSmallD9Ej5fM(), 0.0f, 0.0f, 0.0f, 14, null);
                Modifier modifier4 = modifier2;
                MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(horizontalOrVerticalM5089spacedBy0680j_4, Alignment.INSTANCE.getTop(), composerStartRestartGroup, 0);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5146paddingqDBjuR0$default);
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
                int i10 = i7;
                BentoText2.m20747BentoText38GnDrw(i + ".", null, null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i9).getTextAnnotation(), composerStartRestartGroup, 0, 0, 8190);
                String strStringResource2 = StringResources_androidKt.stringResource(i2, composerStartRestartGroup, (i10 >> 3) & 14);
                String strStringResource3 = StringResources_androidKt.stringResource(i3, composerStartRestartGroup, (i10 >> 6) & 14);
                long jM21425getFg0d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i9).m21425getFg0d7_KjU();
                TextStyle textAnnotation = bentoTheme.getTypography(composerStartRestartGroup, i9).getTextAnnotation();
                Modifier modifierTestTag = TestTag3.testTag(ModifiersKt.autoLogEvents$default(Modifier.INSTANCE, new UserInteractionEventDescriptor(null, new Screen(Screen.Name.CC_WAITLIST_INTRO, null, null, null, 14, null), UserInteractionEventData.Action.OPEN_URL, new com.robinhood.rosetta.eventlogging.Context(0, 0, 0, null, null, null, strStringResource, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -65, -1, -1, -1, -1, -1, 16383, null), new Component(Component.ComponentType.LINK_BUTTON, null, null, 6, null), null, 33, null), false, false, false, true, false, null, 110, null), FOOTNOTES_URL_LINK_TEST_TAG);
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                zChangedInstance = composerStartRestartGroup.changedInstance(context) | composerStartRestartGroup.changed(strStringResource);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.creditcard.ui.waitlist.screens.intro.sections.FootnotesKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Footnotes.FootnoteRowWithUrl$lambda$5$lambda$4$lambda$3(context, strStringResource);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                composer2 = composerStartRestartGroup;
                BentoTextWithLink.m20753BentoTextWithSubstringLinkXkG1Q0A(strStringResource2, strStringResource3, (Function0) objRememberedValue, modifierTestTag, jM21425getFg0d7_KjU, 0L, textAnnotation, 0, composer2, 0, EnumC7081g.SDK_ASSET_ILLUSTRATION_SECURE_TOKENIZATION_VALUE);
                composer2.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier4;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.creditcard.ui.waitlist.screens.intro.sections.FootnotesKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return Footnotes.FootnoteRowWithUrl$lambda$6(i, i2, i3, i4, modifier3, i5, i6, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i7 |= 24576;
        modifier2 = modifier;
        if ((i7 & 9363) != 9362) {
            if (i8 != 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            strStringResource = StringResources_androidKt.stringResource(i4, composerStartRestartGroup, (i7 >> 9) & 14);
            Arrangement arrangement2 = Arrangement.INSTANCE;
            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
            int i92 = BentoTheme.$stable;
            Arrangement.HorizontalOrVertical horizontalOrVerticalM5089spacedBy0680j_42 = arrangement2.m5089spacedBy0680j_4(bentoTheme2.getSpacing(composerStartRestartGroup, i92).m21595getXsmallD9Ej5fM());
            Modifier modifierM5146paddingqDBjuR0$default2 = androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(modifier2, bentoTheme2.getSpacing(composerStartRestartGroup, i92).m21593getSmallD9Ej5fM(), 0.0f, 0.0f, 0.0f, 14, null);
            Modifier modifier42 = modifier2;
            MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(horizontalOrVerticalM5089spacedBy0680j_42, Alignment.INSTANCE.getTop(), composerStartRestartGroup, 0);
            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5146paddingqDBjuR0$default2);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
            }
            composerStartRestartGroup.startReusableNode();
            if (!composerStartRestartGroup.getInserting()) {
            }
            composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy2, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
            setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (!composerM6388constructorimpl.getInserting()) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion2.getSetModifier());
                Row6 row62 = Row6.INSTANCE;
                int i102 = i7;
                BentoText2.m20747BentoText38GnDrw(i + ".", null, null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composerStartRestartGroup, i92).getTextAnnotation(), composerStartRestartGroup, 0, 0, 8190);
                String strStringResource22 = StringResources_androidKt.stringResource(i2, composerStartRestartGroup, (i102 >> 3) & 14);
                String strStringResource32 = StringResources_androidKt.stringResource(i3, composerStartRestartGroup, (i102 >> 6) & 14);
                long jM21425getFg0d7_KjU2 = bentoTheme2.getColors(composerStartRestartGroup, i92).m21425getFg0d7_KjU();
                TextStyle textAnnotation2 = bentoTheme2.getTypography(composerStartRestartGroup, i92).getTextAnnotation();
                Modifier modifierTestTag2 = TestTag3.testTag(ModifiersKt.autoLogEvents$default(Modifier.INSTANCE, new UserInteractionEventDescriptor(null, new Screen(Screen.Name.CC_WAITLIST_INTRO, null, null, null, 14, null), UserInteractionEventData.Action.OPEN_URL, new com.robinhood.rosetta.eventlogging.Context(0, 0, 0, null, null, null, strStringResource, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -65, -1, -1, -1, -1, -1, 16383, null), new Component(Component.ComponentType.LINK_BUTTON, null, null, 6, null), null, 33, null), false, false, false, true, false, null, 110, null), FOOTNOTES_URL_LINK_TEST_TAG);
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                zChangedInstance = composerStartRestartGroup.changedInstance(context) | composerStartRestartGroup.changed(strStringResource);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.creditcard.ui.waitlist.screens.intro.sections.FootnotesKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Footnotes.FootnoteRowWithUrl$lambda$5$lambda$4$lambda$3(context, strStringResource);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    composerStartRestartGroup.endReplaceGroup();
                    composer2 = composerStartRestartGroup;
                    BentoTextWithLink.m20753BentoTextWithSubstringLinkXkG1Q0A(strStringResource22, strStringResource32, (Function0) objRememberedValue, modifierTestTag2, jM21425getFg0d7_KjU2, 0L, textAnnotation2, 0, composer2, 0, EnumC7081g.SDK_ASSET_ILLUSTRATION_SECURE_TOKENIZATION_VALUE);
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier3 = modifier42;
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FootnoteRowWithUrl$lambda$5$lambda$4$lambda$3(Context context, String str) {
        WebUtils.viewUrl$default(context, str, 0, 4, (Object) null);
        return Unit.INSTANCE;
    }
}
