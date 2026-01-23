package com.robinhood.android.transfers.history.internaltransfer.compose;

import android.content.Context;
import android.content.res.Resources;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.platform.UriHandler;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.markdown.compose.MarkdownStyle;
import com.robinhood.android.transfers.history.C30262R;
import com.robinhood.android.transfers.history.internaltransfer.InternalTransferHistoryDetailViewState;
import com.robinhood.android.transfers.history.internaltransfer.compose.InternalTransferHistoryDetailCancelContent;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.text.BentoMarkdownText;
import com.robinhood.compose.bento.component.text.BentoMarkdownText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: InternalTransferHistoryDetailCancelContent.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\r\u0010\u0000\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0002\u001a-\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u0007¢\u0006\u0002\u0010\n¨\u0006\u000b"}, m3636d2 = {"InternalTransferHistoryDetailCancelContentPreview", "", "(Landroidx/compose/runtime/Composer;I)V", "InternalTransferHistoryDetailCancelContent", "state", "Lcom/robinhood/android/transfers/history/internaltransfer/InternalTransferHistoryDetailViewState;", "onCancel", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/android/transfers/history/internaltransfer/InternalTransferHistoryDetailViewState;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "feature-transfer-history_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.transfers.history.internaltransfer.compose.InternalTransferHistoryDetailCancelContentKt, reason: use source file name */
/* loaded from: classes9.dex */
public final class InternalTransferHistoryDetailCancelContent {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InternalTransferHistoryDetailCancelContent$lambda$3(InternalTransferHistoryDetailViewState internalTransferHistoryDetailViewState, Function0 function0, Modifier modifier, int i, int i2, Composer composer, int i3) {
        InternalTransferHistoryDetailCancelContent(internalTransferHistoryDetailViewState, function0, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InternalTransferHistoryDetailCancelContentPreview$lambda$2(int i, Composer composer, int i2) {
        InternalTransferHistoryDetailCancelContentPreview(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    private static final void InternalTransferHistoryDetailCancelContentPreview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1231148384);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1231148384, i, -1, "com.robinhood.android.transfers.history.internaltransfer.compose.InternalTransferHistoryDetailCancelContentPreview (InternalTransferHistoryDetailCancelContent.kt:23)");
            }
            InternalTransferHistoryDetailViewState internalTransferHistoryDetailViewState = new InternalTransferHistoryDetailViewState(null, null, null, null, false, false, false, null, null, StringResource.INSTANCE.invoke(C30262R.string.managed_internal_transfer_withdraw_info, new Object[0]), 447, null);
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.transfers.history.internaltransfer.compose.InternalTransferHistoryDetailCancelContentKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Unit.INSTANCE;
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            InternalTransferHistoryDetailCancelContent(internalTransferHistoryDetailViewState, (Function0) objRememberedValue, null, composerStartRestartGroup, 48, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.transfers.history.internaltransfer.compose.InternalTransferHistoryDetailCancelContentKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return InternalTransferHistoryDetailCancelContent.InternalTransferHistoryDetailCancelContentPreview$lambda$2(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void InternalTransferHistoryDetailCancelContent(final InternalTransferHistoryDetailViewState state, final Function0<Unit> onCancel, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(onCancel, "onCancel");
        Composer composerStartRestartGroup = composer.startRestartGroup(690155520);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(state) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onCancel) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i3 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                final Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(690155520, i3, -1, "com.robinhood.android.transfers.history.internaltransfer.compose.InternalTransferHistoryDetailCancelContent (InternalTransferHistoryDetailCancelContent.kt:38)");
                }
                Modifier modifier5 = modifier4;
                BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, ComposableLambda3.rememberComposableLambda(329926584, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.transfers.history.internaltransfer.compose.InternalTransferHistoryDetailCancelContentKt.InternalTransferHistoryDetailCancelContent.1

                    /* compiled from: InternalTransferHistoryDetailCancelContent.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.transfers.history.internaltransfer.compose.InternalTransferHistoryDetailCancelContentKt$InternalTransferHistoryDetailCancelContent$1$1, reason: invalid class name */
                    static final class AnonymousClass1 implements Function2<Composer, Integer, Unit> {
                        final /* synthetic */ Modifier $modifier;
                        final /* synthetic */ Function0<Unit> $onCancel;
                        final /* synthetic */ InternalTransferHistoryDetailViewState $state;

                        AnonymousClass1(Modifier modifier, InternalTransferHistoryDetailViewState internalTransferHistoryDetailViewState, Function0<Unit> function0) {
                            this.$modifier = modifier;
                            this.$state = internalTransferHistoryDetailViewState;
                            this.$onCancel = function0;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) throws Resources.NotFoundException {
                            invoke(composer, num.intValue());
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final Unit invoke$lambda$3$lambda$2$lambda$1$lambda$0(UriHandler uriHandler, String uri) {
                            Intrinsics.checkNotNullParameter(uri, "uri");
                            uriHandler.openUri(uri);
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer, int i) throws Resources.NotFoundException {
                            CharSequence text;
                            int i2;
                            float f;
                            InternalTransferHistoryDetailViewState internalTransferHistoryDetailViewState;
                            Object obj;
                            Composer composer2 = composer;
                            if ((i & 3) == 2 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1662537859, i, -1, "com.robinhood.android.transfers.history.internaltransfer.compose.InternalTransferHistoryDetailCancelContent.<anonymous>.<anonymous> (InternalTransferHistoryDetailCancelContent.kt:41)");
                            }
                            Modifier modifier = this.$modifier;
                            InternalTransferHistoryDetailViewState internalTransferHistoryDetailViewState2 = this.$state;
                            Function0<Unit> function0 = this.$onCancel;
                            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
                            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, modifier);
                            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion.getConstructor();
                            if (composer2.getApplier() == null) {
                                Composables.invalidApplier();
                            }
                            composer2.startReusableNode();
                            if (composer2.getInserting()) {
                                composer2.createNode(constructor);
                            } else {
                                composer2.useNode();
                            }
                            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer2);
                            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
                            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            }
                            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                            Column6 column6 = Column6.INSTANCE;
                            final UriHandler uriHandler = (UriHandler) composer2.consume(CompositionLocalsKt.getLocalUriHandler());
                            StringResource additionalInfoText = internalTransferHistoryDetailViewState2.getAdditionalInfoText();
                            composer2.startReplaceGroup(2031040640);
                            if (additionalInfoText == null) {
                                text = null;
                            } else {
                                Resources resources = ((Context) composer2.consume(AndroidCompositionLocals_androidKt.getLocalContext())).getResources();
                                Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
                                text = additionalInfoText.getText(resources);
                            }
                            composer2.endReplaceGroup();
                            composer2.startReplaceGroup(2031042581);
                            if (text == null) {
                                i2 = 1;
                                f = 0.0f;
                                internalTransferHistoryDetailViewState = internalTransferHistoryDetailViewState2;
                                obj = null;
                            } else {
                                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                                String string2 = text.toString();
                                BentoMarkdownText bentoMarkdownText = BentoMarkdownText.INSTANCE;
                                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                int i3 = BentoTheme.$stable;
                                i2 = 1;
                                f = 0.0f;
                                internalTransferHistoryDetailViewState = internalTransferHistoryDetailViewState2;
                                obj = null;
                                MarkdownStyle markdownStyleM21100withTextStylesYhh7B2I = bentoMarkdownText.m21100withTextStylesYhh7B2I(bentoTheme.getTypography(composer2, i3).getTextS(), TextAlign.INSTANCE.m7919getCentere0LSkKk(), bentoTheme.getColors(composer2, i3).m21426getFg20d7_KjU(), bentoTheme.getColors(composer2, i3).m21426getFg20d7_KjU(), false, composer2, BentoMarkdownText.$stable << 15, 16);
                                composer2.startReplaceGroup(5004770);
                                boolean zChangedInstance = composer2.changedInstance(uriHandler);
                                Object objRememberedValue = composer2.rememberedValue();
                                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new Function1() { // from class: com.robinhood.android.transfers.history.internaltransfer.compose.InternalTransferHistoryDetailCancelContentKt$InternalTransferHistoryDetailCancelContent$1$1$$ExternalSyntheticLambda0
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj2) {
                                            return InternalTransferHistoryDetailCancelContent.C302741.AnonymousClass1.invoke$lambda$3$lambda$2$lambda$1$lambda$0(uriHandler, (String) obj2);
                                        }
                                    };
                                    composer2.updateRememberedValue(objRememberedValue);
                                }
                                composer2.endReplaceGroup();
                                BentoMarkdownText2.BentoMarkdownText(string2, modifierFillMaxWidth$default, markdownStyleM21100withTextStylesYhh7B2I, (Function0<Unit>) null, (Function1<? super String, Unit>) objRememberedValue, composer2, (MarkdownStyle.$stable << 6) | 48, 8);
                                composer2 = composer2;
                            }
                            composer2.endReplaceGroup();
                            Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, f, i2, obj);
                            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                            int i4 = BentoTheme.$stable;
                            Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(modifierFillMaxWidth$default2, 0.0f, bentoTheme2.getSpacing(composer2, i4).m21592getMediumD9Ej5fM(), 0.0f, bentoTheme2.getSpacing(composer2, i4).m21592getMediumD9Ej5fM(), 5, null);
                            boolean zIsCancelRequestInFlight = internalTransferHistoryDetailViewState.isCancelRequestInFlight();
                            BentoButtonKt.m20586BentoButtonEikTQX8(function0, StringResources_androidKt.stringResource(C30262R.string.ach_transfer_detail_cancel_action, composer2, 0), modifierM5146paddingqDBjuR0$default, null, null, false, zIsCancelRequestInFlight, Color.m6701boximpl(bentoTheme2.getColors(composer2, i4).m21371getBg0d7_KjU()), Color.m6701boximpl(bentoTheme2.getColors(composer2, i4).m21452getNegative0d7_KjU()), Color.m6701boximpl(bentoTheme2.getColors(composer2, i4).m21452getNegative0d7_KjU()), null, false, null, composer2, 0, 0, 7224);
                            composer.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }

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
                            ComposerKt.traceEventStart(329926584, i5, -1, "com.robinhood.android.transfers.history.internaltransfer.compose.InternalTransferHistoryDetailCancelContent.<anonymous> (InternalTransferHistoryDetailCancelContent.kt:40)");
                        }
                        BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(1662537859, true, new AnonymousClass1(modifier4, state, onCancel), composer2, 54), composer2, 6);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, 100663296, 255);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.transfers.history.internaltransfer.compose.InternalTransferHistoryDetailCancelContentKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return InternalTransferHistoryDetailCancelContent.InternalTransferHistoryDetailCancelContent$lambda$3(state, onCancel, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
            Modifier modifier52 = modifier4;
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, ComposableLambda3.rememberComposableLambda(329926584, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.transfers.history.internaltransfer.compose.InternalTransferHistoryDetailCancelContentKt.InternalTransferHistoryDetailCancelContent.1

                /* compiled from: InternalTransferHistoryDetailCancelContent.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.android.transfers.history.internaltransfer.compose.InternalTransferHistoryDetailCancelContentKt$InternalTransferHistoryDetailCancelContent$1$1, reason: invalid class name */
                static final class AnonymousClass1 implements Function2<Composer, Integer, Unit> {
                    final /* synthetic */ Modifier $modifier;
                    final /* synthetic */ Function0<Unit> $onCancel;
                    final /* synthetic */ InternalTransferHistoryDetailViewState $state;

                    AnonymousClass1(Modifier modifier, InternalTransferHistoryDetailViewState internalTransferHistoryDetailViewState, Function0<Unit> function0) {
                        this.$modifier = modifier;
                        this.$state = internalTransferHistoryDetailViewState;
                        this.$onCancel = function0;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) throws Resources.NotFoundException {
                        invoke(composer, num.intValue());
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$3$lambda$2$lambda$1$lambda$0(UriHandler uriHandler, String uri) {
                        Intrinsics.checkNotNullParameter(uri, "uri");
                        uriHandler.openUri(uri);
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer, int i) throws Resources.NotFoundException {
                        CharSequence text;
                        int i2;
                        float f;
                        InternalTransferHistoryDetailViewState internalTransferHistoryDetailViewState;
                        Object obj;
                        Composer composer2 = composer;
                        if ((i & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1662537859, i, -1, "com.robinhood.android.transfers.history.internaltransfer.compose.InternalTransferHistoryDetailCancelContent.<anonymous>.<anonymous> (InternalTransferHistoryDetailCancelContent.kt:41)");
                        }
                        Modifier modifier = this.$modifier;
                        InternalTransferHistoryDetailViewState internalTransferHistoryDetailViewState2 = this.$state;
                        Function0<Unit> function0 = this.$onCancel;
                        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
                        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, modifier);
                        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion.getConstructor();
                        if (composer2.getApplier() == null) {
                            Composables.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor);
                        } else {
                            composer2.useNode();
                        }
                        Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer2);
                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
                        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                        Column6 column6 = Column6.INSTANCE;
                        final UriHandler uriHandler = (UriHandler) composer2.consume(CompositionLocalsKt.getLocalUriHandler());
                        StringResource additionalInfoText = internalTransferHistoryDetailViewState2.getAdditionalInfoText();
                        composer2.startReplaceGroup(2031040640);
                        if (additionalInfoText == null) {
                            text = null;
                        } else {
                            Resources resources = ((Context) composer2.consume(AndroidCompositionLocals_androidKt.getLocalContext())).getResources();
                            Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
                            text = additionalInfoText.getText(resources);
                        }
                        composer2.endReplaceGroup();
                        composer2.startReplaceGroup(2031042581);
                        if (text == null) {
                            i2 = 1;
                            f = 0.0f;
                            internalTransferHistoryDetailViewState = internalTransferHistoryDetailViewState2;
                            obj = null;
                        } else {
                            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                            String string2 = text.toString();
                            BentoMarkdownText bentoMarkdownText = BentoMarkdownText.INSTANCE;
                            BentoTheme bentoTheme = BentoTheme.INSTANCE;
                            int i3 = BentoTheme.$stable;
                            i2 = 1;
                            f = 0.0f;
                            internalTransferHistoryDetailViewState = internalTransferHistoryDetailViewState2;
                            obj = null;
                            MarkdownStyle markdownStyleM21100withTextStylesYhh7B2I = bentoMarkdownText.m21100withTextStylesYhh7B2I(bentoTheme.getTypography(composer2, i3).getTextS(), TextAlign.INSTANCE.m7919getCentere0LSkKk(), bentoTheme.getColors(composer2, i3).m21426getFg20d7_KjU(), bentoTheme.getColors(composer2, i3).m21426getFg20d7_KjU(), false, composer2, BentoMarkdownText.$stable << 15, 16);
                            composer2.startReplaceGroup(5004770);
                            boolean zChangedInstance = composer2.changedInstance(uriHandler);
                            Object objRememberedValue = composer2.rememberedValue();
                            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new Function1() { // from class: com.robinhood.android.transfers.history.internaltransfer.compose.InternalTransferHistoryDetailCancelContentKt$InternalTransferHistoryDetailCancelContent$1$1$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj2) {
                                        return InternalTransferHistoryDetailCancelContent.C302741.AnonymousClass1.invoke$lambda$3$lambda$2$lambda$1$lambda$0(uriHandler, (String) obj2);
                                    }
                                };
                                composer2.updateRememberedValue(objRememberedValue);
                            }
                            composer2.endReplaceGroup();
                            BentoMarkdownText2.BentoMarkdownText(string2, modifierFillMaxWidth$default, markdownStyleM21100withTextStylesYhh7B2I, (Function0<Unit>) null, (Function1<? super String, Unit>) objRememberedValue, composer2, (MarkdownStyle.$stable << 6) | 48, 8);
                            composer2 = composer2;
                        }
                        composer2.endReplaceGroup();
                        Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, f, i2, obj);
                        BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                        int i4 = BentoTheme.$stable;
                        Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(modifierFillMaxWidth$default2, 0.0f, bentoTheme2.getSpacing(composer2, i4).m21592getMediumD9Ej5fM(), 0.0f, bentoTheme2.getSpacing(composer2, i4).m21592getMediumD9Ej5fM(), 5, null);
                        boolean zIsCancelRequestInFlight = internalTransferHistoryDetailViewState.isCancelRequestInFlight();
                        BentoButtonKt.m20586BentoButtonEikTQX8(function0, StringResources_androidKt.stringResource(C30262R.string.ach_transfer_detail_cancel_action, composer2, 0), modifierM5146paddingqDBjuR0$default, null, null, false, zIsCancelRequestInFlight, Color.m6701boximpl(bentoTheme2.getColors(composer2, i4).m21371getBg0d7_KjU()), Color.m6701boximpl(bentoTheme2.getColors(composer2, i4).m21452getNegative0d7_KjU()), Color.m6701boximpl(bentoTheme2.getColors(composer2, i4).m21452getNegative0d7_KjU()), null, false, null, composer2, 0, 0, 7224);
                        composer.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }

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
                        ComposerKt.traceEventStart(329926584, i5, -1, "com.robinhood.android.transfers.history.internaltransfer.compose.InternalTransferHistoryDetailCancelContent.<anonymous> (InternalTransferHistoryDetailCancelContent.kt:40)");
                    }
                    BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(1662537859, true, new AnonymousClass1(modifier4, state, onCancel), composer2, 54), composer2, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier3 = modifier52;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }
}
