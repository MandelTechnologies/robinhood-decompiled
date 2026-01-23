package com.robinhood.android.transfers.p271ui.max;

import android.content.Context;
import android.content.res.Resources;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.text.ClickableTextKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.platform.ComposeView;
import androidx.compose.p011ui.text.AnnotatedString;
import androidx.compose.p011ui.text.TextStyle;
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
import com.robinhood.android.designsystem.compose.ThemesFromScarlet;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiColumns;
import com.robinhood.android.optionsupgrade.knowledgecheckneeded.OptionOnboardingKnowledgeCheckNeededComposable5;
import com.robinhood.android.transfers.p271ui.max.CreateTransferDisclosure;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.text.BentoMarkdownSpannedText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.compose.util.AnnotatedStringResource;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.p348ui.HorizontalPadding;
import com.robinhood.utils.resource.StringResource;
import io.reactivex.Observable;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.extensions2;

/* compiled from: CreateTransferDisclosure.kt */
@Metadata(m3635d1 = {"\u00006\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a'\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007¢\u0006\u0002\u0010\b\u001a'\u0010\t\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u0007¢\u0006\u0002\u0010\u000b\u001a,\u0010\f\u001a\u00020\u0001*\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\u0012"}, m3636d2 = {"CreateTransferDisclosureSection", "", "modifier", "Landroidx/compose/ui/Modifier;", "state", "Lcom/robinhood/android/transfers/ui/max/CreateTransferDisclosure;", "callbacks", "Lcom/robinhood/android/transfers/ui/max/CreateTransferDisclosureCallbacks;", "(Landroidx/compose/ui/Modifier;Lcom/robinhood/android/transfers/ui/max/CreateTransferDisclosure;Lcom/robinhood/android/transfers/ui/max/CreateTransferDisclosureCallbacks;Landroidx/compose/runtime/Composer;II)V", "CreateTransferDisclosureWithResource", "Lcom/robinhood/android/transfers/ui/max/CreateTransferDisclosure$Resource;", "(Lcom/robinhood/android/transfers/ui/max/CreateTransferDisclosure$Resource;Lcom/robinhood/android/transfers/ui/max/CreateTransferDisclosureCallbacks;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "bindDisclosureSection", "Landroidx/compose/ui/platform/ComposeView;", "overlayStream", "Lio/reactivex/Observable;", "Lcom/robinhood/android/designsystem/compose/ThemesFromScarlet;", OptionOnboardingKnowledgeCheckNeededComposable5.DISCLOSURE, "feature-transfers_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.transfers.ui.max.CreateTransferDisclosureKt, reason: use source file name */
/* loaded from: classes9.dex */
public final class CreateTransferDisclosure3 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CreateTransferDisclosureSection$lambda$3(Modifier modifier, CreateTransferDisclosure createTransferDisclosure, CreateTransferDisclosure2 createTransferDisclosure2, int i, int i2, Composer composer, int i3) throws Resources.NotFoundException {
        CreateTransferDisclosureSection(modifier, createTransferDisclosure, createTransferDisclosure2, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CreateTransferDisclosureWithResource$lambda$7(CreateTransferDisclosure.Resource resource, CreateTransferDisclosure2 createTransferDisclosure2, Modifier modifier, int i, int i2, Composer composer, int i3) {
        CreateTransferDisclosureWithResource(resource, createTransferDisclosure2, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:83:0x02ba  */
    @Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CreateTransferDisclosureSection(Modifier modifier, final CreateTransferDisclosure state, final CreateTransferDisclosure2 callbacks, Composer composer, final int i, final int i2) throws Resources.NotFoundException {
        Modifier modifier2;
        int i3;
        Modifier modifier3;
        Modifier modifier4;
        final Modifier modifier5;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1472109528);
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
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= (i & 64) == 0 ? composerStartRestartGroup.changed(state) : composerStartRestartGroup.changedInstance(state) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= (i & 512) == 0 ? composerStartRestartGroup.changed(callbacks) : composerStartRestartGroup.changedInstance(callbacks) ? 256 : 128;
        }
        if ((i3 & 147) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            modifier5 = modifier2;
        } else {
            Modifier modifier6 = i4 != 0 ? Modifier.INSTANCE : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1472109528, i3, -1, "com.robinhood.android.transfers.ui.max.CreateTransferDisclosureSection (CreateTransferDisclosure.kt:79)");
            }
            if (state instanceof CreateTransferDisclosure.Markdown) {
                composerStartRestartGroup.startReplaceGroup(296415974);
                Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ = PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(modifier6, 0.0f, composerStartRestartGroup, i3 & 14, 1);
                String rawMarkdown = ((CreateTransferDisclosure.Markdown) state).getRawMarkdown();
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i5 = BentoTheme.$stable;
                modifier3 = modifier6;
                BentoMarkdownSpannedText2.m21101BentoMarkdownSpannedTextTHkziT8(rawMarkdown, modifierM21623defaultHorizontalPaddingrAjV9yQ, Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i5).m21426getFg20d7_KjU()), Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i5).m21425getFg0d7_KjU()), C20690R.attr.textAppearanceRegularSmall, 17, 0, 0, null, composerStartRestartGroup, 196608, 448);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                modifier3 = modifier6;
                if (state instanceof CreateTransferDisclosure.MarkdownWithResource) {
                    composerStartRestartGroup.startReplaceGroup(296815440);
                    Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ2 = PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(modifier3, 0.0f, composerStartRestartGroup, i3 & 14, 1);
                    StringResource stringResource = ((CreateTransferDisclosure.MarkdownWithResource) state).getStringResource();
                    Resources resources = ((Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext())).getResources();
                    Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
                    String string2 = stringResource.getText(resources).toString();
                    BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                    int i6 = BentoTheme.$stable;
                    BentoMarkdownSpannedText2.m21101BentoMarkdownSpannedTextTHkziT8(string2, modifierM21623defaultHorizontalPaddingrAjV9yQ2, Color.m6701boximpl(bentoTheme2.getColors(composerStartRestartGroup, i6).m21426getFg20d7_KjU()), Color.m6701boximpl(bentoTheme2.getColors(composerStartRestartGroup, i6).m21425getFg0d7_KjU()), C20690R.attr.textAppearanceRegularSmall, 17, 0, 0, null, composerStartRestartGroup, 196608, 448);
                    composerStartRestartGroup.endReplaceGroup();
                } else if (state instanceof CreateTransferDisclosure.ResourceWithLink) {
                    composerStartRestartGroup.startReplaceGroup(297279107);
                    StringResource stringResource2 = ((CreateTransferDisclosure.ResourceWithLink) state).getStringResource();
                    Resources resources2 = ((Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext())).getResources();
                    Intrinsics.checkNotNullExpressionValue(resources2, "getResources(...)");
                    CharSequence text = stringResource2.getText(resources2);
                    BentoTheme bentoTheme3 = BentoTheme.INSTANCE;
                    int i7 = BentoTheme.$stable;
                    final AnnotatedString annotatedStringM22061annotatedStringResourceRIQooxk = AnnotatedStringResource.m22061annotatedStringResourceRIQooxk(text, bentoTheme3.getColors(composerStartRestartGroup, i7).m21426getFg20d7_KjU(), 0L, composerStartRestartGroup, 0, 4);
                    Modifier modifierM5144paddingVpY3zN4$default = androidx.compose.foundation.layout.PaddingKt.m5144paddingVpY3zN4$default(modifier3, bentoTheme3.getSpacing(composerStartRestartGroup, i7).m21592getMediumD9Ej5fM(), 0.0f, 2, null);
                    TextStyle textStyleM7655copyp1EtxEg$default = TextStyle.m7655copyp1EtxEg$default(bentoTheme3.getTypography(composerStartRestartGroup, i7).getTextS(), bentoTheme3.getColors(composerStartRestartGroup, i7).m21426getFg20d7_KjU(), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, TextAlign.INSTANCE.m7919getCentere0LSkKk(), 0, 0L, null, null, null, 0, 0, null, 16744446, null);
                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                    boolean zChanged = composerStartRestartGroup.changed(annotatedStringM22061annotatedStringResourceRIQooxk) | ((i3 & 896) == 256 || ((i3 & 512) != 0 && composerStartRestartGroup.changedInstance(callbacks)));
                    Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function1() { // from class: com.robinhood.android.transfers.ui.max.CreateTransferDisclosureKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return CreateTransferDisclosure3.CreateTransferDisclosureSection$lambda$2$lambda$1(annotatedStringM22061annotatedStringResourceRIQooxk, callbacks, ((Integer) obj).intValue());
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    ClickableTextKt.m5339ClickableText4YKlhWE(annotatedStringM22061annotatedStringResourceRIQooxk, modifierM5144paddingVpY3zN4$default, textStyleM7655copyp1EtxEg$default, false, 0, 0, null, (Function1) objRememberedValue, composerStartRestartGroup, 0, 120);
                    composerStartRestartGroup = composerStartRestartGroup;
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    if (state instanceof CreateTransferDisclosure.Resource) {
                        composerStartRestartGroup.startReplaceGroup(298215276);
                        modifier4 = modifier3;
                        CreateTransferDisclosureWithResource((CreateTransferDisclosure.Resource) state, callbacks, modifier4, composerStartRestartGroup, ((i3 >> 3) & 112) | ((i3 << 6) & 896), 0);
                        composerStartRestartGroup.endReplaceGroup();
                    } else {
                        modifier4 = modifier3;
                        if (!(state instanceof CreateTransferDisclosure.Sdui)) {
                            composerStartRestartGroup.startReplaceGroup(-1653006266);
                            composerStartRestartGroup.endReplaceGroup();
                            throw new NoWhenBranchMatchedException();
                        }
                        composerStartRestartGroup.startReplaceGroup(298402392);
                        int i8 = i3 << 3;
                        composerStartRestartGroup.startReplaceGroup(-1772220517);
                        SduiColumns.SduiColumn(extensions2.toPersistentList(((CreateTransferDisclosure.Sdui) state).getComponents()), GenericAction.class, modifier4, null, callbacks, HorizontalPadding.Default, Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), false, composerStartRestartGroup, ((((i8 & 7168) | ((i8 & 112) | 12582912)) << 3) & 58240) | 100663296, 0);
                        composerStartRestartGroup = composerStartRestartGroup;
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.endReplaceGroup();
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier5 = modifier4;
                }
            }
            modifier4 = modifier3;
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier5 = modifier4;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.transfers.ui.max.CreateTransferDisclosureKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CreateTransferDisclosure3.CreateTransferDisclosureSection$lambda$3(modifier5, state, callbacks, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CreateTransferDisclosureSection$lambda$2$lambda$1(AnnotatedString annotatedString, CreateTransferDisclosure2 createTransferDisclosure2, int i) {
        AnnotatedString.Range range = (AnnotatedString.Range) CollectionsKt.firstOrNull((List) annotatedString.getStringAnnotations("URL", i, i));
        if (range != null) {
            createTransferDisclosure2.onLinkClicked((String) range.getItem());
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0259  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CreateTransferDisclosureWithResource(final CreateTransferDisclosure.Resource state, final CreateTransferDisclosure2 callbacks, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1961653787);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? composerStartRestartGroup.changed(state) : composerStartRestartGroup.changedInstance(state) ? 4 : 2) | i;
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
            if ((i3 & 147) != 146 && composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            } else {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1961653787, i3, -1, "com.robinhood.android.transfers.ui.max.CreateTransferDisclosureWithResource (CreateTransferDisclosure.kt:138)");
                }
                Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ = PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(modifier4, 0.0f, composerStartRestartGroup, (i3 >> 6) & 14, 1);
                MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getCenter(), Alignment.INSTANCE.getCenterVertically(), composerStartRestartGroup, 54);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM21623defaultHorizontalPaddingrAjV9yQ);
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
                StringResource stringResource = state.getStringResource();
                Resources resources = ((Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext())).getResources();
                Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
                CharSequence text = stringResource.getText(resources);
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i5 = BentoTheme.$stable;
                Modifier modifier5 = modifier4;
                int i6 = i3;
                BentoText2.m20748BentoTextQnj7Zds(AnnotatedStringResource.m22061annotatedStringResourceRIQooxk(text, bentoTheme.getColors(composerStartRestartGroup, i5).m21426getFg20d7_KjU(), 0L, composerStartRestartGroup, 0, 4), null, Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i5).m21426getFg20d7_KjU()), null, null, null, TextAlign.m7912boximpl(state.getAction() != null ? TextAlign.INSTANCE.m7919getCentere0LSkKk() : TextAlign.INSTANCE.m7922getLefte0LSkKk()), 0, false, 0, 0, null, null, bentoTheme.getTypography(composerStartRestartGroup, i5).getTextS(), composerStartRestartGroup, 0, 0, 8122);
                composerStartRestartGroup = composerStartRestartGroup;
                composerStartRestartGroup.startReplaceGroup(-914382971);
                if (state.getAction() != null) {
                    Modifier modifierM5146paddingqDBjuR0$default = androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(Modifier.INSTANCE, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21595getXsmallD9Ej5fM(), 0.0f, 0.0f, C2002Dp.m7995constructorimpl(1), 6, null);
                    boolean z = true;
                    BentoIcon4.Size16 size16 = new BentoIcon4.Size16(ServerToBentoAssetMapper2.QUESTION_16);
                    long jM21426getFg20d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i5).m21426getFg20d7_KjU();
                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                    boolean z2 = (i6 & 112) == 32 || ((i6 & 64) != 0 && composerStartRestartGroup.changedInstance(callbacks));
                    if ((i6 & 14) != 4 && ((i6 & 8) == 0 || !composerStartRestartGroup.changedInstance(state))) {
                        z = false;
                    }
                    boolean z3 = z2 | z;
                    Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (z3 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function0() { // from class: com.robinhood.android.transfers.ui.max.CreateTransferDisclosureKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return CreateTransferDisclosure3.CreateTransferDisclosureWithResource$lambda$6$lambda$5$lambda$4(callbacks, state);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    BentoIcon2.m20644BentoIconFU0evQE(size16, null, jM21426getFg20d7_KjU, modifierM5146paddingqDBjuR0$default, (Function0) objRememberedValue, false, composerStartRestartGroup, BentoIcon4.Size16.$stable | 48, 32);
                    composerStartRestartGroup = composerStartRestartGroup;
                }
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.transfers.ui.max.CreateTransferDisclosureKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return CreateTransferDisclosure3.CreateTransferDisclosureWithResource$lambda$7(state, callbacks, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 384;
        modifier2 = modifier;
        if ((i3 & 147) != 146) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ2 = PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(modifier4, 0.0f, composerStartRestartGroup, (i3 >> 6) & 14, 1);
            MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getCenter(), Alignment.INSTANCE.getCenterVertically(), composerStartRestartGroup, 54);
            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM21623defaultHorizontalPaddingrAjV9yQ2);
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
                StringResource stringResource2 = state.getStringResource();
                Resources resources2 = ((Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext())).getResources();
                Intrinsics.checkNotNullExpressionValue(resources2, "getResources(...)");
                CharSequence text2 = stringResource2.getText(resources2);
                BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                int i52 = BentoTheme.$stable;
                if (state.getAction() != null) {
                }
                Modifier modifier52 = modifier4;
                int i62 = i3;
                BentoText2.m20748BentoTextQnj7Zds(AnnotatedStringResource.m22061annotatedStringResourceRIQooxk(text2, bentoTheme2.getColors(composerStartRestartGroup, i52).m21426getFg20d7_KjU(), 0L, composerStartRestartGroup, 0, 4), null, Color.m6701boximpl(bentoTheme2.getColors(composerStartRestartGroup, i52).m21426getFg20d7_KjU()), null, null, null, TextAlign.m7912boximpl(state.getAction() != null ? TextAlign.INSTANCE.m7919getCentere0LSkKk() : TextAlign.INSTANCE.m7922getLefte0LSkKk()), 0, false, 0, 0, null, null, bentoTheme2.getTypography(composerStartRestartGroup, i52).getTextS(), composerStartRestartGroup, 0, 0, 8122);
                composerStartRestartGroup = composerStartRestartGroup;
                composerStartRestartGroup.startReplaceGroup(-914382971);
                if (state.getAction() != null) {
                }
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier3 = modifier52;
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CreateTransferDisclosureWithResource$lambda$6$lambda$5$lambda$4(CreateTransferDisclosure2 createTransferDisclosure2, CreateTransferDisclosure.Resource resource) {
        createTransferDisclosure2.onInfoButtonClicked(resource.getAction());
        return Unit.INSTANCE;
    }

    @Deprecated
    public static final void bindDisclosureSection(ComposeView composeView, final Observable<ThemesFromScarlet> overlayStream, final CreateTransferDisclosure createTransferDisclosure, final CreateTransferDisclosure2 callbacks) {
        Intrinsics.checkNotNullParameter(composeView, "<this>");
        Intrinsics.checkNotNullParameter(overlayStream, "overlayStream");
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        composeView.setVisibility(createTransferDisclosure != null ? 0 : 8);
        if (createTransferDisclosure == null) {
            return;
        }
        composeView.setContent(ComposableLambda3.composableLambdaInstance(734104221, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.transfers.ui.max.CreateTransferDisclosureKt.bindDisclosureSection.1
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
                    ComposerKt.traceEventStart(734104221, i, -1, "com.robinhood.android.transfers.ui.max.bindDisclosureSection.<anonymous> (CreateTransferDisclosure.kt:180)");
                }
                Observable<ThemesFromScarlet> observable = overlayStream;
                final CreateTransferDisclosure createTransferDisclosure2 = createTransferDisclosure;
                final CreateTransferDisclosure2 createTransferDisclosure22 = callbacks;
                BentoTheme2.BentoTheme(observable, null, ComposableLambda3.rememberComposableLambda(1933860139, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.transfers.ui.max.CreateTransferDisclosureKt.bindDisclosureSection.1.1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) throws Resources.NotFoundException {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i2) throws Resources.NotFoundException {
                        if ((i2 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1933860139, i2, -1, "com.robinhood.android.transfers.ui.max.bindDisclosureSection.<anonymous>.<anonymous> (CreateTransferDisclosure.kt:181)");
                        }
                        CreateTransferDisclosure3.CreateTransferDisclosureSection(androidx.compose.foundation.layout.PaddingKt.m5144paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, BentoTheme.INSTANCE.getSpacing(composer2, BentoTheme.$stable).m21590getDefaultD9Ej5fM(), 1, null), createTransferDisclosure2, createTransferDisclosure22, composer2, 0, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composer, 54), composer, 384, 2);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
    }
}
