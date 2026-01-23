package com.robinhood.android.internalassettransfers.intro;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsPadding6;
import androidx.compose.foundation.layout.WindowInsets_androidKt;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.compose.autoeventlogging.UserInteractionEventDescriptors;
import com.robinhood.android.internalassettransfers.C18977R;
import com.robinhood.android.internalassettransfers.intro.InternalAssetTransferIntro7;
import com.robinhood.compose.bento.component.BentoAppBarKt;
import com.robinhood.compose.bento.component.BentoAppBarScope;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoTextButton2;
import com.robinhood.compose.bento.component.BentoTextButton3;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: InternalAssetTransferIntro.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u001f\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0001¢\u0006\u0002\u0010\u0006\u001a\u0015\u0010\u0007\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0003¢\u0006\u0002\u0010\b\u001a\u0015\u0010\t\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0003¢\u0006\u0002\u0010\b\u001a\r\u0010\n\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u000b\"\u000e\u0010\f\u001a\u00020\rX\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000e\u001a\u00020\rX\u0080T¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m3636d2 = {"InternalAssetTransferIntro", "", "callbacks", "Lcom/robinhood/android/internalassettransfers/intro/InternalAssetTransferIntroCallbacks;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/android/internalassettransfers/intro/InternalAssetTransferIntroCallbacks;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "InternalAssetTransferIntroContent", "(Lcom/robinhood/android/internalassettransfers/intro/InternalAssetTransferIntroCallbacks;Landroidx/compose/runtime/Composer;I)V", "InternalAssetTransferIntroFooter", "Preview", "(Landroidx/compose/runtime/Composer;I)V", "InternalAssetTransferIntroLinkButton", "", "InternalAssetTransferIntroContinueButton", "feature-internal-asset-transfers_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.internalassettransfers.intro.InternalAssetTransferIntroKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class InternalAssetTransferIntro7 {
    public static final String InternalAssetTransferIntroContinueButton = "IatIntroContinueButton";
    public static final String InternalAssetTransferIntroLinkButton = "IatIntroLinkButton";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InternalAssetTransferIntro$lambda$1(InternalAssetTransferIntro6 internalAssetTransferIntro6, Modifier modifier, int i, int i2, Composer composer, int i3) {
        InternalAssetTransferIntro(internalAssetTransferIntro6, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InternalAssetTransferIntroContent$lambda$2(InternalAssetTransferIntro6 internalAssetTransferIntro6, int i, Composer composer, int i2) {
        InternalAssetTransferIntroContent(internalAssetTransferIntro6, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InternalAssetTransferIntroFooter$lambda$8(InternalAssetTransferIntro6 internalAssetTransferIntro6, int i, Composer composer, int i2) {
        InternalAssetTransferIntroFooter(internalAssetTransferIntro6, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Preview$lambda$9(int i, Composer composer, int i2) {
        Preview(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void InternalAssetTransferIntro(final InternalAssetTransferIntro6 callbacks, final Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        Composer composerStartRestartGroup = composer.startRestartGroup(742183086);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(callbacks) ? 4 : 2) | i;
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
                ComposerKt.traceEventStart(742183086, i3, -1, "com.robinhood.android.internalassettransfers.intro.InternalAssetTransferIntro (InternalAssetTransferIntro.kt:61)");
            }
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(modifier, 0.0f, 1, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getBottomCenter(), false);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxSize$default);
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                Composables.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            int i5 = i3 & 14;
            InternalAssetTransferIntroContent(callbacks, composerStartRestartGroup, i5);
            InternalAssetTransferIntroFooter(callbacks, composerStartRestartGroup, i5);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.internalassettransfers.intro.InternalAssetTransferIntroKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return InternalAssetTransferIntro7.InternalAssetTransferIntro$lambda$1(callbacks, modifier, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void InternalAssetTransferIntroContent(final InternalAssetTransferIntro6 internalAssetTransferIntro6, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-478969208);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(internalAssetTransferIntro6) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-478969208, i2, -1, "com.robinhood.android.internalassettransfers.intro.InternalAssetTransferIntroContent (InternalAssetTransferIntro.kt:77)");
            }
            ScaffoldKt.m5939ScaffoldTvnljyQ(null, ComposableLambda3.rememberComposableLambda(251599172, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.internalassettransfers.intro.InternalAssetTransferIntroKt.InternalAssetTransferIntroContent.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i3) {
                    if ((i3 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(251599172, i3, -1, "com.robinhood.android.internalassettransfers.intro.InternalAssetTransferIntroContent.<anonymous> (InternalAssetTransferIntro.kt:80)");
                    }
                    BentoAppBarKt.m20573BentoAppBarSGdaT3c(InternalAssetTransferIntro.INSTANCE.m2095x5ca063de(), null, ComposableLambda3.rememberComposableLambda(1693037411, true, new AnonymousClass1(internalAssetTransferIntro6), composer2, 54), null, null, false, false, null, Color.m6701boximpl(BentoTheme.INSTANCE.getColors(composer2, BentoTheme.$stable).getJet()), 0L, null, composer2, 390, 0, 1786);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }

                /* compiled from: InternalAssetTransferIntro.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.android.internalassettransfers.intro.InternalAssetTransferIntroKt$InternalAssetTransferIntroContent$1$1, reason: invalid class name */
                static final class AnonymousClass1 implements Function3<BentoAppBarScope, Composer, Integer, Unit> {
                    final /* synthetic */ InternalAssetTransferIntro6 $callbacks;

                    AnonymousClass1(InternalAssetTransferIntro6 internalAssetTransferIntro6) {
                        this.$callbacks = internalAssetTransferIntro6;
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer, Integer num) {
                        invoke(bentoAppBarScope, composer, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(BentoAppBarScope BentoAppBar, Composer composer, int i) {
                        Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                        if ((i & 6) == 0) {
                            i |= (i & 8) == 0 ? composer.changed(BentoAppBar) : composer.changedInstance(BentoAppBar) ? 4 : 2;
                        }
                        if ((i & 19) == 18 && composer.getSkipping()) {
                            composer.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1693037411, i, -1, "com.robinhood.android.internalassettransfers.intro.InternalAssetTransferIntroContent.<anonymous>.<anonymous> (InternalAssetTransferIntro.kt:84)");
                        }
                        Color colorM6701boximpl = Color.m6701boximpl(BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).getNova());
                        composer.startReplaceGroup(5004770);
                        boolean zChanged = composer.changed(this.$callbacks);
                        final InternalAssetTransferIntro6 internalAssetTransferIntro6 = this.$callbacks;
                        Object objRememberedValue = composer.rememberedValue();
                        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function0() { // from class: com.robinhood.android.internalassettransfers.intro.InternalAssetTransferIntroKt$InternalAssetTransferIntroContent$1$1$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return InternalAssetTransferIntro7.C192241.AnonymousClass1.invoke$lambda$1$lambda$0(internalAssetTransferIntro6);
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue);
                        }
                        composer.endReplaceGroup();
                        BentoAppBar.m20575BentoBackButtondrOMvmE(null, false, colorM6701boximpl, (Function0) objRememberedValue, composer, (BentoAppBarScope.$stable << 12) | ((i << 12) & 57344), 3);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$1$lambda$0(InternalAssetTransferIntro6 internalAssetTransferIntro6) {
                        internalAssetTransferIntro6.onBackNavigationClick();
                        return Unit.INSTANCE;
                    }
                }
            }, composerStartRestartGroup, 54), null, null, null, 0, BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21371getBg0d7_KjU(), 0L, null, InternalAssetTransferIntro.INSTANCE.m2096x4f28e84b(), composerStartRestartGroup, 805306416, 445);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.internalassettransfers.intro.InternalAssetTransferIntroKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return InternalAssetTransferIntro7.InternalAssetTransferIntroContent$lambda$2(internalAssetTransferIntro6, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void InternalAssetTransferIntroFooter(final InternalAssetTransferIntro6 internalAssetTransferIntro6, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-998610322);
        if ((i & 6) == 0) {
            i2 = i | (composerStartRestartGroup.changed(internalAssetTransferIntro6) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-998610322, i2, -1, "com.robinhood.android.internalassettransfers.intro.InternalAssetTransferIntroFooter (InternalAssetTransferIntro.kt:150)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i3 = BentoTheme.$stable;
            Modifier modifierWindowInsetsPadding = WindowInsetsPadding6.windowInsetsPadding(PaddingKt.m5144paddingVpY3zN4$default(modifierFillMaxWidth$default, bentoTheme.getSpacing(composerStartRestartGroup, i3).m21592getMediumD9Ej5fM(), 0.0f, 2, null), WindowInsets_androidKt.getNavigationBars(WindowInsets.INSTANCE, composerStartRestartGroup, 6));
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getCenterHorizontally(), composerStartRestartGroup, 48);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierWindowInsetsPadding);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                Composables.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            Spacer2.Spacer(SizeKt.m5169size3ABfNKs(companion, bentoTheme.getSpacing(composerStartRestartGroup, i3).m21590getDefaultD9Ej5fM()), composerStartRestartGroup, 0);
            Modifier modifierTestTag = TestTag3.testTag(companion, InternalAssetTransferIntroLinkButton);
            String strStringResource = StringResources_androidKt.stringResource(C18977R.string.internal_asset_transfer_intro_link, composerStartRestartGroup, 0);
            BentoTextButton3.Size size = BentoTextButton3.Size.f5148S;
            long jM21426getFg20d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i3).m21426getFg20d7_KjU();
            composerStartRestartGroup.startReplaceGroup(5004770);
            int i4 = i2 & 14;
            boolean z = i4 == 4;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.internalassettransfers.intro.InternalAssetTransferIntroKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return InternalAssetTransferIntro7.InternalAssetTransferIntroFooter$lambda$7$lambda$4$lambda$3(internalAssetTransferIntro6);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            BentoTextButton2.m20715BentoTextButtonPIknLig((Function0) objRememberedValue, strStringResource, modifierTestTag, null, size, false, Color.m6701boximpl(jM21426getFg20d7_KjU), composerStartRestartGroup, 24960, 40);
            Spacer2.Spacer(SizeKt.m5169size3ABfNKs(companion, bentoTheme.getSpacing(composerStartRestartGroup, i3).m21590getDefaultD9Ej5fM()), composerStartRestartGroup, 0);
            Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(PaddingKt.m5146paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(TestTag3.testTag(companion, InternalAssetTransferIntroContinueButton), 0.0f, 1, null), 0.0f, 0.0f, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i3).m21590getDefaultD9Ej5fM(), 7, null), UserInteractionEventDescriptors.updateWith((UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), new UserInteractionEventDescriptor(null, null, UserInteractionEventData.Action.CONTINUE, null, new Component(Component.ComponentType.BUTTON, null, null, 6, null), null, 43, null)), true, false, false, true, false, null, 108, null);
            String strStringResource2 = StringResources_androidKt.stringResource(C18977R.string.internal_asset_transfer_intro_button, composerStartRestartGroup, 0);
            long jM21425getFg0d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i3).m21425getFg0d7_KjU();
            long jM21371getBg0d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i3).m21371getBg0d7_KjU();
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean z2 = i4 == 4;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (z2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: com.robinhood.android.internalassettransfers.intro.InternalAssetTransferIntroKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return InternalAssetTransferIntro7.InternalAssetTransferIntroFooter$lambda$7$lambda$6$lambda$5(internalAssetTransferIntro6);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceGroup();
            BentoButtonKt.m20586BentoButtonEikTQX8((Function0) objRememberedValue2, strStringResource2, modifierAutoLogEvents$default, null, null, false, false, Color.m6701boximpl(jM21425getFg0d7_KjU), Color.m6701boximpl(jM21371getBg0d7_KjU), null, null, false, null, composerStartRestartGroup, 0, 0, 7800);
            composerStartRestartGroup = composerStartRestartGroup;
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.internalassettransfers.intro.InternalAssetTransferIntroKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return InternalAssetTransferIntro7.InternalAssetTransferIntroFooter$lambda$8(internalAssetTransferIntro6, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InternalAssetTransferIntroFooter$lambda$7$lambda$4$lambda$3(InternalAssetTransferIntro6 internalAssetTransferIntro6) {
        internalAssetTransferIntro6.onLinkClick();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InternalAssetTransferIntroFooter$lambda$7$lambda$6$lambda$5(InternalAssetTransferIntro6 internalAssetTransferIntro6) {
        internalAssetTransferIntro6.onContinueButtonClick();
        return Unit.INSTANCE;
    }

    private static final void Preview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-741041649);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-741041649, i, -1, "com.robinhood.android.internalassettransfers.intro.Preview (InternalAssetTransferIntro.kt:194)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, InternalAssetTransferIntro.INSTANCE.m2094xb00f4ac8(), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.internalassettransfers.intro.InternalAssetTransferIntroKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return InternalAssetTransferIntro7.Preview$lambda$9(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
