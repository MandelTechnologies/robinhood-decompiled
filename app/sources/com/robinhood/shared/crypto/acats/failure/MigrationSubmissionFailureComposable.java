package com.robinhood.shared.crypto.acats.failure;

import android.content.Context;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
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
import androidx.compose.p011ui.graphics.ColorFilter;
import androidx.compose.p011ui.layout.ContentScale;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambda3;
import coil.compose.AsyncImagePainter4;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals4;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.home.contracts.MainActivityIntentKey;
import com.robinhood.android.navigation.LocalNavigator;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.extensions.Navigators3;
import com.robinhood.compose.bento.component.BentoButtonBar2;
import com.robinhood.compose.bento.component.BentoButtonBar3;
import com.robinhood.compose.bento.component.BentoButtonBarScreenLayout;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.compose.bento.util.CoilUtils2;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.shared.crypto.acats.C37511R;
import com.robinhood.shared.crypto.acats.MigrationSubmissionFailureDest;
import com.robinhood.shared.crypto.acats.failure.MigrationSubmissionFailureComposable;
import com.robinhood.shared.remote.assets.SvgUrl;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContextImpl6;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: MigrationSubmissionFailureComposable.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001f\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0001¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, m3636d2 = {"MigrationSubmissionFailureComposable", "", "failureType", "Lcom/robinhood/shared/crypto/acats/MigrationSubmissionFailureDest$FailureType;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/shared/crypto/acats/MigrationSubmissionFailureDest$FailureType;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "feature-acats_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.crypto.acats.failure.MigrationSubmissionFailureComposableKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class MigrationSubmissionFailureComposable {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MigrationSubmissionFailureComposable$lambda$0(MigrationSubmissionFailureDest.FailureType failureType, Modifier modifier, int i, int i2, Composer composer, int i3) {
        MigrationSubmissionFailureComposable(failureType, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final void MigrationSubmissionFailureComposable(final MigrationSubmissionFailureDest.FailureType failureType, final Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Screen.Name name;
        Intrinsics.checkNotNullParameter(failureType, "failureType");
        Composer composerStartRestartGroup = composer.startRestartGroup(-924203402);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? composerStartRestartGroup.changed(failureType) : composerStartRestartGroup.changedInstance(failureType) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        if ((i3 & 19) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-924203402, i3, -1, "com.robinhood.shared.crypto.acats.failure.MigrationSubmissionFailureComposable (MigrationSubmissionFailureComposable.kt:54)");
            }
            UserInteractionEventDescriptor userInteractionEventDescriptor = (UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
            if (failureType instanceof MigrationSubmissionFailureDest.FailureType.ContactSupport) {
                name = Screen.Name.ACATS_CRYPTO_MIGRATION_FLOW_ERROR_WITH_CX;
            } else {
                if (!Intrinsics.areEqual(failureType, MigrationSubmissionFailureDest.FailureType.TryAgain.INSTANCE)) {
                    throw new NoWhenBranchMatchedException();
                }
                name = Screen.Name.ACATS_CRYPTO_MIGRATION_FLOW_ERROR;
            }
            AutoLoggingCompositionLocals.EventLoggable(UserInteractionEventDescriptor.copy$default(userInteractionEventDescriptor, null, new Screen(name, null, null, null, 14, null), null, null, null, null, 61, null), ComposableLambda3.rememberComposableLambda(418066337, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.acats.failure.MigrationSubmissionFailureComposableKt.MigrationSubmissionFailureComposable.1
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
                        ComposerKt.traceEventStart(418066337, i5, -1, "com.robinhood.shared.crypto.acats.failure.MigrationSubmissionFailureComposable.<anonymous> (MigrationSubmissionFailureComposable.kt:65)");
                    }
                    final Modifier modifier2 = modifier;
                    final MigrationSubmissionFailureDest.FailureType failureType2 = failureType;
                    BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(913619958, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.acats.failure.MigrationSubmissionFailureComposableKt.MigrationSubmissionFailureComposable.1.1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer3, int i6) {
                            if ((i6 & 3) == 2 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(913619958, i6, -1, "com.robinhood.shared.crypto.acats.failure.MigrationSubmissionFailureComposable.<anonymous>.<anonymous> (MigrationSubmissionFailureComposable.kt:66)");
                            }
                            Modifier modifierLogScreenTransitions$default = ModifiersKt.logScreenTransitions$default(modifier2, null, 1, null);
                            ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(-357742357, true, new C506701(failureType2), composer3, 54);
                            final MigrationSubmissionFailureDest.FailureType failureType3 = failureType2;
                            BentoButtonBarScreenLayout.BentoButtonBarScreenLayout(modifierLogScreenTransitions$default, false, composableLambdaRememberComposableLambda, ComposableLambda3.rememberComposableLambda(1495580894, true, new Function3<BoxScope, Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.acats.failure.MigrationSubmissionFailureComposableKt.MigrationSubmissionFailureComposable.1.1.2
                                public final void invoke(BoxScope BentoButtonBarScreenLayout, Composer composer4, int i7) {
                                    int i8;
                                    Intrinsics.checkNotNullParameter(BentoButtonBarScreenLayout, "$this$BentoButtonBarScreenLayout");
                                    if ((i7 & 17) == 16 && composer4.getSkipping()) {
                                        composer4.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1495580894, i7, -1, "com.robinhood.shared.crypto.acats.failure.MigrationSubmissionFailureComposable.<anonymous>.<anonymous>.<anonymous> (MigrationSubmissionFailureComposable.kt:137)");
                                    }
                                    Modifier.Companion companion = Modifier.INSTANCE;
                                    Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
                                    Alignment.Companion companion2 = Alignment.INSTANCE;
                                    Alignment center = companion2.getCenter();
                                    MigrationSubmissionFailureDest.FailureType failureType4 = failureType3;
                                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
                                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer4, 0);
                                    CompositionLocalMap currentCompositionLocalMap = composer4.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer4, modifierFillMaxSize$default);
                                    ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                                    Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
                                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion3.getSetMeasurePolicy());
                                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                                    if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                    }
                                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                    Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(companion, 0.0f, 1, null), ScrollKt.rememberScrollState(0, composer4, 0, 1), false, null, false, 14, null);
                                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), companion2.getCenterHorizontally(), composer4, 48);
                                    int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer4, 0);
                                    CompositionLocalMap currentCompositionLocalMap2 = composer4.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer4, modifierVerticalScroll$default);
                                    Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                                    if (composer4.getApplier() == null) {
                                        Composables.invalidApplier();
                                    }
                                    composer4.startReusableNode();
                                    if (composer4.getInserting()) {
                                        composer4.createNode(constructor2);
                                    } else {
                                        composer4.useNode();
                                    }
                                    Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer4);
                                    Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
                                    Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                                    if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                        composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                        composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                    }
                                    Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
                                    Column6 column6 = Column6.INSTANCE;
                                    ImageKt.Image(AsyncImagePainter4.m9105rememberAsyncImagePainter0YpotYA(SvgUrl.CROSS_ERROR_DARK.getUrl(), CoilUtils2.rememberImageLoader(0.0d, null, composer4, 0, 3), null, null, null, 0, null, composer4, 0, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE), (String) null, SizeKt.m5156height3ABfNKs(companion, C2002Dp.m7995constructorimpl(EnumC7081g.SDK_ASSET_ILLUSTRATION_SECURE_TOKENIZATION_VALUE)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer4, 432, 120);
                                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                    int i9 = BentoTheme.$stable;
                                    Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, bentoTheme.getSpacing(composer4, i9).m21596getXxlargeD9Ej5fM()), composer4, 0);
                                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                                    TextAlign.Companion companion4 = TextAlign.INSTANCE;
                                    BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C37511R.string.crypto_acats_failure_title, composer4, 0), modifierFillMaxWidth$default, null, null, null, null, TextAlign.m7912boximpl(companion4.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer4, i9).getDisplayCapsuleLarge(), composer4, 48, 0, 8124);
                                    Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, bentoTheme.getSpacing(composer4, i9).m21590getDefaultD9Ej5fM()), composer4, 0);
                                    Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                                    int iM7919getCentere0LSkKk = companion4.m7919getCentere0LSkKk();
                                    if (failureType4 instanceof MigrationSubmissionFailureDest.FailureType.ContactSupport) {
                                        i8 = C37511R.string.crypto_acats_failure_contact_support_description;
                                    } else {
                                        if (!Intrinsics.areEqual(failureType4, MigrationSubmissionFailureDest.FailureType.TryAgain.INSTANCE)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        i8 = C37511R.string.crypto_acats_failure_try_again_description;
                                    }
                                    BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(i8, composer4, 0), modifierFillMaxWidth$default2, null, null, null, null, TextAlign.m7912boximpl(iM7919getCentere0LSkKk), 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer4, i9).getTextM(), composer4, 48, 0, 8124);
                                    composer4.endNode();
                                    composer4.endNode();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }

                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, Composer composer4, Integer num) {
                                    invoke(boxScope, composer4, num.intValue());
                                    return Unit.INSTANCE;
                                }
                            }, composer3, 54), composer3, 3504, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }

                        /* compiled from: MigrationSubmissionFailureComposable.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.shared.crypto.acats.failure.MigrationSubmissionFailureComposableKt$MigrationSubmissionFailureComposable$1$1$1, reason: invalid class name and collision with other inner class name */
                        static final class C506701 implements Function3<BentoButtonBar3, Composer, Integer, Unit> {
                            final /* synthetic */ MigrationSubmissionFailureDest.FailureType $failureType;

                            C506701(MigrationSubmissionFailureDest.FailureType failureType) {
                                this.$failureType = failureType;
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
                                    ComposerKt.traceEventStart(-357742357, i, -1, "com.robinhood.shared.crypto.acats.failure.MigrationSubmissionFailureComposable.<anonymous>.<anonymous>.<anonymous> (MigrationSubmissionFailureComposable.kt:70)");
                                }
                                final Navigator navigator = (Navigator) composer.consume(LocalNavigator.getLocalNavigator());
                                final Context context = (Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                                Object objRememberedValue = composer.rememberedValue();
                                Composer.Companion companion = Composer.INSTANCE;
                                if (objRememberedValue == companion.getEmpty()) {
                                    objRememberedValue = EffectsKt.createCompositionCoroutineScope(CoroutineContextImpl6.INSTANCE, composer);
                                    composer.updateRememberedValue(objRememberedValue);
                                }
                                final CoroutineScope coroutineScope = (CoroutineScope) objRememberedValue;
                                final EventLogger current = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composer, AutoLoggingCompositionLocals4.$stable);
                                MigrationSubmissionFailureDest.FailureType failureType = this.$failureType;
                                if (failureType instanceof MigrationSubmissionFailureDest.FailureType.ContactSupport) {
                                    composer.startReplaceGroup(-1688293350);
                                    Modifier modifierM21619defaultFillMaxWidthPadding3ABfNKs$default = PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(Modifier.INSTANCE, 0.0f, 1, null);
                                    String strStringResource = StringResources_androidKt.stringResource(C37511R.string.crypto_acats_failure_button_contact_support, composer, 0);
                                    String strStringResource2 = StringResources_androidKt.stringResource(C37511R.string.crypto_acats_failure_button_done, composer, 0);
                                    composer.startReplaceGroup(-1224400529);
                                    boolean zChangedInstance = composer.changedInstance(current) | composer.changedInstance(this.$failureType) | composer.changedInstance(coroutineScope) | composer.changedInstance(navigator) | composer.changedInstance(context);
                                    final MigrationSubmissionFailureDest.FailureType failureType2 = this.$failureType;
                                    Object objRememberedValue2 = composer.rememberedValue();
                                    if (zChangedInstance || objRememberedValue2 == companion.getEmpty()) {
                                        Object obj = new Function0() { // from class: com.robinhood.shared.crypto.acats.failure.MigrationSubmissionFailureComposableKt$MigrationSubmissionFailureComposable$1$1$1$$ExternalSyntheticLambda0
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                return MigrationSubmissionFailureComposable.C375311.AnonymousClass1.C506701.invoke$lambda$2$lambda$1(current, failureType2, navigator, context, coroutineScope);
                                            }
                                        };
                                        composer.updateRememberedValue(obj);
                                        objRememberedValue2 = obj;
                                    }
                                    Function0 function0 = (Function0) objRememberedValue2;
                                    composer.endReplaceGroup();
                                    composer.startReplaceGroup(-1746271574);
                                    boolean zChangedInstance2 = composer.changedInstance(current) | composer.changedInstance(navigator) | composer.changedInstance(context);
                                    Object objRememberedValue3 = composer.rememberedValue();
                                    if (zChangedInstance2 || objRememberedValue3 == companion.getEmpty()) {
                                        objRememberedValue3 = new Function0() { // from class: com.robinhood.shared.crypto.acats.failure.MigrationSubmissionFailureComposableKt$MigrationSubmissionFailureComposable$1$1$1$$ExternalSyntheticLambda1
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                return MigrationSubmissionFailureComposable.C375311.AnonymousClass1.C506701.invoke$lambda$4$lambda$3(current, navigator, context);
                                            }
                                        };
                                        composer.updateRememberedValue(objRememberedValue3);
                                    }
                                    composer.endReplaceGroup();
                                    BentoButtonBar2.BentoButtonBar(modifierM21619defaultFillMaxWidthPadding3ABfNKs$default, null, null, false, null, null, function0, strStringResource, false, null, false, (Function0) objRememberedValue3, strStringResource2, false, null, false, composer, 0, 0, 59198);
                                    composer.endReplaceGroup();
                                } else {
                                    if (!Intrinsics.areEqual(failureType, MigrationSubmissionFailureDest.FailureType.TryAgain.INSTANCE)) {
                                        composer.startReplaceGroup(-193009794);
                                        composer.endReplaceGroup();
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    composer.startReplaceGroup(-1686002729);
                                    Modifier modifierM21619defaultFillMaxWidthPadding3ABfNKs$default2 = PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(Modifier.INSTANCE, 0.0f, 1, null);
                                    String strStringResource3 = StringResources_androidKt.stringResource(C37511R.string.crypto_acats_failure_button_done, composer, 0);
                                    composer.startReplaceGroup(-1746271574);
                                    boolean zChangedInstance3 = composer.changedInstance(current) | composer.changedInstance(navigator) | composer.changedInstance(context);
                                    Object objRememberedValue4 = composer.rememberedValue();
                                    if (zChangedInstance3 || objRememberedValue4 == companion.getEmpty()) {
                                        objRememberedValue4 = new Function0() { // from class: com.robinhood.shared.crypto.acats.failure.MigrationSubmissionFailureComposableKt$MigrationSubmissionFailureComposable$1$1$1$$ExternalSyntheticLambda2
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                return MigrationSubmissionFailureComposable.C375311.AnonymousClass1.C506701.invoke$lambda$6$lambda$5(current, navigator, context);
                                            }
                                        };
                                        composer.updateRememberedValue(objRememberedValue4);
                                    }
                                    composer.endReplaceGroup();
                                    BentoButtonBar2.BentoButtonBar(modifierM21619defaultFillMaxWidthPadding3ABfNKs$default2, null, null, false, null, null, (Function0) objRememberedValue4, strStringResource3, false, null, false, null, null, false, null, false, composer, 0, 0, 65342);
                                    composer.endReplaceGroup();
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }

                            /* JADX INFO: Access modifiers changed from: private */
                            public static final Unit invoke$lambda$2$lambda$1(EventLogger eventLogger, MigrationSubmissionFailureDest.FailureType failureType, Navigator navigator, Context context, CoroutineScope coroutineScope) {
                                EventLogger.DefaultImpls.logTap$default(eventLogger, null, null, new Component(Component.ComponentType.BUTTON, AnalyticsStrings.BUTTON_TITLE_VERIFY_TAX_INFO_CONTACT_SUPPORT, null, 4, null), null, null, false, 59, null);
                                String deeplink = ((MigrationSubmissionFailureDest.FailureType.ContactSupport) failureType).getDeeplink();
                                if (deeplink == null || BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new MigrationSubmissionFailureComposable2(navigator, context, deeplink, null), 3, null) == null) {
                                    Navigators3.showContactSupportTriageFragment$default(navigator, context, "crypto.bitstamp.migration", false, 4, null);
                                    Unit unit = Unit.INSTANCE;
                                }
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: Access modifiers changed from: private */
                            public static final Unit invoke$lambda$4$lambda$3(EventLogger eventLogger, Navigator navigator, Context context) {
                                EventLogger.DefaultImpls.logTap$default(eventLogger, null, null, new Component(Component.ComponentType.BUTTON, "done", null, 4, null), null, null, false, 59, null);
                                Navigator.DefaultImpls.startActivity$default(navigator, context, MainActivityIntentKey.INSTANCE, null, false, null, null, 60, null);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: Access modifiers changed from: private */
                            public static final Unit invoke$lambda$6$lambda$5(EventLogger eventLogger, Navigator navigator, Context context) {
                                EventLogger.DefaultImpls.logTap$default(eventLogger, null, null, new Component(Component.ComponentType.BUTTON, "done", null, 4, null), null, null, false, 59, null);
                                Navigator.DefaultImpls.startActivity$default(navigator, context, MainActivityIntentKey.INSTANCE, null, false, null, null, 60, null);
                                return Unit.INSTANCE;
                            }
                        }
                    }, composer2, 54), composer2, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.crypto.acats.failure.MigrationSubmissionFailureComposableKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return MigrationSubmissionFailureComposable.MigrationSubmissionFailureComposable$lambda$0(failureType, modifier, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
