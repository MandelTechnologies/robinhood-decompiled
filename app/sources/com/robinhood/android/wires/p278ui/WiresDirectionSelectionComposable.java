package com.robinhood.android.wires.p278ui;

import android.net.Uri;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.ScaffoldKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.text.TextLayoutResult;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.BentoRichText;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.UtilKt;
import com.robinhood.android.navigation.LocalNavigator;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.wires.p278ui.WiresDirectionSelectionComposable;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.rows.BentoBaseRowKt;
import com.robinhood.compose.bento.component.rows.BentoBaseRowState;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.models.api.bonfire.transfer.wires.ApiIncomingWireContent;
import com.robinhood.models.api.bonfire.transfer.wires.ApiOutgoingWireContent;
import com.robinhood.models.api.bonfire.transfer.wires.ApiWireDetailsContent;
import com.robinhood.models.api.bonfire.transfer.wires.ApiWireDirectionIcon;
import com.robinhood.models.serverdriven.p347db.RichText;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: WiresDirectionSelectionComposable.kt */
@Metadata(m3635d1 = {"\u0000P\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a{\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\n\u0010\u0006\u001a\u00060\u0007j\u0002`\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\n2\u0014\u0010\u000b\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0004\u0012\u00020\u00010\f2\u0014\u0010\u000e\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0004\u0012\u00020\u00010\f2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00010\n2\b\b\u0002\u0010\u0010\u001a\u00020\u0011H\u0007¢\u0006\u0002\u0010\u0012\u001aI\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0004\u001a\u00020\u00052\n\u0010\u0006\u001a\u00060\u0007j\u0002`\b2\u0006\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0010\u001a\u00020\u00112\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00010\nH\u0003¢\u0006\u0002\u0010\u0019\u001a\u000e\u0010\u001a\u001a\u0004\u0018\u00010\u001b*\u00020\u001cH\u0002¨\u0006\u001d"}, m3636d2 = {"WiresDirectionSelectionComposable", "", "content", "Lcom/robinhood/models/api/bonfire/transfer/wires/ApiWireDetailsContent$WireDetailsContent;", "screen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "eventContext", "Lcom/robinhood/rosetta/eventlogging/Context;", "Lcom/robinhood/rosetta/eventlogging/EventContext;", "onIncomingWiresRowClick", "Lkotlin/Function0;", "onOutgoingWiresRowClick", "Lkotlin/Function1;", "Lcom/robinhood/models/api/bonfire/transfer/wires/ApiOutgoingWireContent$ApiOutgoingWireDetails$LinkAccountDetails;", "onThirdPartyHomeClosingClicked", "onGenericThirdPartyClicked", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/models/api/bonfire/transfer/wires/ApiWireDetailsContent$WireDetailsContent;Lcom/robinhood/rosetta/eventlogging/Screen;Lcom/robinhood/rosetta/eventlogging/Context;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "ThirdPartyWireComposable", "thirdPartyContent", "Lcom/robinhood/models/api/bonfire/transfer/wires/ApiOutgoingWireContent;", "identifier", "", "onClick", "(Lcom/robinhood/models/api/bonfire/transfer/wires/ApiOutgoingWireContent;Lcom/robinhood/rosetta/eventlogging/Screen;Lcom/robinhood/rosetta/eventlogging/Context;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "toBaseRowStateStart", "Lcom/robinhood/compose/bento/component/rows/BentoBaseRowState$Start$Icon;", "Lcom/robinhood/models/api/bonfire/transfer/wires/ApiWireDirectionIcon;", "feature-wires_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.wires.ui.WiresDirectionSelectionComposableKt, reason: use source file name */
/* loaded from: classes16.dex */
public final class WiresDirectionSelectionComposable {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ThirdPartyWireComposable$lambda$1(ApiOutgoingWireContent apiOutgoingWireContent, Screen screen, Context context, String str, Modifier modifier, Function0 function0, int i, int i2, Composer composer, int i3) {
        ThirdPartyWireComposable(apiOutgoingWireContent, screen, context, str, modifier, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit WiresDirectionSelectionComposable$lambda$0(ApiWireDetailsContent.WireDetailsContent wireDetailsContent, Screen screen, Context context, Function0 function0, Function1 function1, Function1 function12, Function0 function02, Modifier modifier, int i, int i2, Composer composer, int i3) {
        WiresDirectionSelectionComposable(wireDetailsContent, screen, context, function0, function1, function12, function02, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:104:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0155  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void WiresDirectionSelectionComposable(final ApiWireDetailsContent.WireDetailsContent content, final Screen screen, final Context eventContext, final Function0<Unit> onIncomingWiresRowClick, final Function1<? super ApiOutgoingWireContent.ApiOutgoingWireDetails.LinkAccountDetails, Unit> onOutgoingWiresRowClick, final Function1<? super ApiOutgoingWireContent.ApiOutgoingWireDetails.LinkAccountDetails, Unit> onThirdPartyHomeClosingClicked, final Function0<Unit> onGenericThirdPartyClicked, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(screen, "screen");
        Intrinsics.checkNotNullParameter(eventContext, "eventContext");
        Intrinsics.checkNotNullParameter(onIncomingWiresRowClick, "onIncomingWiresRowClick");
        Intrinsics.checkNotNullParameter(onOutgoingWiresRowClick, "onOutgoingWiresRowClick");
        Intrinsics.checkNotNullParameter(onThirdPartyHomeClosingClicked, "onThirdPartyHomeClosingClicked");
        Intrinsics.checkNotNullParameter(onGenericThirdPartyClicked, "onGenericThirdPartyClicked");
        Composer composerStartRestartGroup = composer.startRestartGroup(2080066780);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(content) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(screen) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(eventContext) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onIncomingWiresRowClick) ? 2048 : 1024;
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onOutgoingWiresRowClick) ? 16384 : 8192;
        }
        if ((i2 & 32) != 0) {
            i3 |= 196608;
        } else if ((i & 196608) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onThirdPartyHomeClosingClicked) ? 131072 : 65536;
        }
        if ((i2 & 64) != 0) {
            i3 |= 1572864;
        } else if ((i & 1572864) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onGenericThirdPartyClicked) ? 1048576 : 524288;
        }
        int i4 = i2 & 128;
        if (i4 == 0) {
            if ((12582912 & i) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 8388608 : 4194304;
            }
            if ((4793491 & i3) == 4793490 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(2080066780, i3, -1, "com.robinhood.android.wires.ui.WiresDirectionSelectionComposable (WiresDirectionSelectionComposable.kt:38)");
                }
                final android.content.Context context = (android.content.Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                final Navigator navigator = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
                final Modifier modifier5 = modifier4;
                BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(498461297, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.wires.ui.WiresDirectionSelectionComposableKt.WiresDirectionSelectionComposable.1
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
                            ComposerKt.traceEventStart(498461297, i5, -1, "com.robinhood.android.wires.ui.WiresDirectionSelectionComposable.<anonymous> (WiresDirectionSelectionComposable.kt:43)");
                        }
                        ScaffoldKt.m5625Scaffold27mzLpw(null, null, null, null, null, null, 0, false, null, false, null, 0.0f, 0L, 0L, 0L, BentoTheme.INSTANCE.getColors(composer2, BentoTheme.$stable).m21371getBg0d7_KjU(), 0L, ComposableLambda3.rememberComposableLambda(1386663283, true, new AnonymousClass1(modifier5, content, navigator, context, onIncomingWiresRowClick, onOutgoingWiresRowClick, screen, eventContext, onThirdPartyHomeClosingClicked, onGenericThirdPartyClicked), composer2, 54), composer2, 0, 12582912, 98303);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    /* compiled from: WiresDirectionSelectionComposable.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.wires.ui.WiresDirectionSelectionComposableKt$WiresDirectionSelectionComposable$1$1, reason: invalid class name */
                    static final class AnonymousClass1 implements Function3<PaddingValues, Composer, Integer, Unit> {
                        final /* synthetic */ ApiWireDetailsContent.WireDetailsContent $content;
                        final /* synthetic */ android.content.Context $context;
                        final /* synthetic */ Context $eventContext;
                        final /* synthetic */ Modifier $modifier;
                        final /* synthetic */ Navigator $navigator;
                        final /* synthetic */ Function0<Unit> $onGenericThirdPartyClicked;
                        final /* synthetic */ Function0<Unit> $onIncomingWiresRowClick;
                        final /* synthetic */ Function1<ApiOutgoingWireContent.ApiOutgoingWireDetails.LinkAccountDetails, Unit> $onOutgoingWiresRowClick;
                        final /* synthetic */ Function1<ApiOutgoingWireContent.ApiOutgoingWireDetails.LinkAccountDetails, Unit> $onThirdPartyHomeClosingClicked;
                        final /* synthetic */ Screen $screen;

                        /* JADX WARN: Multi-variable type inference failed */
                        AnonymousClass1(Modifier modifier, ApiWireDetailsContent.WireDetailsContent wireDetailsContent, Navigator navigator, android.content.Context context, Function0<Unit> function0, Function1<? super ApiOutgoingWireContent.ApiOutgoingWireDetails.LinkAccountDetails, Unit> function1, Screen screen, Context context2, Function1<? super ApiOutgoingWireContent.ApiOutgoingWireDetails.LinkAccountDetails, Unit> function12, Function0<Unit> function02) {
                            this.$modifier = modifier;
                            this.$content = wireDetailsContent;
                            this.$navigator = navigator;
                            this.$context = context;
                            this.$onIncomingWiresRowClick = function0;
                            this.$onOutgoingWiresRowClick = function1;
                            this.$screen = screen;
                            this.$eventContext = context2;
                            this.$onThirdPartyHomeClosingClicked = function12;
                            this.$onGenericThirdPartyClicked = function02;
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer, Integer num) {
                            invoke(paddingValues, composer, num.intValue());
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final Unit invoke$lambda$13$lambda$1$lambda$0(Navigator navigator, android.content.Context context, Uri uri) {
                            Intrinsics.checkNotNullParameter(uri, "uri");
                            Navigator.DefaultImpls.handleDeepLink$default(navigator, context, uri, null, null, false, null, 60, null);
                            return Unit.INSTANCE;
                        }

                        public final void invoke(PaddingValues paddingValues, Composer composer, int i) {
                            int i2;
                            Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                            if ((i & 6) == 0) {
                                i2 = i | (composer.changed(paddingValues) ? 4 : 2);
                            } else {
                                i2 = i;
                            }
                            if ((i2 & 19) == 18 && composer.getSkipping()) {
                                composer.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1386663283, i2, -1, "com.robinhood.android.wires.ui.WiresDirectionSelectionComposable.<anonymous>.<anonymous> (WiresDirectionSelectionComposable.kt:46)");
                            }
                            Modifier modifierPadding = PaddingKt.padding(this.$modifier, paddingValues);
                            ApiWireDetailsContent.WireDetailsContent wireDetailsContent = this.$content;
                            final Navigator navigator = this.$navigator;
                            final android.content.Context context = this.$context;
                            Function0<Unit> function0 = this.$onIncomingWiresRowClick;
                            final Function1<ApiOutgoingWireContent.ApiOutgoingWireDetails.LinkAccountDetails, Unit> function1 = this.$onOutgoingWiresRowClick;
                            Screen screen = this.$screen;
                            Context context2 = this.$eventContext;
                            final Function1<ApiOutgoingWireContent.ApiOutgoingWireDetails.LinkAccountDetails, Unit> function12 = this.$onThirdPartyHomeClosingClicked;
                            final Function0<Unit> function02 = this.$onGenericThirdPartyClicked;
                            Arrangement.Vertical top = Arrangement.INSTANCE.getTop();
                            Alignment.Companion companion = Alignment.INSTANCE;
                            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion.getStart(), composer, 0);
                            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierPadding);
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
                            Modifier.Companion companion3 = Modifier.INSTANCE;
                            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(column6.align(companion3, companion.getCenterHorizontally()), 0.0f, 1, null);
                            BentoTheme bentoTheme = BentoTheme.INSTANCE;
                            int i3 = BentoTheme.$stable;
                            BentoText2.m20747BentoText38GnDrw(wireDetailsContent.getTitle(), PaddingKt.m5144paddingVpY3zN4$default(PaddingKt.m5146paddingqDBjuR0$default(modifierFillMaxWidth$default, 0.0f, 0.0f, 0.0f, bentoTheme.getSpacing(composer, i3).m21593getSmallD9Ej5fM(), 7, null), bentoTheme.getSpacing(composer, i3).m21592getMediumD9Ej5fM(), 0.0f, 2, null), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i3).getDisplayCapsuleMedium(), composer, 0, 0, 8188);
                            Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(PaddingKt.m5146paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(column6.align(companion3, companion.getCenterHorizontally()), 0.0f, 1, null), 0.0f, 0.0f, 0.0f, bentoTheme.getSpacing(composer, i3).m21592getMediumD9Ej5fM(), 7, null), bentoTheme.getSpacing(composer, i3).m21592getMediumD9Ej5fM(), 0.0f, 2, null);
                            TextStyle textM = bentoTheme.getTypography(composer, i3).getTextM();
                            RichText dbModel = wireDetailsContent.getMessage().toDbModel();
                            composer.startReplaceGroup(-1633490746);
                            boolean zChangedInstance = composer.changedInstance(navigator) | composer.changedInstance(context);
                            Object objRememberedValue = composer.rememberedValue();
                            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new Function1() { // from class: com.robinhood.android.wires.ui.WiresDirectionSelectionComposableKt$WiresDirectionSelectionComposable$1$1$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return WiresDirectionSelectionComposable.C315131.AnonymousClass1.invoke$lambda$13$lambda$1$lambda$0(navigator, context, (Uri) obj);
                                    }
                                };
                                composer.updateRememberedValue(objRememberedValue);
                            }
                            composer.endReplaceGroup();
                            BentoRichText.m15948BentoRichText0sCZWFg(dbModel, modifierM5144paddingVpY3zN4$default, textM, 0L, 0L, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (Function1<? super Uri, Unit>) objRememberedValue, composer, 0, 504);
                            ApiIncomingWireContent incoming_wire = wireDetailsContent.getIncoming_wire();
                            composer.startReplaceGroup(75092549);
                            if (incoming_wire != null) {
                                BentoBaseRowKt.m20916BentoBaseRowygcbOzY(null, WiresDirectionSelectionComposable.toBaseRowStateStart(incoming_wire.getIcon()), incoming_wire.getTitle(), incoming_wire.getSubtitle(), null, null, null, false, false, false, 0L, function0, composer, BentoBaseRowState.Start.Icon.$stable << 3, 0, 2033);
                                Unit unit = Unit.INSTANCE;
                            }
                            composer.endReplaceGroup();
                            final ApiOutgoingWireContent outgoing_wire = wireDetailsContent.getOutgoing_wire();
                            composer.startReplaceGroup(75104628);
                            if (outgoing_wire != null) {
                                BentoBaseRowState.Start.Icon baseRowStateStart = WiresDirectionSelectionComposable.toBaseRowStateStart(outgoing_wire.getIcon());
                                String title = outgoing_wire.getTitle();
                                String subtitle = outgoing_wire.getSubtitle();
                                boolean z = outgoing_wire.getDetails() != null;
                                composer.startReplaceGroup(-1633490746);
                                boolean zChangedInstance2 = composer.changedInstance(outgoing_wire) | composer.changed(function1);
                                Object objRememberedValue2 = composer.rememberedValue();
                                if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue2 = new Function0() { // from class: com.robinhood.android.wires.ui.WiresDirectionSelectionComposableKt$WiresDirectionSelectionComposable$1$1$$ExternalSyntheticLambda1
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return WiresDirectionSelectionComposable.C315131.AnonymousClass1.invoke$lambda$13$lambda$6$lambda$5$lambda$4(outgoing_wire, function1);
                                        }
                                    };
                                    composer.updateRememberedValue(objRememberedValue2);
                                }
                                composer.endReplaceGroup();
                                BentoBaseRowKt.m20916BentoBaseRowygcbOzY(null, baseRowStateStart, title, subtitle, null, null, null, false, z, false, 0L, (Function0) objRememberedValue2, composer, BentoBaseRowState.Start.Icon.$stable << 3, 0, 1777);
                                Unit unit2 = Unit.INSTANCE;
                            }
                            composer.endReplaceGroup();
                            final ApiOutgoingWireContent third_party_wire = wireDetailsContent.getThird_party_wire();
                            composer.startReplaceGroup(75125077);
                            if (third_party_wire != null) {
                                composer.startReplaceGroup(-1633490746);
                                boolean zChanged = composer.changed(function12) | composer.changedInstance(third_party_wire);
                                Object objRememberedValue3 = composer.rememberedValue();
                                if (zChanged || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue3 = new Function0() { // from class: com.robinhood.android.wires.ui.WiresDirectionSelectionComposableKt$WiresDirectionSelectionComposable$1$1$$ExternalSyntheticLambda2
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return WiresDirectionSelectionComposable.C315131.AnonymousClass1.invoke$lambda$13$lambda$9$lambda$8$lambda$7(function12, third_party_wire);
                                        }
                                    };
                                    composer.updateRememberedValue(objRememberedValue3);
                                }
                                composer.endReplaceGroup();
                                WiresDirectionSelectionComposable.ThirdPartyWireComposable(third_party_wire, screen, context2, "outgoing-wire-third-party", null, (Function0) objRememberedValue3, composer, 3072, 16);
                                Unit unit3 = Unit.INSTANCE;
                            }
                            composer.endReplaceGroup();
                            ApiOutgoingWireContent generic_third_party_wire = wireDetailsContent.getGeneric_third_party_wire();
                            composer.startReplaceGroup(75142788);
                            if (generic_third_party_wire != null) {
                                composer.startReplaceGroup(5004770);
                                boolean zChanged2 = composer.changed(function02);
                                Object objRememberedValue4 = composer.rememberedValue();
                                if (zChanged2 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue4 = new Function0() { // from class: com.robinhood.android.wires.ui.WiresDirectionSelectionComposableKt$WiresDirectionSelectionComposable$1$1$$ExternalSyntheticLambda3
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return WiresDirectionSelectionComposable.C315131.AnonymousClass1.invoke$lambda$13$lambda$12$lambda$11$lambda$10(function02);
                                        }
                                    };
                                    composer.updateRememberedValue(objRememberedValue4);
                                }
                                composer.endReplaceGroup();
                                WiresDirectionSelectionComposable.ThirdPartyWireComposable(generic_third_party_wire, screen, context2, "outgoing-wire-third-party", null, (Function0) objRememberedValue4, composer, 3072, 16);
                                Unit unit4 = Unit.INSTANCE;
                            }
                            composer.endReplaceGroup();
                            composer.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final Unit invoke$lambda$13$lambda$6$lambda$5$lambda$4(ApiOutgoingWireContent apiOutgoingWireContent, Function1 function1) {
                            ApiOutgoingWireContent.ApiOutgoingWireDetails details = apiOutgoingWireContent.getDetails();
                            if (details != null) {
                                function1.invoke(details.getLinkAccountDetails());
                            }
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final Unit invoke$lambda$13$lambda$9$lambda$8$lambda$7(Function1 function1, ApiOutgoingWireContent apiOutgoingWireContent) {
                            ApiOutgoingWireContent.ApiOutgoingWireDetails details = apiOutgoingWireContent.getDetails();
                            function1.invoke(details != null ? details.getLinkAccountDetails() : null);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final Unit invoke$lambda$13$lambda$12$lambda$11$lambda$10(Function0 function0) {
                            function0.invoke();
                            return Unit.INSTANCE;
                        }
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, 6);
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
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.wires.ui.WiresDirectionSelectionComposableKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return WiresDirectionSelectionComposable.WiresDirectionSelectionComposable$lambda$0(content, screen, eventContext, onIncomingWiresRowClick, onOutgoingWiresRowClick, onThirdPartyHomeClosingClicked, onGenericThirdPartyClicked, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 12582912;
        modifier2 = modifier;
        if ((4793491 & i3) == 4793490) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            final android.content.Context context2 = (android.content.Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            final Navigator navigator2 = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
            final Modifier modifier52 = modifier4;
            BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(498461297, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.wires.ui.WiresDirectionSelectionComposableKt.WiresDirectionSelectionComposable.1
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
                        ComposerKt.traceEventStart(498461297, i5, -1, "com.robinhood.android.wires.ui.WiresDirectionSelectionComposable.<anonymous> (WiresDirectionSelectionComposable.kt:43)");
                    }
                    ScaffoldKt.m5625Scaffold27mzLpw(null, null, null, null, null, null, 0, false, null, false, null, 0.0f, 0L, 0L, 0L, BentoTheme.INSTANCE.getColors(composer2, BentoTheme.$stable).m21371getBg0d7_KjU(), 0L, ComposableLambda3.rememberComposableLambda(1386663283, true, new AnonymousClass1(modifier52, content, navigator2, context2, onIncomingWiresRowClick, onOutgoingWiresRowClick, screen, eventContext, onThirdPartyHomeClosingClicked, onGenericThirdPartyClicked), composer2, 54), composer2, 0, 12582912, 98303);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }

                /* compiled from: WiresDirectionSelectionComposable.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.android.wires.ui.WiresDirectionSelectionComposableKt$WiresDirectionSelectionComposable$1$1, reason: invalid class name */
                static final class AnonymousClass1 implements Function3<PaddingValues, Composer, Integer, Unit> {
                    final /* synthetic */ ApiWireDetailsContent.WireDetailsContent $content;
                    final /* synthetic */ android.content.Context $context;
                    final /* synthetic */ Context $eventContext;
                    final /* synthetic */ Modifier $modifier;
                    final /* synthetic */ Navigator $navigator;
                    final /* synthetic */ Function0<Unit> $onGenericThirdPartyClicked;
                    final /* synthetic */ Function0<Unit> $onIncomingWiresRowClick;
                    final /* synthetic */ Function1<ApiOutgoingWireContent.ApiOutgoingWireDetails.LinkAccountDetails, Unit> $onOutgoingWiresRowClick;
                    final /* synthetic */ Function1<ApiOutgoingWireContent.ApiOutgoingWireDetails.LinkAccountDetails, Unit> $onThirdPartyHomeClosingClicked;
                    final /* synthetic */ Screen $screen;

                    /* JADX WARN: Multi-variable type inference failed */
                    AnonymousClass1(Modifier modifier, ApiWireDetailsContent.WireDetailsContent wireDetailsContent, Navigator navigator, android.content.Context context, Function0<Unit> function0, Function1<? super ApiOutgoingWireContent.ApiOutgoingWireDetails.LinkAccountDetails, Unit> function1, Screen screen, Context context2, Function1<? super ApiOutgoingWireContent.ApiOutgoingWireDetails.LinkAccountDetails, Unit> function12, Function0<Unit> function02) {
                        this.$modifier = modifier;
                        this.$content = wireDetailsContent;
                        this.$navigator = navigator;
                        this.$context = context;
                        this.$onIncomingWiresRowClick = function0;
                        this.$onOutgoingWiresRowClick = function1;
                        this.$screen = screen;
                        this.$eventContext = context2;
                        this.$onThirdPartyHomeClosingClicked = function12;
                        this.$onGenericThirdPartyClicked = function02;
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer, Integer num) {
                        invoke(paddingValues, composer, num.intValue());
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$13$lambda$1$lambda$0(Navigator navigator, android.content.Context context, Uri uri) {
                        Intrinsics.checkNotNullParameter(uri, "uri");
                        Navigator.DefaultImpls.handleDeepLink$default(navigator, context, uri, null, null, false, null, 60, null);
                        return Unit.INSTANCE;
                    }

                    public final void invoke(PaddingValues paddingValues, Composer composer, int i) {
                        int i2;
                        Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                        if ((i & 6) == 0) {
                            i2 = i | (composer.changed(paddingValues) ? 4 : 2);
                        } else {
                            i2 = i;
                        }
                        if ((i2 & 19) == 18 && composer.getSkipping()) {
                            composer.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1386663283, i2, -1, "com.robinhood.android.wires.ui.WiresDirectionSelectionComposable.<anonymous>.<anonymous> (WiresDirectionSelectionComposable.kt:46)");
                        }
                        Modifier modifierPadding = PaddingKt.padding(this.$modifier, paddingValues);
                        ApiWireDetailsContent.WireDetailsContent wireDetailsContent = this.$content;
                        final Navigator navigator = this.$navigator;
                        final android.content.Context context = this.$context;
                        Function0<Unit> function0 = this.$onIncomingWiresRowClick;
                        final Function1 function1 = this.$onOutgoingWiresRowClick;
                        Screen screen = this.$screen;
                        Context context2 = this.$eventContext;
                        final Function1 function12 = this.$onThirdPartyHomeClosingClicked;
                        final Function0 function02 = this.$onGenericThirdPartyClicked;
                        Arrangement.Vertical top = Arrangement.INSTANCE.getTop();
                        Alignment.Companion companion = Alignment.INSTANCE;
                        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion.getStart(), composer, 0);
                        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierPadding);
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
                        Modifier.Companion companion3 = Modifier.INSTANCE;
                        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(column6.align(companion3, companion.getCenterHorizontally()), 0.0f, 1, null);
                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                        int i3 = BentoTheme.$stable;
                        BentoText2.m20747BentoText38GnDrw(wireDetailsContent.getTitle(), PaddingKt.m5144paddingVpY3zN4$default(PaddingKt.m5146paddingqDBjuR0$default(modifierFillMaxWidth$default, 0.0f, 0.0f, 0.0f, bentoTheme.getSpacing(composer, i3).m21593getSmallD9Ej5fM(), 7, null), bentoTheme.getSpacing(composer, i3).m21592getMediumD9Ej5fM(), 0.0f, 2, null), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i3).getDisplayCapsuleMedium(), composer, 0, 0, 8188);
                        Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(PaddingKt.m5146paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(column6.align(companion3, companion.getCenterHorizontally()), 0.0f, 1, null), 0.0f, 0.0f, 0.0f, bentoTheme.getSpacing(composer, i3).m21592getMediumD9Ej5fM(), 7, null), bentoTheme.getSpacing(composer, i3).m21592getMediumD9Ej5fM(), 0.0f, 2, null);
                        TextStyle textM = bentoTheme.getTypography(composer, i3).getTextM();
                        RichText dbModel = wireDetailsContent.getMessage().toDbModel();
                        composer.startReplaceGroup(-1633490746);
                        boolean zChangedInstance = composer.changedInstance(navigator) | composer.changedInstance(context);
                        Object objRememberedValue = composer.rememberedValue();
                        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function1() { // from class: com.robinhood.android.wires.ui.WiresDirectionSelectionComposableKt$WiresDirectionSelectionComposable$1$1$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return WiresDirectionSelectionComposable.C315131.AnonymousClass1.invoke$lambda$13$lambda$1$lambda$0(navigator, context, (Uri) obj);
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue);
                        }
                        composer.endReplaceGroup();
                        BentoRichText.m15948BentoRichText0sCZWFg(dbModel, modifierM5144paddingVpY3zN4$default, textM, 0L, 0L, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (Function1<? super Uri, Unit>) objRememberedValue, composer, 0, 504);
                        ApiIncomingWireContent incoming_wire = wireDetailsContent.getIncoming_wire();
                        composer.startReplaceGroup(75092549);
                        if (incoming_wire != null) {
                            BentoBaseRowKt.m20916BentoBaseRowygcbOzY(null, WiresDirectionSelectionComposable.toBaseRowStateStart(incoming_wire.getIcon()), incoming_wire.getTitle(), incoming_wire.getSubtitle(), null, null, null, false, false, false, 0L, function0, composer, BentoBaseRowState.Start.Icon.$stable << 3, 0, 2033);
                            Unit unit = Unit.INSTANCE;
                        }
                        composer.endReplaceGroup();
                        final ApiOutgoingWireContent outgoing_wire = wireDetailsContent.getOutgoing_wire();
                        composer.startReplaceGroup(75104628);
                        if (outgoing_wire != null) {
                            BentoBaseRowState.Start.Icon baseRowStateStart = WiresDirectionSelectionComposable.toBaseRowStateStart(outgoing_wire.getIcon());
                            String title = outgoing_wire.getTitle();
                            String subtitle = outgoing_wire.getSubtitle();
                            boolean z = outgoing_wire.getDetails() != null;
                            composer.startReplaceGroup(-1633490746);
                            boolean zChangedInstance2 = composer.changedInstance(outgoing_wire) | composer.changed(function1);
                            Object objRememberedValue2 = composer.rememberedValue();
                            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue2 = new Function0() { // from class: com.robinhood.android.wires.ui.WiresDirectionSelectionComposableKt$WiresDirectionSelectionComposable$1$1$$ExternalSyntheticLambda1
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return WiresDirectionSelectionComposable.C315131.AnonymousClass1.invoke$lambda$13$lambda$6$lambda$5$lambda$4(outgoing_wire, function1);
                                    }
                                };
                                composer.updateRememberedValue(objRememberedValue2);
                            }
                            composer.endReplaceGroup();
                            BentoBaseRowKt.m20916BentoBaseRowygcbOzY(null, baseRowStateStart, title, subtitle, null, null, null, false, z, false, 0L, (Function0) objRememberedValue2, composer, BentoBaseRowState.Start.Icon.$stable << 3, 0, 1777);
                            Unit unit2 = Unit.INSTANCE;
                        }
                        composer.endReplaceGroup();
                        final ApiOutgoingWireContent third_party_wire = wireDetailsContent.getThird_party_wire();
                        composer.startReplaceGroup(75125077);
                        if (third_party_wire != null) {
                            composer.startReplaceGroup(-1633490746);
                            boolean zChanged = composer.changed(function12) | composer.changedInstance(third_party_wire);
                            Object objRememberedValue3 = composer.rememberedValue();
                            if (zChanged || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue3 = new Function0() { // from class: com.robinhood.android.wires.ui.WiresDirectionSelectionComposableKt$WiresDirectionSelectionComposable$1$1$$ExternalSyntheticLambda2
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return WiresDirectionSelectionComposable.C315131.AnonymousClass1.invoke$lambda$13$lambda$9$lambda$8$lambda$7(function12, third_party_wire);
                                    }
                                };
                                composer.updateRememberedValue(objRememberedValue3);
                            }
                            composer.endReplaceGroup();
                            WiresDirectionSelectionComposable.ThirdPartyWireComposable(third_party_wire, screen, context2, "outgoing-wire-third-party", null, (Function0) objRememberedValue3, composer, 3072, 16);
                            Unit unit3 = Unit.INSTANCE;
                        }
                        composer.endReplaceGroup();
                        ApiOutgoingWireContent generic_third_party_wire = wireDetailsContent.getGeneric_third_party_wire();
                        composer.startReplaceGroup(75142788);
                        if (generic_third_party_wire != null) {
                            composer.startReplaceGroup(5004770);
                            boolean zChanged2 = composer.changed(function02);
                            Object objRememberedValue4 = composer.rememberedValue();
                            if (zChanged2 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue4 = new Function0() { // from class: com.robinhood.android.wires.ui.WiresDirectionSelectionComposableKt$WiresDirectionSelectionComposable$1$1$$ExternalSyntheticLambda3
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return WiresDirectionSelectionComposable.C315131.AnonymousClass1.invoke$lambda$13$lambda$12$lambda$11$lambda$10(function02);
                                    }
                                };
                                composer.updateRememberedValue(objRememberedValue4);
                            }
                            composer.endReplaceGroup();
                            WiresDirectionSelectionComposable.ThirdPartyWireComposable(generic_third_party_wire, screen, context2, "outgoing-wire-third-party", null, (Function0) objRememberedValue4, composer, 3072, 16);
                            Unit unit4 = Unit.INSTANCE;
                        }
                        composer.endReplaceGroup();
                        composer.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$13$lambda$6$lambda$5$lambda$4(ApiOutgoingWireContent apiOutgoingWireContent, Function1 function1) {
                        ApiOutgoingWireContent.ApiOutgoingWireDetails details = apiOutgoingWireContent.getDetails();
                        if (details != null) {
                            function1.invoke(details.getLinkAccountDetails());
                        }
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$13$lambda$9$lambda$8$lambda$7(Function1 function1, ApiOutgoingWireContent apiOutgoingWireContent) {
                        ApiOutgoingWireContent.ApiOutgoingWireDetails details = apiOutgoingWireContent.getDetails();
                        function1.invoke(details != null ? details.getLinkAccountDetails() : null);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$13$lambda$12$lambda$11$lambda$10(Function0 function0) {
                        function0.invoke();
                        return Unit.INSTANCE;
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 6);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier3 = modifier52;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:85:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ThirdPartyWireComposable(ApiOutgoingWireContent apiOutgoingWireContent, final Screen screen, final Context context, final String str, Modifier modifier, final Function0<Unit> function0, Composer composer, final int i, final int i2) {
        ApiOutgoingWireContent apiOutgoingWireContent2;
        int i3;
        Screen screen2;
        Context context2;
        String str2;
        final Modifier modifier2;
        Function0<Unit> function02;
        Composer composer2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-414272974);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            apiOutgoingWireContent2 = apiOutgoingWireContent;
        } else if ((i & 6) == 0) {
            apiOutgoingWireContent2 = apiOutgoingWireContent;
            i3 = (composerStartRestartGroup.changedInstance(apiOutgoingWireContent2) ? 4 : 2) | i;
        } else {
            apiOutgoingWireContent2 = apiOutgoingWireContent;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
            screen2 = screen;
        } else {
            screen2 = screen;
            if ((i & 48) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(screen2) ? 32 : 16;
            }
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
            context2 = context;
        } else {
            context2 = context;
            if ((i & 384) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(context2) ? 256 : 128;
            }
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
            str2 = str;
        } else {
            str2 = str;
            if ((i & 3072) == 0) {
                i3 |= composerStartRestartGroup.changed(str2) ? 2048 : 1024;
            }
        }
        int i4 = i2 & 16;
        if (i4 != 0) {
            i3 |= 24576;
        } else {
            if ((i & 24576) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 16384 : 8192;
            }
            if ((i2 & 32) != 0) {
                if ((i & 196608) == 0) {
                    function02 = function0;
                    i3 |= composerStartRestartGroup.changedInstance(function02) ? 131072 : 65536;
                }
                if ((74899 & i3) != 74898 || !composerStartRestartGroup.getSkipping()) {
                    Modifier modifier3 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-414272974, i3, -1, "com.robinhood.android.wires.ui.ThirdPartyWireComposable (WiresDirectionSelectionComposable.kt:142)");
                    }
                    composer2 = composerStartRestartGroup;
                    BentoBaseRowKt.m20916BentoBaseRowygcbOzY(ModifiersKt.autoLogEvents$default(modifier3, new UserInteractionEventDescriptor(null, screen2, null, context2, new Component(Component.ComponentType.ROW, str2, null, 4, null), null, 37, null), true, false, false, true, false, null, 108, null), toBaseRowStateStart(apiOutgoingWireContent2.getIcon()), apiOutgoingWireContent2.getTitle(), apiOutgoingWireContent2.getSubtitle(), null, null, null, false, false, false, 0L, function02, composer2, BentoBaseRowState.Start.Icon.$stable << 3, (i3 >> 12) & 112, 2032);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier2 = modifier3;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    composer2 = composerStartRestartGroup;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    final ApiOutgoingWireContent apiOutgoingWireContent3 = apiOutgoingWireContent2;
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.wires.ui.WiresDirectionSelectionComposableKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return WiresDirectionSelectionComposable.ThirdPartyWireComposable$lambda$1(apiOutgoingWireContent3, screen, context, str, modifier2, function0, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 196608;
            function02 = function0;
            if ((74899 & i3) != 74898) {
                if (i4 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                composer2 = composerStartRestartGroup;
                BentoBaseRowKt.m20916BentoBaseRowygcbOzY(ModifiersKt.autoLogEvents$default(modifier3, new UserInteractionEventDescriptor(null, screen2, null, context2, new Component(Component.ComponentType.ROW, str2, null, 4, null), null, 37, null), true, false, false, true, false, null, 108, null), toBaseRowStateStart(apiOutgoingWireContent2.getIcon()), apiOutgoingWireContent2.getTitle(), apiOutgoingWireContent2.getSubtitle(), null, null, null, false, false, false, 0L, function02, composer2, BentoBaseRowState.Start.Icon.$stable << 3, (i3 >> 12) & 112, 2032);
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier2 = modifier3;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        if ((i2 & 32) != 0) {
        }
        function02 = function0;
        if ((74899 & i3) != 74898) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BentoBaseRowState.Start.Icon toBaseRowStateStart(ApiWireDirectionIcon apiWireDirectionIcon) {
        ServerToBentoAssetMapper2 iconAsset;
        ServerToBentoAssetMapper2 iconAsset2 = UtilKt.getIconAsset(apiWireDirectionIcon.getIcon());
        if (iconAsset2 == null || (iconAsset = UtilKt.getIconAsset(apiWireDirectionIcon.getLayeredIcon())) == null) {
            return null;
        }
        return new BentoBaseRowState.Start.Icon(iconAsset2, new BentoBaseRowState.Start.Icon.LayeredAsset(iconAsset, null, 2, null), null, 4, null);
    }
}
