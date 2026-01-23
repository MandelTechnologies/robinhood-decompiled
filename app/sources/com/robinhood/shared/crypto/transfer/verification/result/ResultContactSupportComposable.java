package com.robinhood.shared.crypto.transfer.verification.result;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.ColorFilter;
import androidx.compose.p011ui.layout.ContentScale;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.style.TextAlign;
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
import androidx.view.compose.BackHandler;
import coil.compose.AsyncImagePainter4;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals4;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.markdown.compose.MarkdownStyle;
import com.robinhood.compose.bento.component.BentoButtonBar2;
import com.robinhood.compose.bento.component.BentoButtonBar3;
import com.robinhood.compose.bento.component.BentoButtonBarScreenLayout;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.text.BentoMarkdownText;
import com.robinhood.compose.bento.component.text.BentoMarkdownText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.util.CoilUtils2;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.models.api.transfer.verification.ApiCryptoVerificationResponse3;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.shared.crypto.transfer.C37934R;
import com.robinhood.shared.crypto.transfer.verification.VerificationType;
import com.robinhood.shared.crypto.transfer.verification.result.ResultContactSupportComposable;
import com.robinhood.shared.remote.assets.SvgUrl;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: ResultContactSupportComposable.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aK\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\t2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0007¢\u0006\u0002\u0010\r¨\u0006\u000e"}, m3636d2 = {"ResultContactSupportComposable", "", "verificationId", "Ljava/util/UUID;", "verificationType", "Lcom/robinhood/shared/crypto/transfer/verification/VerificationType;", "content", "Lcom/robinhood/models/api/transfer/verification/NextStepData$Content;", "contactSupport", "Lkotlin/Function0;", "done", "modifier", "Landroidx/compose/ui/Modifier;", "(Ljava/util/UUID;Lcom/robinhood/shared/crypto/transfer/verification/VerificationType;Lcom/robinhood/models/api/transfer/verification/NextStepData$Content;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "feature-crypto-transfer_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.crypto.transfer.verification.result.ResultContactSupportComposableKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class ResultContactSupportComposable {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ResultContactSupportComposable$lambda$2(UUID uuid, VerificationType verificationType, ApiCryptoVerificationResponse3.Content content, Function0 function0, Function0 function02, Modifier modifier, int i, int i2, Composer composer, int i3) {
        ResultContactSupportComposable(uuid, verificationType, content, function0, function02, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ResultContactSupportComposable(final UUID verificationId, final VerificationType verificationType, final ApiCryptoVerificationResponse3.Content content, final Function0<Unit> contactSupport, final Function0<Unit> done, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        final Modifier modifier3;
        Object objRememberedValue;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(verificationId, "verificationId");
        Intrinsics.checkNotNullParameter(verificationType, "verificationType");
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(contactSupport, "contactSupport");
        Intrinsics.checkNotNullParameter(done, "done");
        Composer composerStartRestartGroup = composer.startRestartGroup(-986501478);
        if ((i2 & 4) != 0) {
            i3 = i | 384;
        } else if ((i & 384) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(content) ? 256 : 128) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(contactSupport) ? 2048 : 1024;
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(done) ? 16384 : 8192;
        }
        int i4 = i2 & 32;
        if (i4 == 0) {
            if ((196608 & i) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 131072 : 65536;
            }
            if ((74881 & i3) == 74880 || !composerStartRestartGroup.getSkipping()) {
                modifier3 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-986501478, i3, -1, "com.robinhood.shared.crypto.transfer.verification.result.ResultContactSupportComposable (ResultContactSupportComposable.kt:45)");
                }
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.shared.crypto.transfer.verification.result.ResultContactSupportComposableKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Unit.INSTANCE;
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                BackHandler.BackHandler(false, (Function0) objRememberedValue, composerStartRestartGroup, 48, 1);
                AutoLoggingCompositionLocals.EventLoggable(UserInteractionEventDescriptor.copy$default((UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), null, new Screen(Screen.Name.CRYPTO_TRANSFER_RECEIVE_CONTACT_SUPPORT, null, null, null, 14, null), null, null, null, null, 61, null), ComposableLambda3.rememberComposableLambda(1796985295, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.transfer.verification.result.ResultContactSupportComposableKt.ResultContactSupportComposable.2
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
                            ComposerKt.traceEventStart(1796985295, i5, -1, "com.robinhood.shared.crypto.transfer.verification.result.ResultContactSupportComposable.<anonymous> (ResultContactSupportComposable.kt:52)");
                        }
                        Modifier modifierLogScreenTransitions$default = ModifiersKt.logScreenTransitions$default(modifier3, null, 1, null);
                        ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(-823420550, true, new AnonymousClass1(contactSupport, done), composer2, 54);
                        final ApiCryptoVerificationResponse3.Content content2 = content;
                        BentoButtonBarScreenLayout.BentoButtonBarScreenLayout(modifierLogScreenTransitions$default, false, composableLambdaRememberComposableLambda, ComposableLambda3.rememberComposableLambda(-1626367513, true, new Function3<BoxScope, Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.transfer.verification.result.ResultContactSupportComposableKt.ResultContactSupportComposable.2.2
                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, Composer composer3, Integer num) {
                                invoke(boxScope, composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(BoxScope BentoButtonBarScreenLayout, Composer composer3, int i6) {
                                int i7;
                                Intrinsics.checkNotNullParameter(BentoButtonBarScreenLayout, "$this$BentoButtonBarScreenLayout");
                                if ((i6 & 6) == 0) {
                                    i7 = i6 | (composer3.changed(BentoButtonBarScreenLayout) ? 4 : 2);
                                } else {
                                    i7 = i6;
                                }
                                if ((i7 & 19) == 18 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1626367513, i7, -1, "com.robinhood.shared.crypto.transfer.verification.result.ResultContactSupportComposable.<anonymous>.<anonymous> (ResultContactSupportComposable.kt:55)");
                                }
                                Modifier.Companion companion = Modifier.INSTANCE;
                                Modifier modifierM21619defaultFillMaxWidthPadding3ABfNKs$default = PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(ScrollKt.verticalScroll$default(companion, ScrollKt.rememberScrollState(0, composer3, 0, 1), false, null, false, 14, null), 0.0f, 1, null);
                                Alignment.Companion companion2 = Alignment.INSTANCE;
                                Modifier modifierAlign = BentoButtonBarScreenLayout.align(modifierM21619defaultFillMaxWidthPadding3ABfNKs$default, companion2.getCenter());
                                Alignment.Horizontal centerHorizontally = companion2.getCenterHorizontally();
                                ApiCryptoVerificationResponse3.Content content3 = content2;
                                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, composer3, 48);
                                int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer3, 0);
                                CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer3, modifierAlign);
                                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
                                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
                                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                                if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                }
                                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                                Column6 column6 = Column6.INSTANCE;
                                ImageKt.Image(AsyncImagePainter4.m9105rememberAsyncImagePainter0YpotYA(SvgUrl.MORE_DOCUMENTATION.getUrl(), CoilUtils2.rememberImageLoader(0.0d, null, composer3, 0, 3), null, null, null, 0, null, composer3, 0, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE), (String) null, SizeKt.m5156height3ABfNKs(companion, C2002Dp.m7995constructorimpl(EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_SEARCH_CIRCLE_VALUE)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer3, 432, 120);
                                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                int i8 = BentoTheme.$stable;
                                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, bentoTheme.getSpacing(composer3, i8).m21591getLargeD9Ej5fM()), composer3, 0);
                                TextAlign.Companion companion4 = TextAlign.INSTANCE;
                                BentoText2.m20747BentoText38GnDrw(content3.getTitle(), null, null, null, null, null, TextAlign.m7912boximpl(companion4.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer3, i8).getDisplayCapsuleMedium(), composer3, 0, 0, 8126);
                                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, bentoTheme.getSpacing(composer3, i8).m21593getSmallD9Ej5fM()), composer3, 0);
                                BentoMarkdownText2.BentoMarkdownText(content3.getBodyMarkdown(), (Modifier) null, MarkdownStyle.m16260copyR0sFphs$default(BentoMarkdownText.INSTANCE.getStyle(composer3, BentoMarkdownText.$stable), null, null, null, null, null, null, null, 0L, null, companion4.m7919getCentere0LSkKk(), null, 1535, null), (Function0<Unit>) null, (Function1<? super String, Unit>) null, composer3, MarkdownStyle.$stable << 6, 26);
                                composer3.endNode();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer2, 54), composer2, 3504, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    /* compiled from: ResultContactSupportComposable.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.shared.crypto.transfer.verification.result.ResultContactSupportComposableKt$ResultContactSupportComposable$2$1, reason: invalid class name */
                    static final class AnonymousClass1 implements Function3<BentoButtonBar3, Composer, Integer, Unit> {
                        final /* synthetic */ Function0<Unit> $contactSupport;
                        final /* synthetic */ Function0<Unit> $done;

                        AnonymousClass1(Function0<Unit> function0, Function0<Unit> function02) {
                            this.$contactSupport = function0;
                            this.$done = function02;
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(BentoButtonBar3 bentoButtonBar3, Composer composer, Integer num) {
                            invoke(bentoButtonBar3, composer, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(BentoButtonBar3 BentoButtonBarScreenLayout, Composer composer, int i) {
                            Intrinsics.checkNotNullParameter(BentoButtonBarScreenLayout, "$this$BentoButtonBarScreenLayout");
                            if ((i & 17) == 16 && composer.getSkipping()) {
                                composer.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-823420550, i, -1, "com.robinhood.shared.crypto.transfer.verification.result.ResultContactSupportComposable.<anonymous>.<anonymous> (ResultContactSupportComposable.kt:88)");
                            }
                            final EventLogger current = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composer, AutoLoggingCompositionLocals4.$stable);
                            final UserInteractionEventDescriptor userInteractionEventDescriptor = (UserInteractionEventDescriptor) composer.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
                            Modifier modifierM21619defaultFillMaxWidthPadding3ABfNKs$default = PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(Modifier.INSTANCE, 0.0f, 1, null);
                            String strStringResource = StringResources_androidKt.stringResource(C37934R.string.result_contact_support_primary_cta, composer, 0);
                            String strStringResource2 = StringResources_androidKt.stringResource(C37934R.string.crypto_transfer_done_button_label, composer, 0);
                            composer.startReplaceGroup(-1746271574);
                            boolean zChanged = composer.changed(this.$contactSupport) | composer.changedInstance(userInteractionEventDescriptor) | composer.changedInstance(current);
                            final Function0<Unit> function0 = this.$contactSupport;
                            Object objRememberedValue = composer.rememberedValue();
                            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new Function0() { // from class: com.robinhood.shared.crypto.transfer.verification.result.ResultContactSupportComposableKt$ResultContactSupportComposable$2$1$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return ResultContactSupportComposable.C385522.AnonymousClass1.invoke$lambda$1$lambda$0(function0, userInteractionEventDescriptor, current);
                                    }
                                };
                                composer.updateRememberedValue(objRememberedValue);
                            }
                            Function0 function02 = (Function0) objRememberedValue;
                            composer.endReplaceGroup();
                            composer.startReplaceGroup(-1746271574);
                            boolean zChanged2 = composer.changed(this.$done) | composer.changedInstance(userInteractionEventDescriptor) | composer.changedInstance(current);
                            final Function0<Unit> function03 = this.$done;
                            Object objRememberedValue2 = composer.rememberedValue();
                            if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue2 = new Function0() { // from class: com.robinhood.shared.crypto.transfer.verification.result.ResultContactSupportComposableKt$ResultContactSupportComposable$2$1$$ExternalSyntheticLambda1
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return ResultContactSupportComposable.C385522.AnonymousClass1.invoke$lambda$3$lambda$2(function03, userInteractionEventDescriptor, current);
                                    }
                                };
                                composer.updateRememberedValue(objRememberedValue2);
                            }
                            composer.endReplaceGroup();
                            BentoButtonBar2.BentoButtonBar(modifierM21619defaultFillMaxWidthPadding3ABfNKs$default, null, null, false, null, null, function02, strStringResource, false, null, false, (Function0) objRememberedValue2, strStringResource2, false, null, false, composer, 0, 0, 59198);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final Unit invoke$lambda$1$lambda$0(Function0 function0, UserInteractionEventDescriptor userInteractionEventDescriptor, EventLogger eventLogger) {
                            function0.invoke();
                            EventLogger.DefaultImpls.logTap$default(eventLogger, UserInteractionEventData.Action.CONTACT_SUPPORT, userInteractionEventDescriptor.getScreen(), new Component(Component.ComponentType.BUTTON, null, null, 6, null), null, null, false, 56, null);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final Unit invoke$lambda$3$lambda$2(Function0 function0, UserInteractionEventDescriptor userInteractionEventDescriptor, EventLogger eventLogger) {
                            function0.invoke();
                            EventLogger.DefaultImpls.logTap$default(eventLogger, UserInteractionEventData.Action.DONE, userInteractionEventDescriptor.getScreen(), new Component(Component.ComponentType.BUTTON, null, null, 6, null), null, null, false, 56, null);
                            return Unit.INSTANCE;
                        }
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, 48);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                final Modifier modifier4 = modifier3;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.crypto.transfer.verification.result.ResultContactSupportComposableKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return ResultContactSupportComposable.ResultContactSupportComposable$lambda$2(verificationId, verificationType, content, contactSupport, done, modifier4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 196608;
        modifier2 = modifier;
        if ((74881 & i3) == 74880) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            }
            composerStartRestartGroup.endReplaceGroup();
            BackHandler.BackHandler(false, (Function0) objRememberedValue, composerStartRestartGroup, 48, 1);
            AutoLoggingCompositionLocals.EventLoggable(UserInteractionEventDescriptor.copy$default((UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), null, new Screen(Screen.Name.CRYPTO_TRANSFER_RECEIVE_CONTACT_SUPPORT, null, null, null, 14, null), null, null, null, null, 61, null), ComposableLambda3.rememberComposableLambda(1796985295, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.transfer.verification.result.ResultContactSupportComposableKt.ResultContactSupportComposable.2
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
                        ComposerKt.traceEventStart(1796985295, i5, -1, "com.robinhood.shared.crypto.transfer.verification.result.ResultContactSupportComposable.<anonymous> (ResultContactSupportComposable.kt:52)");
                    }
                    Modifier modifierLogScreenTransitions$default = ModifiersKt.logScreenTransitions$default(modifier3, null, 1, null);
                    ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(-823420550, true, new AnonymousClass1(contactSupport, done), composer2, 54);
                    final ApiCryptoVerificationResponse3.Content content2 = content;
                    BentoButtonBarScreenLayout.BentoButtonBarScreenLayout(modifierLogScreenTransitions$default, false, composableLambdaRememberComposableLambda, ComposableLambda3.rememberComposableLambda(-1626367513, true, new Function3<BoxScope, Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.transfer.verification.result.ResultContactSupportComposableKt.ResultContactSupportComposable.2.2
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, Composer composer3, Integer num) {
                            invoke(boxScope, composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(BoxScope BentoButtonBarScreenLayout, Composer composer3, int i6) {
                            int i7;
                            Intrinsics.checkNotNullParameter(BentoButtonBarScreenLayout, "$this$BentoButtonBarScreenLayout");
                            if ((i6 & 6) == 0) {
                                i7 = i6 | (composer3.changed(BentoButtonBarScreenLayout) ? 4 : 2);
                            } else {
                                i7 = i6;
                            }
                            if ((i7 & 19) == 18 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1626367513, i7, -1, "com.robinhood.shared.crypto.transfer.verification.result.ResultContactSupportComposable.<anonymous>.<anonymous> (ResultContactSupportComposable.kt:55)");
                            }
                            Modifier.Companion companion = Modifier.INSTANCE;
                            Modifier modifierM21619defaultFillMaxWidthPadding3ABfNKs$default = PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(ScrollKt.verticalScroll$default(companion, ScrollKt.rememberScrollState(0, composer3, 0, 1), false, null, false, 14, null), 0.0f, 1, null);
                            Alignment.Companion companion2 = Alignment.INSTANCE;
                            Modifier modifierAlign = BentoButtonBarScreenLayout.align(modifierM21619defaultFillMaxWidthPadding3ABfNKs$default, companion2.getCenter());
                            Alignment.Horizontal centerHorizontally = companion2.getCenterHorizontally();
                            ApiCryptoVerificationResponse3.Content content3 = content2;
                            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, composer3, 48);
                            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer3, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer3, modifierAlign);
                            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
                            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            }
                            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                            Column6 column6 = Column6.INSTANCE;
                            ImageKt.Image(AsyncImagePainter4.m9105rememberAsyncImagePainter0YpotYA(SvgUrl.MORE_DOCUMENTATION.getUrl(), CoilUtils2.rememberImageLoader(0.0d, null, composer3, 0, 3), null, null, null, 0, null, composer3, 0, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE), (String) null, SizeKt.m5156height3ABfNKs(companion, C2002Dp.m7995constructorimpl(EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_SEARCH_CIRCLE_VALUE)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer3, 432, 120);
                            BentoTheme bentoTheme = BentoTheme.INSTANCE;
                            int i8 = BentoTheme.$stable;
                            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, bentoTheme.getSpacing(composer3, i8).m21591getLargeD9Ej5fM()), composer3, 0);
                            TextAlign.Companion companion4 = TextAlign.INSTANCE;
                            BentoText2.m20747BentoText38GnDrw(content3.getTitle(), null, null, null, null, null, TextAlign.m7912boximpl(companion4.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer3, i8).getDisplayCapsuleMedium(), composer3, 0, 0, 8126);
                            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, bentoTheme.getSpacing(composer3, i8).m21593getSmallD9Ej5fM()), composer3, 0);
                            BentoMarkdownText2.BentoMarkdownText(content3.getBodyMarkdown(), (Modifier) null, MarkdownStyle.m16260copyR0sFphs$default(BentoMarkdownText.INSTANCE.getStyle(composer3, BentoMarkdownText.$stable), null, null, null, null, null, null, null, 0L, null, companion4.m7919getCentere0LSkKk(), null, 1535, null), (Function0<Unit>) null, (Function1<? super String, Unit>) null, composer3, MarkdownStyle.$stable << 6, 26);
                            composer3.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer2, 54), composer2, 3504, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }

                /* compiled from: ResultContactSupportComposable.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.shared.crypto.transfer.verification.result.ResultContactSupportComposableKt$ResultContactSupportComposable$2$1, reason: invalid class name */
                static final class AnonymousClass1 implements Function3<BentoButtonBar3, Composer, Integer, Unit> {
                    final /* synthetic */ Function0<Unit> $contactSupport;
                    final /* synthetic */ Function0<Unit> $done;

                    AnonymousClass1(Function0<Unit> function0, Function0<Unit> function02) {
                        this.$contactSupport = function0;
                        this.$done = function02;
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(BentoButtonBar3 bentoButtonBar3, Composer composer, Integer num) {
                        invoke(bentoButtonBar3, composer, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(BentoButtonBar3 BentoButtonBarScreenLayout, Composer composer, int i) {
                        Intrinsics.checkNotNullParameter(BentoButtonBarScreenLayout, "$this$BentoButtonBarScreenLayout");
                        if ((i & 17) == 16 && composer.getSkipping()) {
                            composer.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-823420550, i, -1, "com.robinhood.shared.crypto.transfer.verification.result.ResultContactSupportComposable.<anonymous>.<anonymous> (ResultContactSupportComposable.kt:88)");
                        }
                        final EventLogger current = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composer, AutoLoggingCompositionLocals4.$stable);
                        final UserInteractionEventDescriptor userInteractionEventDescriptor = (UserInteractionEventDescriptor) composer.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
                        Modifier modifierM21619defaultFillMaxWidthPadding3ABfNKs$default = PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(Modifier.INSTANCE, 0.0f, 1, null);
                        String strStringResource = StringResources_androidKt.stringResource(C37934R.string.result_contact_support_primary_cta, composer, 0);
                        String strStringResource2 = StringResources_androidKt.stringResource(C37934R.string.crypto_transfer_done_button_label, composer, 0);
                        composer.startReplaceGroup(-1746271574);
                        boolean zChanged = composer.changed(this.$contactSupport) | composer.changedInstance(userInteractionEventDescriptor) | composer.changedInstance(current);
                        final Function0 function0 = this.$contactSupport;
                        Object objRememberedValue = composer.rememberedValue();
                        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function0() { // from class: com.robinhood.shared.crypto.transfer.verification.result.ResultContactSupportComposableKt$ResultContactSupportComposable$2$1$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return ResultContactSupportComposable.C385522.AnonymousClass1.invoke$lambda$1$lambda$0(function0, userInteractionEventDescriptor, current);
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue);
                        }
                        Function0 function02 = (Function0) objRememberedValue;
                        composer.endReplaceGroup();
                        composer.startReplaceGroup(-1746271574);
                        boolean zChanged2 = composer.changed(this.$done) | composer.changedInstance(userInteractionEventDescriptor) | composer.changedInstance(current);
                        final Function0 function03 = this.$done;
                        Object objRememberedValue2 = composer.rememberedValue();
                        if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = new Function0() { // from class: com.robinhood.shared.crypto.transfer.verification.result.ResultContactSupportComposableKt$ResultContactSupportComposable$2$1$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return ResultContactSupportComposable.C385522.AnonymousClass1.invoke$lambda$3$lambda$2(function03, userInteractionEventDescriptor, current);
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue2);
                        }
                        composer.endReplaceGroup();
                        BentoButtonBar2.BentoButtonBar(modifierM21619defaultFillMaxWidthPadding3ABfNKs$default, null, null, false, null, null, function02, strStringResource, false, null, false, (Function0) objRememberedValue2, strStringResource2, false, null, false, composer, 0, 0, 59198);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$1$lambda$0(Function0 function0, UserInteractionEventDescriptor userInteractionEventDescriptor, EventLogger eventLogger) {
                        function0.invoke();
                        EventLogger.DefaultImpls.logTap$default(eventLogger, UserInteractionEventData.Action.CONTACT_SUPPORT, userInteractionEventDescriptor.getScreen(), new Component(Component.ComponentType.BUTTON, null, null, 6, null), null, null, false, 56, null);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$3$lambda$2(Function0 function0, UserInteractionEventDescriptor userInteractionEventDescriptor, EventLogger eventLogger) {
                        function0.invoke();
                        EventLogger.DefaultImpls.logTap$default(eventLogger, UserInteractionEventData.Action.DONE, userInteractionEventDescriptor.getScreen(), new Component(Component.ComponentType.BUTTON, null, null, 6, null), null, null, false, 56, null);
                        return Unit.INSTANCE;
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 48);
            if (ComposerKt.isTraceInProgress()) {
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }
}
