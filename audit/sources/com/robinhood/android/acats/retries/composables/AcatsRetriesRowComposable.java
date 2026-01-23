package com.robinhood.android.acats.retries.composables;

import android.content.Context;
import android.content.res.Resources;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.Clip;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import coil.compose.SingletonAsyncImage;
import com.robinhood.android.acats.retries.AcatsRetriesRowState;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.rows.BentoBaseRowLayout;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.models.api.bonfire.ApiAcatsTransfer;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: AcatsRetriesRowComposable.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\u001a5\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0014\u0010\u0004\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0007¢\u0006\u0002\u0010\t\"\u000e\u0010\n\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\f\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\r\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000e\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000f\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m3636d2 = {"AcatsRetriesRow", "", "state", "Lcom/robinhood/android/acats/retries/AcatsRetriesRowState;", "onRowClicked", "Lkotlin/Function1;", "Lcom/robinhood/models/api/bonfire/ApiAcatsTransfer$AcatRetryStep;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/android/acats/retries/AcatsRetriesRowState;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "acatsRetriesRowMetaIconTestTag", "", "acatsRetriedRowMetaVerifyIconTestTag", "acatsRetriedRowMetaErrorIconTestTag", "acatsRetriesRowClickableTestTag", "acatsRetriedRowEndIconTestTag", "feature-acats-retries_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.acats.retries.composables.AcatsRetriesRowComposableKt, reason: use source file name */
/* loaded from: classes24.dex */
public final class AcatsRetriesRowComposable {
    public static final String acatsRetriedRowEndIconTestTag = "AcatsRetriesRowEndIcon";
    public static final String acatsRetriedRowMetaErrorIconTestTag = "AcatsRetriesRowMetaErrorIcon";
    public static final String acatsRetriedRowMetaVerifyIconTestTag = "AcatsRetriesRowMetaVerifyIcon";
    public static final String acatsRetriesRowClickableTestTag = "AcatsRetriesRowClickable";
    public static final String acatsRetriesRowMetaIconTestTag = "AcatsRetriesRowMetaIcon";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AcatsRetriesRow$lambda$2(AcatsRetriesRowState acatsRetriesRowState, Function1 function1, Modifier modifier, int i, int i2, Composer composer, int i3) {
        AcatsRetriesRow(acatsRetriesRowState, function1, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:77:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AcatsRetriesRow(final AcatsRetriesRowState state, final Function1<? super ApiAcatsTransfer.AcatRetryStep, Unit> onRowClicked, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        Modifier modifierM4893clickableXHw0xAI$default;
        Composer composer2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(onRowClicked, "onRowClicked");
        Composer composerStartRestartGroup = composer.startRestartGroup(-2106410786);
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
            i3 |= composerStartRestartGroup.changedInstance(onRowClicked) ? 32 : 16;
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
                    ComposerKt.traceEventStart(-2106410786, i3, -1, "com.robinhood.android.acats.retries.composables.AcatsRetriesRow (AcatsRetriesRowComposable.kt:29)");
                }
                final Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                Modifier modifierTestTag = TestTag3.testTag(modifier4, acatsRetriesRowClickableTestTag);
                composerStartRestartGroup.startReplaceGroup(-1331065544);
                if (state.getIsActionable()) {
                    modifierM4893clickableXHw0xAI$default = Modifier.INSTANCE;
                } else {
                    Modifier.Companion companion = Modifier.INSTANCE;
                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                    boolean z = false;
                    boolean z2 = (i3 & 112) == 32;
                    if ((i3 & 14) == 4 || ((i3 & 8) != 0 && composerStartRestartGroup.changedInstance(state))) {
                        z = true;
                    }
                    boolean z3 = z2 | z;
                    Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (z3 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function0() { // from class: com.robinhood.android.acats.retries.composables.AcatsRetriesRowComposableKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return AcatsRetriesRowComposable.AcatsRetriesRow$lambda$1$lambda$0(onRowClicked, state);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    modifierM4893clickableXHw0xAI$default = ClickableKt.m4893clickableXHw0xAI$default(companion, false, null, null, (Function0) objRememberedValue, 7, null);
                }
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifier5 = modifier4;
                composer2 = composerStartRestartGroup;
                BentoBaseRowLayout.BentoBaseRowLayout(modifierTestTag.then(modifierM4893clickableXHw0xAI$default), null, ComposableLambda3.rememberComposableLambda(951335842, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.acats.retries.composables.AcatsRetriesRowComposableKt.AcatsRetriesRow.2
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer3, int i5) {
                        if ((i5 & 3) == 2 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(951335842, i5, -1, "com.robinhood.android.acats.retries.composables.AcatsRetriesRow.<anonymous> (AcatsRetriesRowComposable.kt:33)");
                        }
                        StringResource labelText = state.getLabelText();
                        Resources resources = context.getResources();
                        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
                        String string2 = labelText.getText(resources).toString();
                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                        int i6 = BentoTheme.$stable;
                        BentoText2.m20747BentoText38GnDrw(string2, null, Color.m6701boximpl(bentoTheme.getColors(composer3, i6).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer3, i6).getTextM(), composer3, 0, 0, 8186);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), null, null, ComposableLambda3.rememberComposableLambda(1859998015, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.acats.retries.composables.AcatsRetriesRowComposableKt.AcatsRetriesRow.3

                    /* compiled from: AcatsRetriesRowComposable.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    /* renamed from: com.robinhood.android.acats.retries.composables.AcatsRetriesRowComposableKt$AcatsRetriesRow$3$WhenMappings */
                    public /* synthetic */ class WhenMappings {
                        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                        static {
                            int[] iArr = new int[AcatsRetriesRowState.RowInteractionState.values().length];
                            try {
                                iArr[AcatsRetriesRowState.RowInteractionState.ERROR.ordinal()] = 1;
                            } catch (NoSuchFieldError unused) {
                            }
                            try {
                                iArr[AcatsRetriesRowState.RowInteractionState.VERIFY.ordinal()] = 2;
                            } catch (NoSuchFieldError unused2) {
                            }
                            $EnumSwitchMapping$0 = iArr;
                        }
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer3, int i5) {
                        Context context2;
                        AcatsRetriesRowState acatsRetriesRowState;
                        int i6;
                        Modifier.Companion companion2;
                        long jM21425getFg0d7_KjU;
                        Composer composer4 = composer3;
                        if ((i5 & 3) == 2 && composer4.getSkipping()) {
                            composer4.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1859998015, i5, -1, "com.robinhood.android.acats.retries.composables.AcatsRetriesRow.<anonymous> (AcatsRetriesRowComposable.kt:40)");
                        }
                        Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                        AcatsRetriesRowState acatsRetriesRowState2 = state;
                        Context context3 = context;
                        Modifier.Companion companion3 = Modifier.INSTANCE;
                        MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composer4, 48);
                        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer4, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer4.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer4, companion3);
                        ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion4.getConstructor();
                        if (composer4.getApplier() == null) {
                            Composables.invalidApplier();
                        }
                        composer4.startReusableNode();
                        if (composer4.getInserting()) {
                            composer4.createNode(constructor);
                        } else {
                            composer4.useNode();
                        }
                        Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer4);
                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion4.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion4.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion4.getSetCompositeKeyHash();
                        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion4.getSetModifier());
                        Row6 row6 = Row6.INSTANCE;
                        String metaIconUrl = acatsRetriesRowState2.getMetaIconUrl();
                        composer4.startReplaceGroup(887908633);
                        if (metaIconUrl == null) {
                            acatsRetriesRowState = acatsRetriesRowState2;
                            i6 = 2;
                            context2 = context3;
                            companion2 = companion3;
                        } else {
                            Modifier modifierM5169size3ABfNKs = SizeKt.m5169size3ABfNKs(companion3, C2002Dp.m7995constructorimpl(43));
                            BentoTheme bentoTheme = BentoTheme.INSTANCE;
                            int i7 = BentoTheme.$stable;
                            context2 = context3;
                            acatsRetriesRowState = acatsRetriesRowState2;
                            i6 = 2;
                            companion2 = companion3;
                            SingletonAsyncImage.m9119AsyncImagegl8XCv8(metaIconUrl, null, TestTag3.testTag(PaddingKt.m5146paddingqDBjuR0$default(Clip.clip(modifierM5169size3ABfNKs, RoundedCornerShape2.m5327RoundedCornerShape0680j_4(bentoTheme.getSpacing(composer4, i7).m21597getXxsmallD9Ej5fM())), 0.0f, 0.0f, bentoTheme.getSpacing(composer4, i7).m21593getSmallD9Ej5fM(), 0.0f, 11, null), AcatsRetriesRowComposable.acatsRetriesRowMetaIconTestTag), null, null, null, null, 0.0f, null, 0, false, null, composer3, 48, 0, 4088);
                            composer4 = composer3;
                        }
                        composer4.endReplaceGroup();
                        StringResource metaText = acatsRetriesRowState.getMetaText();
                        Resources resources = context2.getResources();
                        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
                        String string2 = metaText.getText(resources).toString();
                        if (acatsRetriesRowState.getInteractionState() == AcatsRetriesRowState.RowInteractionState.ERROR) {
                            composer4.startReplaceGroup(1756038688);
                            jM21425getFg0d7_KjU = BentoTheme.INSTANCE.getColors(composer4, BentoTheme.$stable).getJoule();
                            composer4.endReplaceGroup();
                        } else {
                            composer4.startReplaceGroup(1756114979);
                            jM21425getFg0d7_KjU = BentoTheme.INSTANCE.getColors(composer4, BentoTheme.$stable).m21425getFg0d7_KjU();
                            composer4.endReplaceGroup();
                        }
                        Color colorM6701boximpl = Color.m6701boximpl(jM21425getFg0d7_KjU);
                        BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                        int i8 = BentoTheme.$stable;
                        BentoText2.m20747BentoText38GnDrw(string2, null, colorM6701boximpl, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composer4, i8).getTextM(), composer3, 0, 0, 8186);
                        int i9 = WhenMappings.$EnumSwitchMapping$0[acatsRetriesRowState.getInteractionState().ordinal()];
                        if (i9 == 1) {
                            composer3.startReplaceGroup(1756388461);
                            BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size16(ServerToBentoAssetMapper2.ALERT_16), null, bentoTheme2.getColors(composer3, i8).getJoule(), TestTag3.testTag(PaddingKt.m5146paddingqDBjuR0$default(companion2, bentoTheme2.getSpacing(composer3, i8).m21593getSmallD9Ej5fM(), 0.0f, 0.0f, 0.0f, 14, null), AcatsRetriesRowComposable.acatsRetriedRowMetaErrorIconTestTag), null, false, composer3, BentoIcon4.Size16.$stable | 48, 48);
                            composer3.endReplaceGroup();
                        } else if (i9 != i6) {
                            composer3.startReplaceGroup(887972735);
                            composer3.endReplaceGroup();
                        } else {
                            composer3.startReplaceGroup(1756898318);
                            BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size16(ServerToBentoAssetMapper2.DOT_16), null, bentoTheme2.getColors(composer3, i8).getPrime(), TestTag3.testTag(PaddingKt.m5146paddingqDBjuR0$default(companion2, bentoTheme2.getSpacing(composer3, i8).m21593getSmallD9Ej5fM(), 0.0f, 0.0f, 0.0f, 14, null), AcatsRetriesRowComposable.acatsRetriedRowMetaVerifyIconTestTag), null, false, composer3, BentoIcon4.Size16.$stable | 48, 48);
                            composer3.endReplaceGroup();
                        }
                        composer3.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(-2132081890, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.acats.retries.composables.AcatsRetriesRowComposableKt.AcatsRetriesRow.4
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer3, int i5) {
                        if ((i5 & 3) == 2 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-2132081890, i5, -1, "com.robinhood.android.acats.retries.composables.AcatsRetriesRow.<anonymous> (AcatsRetriesRowComposable.kt:86)");
                        }
                        if (state.getIsActionable()) {
                            BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size16(ServerToBentoAssetMapper2.CARET_RIGHT_16), null, BentoTheme.INSTANCE.getColors(composer3, BentoTheme.$stable).m21427getFg30d7_KjU(), TestTag3.testTag(Modifier.INSTANCE, AcatsRetriesRowComposable.acatsRetriedRowEndIconTestTag), null, false, composer3, BentoIcon4.Size16.$stable | 3120, 48);
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), true, false, false, null, composer2, 14352768, 0, 1818);
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
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.acats.retries.composables.AcatsRetriesRowComposableKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return AcatsRetriesRowComposable.AcatsRetriesRow$lambda$2(state, onRowClicked, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
            final Context context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            Modifier modifierTestTag2 = TestTag3.testTag(modifier4, acatsRetriesRowClickableTestTag);
            composerStartRestartGroup.startReplaceGroup(-1331065544);
            if (state.getIsActionable()) {
            }
            composerStartRestartGroup.endReplaceGroup();
            Modifier modifier52 = modifier4;
            composer2 = composerStartRestartGroup;
            BentoBaseRowLayout.BentoBaseRowLayout(modifierTestTag2.then(modifierM4893clickableXHw0xAI$default), null, ComposableLambda3.rememberComposableLambda(951335842, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.acats.retries.composables.AcatsRetriesRowComposableKt.AcatsRetriesRow.2
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i5) {
                    if ((i5 & 3) == 2 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(951335842, i5, -1, "com.robinhood.android.acats.retries.composables.AcatsRetriesRow.<anonymous> (AcatsRetriesRowComposable.kt:33)");
                    }
                    StringResource labelText = state.getLabelText();
                    Resources resources = context2.getResources();
                    Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
                    String string2 = labelText.getText(resources).toString();
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i6 = BentoTheme.$stable;
                    BentoText2.m20747BentoText38GnDrw(string2, null, Color.m6701boximpl(bentoTheme.getColors(composer3, i6).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer3, i6).getTextM(), composer3, 0, 0, 8186);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), null, null, ComposableLambda3.rememberComposableLambda(1859998015, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.acats.retries.composables.AcatsRetriesRowComposableKt.AcatsRetriesRow.3

                /* compiled from: AcatsRetriesRowComposable.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                /* renamed from: com.robinhood.android.acats.retries.composables.AcatsRetriesRowComposableKt$AcatsRetriesRow$3$WhenMappings */
                public /* synthetic */ class WhenMappings {
                    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                    static {
                        int[] iArr = new int[AcatsRetriesRowState.RowInteractionState.values().length];
                        try {
                            iArr[AcatsRetriesRowState.RowInteractionState.ERROR.ordinal()] = 1;
                        } catch (NoSuchFieldError unused) {
                        }
                        try {
                            iArr[AcatsRetriesRowState.RowInteractionState.VERIFY.ordinal()] = 2;
                        } catch (NoSuchFieldError unused2) {
                        }
                        $EnumSwitchMapping$0 = iArr;
                    }
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i5) {
                    Context context22;
                    AcatsRetriesRowState acatsRetriesRowState;
                    int i6;
                    Modifier.Companion companion2;
                    long jM21425getFg0d7_KjU;
                    Composer composer4 = composer3;
                    if ((i5 & 3) == 2 && composer4.getSkipping()) {
                        composer4.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1859998015, i5, -1, "com.robinhood.android.acats.retries.composables.AcatsRetriesRow.<anonymous> (AcatsRetriesRowComposable.kt:40)");
                    }
                    Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                    AcatsRetriesRowState acatsRetriesRowState2 = state;
                    Context context3 = context2;
                    Modifier.Companion companion3 = Modifier.INSTANCE;
                    MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composer4, 48);
                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer4, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer4.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer4, companion3);
                    ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion4.getConstructor();
                    if (composer4.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composer4.startReusableNode();
                    if (composer4.getInserting()) {
                        composer4.createNode(constructor);
                    } else {
                        composer4.useNode();
                    }
                    Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer4);
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion4.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion4.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion4.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion4.getSetModifier());
                    Row6 row6 = Row6.INSTANCE;
                    String metaIconUrl = acatsRetriesRowState2.getMetaIconUrl();
                    composer4.startReplaceGroup(887908633);
                    if (metaIconUrl == null) {
                        acatsRetriesRowState = acatsRetriesRowState2;
                        i6 = 2;
                        context22 = context3;
                        companion2 = companion3;
                    } else {
                        Modifier modifierM5169size3ABfNKs = SizeKt.m5169size3ABfNKs(companion3, C2002Dp.m7995constructorimpl(43));
                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                        int i7 = BentoTheme.$stable;
                        context22 = context3;
                        acatsRetriesRowState = acatsRetriesRowState2;
                        i6 = 2;
                        companion2 = companion3;
                        SingletonAsyncImage.m9119AsyncImagegl8XCv8(metaIconUrl, null, TestTag3.testTag(PaddingKt.m5146paddingqDBjuR0$default(Clip.clip(modifierM5169size3ABfNKs, RoundedCornerShape2.m5327RoundedCornerShape0680j_4(bentoTheme.getSpacing(composer4, i7).m21597getXxsmallD9Ej5fM())), 0.0f, 0.0f, bentoTheme.getSpacing(composer4, i7).m21593getSmallD9Ej5fM(), 0.0f, 11, null), AcatsRetriesRowComposable.acatsRetriesRowMetaIconTestTag), null, null, null, null, 0.0f, null, 0, false, null, composer3, 48, 0, 4088);
                        composer4 = composer3;
                    }
                    composer4.endReplaceGroup();
                    StringResource metaText = acatsRetriesRowState.getMetaText();
                    Resources resources = context22.getResources();
                    Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
                    String string2 = metaText.getText(resources).toString();
                    if (acatsRetriesRowState.getInteractionState() == AcatsRetriesRowState.RowInteractionState.ERROR) {
                        composer4.startReplaceGroup(1756038688);
                        jM21425getFg0d7_KjU = BentoTheme.INSTANCE.getColors(composer4, BentoTheme.$stable).getJoule();
                        composer4.endReplaceGroup();
                    } else {
                        composer4.startReplaceGroup(1756114979);
                        jM21425getFg0d7_KjU = BentoTheme.INSTANCE.getColors(composer4, BentoTheme.$stable).m21425getFg0d7_KjU();
                        composer4.endReplaceGroup();
                    }
                    Color colorM6701boximpl = Color.m6701boximpl(jM21425getFg0d7_KjU);
                    BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                    int i8 = BentoTheme.$stable;
                    BentoText2.m20747BentoText38GnDrw(string2, null, colorM6701boximpl, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composer4, i8).getTextM(), composer3, 0, 0, 8186);
                    int i9 = WhenMappings.$EnumSwitchMapping$0[acatsRetriesRowState.getInteractionState().ordinal()];
                    if (i9 == 1) {
                        composer3.startReplaceGroup(1756388461);
                        BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size16(ServerToBentoAssetMapper2.ALERT_16), null, bentoTheme2.getColors(composer3, i8).getJoule(), TestTag3.testTag(PaddingKt.m5146paddingqDBjuR0$default(companion2, bentoTheme2.getSpacing(composer3, i8).m21593getSmallD9Ej5fM(), 0.0f, 0.0f, 0.0f, 14, null), AcatsRetriesRowComposable.acatsRetriedRowMetaErrorIconTestTag), null, false, composer3, BentoIcon4.Size16.$stable | 48, 48);
                        composer3.endReplaceGroup();
                    } else if (i9 != i6) {
                        composer3.startReplaceGroup(887972735);
                        composer3.endReplaceGroup();
                    } else {
                        composer3.startReplaceGroup(1756898318);
                        BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size16(ServerToBentoAssetMapper2.DOT_16), null, bentoTheme2.getColors(composer3, i8).getPrime(), TestTag3.testTag(PaddingKt.m5146paddingqDBjuR0$default(companion2, bentoTheme2.getSpacing(composer3, i8).m21593getSmallD9Ej5fM(), 0.0f, 0.0f, 0.0f, 14, null), AcatsRetriesRowComposable.acatsRetriedRowMetaVerifyIconTestTag), null, false, composer3, BentoIcon4.Size16.$stable | 48, 48);
                        composer3.endReplaceGroup();
                    }
                    composer3.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(-2132081890, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.acats.retries.composables.AcatsRetriesRowComposableKt.AcatsRetriesRow.4
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i5) {
                    if ((i5 & 3) == 2 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-2132081890, i5, -1, "com.robinhood.android.acats.retries.composables.AcatsRetriesRow.<anonymous> (AcatsRetriesRowComposable.kt:86)");
                    }
                    if (state.getIsActionable()) {
                        BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size16(ServerToBentoAssetMapper2.CARET_RIGHT_16), null, BentoTheme.INSTANCE.getColors(composer3, BentoTheme.$stable).m21427getFg30d7_KjU(), TestTag3.testTag(Modifier.INSTANCE, AcatsRetriesRowComposable.acatsRetriedRowEndIconTestTag), null, false, composer3, BentoIcon4.Size16.$stable | 3120, 48);
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), true, false, false, null, composer2, 14352768, 0, 1818);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier3 = modifier52;
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AcatsRetriesRow$lambda$1$lambda$0(Function1 function1, AcatsRetriesRowState acatsRetriesRowState) {
        function1.invoke(acatsRetriesRowState.getRowAction());
        return Unit.INSTANCE;
    }
}
