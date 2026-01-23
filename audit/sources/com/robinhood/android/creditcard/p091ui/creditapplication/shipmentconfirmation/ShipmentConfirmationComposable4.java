package com.robinhood.android.creditcard.p091ui.creditapplication.shipmentconfirmation;

import android.content.Context;
import android.net.Uri;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.TextStyle;
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
import androidx.media3.exoplayer.ExoPlayer;
import androidx.view.ComponentActivity;
import androidx.view.compose.LocalActivity;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals4;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.creditcard.C12201R;
import com.robinhood.android.creditcard.p091ui.creditapplication.loggingUtils;
import com.robinhood.android.creditcard.p091ui.creditapplication.shipmentconfirmation.ShipmentConfirmationComposable4;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.compose.common.AnimationExoPlayer2;
import com.robinhood.compose.common.AnimationExoPlayerConfig;
import com.robinhood.rosetta.eventlogging.Screen;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: ShipmentConfirmationComposable.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a3\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007H\u0001¢\u0006\u0002\u0010\b\"\u000e\u0010\t\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\n\u001a\u00020\u0003X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000b\u001a\u00020\u0003X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\f\u001a\u00020\u0003X\u0086T¢\u0006\u0002\n\u0000¨\u0006\r"}, m3636d2 = {"ShipmentConfirmation", "", "cardDescription", "", "carrier", "window", "onContinue", "Lkotlin/Function0;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "VIDEO_FILE", "SHIPMENT_CONFIRMATION_TITLE_TEST_TAG", "SHIPMENT_CONFIRMATION_SUBTITLE_TEST_TAG", "SHIPMENT_CONFIRMATION_CARRIER_TEST_TAG", "feature-credit-card_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.creditcard.ui.creditapplication.shipmentconfirmation.ShipmentConfirmationComposableKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class ShipmentConfirmationComposable4 {
    public static final String SHIPMENT_CONFIRMATION_CARRIER_TEST_TAG = "shipment-confirmation-carrier-test-tag";
    public static final String SHIPMENT_CONFIRMATION_SUBTITLE_TEST_TAG = "shipment-confirmation-subtitle-test-tag";
    public static final String SHIPMENT_CONFIRMATION_TITLE_TEST_TAG = "shipment-confirmation-title-test-tag";
    private static final String VIDEO_FILE = "asset:///gold_card_mystery.mov";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ShipmentConfirmation$lambda$0(String str, String str2, String str3, Function0 function0, int i, Composer composer, int i2) {
        ShipmentConfirmation(str, str2, str3, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void ShipmentConfirmation(final String cardDescription, final String carrier, final String window, final Function0<Unit> onContinue, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Intrinsics.checkNotNullParameter(cardDescription, "cardDescription");
        Intrinsics.checkNotNullParameter(carrier, "carrier");
        Intrinsics.checkNotNullParameter(window, "window");
        Intrinsics.checkNotNullParameter(onContinue, "onContinue");
        Composer composerStartRestartGroup = composer.startRestartGroup(-761583713);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(cardDescription) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(carrier) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(window) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onContinue) ? 2048 : 1024;
        }
        if ((i2 & 1171) != 1170 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-761583713, i2, -1, "com.robinhood.android.creditcard.ui.creditapplication.shipmentconfirmation.ShipmentConfirmation (ShipmentConfirmationComposable.kt:55)");
            }
            final EventLogger current = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composerStartRestartGroup, AutoLoggingCompositionLocals4.$stable);
            final Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            loggingUtils.setCcScreen(new Screen(Screen.Name.CC_APPLICATION_SHIPPING_ETA, null, null, null, 14, null));
            composer2 = composerStartRestartGroup;
            BentoTheme2.BentoTheme(Boolean.FALSE, null, Boolean.TRUE, null, null, null, null, null, ComposableLambda3.rememberComposableLambda(-677356825, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.creditcard.ui.creditapplication.shipmentconfirmation.ShipmentConfirmationComposableKt.ShipmentConfirmation.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i3) {
                    if ((i3 & 3) == 2 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-677356825, i3, -1, "com.robinhood.android.creditcard.ui.creditapplication.shipmentconfirmation.ShipmentConfirmation.<anonymous> (ShipmentConfirmationComposable.kt:60)");
                    }
                    long jM6716getBlack0d7_KjU = Color.INSTANCE.m6716getBlack0d7_KjU();
                    final Context context2 = context;
                    final String str = cardDescription;
                    final String str2 = window;
                    final String str3 = carrier;
                    final EventLogger eventLogger = current;
                    final Function0<Unit> function0 = onContinue;
                    BentoThemeOverlays.m21607CustomThemeOverlaywsPGbo(0L, 0L, 0L, 0L, jM6716getBlack0d7_KjU, 0L, 0L, 0L, 0L, ComposableLambda3.rememberComposableLambda(-1609248967, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.creditcard.ui.creditapplication.shipmentconfirmation.ShipmentConfirmationComposableKt.ShipmentConfirmation.1.1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                            invoke(composer4, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer4, int i4) {
                            if ((i4 & 3) == 2 && composer4.getSkipping()) {
                                composer4.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1609248967, i4, -1, "com.robinhood.android.creditcard.ui.creditapplication.shipmentconfirmation.ShipmentConfirmation.<anonymous>.<anonymous> (ShipmentConfirmationComposable.kt:61)");
                            }
                            Object objConsume = composer4.consume(LocalActivity.getLocalActivity());
                            ComponentActivity componentActivity = objConsume instanceof ComponentActivity ? (ComponentActivity) objConsume : null;
                            Unit unit = Unit.INSTANCE;
                            composer4.startReplaceGroup(5004770);
                            boolean zChangedInstance = composer4.changedInstance(componentActivity);
                            Object objRememberedValue = composer4.rememberedValue();
                            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new ShipmentConfirmationComposable5(componentActivity, null);
                                composer4.updateRememberedValue(objRememberedValue);
                            }
                            composer4.endReplaceGroup();
                            EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue, composer4, 6);
                            ScaffoldKt.m5939ScaffoldTvnljyQ(null, ShipmentConfirmationComposable.INSTANCE.m12807getLambda$1734976779$feature_credit_card_externalDebug(), null, null, null, 0, BentoTheme.INSTANCE.getColors(composer4, BentoTheme.$stable).m21371getBg0d7_KjU(), 0L, null, ComposableLambda3.rememberComposableLambda(104020874, true, new AnonymousClass2(context2, str, str2, str3, eventLogger, function0), composer4, 54), composer4, 805306416, 445);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }

                        /* compiled from: ShipmentConfirmationComposable.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.android.creditcard.ui.creditapplication.shipmentconfirmation.ShipmentConfirmationComposableKt$ShipmentConfirmation$1$1$2, reason: invalid class name */
                        static final class AnonymousClass2 implements Function3<PaddingValues, Composer, Integer, Unit> {
                            final /* synthetic */ String $cardDescription;
                            final /* synthetic */ String $carrier;
                            final /* synthetic */ Context $context;
                            final /* synthetic */ EventLogger $eventLogger;
                            final /* synthetic */ Function0<Unit> $onContinue;
                            final /* synthetic */ String $window;

                            AnonymousClass2(Context context, String str, String str2, String str3, EventLogger eventLogger, Function0<Unit> function0) {
                                this.$context = context;
                                this.$cardDescription = str;
                                this.$window = str2;
                                this.$carrier = str3;
                                this.$eventLogger = eventLogger;
                                this.$onContinue = function0;
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer, Integer num) {
                                invoke(paddingValues, composer, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(PaddingValues paddingValues, Composer composer, int i) {
                                int i2;
                                Modifier.Companion companion;
                                BentoTheme bentoTheme;
                                int i3;
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
                                    ComposerKt.traceEventStart(104020874, i2, -1, "com.robinhood.android.creditcard.ui.creditapplication.shipmentconfirmation.ShipmentConfirmation.<anonymous>.<anonymous>.<anonymous> (ShipmentConfirmationComposable.kt:76)");
                                }
                                Modifier.Companion companion2 = Modifier.INSTANCE;
                                Modifier modifierLogScreenTransitions = ModifiersKt.logScreenTransitions(SizeKt.fillMaxSize$default(companion2, 0.0f, 1, null), new UserInteractionEventDescriptor(null, new Screen(Screen.Name.CC_APPLICATION_SHIPPING_ETA, null, null, null, 14, null), null, null, null, null, 61, null));
                                final Context context = this.$context;
                                String str = this.$cardDescription;
                                String str2 = this.$window;
                                String str3 = this.$carrier;
                                EventLogger eventLogger = this.$eventLogger;
                                Function0<Unit> function0 = this.$onContinue;
                                Alignment.Companion companion3 = Alignment.INSTANCE;
                                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getTopStart(), false);
                                int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
                                CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierLogScreenTransitions);
                                ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor = companion4.getConstructor();
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
                                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion4.getSetMeasurePolicy());
                                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion4.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion4.getSetCompositeKeyHash();
                                if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                }
                                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion4.getSetModifier());
                                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                AnimationExoPlayerConfig animationExoPlayerConfig = new AnimationExoPlayerConfig(1, 4);
                                Modifier modifierAlign = boxScopeInstance.align(SizeKt.fillMaxSize$default(companion2, 0.0f, 1, null), companion3.getBottomCenter());
                                composer.startReplaceGroup(5004770);
                                boolean zChangedInstance = composer.changedInstance(context);
                                Object objRememberedValue = composer.rememberedValue();
                                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new Function1() { // from class: com.robinhood.android.creditcard.ui.creditapplication.shipmentconfirmation.ShipmentConfirmationComposableKt$ShipmentConfirmation$1$1$2$$ExternalSyntheticLambda0
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj) {
                                            return ShipmentConfirmationComposable4.C125411.AnonymousClass1.AnonymousClass2.invoke$lambda$3$lambda$1$lambda$0(context, (ExoPlayer) obj);
                                        }
                                    };
                                    composer.updateRememberedValue(objRememberedValue);
                                }
                                composer.endReplaceGroup();
                                AnimationExoPlayer2.AnimationExoPlayer(animationExoPlayerConfig, modifierAlign, false, 0, null, null, (Function1) objRememberedValue, composer, AnimationExoPlayerConfig.$stable, 60);
                                Modifier modifierAlign2 = boxScopeInstance.align(PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(androidx.compose.foundation.layout.PaddingKt.padding(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), paddingValues), 0.0f, composer, 0, 1), companion3.getBottomCenter());
                                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), companion3.getCenterHorizontally(), composer, 48);
                                int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer, 0);
                                CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer, modifierAlign2);
                                Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
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
                                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy, companion4.getSetMeasurePolicy());
                                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion4.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion4.getSetCompositeKeyHash();
                                if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                }
                                Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion4.getSetModifier());
                                Column6 column6 = Column6.INSTANCE;
                                Modifier modifierTestTag = TestTag3.testTag(companion2, ShipmentConfirmationComposable4.SHIPMENT_CONFIRMATION_TITLE_TEST_TAG);
                                String strStringResource = StringResources_androidKt.stringResource(C12201R.string.credit_app_shipment_confirmation_title, composer, 0);
                                BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                                int i4 = BentoTheme.$stable;
                                TextStyle bookCoverCapsuleSmall = bentoTheme2.getTypography(composer, i4).getBookCoverCapsuleSmall();
                                TextAlign.Companion companion5 = TextAlign.INSTANCE;
                                BentoText2.m20747BentoText38GnDrw(strStringResource, modifierTestTag, null, null, null, null, TextAlign.m7912boximpl(companion5.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bookCoverCapsuleSmall, composer, 48, 0, 8124);
                                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion2, bentoTheme2.getSpacing(composer, i4).m21592getMediumD9Ej5fM()), composer, 0);
                                BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C12201R.string.credit_app_shipment_confirmation_arrives, new Object[]{str, str2}, composer, 0), TestTag3.testTag(companion2, ShipmentConfirmationComposable4.SHIPMENT_CONFIRMATION_SUBTITLE_TEST_TAG), null, null, null, null, TextAlign.m7912boximpl(companion5.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composer, i4).getTextM(), composer, 48, 0, 8124);
                                composer.startReplaceGroup(-1206067744);
                                if (Intrinsics.areEqual(str3, "UNKNOWN")) {
                                    companion = companion2;
                                    bentoTheme = bentoTheme2;
                                    i3 = i4;
                                } else {
                                    companion = companion2;
                                    bentoTheme = bentoTheme2;
                                    i3 = i4;
                                    BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C12201R.string.credit_app_shipment_confirmation_carrier, new Object[]{str3}, composer, 0), TestTag3.testTag(companion2, ShipmentConfirmationComposable4.SHIPMENT_CONFIRMATION_CARRIER_TEST_TAG), null, null, null, null, TextAlign.m7912boximpl(companion5.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composer, i4).getTextM(), composer, 48, 0, 8124);
                                }
                                composer.endReplaceGroup();
                                int i5 = i3;
                                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, bentoTheme.getSpacing(composer, i5).m21592getMediumD9Ej5fM()), composer, 0);
                                BentoThemeOverlays.m21607CustomThemeOverlaywsPGbo(bentoTheme.getColors(composer, i5).m21425getFg0d7_KjU(), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, ComposableLambda3.rememberComposableLambda(955018356, true, new ShipmentConfirmationComposable6(eventLogger, function0), composer, 54), composer, 805306368, 510);
                                composer.endNode();
                                composer.endNode();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }

                            /* JADX INFO: Access modifiers changed from: private */
                            public static final Unit invoke$lambda$3$lambda$1$lambda$0(Context context, ExoPlayer AnimationExoPlayer) {
                                Intrinsics.checkNotNullParameter(AnimationExoPlayer, "$this$AnimationExoPlayer");
                                Uri uri = Uri.parse(ShipmentConfirmationComposable4.VIDEO_FILE);
                                Intrinsics.checkNotNullExpressionValue(uri, "parse(...)");
                                AnimationExoPlayer.setMediaSource(AnimationExoPlayer2.mp4MediaSourceFromAssets(uri, context));
                                return Unit.INSTANCE;
                            }
                        }
                    }, composer3, 54), composer3, 805330944, 495);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composer2, 100663686, 250);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.creditcard.ui.creditapplication.shipmentconfirmation.ShipmentConfirmationComposableKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ShipmentConfirmationComposable4.ShipmentConfirmation$lambda$0(cardDescription, carrier, window, onContinue, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
