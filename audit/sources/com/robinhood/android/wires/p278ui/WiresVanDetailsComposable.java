package com.robinhood.android.wires.p278ui;

import android.net.Uri;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.ScaffoldKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.TextLayoutResult;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.BentoRichText;
import com.robinhood.android.wires.p278ui.WiresVanDetailsComposable;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoDivider;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.rows.BentoBaseRowKt;
import com.robinhood.compose.bento.component.rows.BentoBaseRowState;
import com.robinhood.compose.bento.component.rows.BentoValuePropRow;
import com.robinhood.compose.bento.component.rows.BentoValuePropRow2;
import com.robinhood.compose.bento.component.rows.BentoValuePropRow3;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.models.api.bonfire.transfer.wires.ApiMessageDetailRow;
import com.robinhood.models.api.bonfire.transfer.wires.ApiWireVanDetails;
import com.robinhood.models.api.bonfire.transfer.wires.ApiWireVanDetailsInfoRow;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.utils.compose.ClipboardUtil;
import com.robinhood.utils.compose.ClipboardUtil2;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContextImpl6;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: WiresVanDetailsComposable.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a5\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u0007¢\u0006\u0002\u0010\n\"\u000e\u0010\u000b\u001a\u00020\fX\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\r\u001a\u00020\fX\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000e\u001a\u00020\fX\u0080T¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m3636d2 = {"WiresVanDetailsComposable", "", "onDoneButtonClick", "Lkotlin/Function0;", "screenLoggingContext", "Lcom/robinhood/rosetta/eventlogging/Context;", "vanDetails", "Lcom/robinhood/models/api/bonfire/transfer/wires/ApiWireVanDetails;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lkotlin/jvm/functions/Function0;Lcom/robinhood/rosetta/eventlogging/Context;Lcom/robinhood/models/api/bonfire/transfer/wires/ApiWireVanDetails;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "MessageDetailRowPrefixTag", "", "MesssageDetailDividerTag", "InfoRowPrefixTag", "feature-wires_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.wires.ui.WiresVanDetailsComposableKt, reason: use source file name */
/* loaded from: classes16.dex */
public final class WiresVanDetailsComposable {
    public static final String InfoRowPrefixTag = "InfoRow_";
    public static final String MessageDetailRowPrefixTag = "MessageDetailRow_";
    public static final String MesssageDetailDividerTag = "MessageDetailDivider";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit WiresVanDetailsComposable$lambda$0(Function0 function0, Context context, ApiWireVanDetails apiWireVanDetails, Modifier modifier, int i, int i2, Composer composer, int i3) {
        WiresVanDetailsComposable(function0, context, apiWireVanDetails, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final void WiresVanDetailsComposable(final Function0<Unit> onDoneButtonClick, final Context screenLoggingContext, final ApiWireVanDetails vanDetails, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        final Modifier modifier2;
        Intrinsics.checkNotNullParameter(onDoneButtonClick, "onDoneButtonClick");
        Intrinsics.checkNotNullParameter(screenLoggingContext, "screenLoggingContext");
        Intrinsics.checkNotNullParameter(vanDetails, "vanDetails");
        Composer composerStartRestartGroup = composer.startRestartGroup(766494748);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(onDoneButtonClick) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(screenLoggingContext) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(vanDetails) ? 256 : 128;
        }
        int i4 = i2 & 8;
        if (i4 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 2048 : 1024;
        }
        if ((i3 & 1171) != 1170 || !composerStartRestartGroup.getSkipping()) {
            Modifier modifier3 = i4 != 0 ? Modifier.INSTANCE : modifier;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(766494748, i3, -1, "com.robinhood.android.wires.ui.WiresVanDetailsComposable (WiresVanDetailsComposable.kt:44)");
            }
            final ClipboardUtil clipboardUtil = ClipboardUtil2.clipboardUtil(composerStartRestartGroup, 0);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = EffectsKt.createCompositionCoroutineScope(CoroutineContextImpl6.INSTANCE, composerStartRestartGroup);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final CoroutineScope coroutineScope = (CoroutineScope) objRememberedValue;
            final Modifier modifier4 = modifier3;
            BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(-318023823, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.wires.ui.WiresVanDetailsComposableKt.WiresVanDetailsComposable.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i5) {
                    if ((i5 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-318023823, i5, -1, "com.robinhood.android.wires.ui.WiresVanDetailsComposable.<anonymous> (WiresVanDetailsComposable.kt:49)");
                    }
                    ScaffoldKt.m5625Scaffold27mzLpw(modifier4, null, null, null, null, null, 0, false, null, false, null, 0.0f, 0L, 0L, 0L, BentoTheme.INSTANCE.getColors(composer2, BentoTheme.$stable).m21371getBg0d7_KjU(), 0L, ComposableLambda3.rememberComposableLambda(-137695245, true, new AnonymousClass1(onDoneButtonClick, vanDetails, screenLoggingContext, coroutineScope, clipboardUtil), composer2, 54), composer2, 0, 12582912, 98302);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }

                /* compiled from: WiresVanDetailsComposable.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.android.wires.ui.WiresVanDetailsComposableKt$WiresVanDetailsComposable$1$1, reason: invalid class name */
                static final class AnonymousClass1 implements Function3<PaddingValues, Composer, Integer, Unit> {
                    final /* synthetic */ ClipboardUtil $clipboardUtil;
                    final /* synthetic */ Function0<Unit> $onDoneButtonClick;
                    final /* synthetic */ CoroutineScope $scope;
                    final /* synthetic */ Context $screenLoggingContext;
                    final /* synthetic */ ApiWireVanDetails $vanDetails;

                    AnonymousClass1(Function0<Unit> function0, ApiWireVanDetails apiWireVanDetails, Context context, CoroutineScope coroutineScope, ClipboardUtil clipboardUtil) {
                        this.$onDoneButtonClick = function0;
                        this.$vanDetails = apiWireVanDetails;
                        this.$screenLoggingContext = context;
                        this.$scope = coroutineScope;
                        this.$clipboardUtil = clipboardUtil;
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer, Integer num) {
                        invoke(paddingValues, composer, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(PaddingValues padding, Composer composer, int i) {
                        Composer composer2;
                        int i2;
                        boolean z;
                        Intrinsics.checkNotNullParameter(padding, "padding");
                        int i3 = (i & 6) == 0 ? i | (composer.changed(padding) ? 4 : 2) : i;
                        if ((i3 & 19) == 18 && composer.getSkipping()) {
                            composer.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-137695245, i3, -1, "com.robinhood.android.wires.ui.WiresVanDetailsComposable.<anonymous>.<anonymous> (WiresVanDetailsComposable.kt:53)");
                        }
                        Modifier.Companion companion = Modifier.INSTANCE;
                        Modifier modifierPadding = PaddingKt.padding(companion, padding);
                        Function0<Unit> function0 = this.$onDoneButtonClick;
                        ApiWireVanDetails apiWireVanDetails = this.$vanDetails;
                        Context context = this.$screenLoggingContext;
                        CoroutineScope coroutineScope = this.$scope;
                        ClipboardUtil clipboardUtil = this.$clipboardUtil;
                        Arrangement arrangement = Arrangement.INSTANCE;
                        Arrangement.Vertical top = arrangement.getTop();
                        Alignment.Companion companion2 = Alignment.INSTANCE;
                        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion2.getStart(), composer, 0);
                        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierPadding);
                        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                        Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(Column5.weight$default(Column6.INSTANCE, SizeKt.fillMaxHeight$default(companion, 0.0f, 1, null), 1.0f, false, 2, null), ScrollKt.rememberScrollState(0, composer, 0, 1), false, null, false, 14, null);
                        MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), composer, 0);
                        int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer, 0);
                        CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer, modifierVerticalScroll$default);
                        Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
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
                        Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy2, companion3.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                        if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                            composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                            composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
                        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                        int i4 = BentoTheme.$stable;
                        CoroutineScope coroutineScope2 = coroutineScope;
                        ClipboardUtil clipboardUtil2 = clipboardUtil;
                        BentoText2.m20747BentoText38GnDrw(apiWireVanDetails.getTitle(), PaddingKt.m5146paddingqDBjuR0$default(PaddingKt.m5144paddingVpY3zN4$default(modifierFillMaxWidth$default, bentoTheme.getSpacing(composer, i4).m21592getMediumD9Ej5fM(), 0.0f, 2, null), 0.0f, 0.0f, 0.0f, bentoTheme.getSpacing(composer, i4).m21593getSmallD9Ej5fM(), 7, null), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i4).getDisplayCapsuleMedium(), composer, 0, 0, 8188);
                        composer.startReplaceGroup(-539567007);
                        Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), bentoTheme.getSpacing(composer, i4).m21592getMediumD9Ej5fM(), 0.0f, 2, null);
                        if (!apiWireVanDetails.getMessage_details().isEmpty()) {
                            modifierM5144paddingVpY3zN4$default = PaddingKt.m5146paddingqDBjuR0$default(modifierM5144paddingVpY3zN4$default, 0.0f, 0.0f, 0.0f, bentoTheme.getSpacing(composer, i4).m21595getXsmallD9Ej5fM(), 7, null);
                        }
                        composer.endReplaceGroup();
                        BentoRichText.m15948BentoRichText0sCZWFg(apiWireVanDetails.getMessage().toDbModel(), modifierM5144paddingVpY3zN4$default, bentoTheme.getTypography(composer, i4).getTextM(), 0L, 0L, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (Function1<? super Uri, Unit>) null, composer, 0, 1016);
                        List<ApiMessageDetailRow> message_details = apiWireVanDetails.getMessage_details();
                        composer.startReplaceGroup(-539552436);
                        int i5 = 0;
                        for (Object obj : message_details) {
                            int i6 = i5 + 1;
                            if (i5 < 0) {
                                CollectionsKt.throwIndexOverflow();
                            }
                            ApiMessageDetailRow apiMessageDetailRow = (ApiMessageDetailRow) obj;
                            composer.startReplaceGroup(-539550447);
                            composer.startReplaceGroup(-539542794);
                            Modifier modifierTestTag = TestTag3.testTag(Modifier.INSTANCE, WiresVanDetailsComposable.MessageDetailRowPrefixTag + i5);
                            if (i5 == 0) {
                                modifierTestTag = PaddingKt.m5146paddingqDBjuR0$default(modifierTestTag, 0.0f, BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21590getDefaultD9Ej5fM(), 0.0f, 0.0f, 13, null);
                            }
                            composer.endReplaceGroup();
                            BentoValuePropRow3.BentoValuePropRow((String) null, apiMessageDetailRow.getDetails().getText(), new BentoValuePropRow2.Icon(apiMessageDetailRow.getIcon(), null, 2, null), BentoValuePropRow.Top, modifierTestTag, composer, (BentoValuePropRow2.Icon.$stable << 6) | 3078, 0);
                            Unit unit = Unit.INSTANCE;
                            composer.endReplaceGroup();
                            i5 = i6;
                        }
                        Object obj2 = null;
                        composer.endReplaceGroup();
                        composer.startReplaceGroup(-539522300);
                        if (message_details.isEmpty()) {
                            composer2 = composer;
                            i2 = 1;
                            z = false;
                        } else {
                            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                            int i7 = BentoTheme.$stable;
                            i2 = 1;
                            z = false;
                            composer2 = composer;
                            BentoDivider.m20635BentoHorizontalDivideraMcp0Q(TestTag3.testTag(PaddingKt.m5146paddingqDBjuR0$default(PaddingKt.m5144paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), bentoTheme2.getSpacing(composer, i7).m21592getMediumD9Ej5fM(), 0.0f, 2, null), 0.0f, bentoTheme2.getSpacing(composer, i7).m21590getDefaultD9Ej5fM(), 0.0f, 0.0f, 13, null), WiresVanDetailsComposable.MesssageDetailDividerTag), bentoTheme2.getColors(composer, i7).m21373getBg30d7_KjU(), 0.0f, composer2, 0, 4);
                        }
                        composer2.endReplaceGroup();
                        composer2.startReplaceGroup(-539501449);
                        for (final ApiWireVanDetailsInfoRow apiWireVanDetailsInfoRow : apiWireVanDetails.getInfo_rows()) {
                            composer2.startReplaceGroup(-539499956);
                            BentoBaseRowState.Meta.Icon icon = new BentoBaseRowState.Meta.Icon(ServerToBentoAssetMapper2.COPY_24, "copyIcon", (Color) null, (Function0) null, 12, (DefaultConstructorMarker) null);
                            String primary_text = apiWireVanDetailsInfoRow.getPrimary_text();
                            String secondary_text = apiWireVanDetailsInfoRow.getSecondary_text();
                            int i8 = i2;
                            Modifier modifierTestTag2 = TestTag3.testTag(ModifiersKt.autoLogEvents$default(Modifier.INSTANCE, new UserInteractionEventDescriptor(null, new Screen(Screen.Name.WIRE_VAN_DETAILS, null, null, null, 14, null), null, context, new Component(Component.ComponentType.ROW, apiWireVanDetailsInfoRow.getLogging_identifier(), null, 4, null), null, 37, null), false, false, false, true, false, null, 110, null), WiresVanDetailsComposable.InfoRowPrefixTag + apiWireVanDetailsInfoRow.getLogging_identifier());
                            composer2.startReplaceGroup(-1746271574);
                            final CoroutineScope coroutineScope3 = coroutineScope2;
                            final ClipboardUtil clipboardUtil3 = clipboardUtil2;
                            boolean zChangedInstance = composer2.changedInstance(coroutineScope3) | composer2.changedInstance(clipboardUtil3) | composer2.changedInstance(apiWireVanDetailsInfoRow);
                            Object objRememberedValue = composer2.rememberedValue();
                            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new Function0() { // from class: com.robinhood.android.wires.ui.WiresVanDetailsComposableKt$WiresVanDetailsComposable$1$1$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return WiresVanDetailsComposable.C315271.AnonymousClass1.invoke$lambda$9$lambda$8$lambda$7$lambda$6$lambda$5$lambda$4(coroutineScope3, clipboardUtil3, apiWireVanDetailsInfoRow);
                                    }
                                };
                                composer2.updateRememberedValue(objRememberedValue);
                            }
                            composer2.endReplaceGroup();
                            clipboardUtil2 = clipboardUtil3;
                            coroutineScope2 = coroutineScope3;
                            BentoBaseRowKt.m20916BentoBaseRowygcbOzY(modifierTestTag2, null, primary_text, secondary_text, null, icon, null, false, false, false, 0L, (Function0) objRememberedValue, composer, BentoBaseRowState.Meta.Icon.$stable << 15, 0, 2002);
                            Unit unit2 = Unit.INSTANCE;
                            composer.endReplaceGroup();
                            i2 = i8;
                            composer2 = composer;
                            z = false;
                            obj2 = null;
                        }
                        Composer composer3 = composer2;
                        int i9 = i2;
                        composer3.endReplaceGroup();
                        BentoTheme bentoTheme3 = BentoTheme.INSTANCE;
                        int i10 = BentoTheme.$stable;
                        long jM21426getFg20d7_KjU = bentoTheme3.getColors(composer3, i10).m21426getFg20d7_KjU();
                        Modifier.Companion companion4 = Modifier.INSTANCE;
                        BentoText2.m20747BentoText38GnDrw(apiWireVanDetails.getDisclosure(), PaddingKt.m5146paddingqDBjuR0$default(PaddingKt.m5144paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion4, 0.0f, i9, null), bentoTheme3.getSpacing(composer3, i10).m21592getMediumD9Ej5fM(), 0.0f, 2, null), 0.0f, bentoTheme3.getSpacing(composer3, i10).m21594getXlargeD9Ej5fM(), 0.0f, 0.0f, 13, null), Color.m6701boximpl(jM21426getFg20d7_KjU), null, null, null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme3.getTypography(composer3, i10).getTextS(), composer, 0, 0, 8120);
                        composer.endNode();
                        BentoButtonKt.m20586BentoButtonEikTQX8(function0, StringResources_androidKt.stringResource(C11048R.string.general_label_done, composer, 0), PaddingKt.m5146paddingqDBjuR0$default(PaddingKt.m5144paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion4, 0.0f, i9, null), bentoTheme3.getSpacing(composer, i10).m21592getMediumD9Ej5fM(), 0.0f, 2, null), 0.0f, bentoTheme3.getSpacing(composer, i10).m21593getSmallD9Ej5fM(), 0.0f, 0.0f, 13, null), null, null, false, false, null, null, null, null, false, null, composer, 0, 0, 8184);
                        composer.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$9$lambda$8$lambda$7$lambda$6$lambda$5$lambda$4(CoroutineScope coroutineScope, ClipboardUtil clipboardUtil, ApiWireVanDetailsInfoRow apiWireVanDetailsInfoRow) {
                        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new WiresVanDetailsComposable2(clipboardUtil, apiWireVanDetailsInfoRow, null), 3, null);
                        return Unit.INSTANCE;
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = modifier4;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            modifier2 = modifier;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.wires.ui.WiresVanDetailsComposableKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return WiresVanDetailsComposable.WiresVanDetailsComposable$lambda$0(onDoneButtonClick, screenLoggingContext, vanDetails, modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
