package com.robinhood.shared.crypto.transfer.unified;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.AspectRatio3;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.compose.LottieAnimation2;
import com.airbnb.lottie.compose.LottieCompositionResult;
import com.airbnb.lottie.compose.LottieCompositionSpec;
import com.airbnb.lottie.compose.rememberLottieComposition;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.compose.bento.component.BentoButtonBar3;
import com.robinhood.compose.bento.component.BentoButtonBarScreenLayout;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.models.api.transfer.ApiCryptoTransferConfig;
import com.robinhood.models.api.transfer.CryptoTransferAction;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.shared.crypto.transfer.C37934R;
import com.robinhood.shared.crypto.transfer.unified.CryptoTransferUnifiedMfaRequiredComposable;
import com.robinhood.shared.remote.assets.LottieUrl;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: CryptoTransferUnifiedMfaRequiredComposable.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\u001aC\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00030\t2\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0001¢\u0006\u0002\u0010\f\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000¨\u0006\r²\u0006\f\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u008a\u0084\u0002"}, m3636d2 = {"TestTagCryptoTransferMfaRequired", "", "CryptoTransferUnifiedMfaRequiredComposable", "", "action", "Lcom/robinhood/models/api/transfer/CryptoTransferAction;", "enrollmentState", "Lcom/robinhood/models/api/transfer/ApiCryptoTransferConfig$TransferStates$EnrollmentState;", "onSetupTwoFactorClicked", "Lkotlin/Function2;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/models/api/transfer/CryptoTransferAction;Lcom/robinhood/models/api/transfer/ApiCryptoTransferConfig$TransferStates$EnrollmentState;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "feature-crypto-transfer_externalDebug", "composition", "Lcom/airbnb/lottie/LottieComposition;"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.crypto.transfer.unified.CryptoTransferUnifiedMfaRequiredComposableKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class CryptoTransferUnifiedMfaRequiredComposable {
    public static final String TestTagCryptoTransferMfaRequired = "crypto_transfer_mfa_required";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoTransferUnifiedMfaRequiredComposable$lambda$0(CryptoTransferAction cryptoTransferAction, ApiCryptoTransferConfig.TransferStates.EnrollmentState enrollmentState, Function2 function2, Modifier modifier, int i, int i2, Composer composer, int i3) {
        CryptoTransferUnifiedMfaRequiredComposable(cryptoTransferAction, enrollmentState, function2, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CryptoTransferUnifiedMfaRequiredComposable(final CryptoTransferAction action, final ApiCryptoTransferConfig.TransferStates.EnrollmentState enrollmentState, final Function2<? super ApiCryptoTransferConfig.TransferStates.EnrollmentState, ? super CryptoTransferAction, Unit> onSetupTwoFactorClicked, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        final Modifier modifier2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(onSetupTwoFactorClicked, "onSetupTwoFactorClicked");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1415919786);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(action.ordinal()) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(enrollmentState == null ? -1 : enrollmentState.ordinal()) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onSetupTwoFactorClicked) ? 256 : 128;
        }
        int i4 = i2 & 8;
        if (i4 == 0) {
            if ((i & 3072) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            if ((i3 & 1171) == 1170 || !composerStartRestartGroup.getSkipping()) {
                if (i4 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1415919786, i3, -1, "com.robinhood.shared.crypto.transfer.unified.CryptoTransferUnifiedMfaRequiredComposable (CryptoTransferUnifiedMfaRequiredComposable.kt:43)");
                }
                AutoLoggingCompositionLocals.EventLoggable(new UserInteractionEventDescriptor(null, new Screen(Screen.Name.CRYPTO_TRANSFER_ENROLLMENT_ADDITIONAL_STEPS_REQUIRED, null, null, null, 14, null), null, null, null, null, 61, null), ComposableLambda3.rememberComposableLambda(-2131890239, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.transfer.unified.CryptoTransferUnifiedMfaRequiredComposableKt.CryptoTransferUnifiedMfaRequiredComposable.1
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
                            ComposerKt.traceEventStart(-2131890239, i5, -1, "com.robinhood.shared.crypto.transfer.unified.CryptoTransferUnifiedMfaRequiredComposable.<anonymous> (CryptoTransferUnifiedMfaRequiredComposable.kt:49)");
                        }
                        Modifier modifierTestTag = TestTag3.testTag(PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(ModifiersKt.logScreenTransitions(modifier2, (UserInteractionEventDescriptor) composer2.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor())), 0.0f, composer2, 0, 1), CryptoTransferUnifiedMfaRequiredComposable.TestTagCryptoTransferMfaRequired);
                        ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(972855414, true, new AnonymousClass1(enrollmentState, onSetupTwoFactorClicked, action), composer2, 54);
                        final CryptoTransferAction cryptoTransferAction = action;
                        BentoButtonBarScreenLayout.BentoButtonBarScreenLayout(modifierTestTag, false, composableLambdaRememberComposableLambda, ComposableLambda3.rememberComposableLambda(1436402345, true, new Function3<BoxScope, Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.transfer.unified.CryptoTransferUnifiedMfaRequiredComposableKt.CryptoTransferUnifiedMfaRequiredComposable.1.2

                            /* compiled from: CryptoTransferUnifiedMfaRequiredComposable.kt */
                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            /* renamed from: com.robinhood.shared.crypto.transfer.unified.CryptoTransferUnifiedMfaRequiredComposableKt$CryptoTransferUnifiedMfaRequiredComposable$1$2$WhenMappings */
                            public /* synthetic */ class WhenMappings {
                                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                                static {
                                    int[] iArr = new int[CryptoTransferAction.values().length];
                                    try {
                                        iArr[CryptoTransferAction.RECEIVE.ordinal()] = 1;
                                    } catch (NoSuchFieldError unused) {
                                    }
                                    $EnumSwitchMapping$0 = iArr;
                                }
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, Composer composer3, Integer num) {
                                invoke(boxScope, composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(BoxScope BentoButtonBarScreenLayout, Composer composer3, int i6) {
                                Intrinsics.checkNotNullParameter(BentoButtonBarScreenLayout, "$this$BentoButtonBarScreenLayout");
                                if ((i6 & 17) == 16 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1436402345, i6, -1, "com.robinhood.shared.crypto.transfer.unified.CryptoTransferUnifiedMfaRequiredComposable.<anonymous>.<anonymous> (CryptoTransferUnifiedMfaRequiredComposable.kt:62)");
                                }
                                Modifier.Companion companion = Modifier.INSTANCE;
                                Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
                                Alignment.Companion companion2 = Alignment.INSTANCE;
                                Alignment center = companion2.getCenter();
                                CryptoTransferAction cryptoTransferAction2 = cryptoTransferAction;
                                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
                                int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer3, 0);
                                CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer3, modifierFillMaxSize$default);
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
                                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion3.getSetMeasurePolicy());
                                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                                if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                }
                                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getCenter(), companion2.getCenterHorizontally(), composer3, 54);
                                int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer3, 0);
                                CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer3, modifierFillMaxWidth$default);
                                Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
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
                                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
                                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                                if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                }
                                Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
                                Column6 column6 = Column6.INSTANCE;
                                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                int i7 = BentoTheme.$stable;
                                LottieAnimation2.LottieAnimation(invoke$lambda$2$lambda$1$lambda$0(rememberLottieComposition.rememberLottieComposition(LottieCompositionSpec.Url.m9176boximpl(LottieCompositionSpec.Url.m9177constructorimpl((bentoTheme.getColors(composer3, i7).getIsDay() ? LottieUrl.RHC_TRANSFER_ERROR_LIGHT : LottieUrl.RHC_TRANSFER_ERROR_DARK).getUrl().getUrl())), null, null, null, null, null, composer3, 0, 62)), column6.align(AspectRatio3.aspectRatio$default(companion, 1.0f, false, 2, null), companion2.getCenterHorizontally()), false, false, null, 0.0f, 0, false, false, false, null, false, false, null, null, null, false, false, null, false, null, composer3, 0, 0, 0, 2097148);
                                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, bentoTheme.getSpacing(composer3, i7).m21594getXlargeD9Ej5fM()), composer3, 0);
                                Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                                String strStringResource = StringResources_androidKt.stringResource(WhenMappings.$EnumSwitchMapping$0[cryptoTransferAction2.ordinal()] == 1 ? C37934R.string.crypto_receive_mfa_required_title : C37934R.string.crypto_send_mfa_required_title, composer3, 0);
                                TextStyle displayCapsuleMedium = bentoTheme.getTypography(composer3, i7).getDisplayCapsuleMedium();
                                TextAlign.Companion companion4 = TextAlign.INSTANCE;
                                BentoText2.m20747BentoText38GnDrw(strStringResource, modifierFillMaxWidth$default2, null, null, null, null, TextAlign.m7912boximpl(companion4.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, displayCapsuleMedium, composer3, 48, 0, 8124);
                                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, bentoTheme.getSpacing(composer3, i7).m21595getXsmallD9Ej5fM()), composer3, 0);
                                BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C37934R.string.crypto_send_mfa_required_subtitle, composer3, 0), SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), null, null, null, null, TextAlign.m7912boximpl(companion4.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, null, composer3, 48, 0, 16316);
                                composer3.endNode();
                                composer3.endNode();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }

                            private static final LottieComposition invoke$lambda$2$lambda$1$lambda$0(LottieCompositionResult lottieCompositionResult) {
                                return lottieCompositionResult.getValue();
                            }
                        }, composer2, 54), composer2, 3456, 2);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    /* compiled from: CryptoTransferUnifiedMfaRequiredComposable.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.shared.crypto.transfer.unified.CryptoTransferUnifiedMfaRequiredComposableKt$CryptoTransferUnifiedMfaRequiredComposable$1$1, reason: invalid class name */
                    static final class AnonymousClass1 implements Function3<BentoButtonBar3, Composer, Integer, Unit> {
                        final /* synthetic */ CryptoTransferAction $action;
                        final /* synthetic */ ApiCryptoTransferConfig.TransferStates.EnrollmentState $enrollmentState;
                        final /* synthetic */ Function2<ApiCryptoTransferConfig.TransferStates.EnrollmentState, CryptoTransferAction, Unit> $onSetupTwoFactorClicked;

                        /* JADX WARN: Multi-variable type inference failed */
                        AnonymousClass1(ApiCryptoTransferConfig.TransferStates.EnrollmentState enrollmentState, Function2<? super ApiCryptoTransferConfig.TransferStates.EnrollmentState, ? super CryptoTransferAction, Unit> function2, CryptoTransferAction cryptoTransferAction) {
                            this.$enrollmentState = enrollmentState;
                            this.$onSetupTwoFactorClicked = function2;
                            this.$action = cryptoTransferAction;
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(BentoButtonBar3 bentoButtonBar3, Composer composer, Integer num) {
                            invoke(bentoButtonBar3, composer, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(BentoButtonBar3 BentoButtonBarScreenLayout, Composer composer, int i) {
                            int i2;
                            Intrinsics.checkNotNullParameter(BentoButtonBarScreenLayout, "$this$BentoButtonBarScreenLayout");
                            if ((i & 6) == 0) {
                                i2 = ((i & 8) == 0 ? composer.changed(BentoButtonBarScreenLayout) : composer.changedInstance(BentoButtonBarScreenLayout) ? 4 : 2) | i;
                            } else {
                                i2 = i;
                            }
                            if ((i2 & 19) == 18 && composer.getSkipping()) {
                                composer.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(972855414, i2, -1, "com.robinhood.shared.crypto.transfer.unified.CryptoTransferUnifiedMfaRequiredComposable.<anonymous>.<anonymous> (CryptoTransferUnifiedMfaRequiredComposable.kt:55)");
                            }
                            boolean z = this.$enrollmentState != null;
                            String strStringResource = StringResources_androidKt.stringResource(C11048R.string.general_label_continue, composer, 0);
                            composer.startReplaceGroup(-1746271574);
                            boolean zChanged = composer.changed(this.$onSetupTwoFactorClicked);
                            ApiCryptoTransferConfig.TransferStates.EnrollmentState enrollmentState = this.$enrollmentState;
                            boolean zChanged2 = zChanged | composer.changed(enrollmentState != null ? enrollmentState.ordinal() : -1) | composer.changed(this.$action.ordinal());
                            final Function2<ApiCryptoTransferConfig.TransferStates.EnrollmentState, CryptoTransferAction, Unit> function2 = this.$onSetupTwoFactorClicked;
                            final ApiCryptoTransferConfig.TransferStates.EnrollmentState enrollmentState2 = this.$enrollmentState;
                            final CryptoTransferAction cryptoTransferAction = this.$action;
                            Object objRememberedValue = composer.rememberedValue();
                            if (zChanged2 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new Function0() { // from class: com.robinhood.shared.crypto.transfer.unified.CryptoTransferUnifiedMfaRequiredComposableKt$CryptoTransferUnifiedMfaRequiredComposable$1$1$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return CryptoTransferUnifiedMfaRequiredComposable.C384361.AnonymousClass1.invoke$lambda$1$lambda$0(function2, enrollmentState2, cryptoTransferAction);
                                    }
                                };
                                composer.updateRememberedValue(objRememberedValue);
                            }
                            composer.endReplaceGroup();
                            BentoButtonBarScreenLayout.PrimaryButtonOnly(null, null, (Function0) objRememberedValue, strStringResource, false, null, z, composer, (BentoButtonBar3.$stable << 21) | ((i2 << 21) & 29360128), 51);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final Unit invoke$lambda$1$lambda$0(Function2 function2, ApiCryptoTransferConfig.TransferStates.EnrollmentState enrollmentState, CryptoTransferAction cryptoTransferAction) {
                            if (enrollmentState == null) {
                                throw new IllegalArgumentException("Required value was null.");
                            }
                            function2.invoke(enrollmentState, cryptoTransferAction);
                            return Unit.INSTANCE;
                        }
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, 48);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                final Modifier modifier3 = modifier2;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.crypto.transfer.unified.CryptoTransferUnifiedMfaRequiredComposableKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return CryptoTransferUnifiedMfaRequiredComposable.CryptoTransferUnifiedMfaRequiredComposable$lambda$0(action, enrollmentState, onSetupTwoFactorClicked, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 3072;
        modifier2 = modifier;
        if ((i3 & 1171) == 1170) {
            if (i4 != 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            AutoLoggingCompositionLocals.EventLoggable(new UserInteractionEventDescriptor(null, new Screen(Screen.Name.CRYPTO_TRANSFER_ENROLLMENT_ADDITIONAL_STEPS_REQUIRED, null, null, null, 14, null), null, null, null, null, 61, null), ComposableLambda3.rememberComposableLambda(-2131890239, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.transfer.unified.CryptoTransferUnifiedMfaRequiredComposableKt.CryptoTransferUnifiedMfaRequiredComposable.1
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
                        ComposerKt.traceEventStart(-2131890239, i5, -1, "com.robinhood.shared.crypto.transfer.unified.CryptoTransferUnifiedMfaRequiredComposable.<anonymous> (CryptoTransferUnifiedMfaRequiredComposable.kt:49)");
                    }
                    Modifier modifierTestTag = TestTag3.testTag(PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(ModifiersKt.logScreenTransitions(modifier2, (UserInteractionEventDescriptor) composer2.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor())), 0.0f, composer2, 0, 1), CryptoTransferUnifiedMfaRequiredComposable.TestTagCryptoTransferMfaRequired);
                    ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(972855414, true, new AnonymousClass1(enrollmentState, onSetupTwoFactorClicked, action), composer2, 54);
                    final CryptoTransferAction cryptoTransferAction = action;
                    BentoButtonBarScreenLayout.BentoButtonBarScreenLayout(modifierTestTag, false, composableLambdaRememberComposableLambda, ComposableLambda3.rememberComposableLambda(1436402345, true, new Function3<BoxScope, Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.transfer.unified.CryptoTransferUnifiedMfaRequiredComposableKt.CryptoTransferUnifiedMfaRequiredComposable.1.2

                        /* compiled from: CryptoTransferUnifiedMfaRequiredComposable.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        /* renamed from: com.robinhood.shared.crypto.transfer.unified.CryptoTransferUnifiedMfaRequiredComposableKt$CryptoTransferUnifiedMfaRequiredComposable$1$2$WhenMappings */
                        public /* synthetic */ class WhenMappings {
                            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                            static {
                                int[] iArr = new int[CryptoTransferAction.values().length];
                                try {
                                    iArr[CryptoTransferAction.RECEIVE.ordinal()] = 1;
                                } catch (NoSuchFieldError unused) {
                                }
                                $EnumSwitchMapping$0 = iArr;
                            }
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, Composer composer3, Integer num) {
                            invoke(boxScope, composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(BoxScope BentoButtonBarScreenLayout, Composer composer3, int i6) {
                            Intrinsics.checkNotNullParameter(BentoButtonBarScreenLayout, "$this$BentoButtonBarScreenLayout");
                            if ((i6 & 17) == 16 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1436402345, i6, -1, "com.robinhood.shared.crypto.transfer.unified.CryptoTransferUnifiedMfaRequiredComposable.<anonymous>.<anonymous> (CryptoTransferUnifiedMfaRequiredComposable.kt:62)");
                            }
                            Modifier.Companion companion = Modifier.INSTANCE;
                            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
                            Alignment.Companion companion2 = Alignment.INSTANCE;
                            Alignment center = companion2.getCenter();
                            CryptoTransferAction cryptoTransferAction2 = cryptoTransferAction;
                            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
                            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer3, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer3, modifierFillMaxSize$default);
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
                            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion3.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            }
                            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getCenter(), companion2.getCenterHorizontally(), composer3, 54);
                            int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer3, 0);
                            CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer3, modifierFillMaxWidth$default);
                            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
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
                            Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                            if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                            }
                            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
                            Column6 column6 = Column6.INSTANCE;
                            BentoTheme bentoTheme = BentoTheme.INSTANCE;
                            int i7 = BentoTheme.$stable;
                            LottieAnimation2.LottieAnimation(invoke$lambda$2$lambda$1$lambda$0(rememberLottieComposition.rememberLottieComposition(LottieCompositionSpec.Url.m9176boximpl(LottieCompositionSpec.Url.m9177constructorimpl((bentoTheme.getColors(composer3, i7).getIsDay() ? LottieUrl.RHC_TRANSFER_ERROR_LIGHT : LottieUrl.RHC_TRANSFER_ERROR_DARK).getUrl().getUrl())), null, null, null, null, null, composer3, 0, 62)), column6.align(AspectRatio3.aspectRatio$default(companion, 1.0f, false, 2, null), companion2.getCenterHorizontally()), false, false, null, 0.0f, 0, false, false, false, null, false, false, null, null, null, false, false, null, false, null, composer3, 0, 0, 0, 2097148);
                            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, bentoTheme.getSpacing(composer3, i7).m21594getXlargeD9Ej5fM()), composer3, 0);
                            Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                            String strStringResource = StringResources_androidKt.stringResource(WhenMappings.$EnumSwitchMapping$0[cryptoTransferAction2.ordinal()] == 1 ? C37934R.string.crypto_receive_mfa_required_title : C37934R.string.crypto_send_mfa_required_title, composer3, 0);
                            TextStyle displayCapsuleMedium = bentoTheme.getTypography(composer3, i7).getDisplayCapsuleMedium();
                            TextAlign.Companion companion4 = TextAlign.INSTANCE;
                            BentoText2.m20747BentoText38GnDrw(strStringResource, modifierFillMaxWidth$default2, null, null, null, null, TextAlign.m7912boximpl(companion4.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, displayCapsuleMedium, composer3, 48, 0, 8124);
                            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, bentoTheme.getSpacing(composer3, i7).m21595getXsmallD9Ej5fM()), composer3, 0);
                            BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C37934R.string.crypto_send_mfa_required_subtitle, composer3, 0), SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), null, null, null, null, TextAlign.m7912boximpl(companion4.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, null, composer3, 48, 0, 16316);
                            composer3.endNode();
                            composer3.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }

                        private static final LottieComposition invoke$lambda$2$lambda$1$lambda$0(LottieCompositionResult lottieCompositionResult) {
                            return lottieCompositionResult.getValue();
                        }
                    }, composer2, 54), composer2, 3456, 2);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }

                /* compiled from: CryptoTransferUnifiedMfaRequiredComposable.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.shared.crypto.transfer.unified.CryptoTransferUnifiedMfaRequiredComposableKt$CryptoTransferUnifiedMfaRequiredComposable$1$1, reason: invalid class name */
                static final class AnonymousClass1 implements Function3<BentoButtonBar3, Composer, Integer, Unit> {
                    final /* synthetic */ CryptoTransferAction $action;
                    final /* synthetic */ ApiCryptoTransferConfig.TransferStates.EnrollmentState $enrollmentState;
                    final /* synthetic */ Function2<ApiCryptoTransferConfig.TransferStates.EnrollmentState, CryptoTransferAction, Unit> $onSetupTwoFactorClicked;

                    /* JADX WARN: Multi-variable type inference failed */
                    AnonymousClass1(ApiCryptoTransferConfig.TransferStates.EnrollmentState enrollmentState, Function2<? super ApiCryptoTransferConfig.TransferStates.EnrollmentState, ? super CryptoTransferAction, Unit> function2, CryptoTransferAction cryptoTransferAction) {
                        this.$enrollmentState = enrollmentState;
                        this.$onSetupTwoFactorClicked = function2;
                        this.$action = cryptoTransferAction;
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(BentoButtonBar3 bentoButtonBar3, Composer composer, Integer num) {
                        invoke(bentoButtonBar3, composer, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(BentoButtonBar3 BentoButtonBarScreenLayout, Composer composer, int i) {
                        int i2;
                        Intrinsics.checkNotNullParameter(BentoButtonBarScreenLayout, "$this$BentoButtonBarScreenLayout");
                        if ((i & 6) == 0) {
                            i2 = ((i & 8) == 0 ? composer.changed(BentoButtonBarScreenLayout) : composer.changedInstance(BentoButtonBarScreenLayout) ? 4 : 2) | i;
                        } else {
                            i2 = i;
                        }
                        if ((i2 & 19) == 18 && composer.getSkipping()) {
                            composer.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(972855414, i2, -1, "com.robinhood.shared.crypto.transfer.unified.CryptoTransferUnifiedMfaRequiredComposable.<anonymous>.<anonymous> (CryptoTransferUnifiedMfaRequiredComposable.kt:55)");
                        }
                        boolean z = this.$enrollmentState != null;
                        String strStringResource = StringResources_androidKt.stringResource(C11048R.string.general_label_continue, composer, 0);
                        composer.startReplaceGroup(-1746271574);
                        boolean zChanged = composer.changed(this.$onSetupTwoFactorClicked);
                        ApiCryptoTransferConfig.TransferStates.EnrollmentState enrollmentState = this.$enrollmentState;
                        boolean zChanged2 = zChanged | composer.changed(enrollmentState != null ? enrollmentState.ordinal() : -1) | composer.changed(this.$action.ordinal());
                        final Function2 function2 = this.$onSetupTwoFactorClicked;
                        final ApiCryptoTransferConfig.TransferStates.EnrollmentState enrollmentState2 = this.$enrollmentState;
                        final CryptoTransferAction cryptoTransferAction = this.$action;
                        Object objRememberedValue = composer.rememberedValue();
                        if (zChanged2 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function0() { // from class: com.robinhood.shared.crypto.transfer.unified.CryptoTransferUnifiedMfaRequiredComposableKt$CryptoTransferUnifiedMfaRequiredComposable$1$1$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return CryptoTransferUnifiedMfaRequiredComposable.C384361.AnonymousClass1.invoke$lambda$1$lambda$0(function2, enrollmentState2, cryptoTransferAction);
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue);
                        }
                        composer.endReplaceGroup();
                        BentoButtonBarScreenLayout.PrimaryButtonOnly(null, null, (Function0) objRememberedValue, strStringResource, false, null, z, composer, (BentoButtonBar3.$stable << 21) | ((i2 << 21) & 29360128), 51);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$1$lambda$0(Function2 function2, ApiCryptoTransferConfig.TransferStates.EnrollmentState enrollmentState, CryptoTransferAction cryptoTransferAction) {
                        if (enrollmentState == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        function2.invoke(enrollmentState, cryptoTransferAction);
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
