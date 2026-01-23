package com.robinhood.android.wires.p278ui;

import android.content.Context;
import android.content.res.Resources;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.wires.C31498R;
import com.robinhood.compose.bento.component.BentoButtonBar3;
import com.robinhood.compose.bento.component.BentoButtonBarScreenLayout;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.rows.BentoValuePropRow;
import com.robinhood.compose.bento.component.rows.BentoValuePropRow2;
import com.robinhood.compose.bento.component.rows.BentoValuePropRow3;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.compose.util.AnnotatedStringResource;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OutgoingWiresInfoComposable.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a%\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, m3636d2 = {"OutgoingWiresInfoComposable", "", "onContinueClick", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "feature-wires_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.wires.ui.OutgoingWiresInfoComposableKt, reason: use source file name */
/* loaded from: classes16.dex */
public final class OutgoingWiresInfoComposable {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OutgoingWiresInfoComposable$lambda$0(Function0 function0, Modifier modifier, int i, int i2, Composer composer, int i3) {
        OutgoingWiresInfoComposable(function0, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final void OutgoingWiresInfoComposable(final Function0<Unit> onContinueClick, final Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(onContinueClick, "onContinueClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(-939162869);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(onContinueClick) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        if ((i3 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-939162869, i3, -1, "com.robinhood.android.wires.ui.OutgoingWiresInfoComposable (OutgoingWiresInfoComposable.kt:25)");
            }
            BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(-1125433312, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.wires.ui.OutgoingWiresInfoComposableKt.OutgoingWiresInfoComposable.1
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
                        ComposerKt.traceEventStart(-1125433312, i5, -1, "com.robinhood.android.wires.ui.OutgoingWiresInfoComposable.<anonymous> (OutgoingWiresInfoComposable.kt:27)");
                    }
                    final Function0<Unit> function0 = onContinueClick;
                    ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(1339856341, true, new Function3<BentoButtonBar3, Composer, Integer, Unit>() { // from class: com.robinhood.android.wires.ui.OutgoingWiresInfoComposableKt.OutgoingWiresInfoComposable.1.1
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(BentoButtonBar3 bentoButtonBar3, Composer composer3, Integer num) {
                            invoke(bentoButtonBar3, composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(BentoButtonBar3 BentoButtonBarScreenLayout, Composer composer3, int i6) {
                            Intrinsics.checkNotNullParameter(BentoButtonBarScreenLayout, "$this$BentoButtonBarScreenLayout");
                            if ((i6 & 17) == 16 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1339856341, i6, -1, "com.robinhood.android.wires.ui.OutgoingWiresInfoComposable.<anonymous>.<anonymous> (OutgoingWiresInfoComposable.kt:29)");
                            }
                            BentoButtonKt.m20586BentoButtonEikTQX8(function0, StringResources_androidKt.stringResource(C11048R.string.general_label_continue, composer3, 0), PaddingKt.m5144paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), BentoTheme.INSTANCE.getSpacing(composer3, BentoTheme.$stable).m21592getMediumD9Ej5fM(), 0.0f, 2, null), null, null, false, false, null, null, null, null, false, null, composer3, 0, 0, 8184);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer2, 54);
                    final Modifier modifier2 = modifier;
                    BentoButtonBarScreenLayout.BentoButtonBarScreenLayout(null, false, composableLambdaRememberComposableLambda, ComposableLambda3.rememberComposableLambda(-759448824, true, new Function3<BoxScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.wires.ui.OutgoingWiresInfoComposableKt.OutgoingWiresInfoComposable.1.2
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, Composer composer3, Integer num) throws Resources.NotFoundException {
                            invoke(boxScope, composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(BoxScope BentoButtonBarScreenLayout, Composer composer3, int i6) throws Resources.NotFoundException {
                            Intrinsics.checkNotNullParameter(BentoButtonBarScreenLayout, "$this$BentoButtonBarScreenLayout");
                            if ((i6 & 17) == 16 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-759448824, i6, -1, "com.robinhood.android.wires.ui.OutgoingWiresInfoComposable.<anonymous>.<anonymous> (OutgoingWiresInfoComposable.kt:40)");
                            }
                            Modifier modifier3 = modifier2;
                            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer3, 0);
                            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer3, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer3, modifier3);
                            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion.getConstructor();
                            if (composer3.getApplier() == null) {
                                Composables.invalidApplier();
                            }
                            composer3.startReusableNode();
                            if (composer3.getInserting()) {
                                composer3.createNode(constructor);
                            } else {
                                composer3.useNode();
                            }
                            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer3);
                            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
                            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            }
                            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                            Column6 column6 = Column6.INSTANCE;
                            String strStringResource = StringResources_androidKt.stringResource(C31498R.string.outgoing_wire_info_title, composer3, 0);
                            BentoTheme bentoTheme = BentoTheme.INSTANCE;
                            int i7 = BentoTheme.$stable;
                            BentoText2.m20747BentoText38GnDrw(strStringResource, PaddingKt.m5146paddingqDBjuR0$default(Modifier.INSTANCE, bentoTheme.getSpacing(composer3, i7).m21592getMediumD9Ej5fM(), 0.0f, bentoTheme.getSpacing(composer3, i7).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composer3, i7).m21592getMediumD9Ej5fM(), 2, null), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer3, i7).getDisplayCapsuleMedium(), composer3, 0, 0, 8188);
                            String strStringResource2 = StringResources_androidKt.stringResource(C31498R.string.outgoing_wire_info_first_row_title, composer3, 0);
                            String strStringResource3 = StringResources_androidKt.stringResource(C31498R.string.outgoing_wire_info_first_row_body, composer3, 0);
                            BentoValuePropRow2.Icon icon = new BentoValuePropRow2.Icon(ServerToBentoAssetMapper2.EYE_24, null, 2, null);
                            BentoValuePropRow bentoValuePropRow = BentoValuePropRow.Top;
                            int i8 = BentoValuePropRow2.Icon.$stable;
                            BentoValuePropRow3.BentoValuePropRow(strStringResource2, strStringResource3, icon, bentoValuePropRow, (Modifier) null, composer3, (i8 << 6) | 3072, 16);
                            String strStringResource4 = StringResources_androidKt.stringResource(C31498R.string.outgoing_wire_info_second_row_title, composer3, 0);
                            CharSequence text = ((Context) composer3.consume(AndroidCompositionLocals_androidKt.getLocalContext())).getResources().getText(C31498R.string.outgoing_wire_info_second_row_body);
                            Intrinsics.checkNotNullExpressionValue(text, "getText(...)");
                            BentoValuePropRow3.BentoValuePropRow(strStringResource4, AnnotatedStringResource.m22061annotatedStringResourceRIQooxk(text, bentoTheme.getColors(composer3, i7).m21425getFg0d7_KjU(), 0L, composer3, 0, 4), new BentoValuePropRow2.Icon(ServerToBentoAssetMapper2.PHONE_24, null, 2, null), bentoValuePropRow, (Modifier) null, composer3, (i8 << 6) | 3072, 16);
                            BentoValuePropRow3.BentoValuePropRow(StringResources_androidKt.stringResource(C31498R.string.outgoing_wire_info_third_row_title, composer3, 0), StringResources_androidKt.stringResource(C31498R.string.outgoing_wire_info_third_row_body, composer3, 0), new BentoValuePropRow2.Icon(ServerToBentoAssetMapper2.MESSAGE_SEND_24, null, 2, null), bentoValuePropRow, (Modifier) null, composer3, (i8 << 6) | 3072, 16);
                            composer3.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer2, 54), composer2, 3456, 3);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.wires.ui.OutgoingWiresInfoComposableKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return OutgoingWiresInfoComposable.OutgoingWiresInfoComposable$lambda$0(onContinueClick, modifier, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
