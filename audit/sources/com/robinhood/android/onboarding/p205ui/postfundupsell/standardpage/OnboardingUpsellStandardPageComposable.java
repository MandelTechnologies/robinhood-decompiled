package com.robinhood.android.onboarding.p205ui.postfundupsell.standardpage;

import androidx.compose.foundation.Background3;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.res.StringResources_androidKt;
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
import com.google.accompanist.systemuicontroller.SystemUiController;
import com.google.accompanist.systemuicontroller.SystemUiController3;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiColumns;
import com.robinhood.android.maxonboarding.OnboardingProgress;
import com.robinhood.android.onboarding.C22739R;
import com.robinhood.compose.bento.component.BentoAppBarKt;
import com.robinhood.compose.bento.component.BentoAppBarScope;
import com.robinhood.compose.bento.component.BentoProgressBar2;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.models.serverdriven.experimental.api.CenterAlignedListPage;
import com.robinhood.models.serverdriven.experimental.api.OnboardingFundingUpsellAction;
import com.robinhood.models.serverdriven.experimental.api.PageThemeOverride;
import com.robinhood.models.serverdriven.experimental.api.StandardPageTemplate;
import com.robinhood.models.serverdriven.experimental.api.TopAlignedListPage;
import com.robinhood.models.serverdriven.experimental.p348ui.HorizontalPadding;
import com.robinhood.rosetta.eventlogging.Screen;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList3;
import kotlinx.collections.immutable.extensions2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: OnboardingUpsellStandardPageComposable.kt */
@Metadata(m3635d1 = {"\u00004\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u001a]\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u0007¢\u0006\u0002\u0010\u0010\u001aA\u0010\u0011\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000f2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\tH\u0007¢\u0006\u0002\u0010\u0012\u001aE\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000f2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0007¢\u0006\u0002\u0010\u0015\u001a;\u0010\u0016\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u000e\u001a\u00020\u000f2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\r2\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0007¢\u0006\u0002\u0010\u0017¨\u0006\u0018"}, m3636d2 = {"OnboardingUpsellStandardPageComposable", "", "content", "Lcom/robinhood/models/serverdriven/experimental/api/StandardPageTemplate;", "Lcom/robinhood/models/serverdriven/experimental/api/OnboardingFundingUpsellAction;", "shouldShowGoldNativeFundingNavBar", "", "useCloseNavigationIcon", "onBackPressed", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "actionHandler", "Lcom/robinhood/android/libdesignsystem/serverui/experimental/compose/ActionHandler;", "screen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "(Lcom/robinhood/models/serverdriven/experimental/api/StandardPageTemplate;ZZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Lcom/robinhood/android/libdesignsystem/serverui/experimental/compose/ActionHandler;Lcom/robinhood/rosetta/eventlogging/Screen;Landroidx/compose/runtime/Composer;II)V", "OnboardingUpsellStandardNavigationBar", "(Lcom/robinhood/models/serverdriven/experimental/api/StandardPageTemplate;ZZLcom/robinhood/rosetta/eventlogging/Screen;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "OnboardingUpsellStandardNavigationAppBar", "isTransparent", "(ZZZLcom/robinhood/rosetta/eventlogging/Screen;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "OnboardingUpsellStandardPageContent", "(Lcom/robinhood/models/serverdriven/experimental/api/StandardPageTemplate;Lcom/robinhood/rosetta/eventlogging/Screen;Lcom/robinhood/android/libdesignsystem/serverui/experimental/compose/ActionHandler;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "feature-onboarding_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.onboarding.ui.postfundupsell.standardpage.OnboardingUpsellStandardPageComposableKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class OnboardingUpsellStandardPageComposable {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OnboardingUpsellStandardNavigationAppBar$lambda$4(boolean z, boolean z2, boolean z3, Screen screen, Function0 function0, Modifier modifier, int i, int i2, Composer composer, int i3) {
        OnboardingUpsellStandardNavigationAppBar(z, z2, z3, screen, function0, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OnboardingUpsellStandardNavigationBar$lambda$3(StandardPageTemplate standardPageTemplate, boolean z, boolean z2, Screen screen, Function0 function0, int i, Composer composer, int i2) {
        OnboardingUpsellStandardNavigationBar(standardPageTemplate, z, z2, screen, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OnboardingUpsellStandardPageComposable$lambda$2(StandardPageTemplate standardPageTemplate, boolean z, boolean z2, Function0 function0, Modifier modifier, SduiActionHandler sduiActionHandler, Screen screen, int i, int i2, Composer composer, int i3) {
        OnboardingUpsellStandardPageComposable(standardPageTemplate, z, z2, function0, modifier, sduiActionHandler, screen, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OnboardingUpsellStandardPageContent$lambda$5(StandardPageTemplate standardPageTemplate, Screen screen, SduiActionHandler sduiActionHandler, Modifier modifier, int i, int i2, Composer composer, int i3) {
        OnboardingUpsellStandardPageContent(standardPageTemplate, screen, sduiActionHandler, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:149:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0114  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void OnboardingUpsellStandardPageComposable(final StandardPageTemplate<? extends OnboardingFundingUpsellAction> content, final boolean z, final boolean z2, final Function0<Unit> onBackPressed, Modifier modifier, SduiActionHandler<? super OnboardingFundingUpsellAction> sduiActionHandler, Screen screen, Composer composer, final int i, final int i2) {
        int i3;
        boolean z3;
        int i4;
        Modifier modifier2;
        SduiActionHandler<? super OnboardingFundingUpsellAction> sduiActionHandler2;
        Screen screen2;
        Modifier modifier3;
        SduiActionHandler<? super OnboardingFundingUpsellAction> sduiActionHandler3;
        int i5;
        Screen screen3;
        Screen screen4;
        Composer composer2;
        SduiActionHandler<? super OnboardingFundingUpsellAction> sduiActionHandler4;
        final SduiActionHandler<? super OnboardingFundingUpsellAction> sduiActionHandler5;
        final Modifier modifier4;
        final Screen screen5;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(onBackPressed, "onBackPressed");
        Composer composerStartRestartGroup = composer.startRestartGroup(427929498);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(content) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                i3 |= composerStartRestartGroup.changed(z) ? 32 : 16;
            }
            if ((i2 & 4) == 0) {
                i3 |= 384;
            } else {
                if ((i & 384) == 0) {
                    z3 = z2;
                    i3 |= composerStartRestartGroup.changed(z3) ? 256 : 128;
                }
                if ((i2 & 8) != 0) {
                    i3 |= 3072;
                } else if ((i & 3072) == 0) {
                    i3 |= composerStartRestartGroup.changedInstance(onBackPressed) ? 2048 : 1024;
                }
                i4 = i2 & 16;
                if (i4 == 0) {
                    if ((i & 24576) == 0) {
                        modifier2 = modifier;
                        i3 |= composerStartRestartGroup.changed(modifier2) ? 16384 : 8192;
                    }
                    if ((196608 & i) != 0) {
                        if ((i2 & 32) == 0) {
                            sduiActionHandler2 = sduiActionHandler;
                            int i6 = composerStartRestartGroup.changedInstance(sduiActionHandler2) ? 131072 : 65536;
                            i3 |= i6;
                        } else {
                            sduiActionHandler2 = sduiActionHandler;
                        }
                        i3 |= i6;
                    } else {
                        sduiActionHandler2 = sduiActionHandler;
                    }
                    if ((1572864 & i) != 0) {
                        if ((i2 & 64) == 0) {
                            screen2 = screen;
                            int i7 = composerStartRestartGroup.changedInstance(screen2) ? 1048576 : 524288;
                            i3 |= i7;
                        } else {
                            screen2 = screen;
                        }
                        i3 |= i7;
                    } else {
                        screen2 = screen;
                    }
                    if ((599187 & i3) == 599186 || !composerStartRestartGroup.getSkipping()) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                            modifier3 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                            if ((i2 & 32) == 0) {
                                sduiActionHandler3 = SduiActionHandler.NotImplemented.INSTANCE;
                                i3 &= -458753;
                            } else {
                                sduiActionHandler3 = sduiActionHandler2;
                            }
                            if ((i2 & 64) == 0) {
                                String logging_screen_identifier = content.getLogging_screen_identifier();
                                if (logging_screen_identifier == null) {
                                    logging_screen_identifier = "onboarding-upsell-standard-page-template";
                                }
                                Screen screen6 = new Screen(null, null, logging_screen_identifier, null, 11, null);
                                i5 = i3 & (-3670017);
                                screen3 = screen6;
                            } else {
                                i5 = i3;
                                screen3 = screen2;
                            }
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            if ((i2 & 32) != 0) {
                                i3 &= -458753;
                            }
                            if ((i2 & 64) != 0) {
                                i3 &= -3670017;
                            }
                            modifier3 = modifier2;
                            sduiActionHandler3 = sduiActionHandler2;
                            screen3 = screen2;
                            i5 = i3;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(427929498, i5, -1, "com.robinhood.android.onboarding.ui.postfundupsell.standardpage.OnboardingUpsellStandardPageComposable (OnboardingUpsellStandardPageComposable.kt:41)");
                        }
                        if (!content.is_full_bleed()) {
                            composerStartRestartGroup.startReplaceGroup(985296625);
                            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(modifier3, 0.0f, 1, null);
                            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
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
                            int i8 = i5 >> 9;
                            OnboardingUpsellStandardNavigationBar(content, z, z3, screen3, onBackPressed, composerStartRestartGroup, (i5 & 1022) | (i8 & 7168) | ((i5 << 3) & 57344));
                            screen4 = screen3;
                            composer2 = composerStartRestartGroup;
                            sduiActionHandler4 = sduiActionHandler3;
                            OnboardingUpsellStandardPageContent(content, screen4, sduiActionHandler4, null, composer2, ((i5 >> 15) & 112) | (i5 & 14) | (i8 & 896), 8);
                            composer2.endNode();
                            composer2.endReplaceGroup();
                        } else {
                            Screen screen7 = screen3;
                            composerStartRestartGroup.startReplaceGroup(985896878);
                            Modifier modifierFillMaxSize$default2 = SizeKt.fillMaxSize$default(modifier3, 0.0f, 1, null);
                            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                            int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxSize$default2);
                            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
                            if (composerStartRestartGroup.getApplier() == null) {
                                Composables.invalidApplier();
                            }
                            composerStartRestartGroup.startReusableNode();
                            if (composerStartRestartGroup.getInserting()) {
                                composerStartRestartGroup.createNode(constructor2);
                            } else {
                                composerStartRestartGroup.useNode();
                            }
                            Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                            Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion2.getSetCompositeKeyHash();
                            if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                            }
                            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion2.getSetModifier());
                            Column6 column6 = Column6.INSTANCE;
                            int i9 = i5 >> 9;
                            OnboardingUpsellStandardNavigationBar(content, z, z2, screen7, onBackPressed, composerStartRestartGroup, (i5 & 1022) | (i9 & 7168) | ((i5 << 3) & 57344));
                            screen4 = screen7;
                            composer2 = composerStartRestartGroup;
                            sduiActionHandler4 = sduiActionHandler3;
                            OnboardingUpsellStandardPageContent(content, screen4, sduiActionHandler4, null, composer2, ((i5 >> 15) & 112) | (i5 & 14) | (i9 & 896), 8);
                            composer2.endNode();
                            composer2.endReplaceGroup();
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        sduiActionHandler5 = sduiActionHandler4;
                        modifier4 = modifier3;
                        screen5 = screen4;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        composer2 = composerStartRestartGroup;
                        modifier4 = modifier2;
                        sduiActionHandler5 = sduiActionHandler2;
                        screen5 = screen2;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.onboarding.ui.postfundupsell.standardpage.OnboardingUpsellStandardPageComposableKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return OnboardingUpsellStandardPageComposable.OnboardingUpsellStandardPageComposable$lambda$2(content, z, z2, onBackPressed, modifier4, sduiActionHandler5, screen5, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                i3 |= 24576;
                modifier2 = modifier;
                if ((196608 & i) != 0) {
                }
                if ((1572864 & i) != 0) {
                }
                if ((599187 & i3) == 599186) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i4 == 0) {
                        }
                        if ((i2 & 32) == 0) {
                        }
                        if ((i2 & 64) == 0) {
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        if (!content.is_full_bleed()) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        sduiActionHandler5 = sduiActionHandler4;
                        modifier4 = modifier3;
                        screen5 = screen4;
                    }
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            z3 = z2;
            if ((i2 & 8) != 0) {
            }
            i4 = i2 & 16;
            if (i4 == 0) {
            }
            modifier2 = modifier;
            if ((196608 & i) != 0) {
            }
            if ((1572864 & i) != 0) {
            }
            if ((599187 & i3) == 599186) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        if ((i2 & 4) == 0) {
        }
        z3 = z2;
        if ((i2 & 8) != 0) {
        }
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        modifier2 = modifier;
        if ((196608 & i) != 0) {
        }
        if ((1572864 & i) != 0) {
        }
        if ((599187 & i3) == 599186) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    public static final void OnboardingUpsellStandardNavigationBar(final StandardPageTemplate<? extends OnboardingFundingUpsellAction> content, final boolean z, final boolean z2, final Screen screen, final Function0<Unit> onBackPressed, Composer composer, final int i) {
        int i2;
        boolean z3;
        boolean z4;
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(screen, "screen");
        Intrinsics.checkNotNullParameter(onBackPressed, "onBackPressed");
        Composer composerStartRestartGroup = composer.startRestartGroup(1845934228);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(content) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            z3 = z;
            i2 |= composerStartRestartGroup.changed(z3) ? 32 : 16;
        } else {
            z3 = z;
        }
        if ((i & 384) == 0) {
            z4 = z2;
            i2 |= composerStartRestartGroup.changed(z4) ? 256 : 128;
        } else {
            z4 = z2;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(screen) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onBackPressed) ? 16384 : 8192;
        }
        if ((i2 & 9363) != 9362 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1845934228, i2, -1, "com.robinhood.android.onboarding.ui.postfundupsell.standardpage.OnboardingUpsellStandardNavigationBar (OnboardingUpsellStandardPageComposable.kt:86)");
            }
            if (!content.getHide_back_button()) {
                if (content.getTheme_override() != null) {
                    composerStartRestartGroup.startReplaceGroup(-534316188);
                    final boolean z5 = z3;
                    final boolean z6 = z4;
                    BentoTheme2.BentoTheme(Boolean.valueOf(content.getTheme_override() == PageThemeOverride.LIGHT), null, null, null, null, null, null, null, ComposableLambda3.rememberComposableLambda(2060927938, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.onboarding.ui.postfundupsell.standardpage.OnboardingUpsellStandardPageComposableKt.OnboardingUpsellStandardNavigationBar.1
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
                                ComposerKt.traceEventStart(2060927938, i3, -1, "com.robinhood.android.onboarding.ui.postfundupsell.standardpage.OnboardingUpsellStandardNavigationBar.<anonymous> (OnboardingUpsellStandardPageComposable.kt:91)");
                            }
                            OnboardingUpsellStandardPageComposable.OnboardingUpsellStandardNavigationAppBar(z5, z6, content.is_full_bleed(), screen, onBackPressed, null, composer2, 0, 32);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composerStartRestartGroup, 54), composerStartRestartGroup, 100663296, EnumC7081g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE);
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    composerStartRestartGroup.startReplaceGroup(-533797248);
                    OnboardingUpsellStandardNavigationAppBar(z, z2, content.is_full_bleed(), screen, onBackPressed, null, composerStartRestartGroup, ((i2 >> 3) & EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE) | (i2 & 7168) | (i2 & 57344), 32);
                    composerStartRestartGroup.endReplaceGroup();
                }
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.onboarding.ui.postfundupsell.standardpage.OnboardingUpsellStandardPageComposableKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return OnboardingUpsellStandardPageComposable.OnboardingUpsellStandardNavigationBar$lambda$3(content, z, z2, screen, onBackPressed, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:70:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:84:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void OnboardingUpsellStandardNavigationAppBar(final boolean z, final boolean z2, final boolean z3, final Screen screen, final Function0<Unit> onBackPressed, Modifier modifier, Composer composer, final int i, final int i2) {
        boolean z4;
        int i3;
        boolean z5;
        boolean z6;
        Modifier modifier2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(screen, "screen");
        Intrinsics.checkNotNullParameter(onBackPressed, "onBackPressed");
        Composer composerStartRestartGroup = composer.startRestartGroup(184755994);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            z4 = z;
        } else {
            z4 = z;
            if ((i & 6) == 0) {
                i3 = (composerStartRestartGroup.changed(z4) ? 4 : 2) | i;
            } else {
                i3 = i;
            }
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
            z5 = z2;
        } else {
            z5 = z2;
            if ((i & 48) == 0) {
                i3 |= composerStartRestartGroup.changed(z5) ? 32 : 16;
            }
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
            z6 = z3;
        } else {
            z6 = z3;
            if ((i & 384) == 0) {
                i3 |= composerStartRestartGroup.changed(z6) ? 256 : 128;
            }
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(screen) ? 2048 : 1024;
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onBackPressed) ? 16384 : 8192;
        }
        int i4 = i2 & 32;
        if (i4 == 0) {
            if ((196608 & i) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 131072 : 65536;
            }
            if ((74899 & i3) == 74898 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(184755994, i3, -1, "com.robinhood.android.onboarding.ui.postfundupsell.standardpage.OnboardingUpsellStandardNavigationAppBar (OnboardingUpsellStandardPageComposable.kt:119)");
                }
                final boolean z7 = z4;
                final boolean z8 = z5;
                final boolean z9 = z6;
                final Modifier modifier5 = modifier4;
                AutoLoggingCompositionLocals.EventLoggable(new UserInteractionEventDescriptor(null, screen, null, null, null, null, 61, null), ComposableLambda3.rememberComposableLambda(-1133461425, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.onboarding.ui.postfundupsell.standardpage.OnboardingUpsellStandardPageComposableKt.OnboardingUpsellStandardNavigationAppBar.1
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
                            ComposerKt.traceEventStart(-1133461425, i5, -1, "com.robinhood.android.onboarding.ui.postfundupsell.standardpage.OnboardingUpsellStandardNavigationAppBar.<anonymous> (OnboardingUpsellStandardPageComposable.kt:125)");
                        }
                        final boolean z10 = z7;
                        ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(1291993980, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.onboarding.ui.postfundupsell.standardpage.OnboardingUpsellStandardPageComposableKt.OnboardingUpsellStandardNavigationAppBar.1.1
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
                                    ComposerKt.traceEventStart(1291993980, i6, -1, "com.robinhood.android.onboarding.ui.postfundupsell.standardpage.OnboardingUpsellStandardNavigationAppBar.<anonymous>.<anonymous> (OnboardingUpsellStandardPageComposable.kt:128)");
                                }
                                if (z10) {
                                    BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C22739R.string.post_sign_up_toolbar_title, composer3, 0), PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(Modifier.INSTANCE, 0.0f, composer3, 6, 1), null, null, null, null, null, 0, false, 0, 0, null, 0, BentoTheme.INSTANCE.getTypography(composer3, BentoTheme.$stable).getTextL(), composer3, 0, 0, 8188);
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer2, 54);
                        Modifier modifier6 = modifier5;
                        final boolean z11 = z8;
                        final Function0<Unit> function0 = onBackPressed;
                        ComposableLambda composableLambdaRememberComposableLambda2 = ComposableLambda3.rememberComposableLambda(1012832208, true, new Function3<BentoAppBarScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.onboarding.ui.postfundupsell.standardpage.OnboardingUpsellStandardPageComposableKt.OnboardingUpsellStandardNavigationAppBar.1.2
                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer3, Integer num) {
                                invoke(bentoAppBarScope, composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(BentoAppBarScope BentoAppBar, Composer composer3, int i6) {
                                int i7;
                                Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                                if ((i6 & 6) == 0) {
                                    i7 = i6 | ((i6 & 8) == 0 ? composer3.changed(BentoAppBar) : composer3.changedInstance(BentoAppBar) ? 4 : 2);
                                } else {
                                    i7 = i6;
                                }
                                if ((i7 & 19) == 18 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1012832208, i7, -1, "com.robinhood.android.onboarding.ui.postfundupsell.standardpage.OnboardingUpsellStandardNavigationAppBar.<anonymous>.<anonymous> (OnboardingUpsellStandardPageComposable.kt:146)");
                                }
                                if (z11) {
                                    composer3.startReplaceGroup(1139112441);
                                    BentoAppBar.m20576BentoCloseButtoncf5BqRc(ModifiersKt.autoLogEvents$default(TestTag3.testTag(Modifier.INSTANCE, OnboardingUpsellStandardPageFragment.CLOSE_BUTTON_TEST_TAG), null, true, false, false, true, false, null, 109, null), false, 0L, function0, composer3, (BentoAppBarScope.$stable << 12) | ((i7 << 12) & 57344), 6);
                                    composer3.endReplaceGroup();
                                } else {
                                    composer3.startReplaceGroup(1139524028);
                                    BentoAppBar.m20575BentoBackButtondrOMvmE(ModifiersKt.autoLogEvents$default(TestTag3.testTag(Modifier.INSTANCE, OnboardingUpsellStandardPageFragment.BACK_BUTTON_TEST_TAG), null, true, false, false, true, false, null, 109, null), false, null, function0, composer3, (BentoAppBarScope.$stable << 12) | ((i7 << 12) & 57344), 6);
                                    composer3.endReplaceGroup();
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer2, 54);
                        final boolean z12 = z7;
                        BentoAppBarKt.m20573BentoAppBarSGdaT3c(composableLambdaRememberComposableLambda, modifier6, composableLambdaRememberComposableLambda2, null, ComposableLambda3.rememberComposableLambda(331244481, true, new Function3<BoxScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.onboarding.ui.postfundupsell.standardpage.OnboardingUpsellStandardPageComposableKt.OnboardingUpsellStandardNavigationAppBar.1.3
                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, Composer composer3, Integer num) {
                                invoke(boxScope, composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(BoxScope BentoAppBar, Composer composer3, int i6) {
                                Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                                if ((i6 & 17) == 16 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(331244481, i6, -1, "com.robinhood.android.onboarding.ui.postfundupsell.standardpage.OnboardingUpsellStandardNavigationAppBar.<anonymous>.<anonymous> (OnboardingUpsellStandardPageComposable.kt:137)");
                                }
                                if (z12) {
                                    OnboardingProgress onboardingProgress = OnboardingProgress.FUND_ACCOUNT_NATIVE_GOLD_UPSELL;
                                    BentoProgressBar2.m20699BentoProgressBarnBX6wN0(onboardingProgress.getSegmentIdx(), onboardingProgress.getProgress(), 5, null, 0L, 0L, false, composer3, 384, 120);
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer2, 54), z9, false, null, null, 0L, null, composer2, 1597830, 0, 1928);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, 48);
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
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.onboarding.ui.postfundupsell.standardpage.OnboardingUpsellStandardPageComposableKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return OnboardingUpsellStandardPageComposable.OnboardingUpsellStandardNavigationAppBar$lambda$4(z, z2, z3, screen, onBackPressed, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 196608;
        modifier2 = modifier;
        if ((74899 & i3) == 74898) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            final boolean z72 = z4;
            final boolean z82 = z5;
            final boolean z92 = z6;
            final Modifier modifier52 = modifier4;
            AutoLoggingCompositionLocals.EventLoggable(new UserInteractionEventDescriptor(null, screen, null, null, null, null, 61, null), ComposableLambda3.rememberComposableLambda(-1133461425, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.onboarding.ui.postfundupsell.standardpage.OnboardingUpsellStandardPageComposableKt.OnboardingUpsellStandardNavigationAppBar.1
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
                        ComposerKt.traceEventStart(-1133461425, i5, -1, "com.robinhood.android.onboarding.ui.postfundupsell.standardpage.OnboardingUpsellStandardNavigationAppBar.<anonymous> (OnboardingUpsellStandardPageComposable.kt:125)");
                    }
                    final boolean z10 = z72;
                    ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(1291993980, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.onboarding.ui.postfundupsell.standardpage.OnboardingUpsellStandardPageComposableKt.OnboardingUpsellStandardNavigationAppBar.1.1
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
                                ComposerKt.traceEventStart(1291993980, i6, -1, "com.robinhood.android.onboarding.ui.postfundupsell.standardpage.OnboardingUpsellStandardNavigationAppBar.<anonymous>.<anonymous> (OnboardingUpsellStandardPageComposable.kt:128)");
                            }
                            if (z10) {
                                BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C22739R.string.post_sign_up_toolbar_title, composer3, 0), PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(Modifier.INSTANCE, 0.0f, composer3, 6, 1), null, null, null, null, null, 0, false, 0, 0, null, 0, BentoTheme.INSTANCE.getTypography(composer3, BentoTheme.$stable).getTextL(), composer3, 0, 0, 8188);
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer2, 54);
                    Modifier modifier6 = modifier52;
                    final boolean z11 = z82;
                    final Function0<Unit> function0 = onBackPressed;
                    ComposableLambda composableLambdaRememberComposableLambda2 = ComposableLambda3.rememberComposableLambda(1012832208, true, new Function3<BentoAppBarScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.onboarding.ui.postfundupsell.standardpage.OnboardingUpsellStandardPageComposableKt.OnboardingUpsellStandardNavigationAppBar.1.2
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer3, Integer num) {
                            invoke(bentoAppBarScope, composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(BentoAppBarScope BentoAppBar, Composer composer3, int i6) {
                            int i7;
                            Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                            if ((i6 & 6) == 0) {
                                i7 = i6 | ((i6 & 8) == 0 ? composer3.changed(BentoAppBar) : composer3.changedInstance(BentoAppBar) ? 4 : 2);
                            } else {
                                i7 = i6;
                            }
                            if ((i7 & 19) == 18 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1012832208, i7, -1, "com.robinhood.android.onboarding.ui.postfundupsell.standardpage.OnboardingUpsellStandardNavigationAppBar.<anonymous>.<anonymous> (OnboardingUpsellStandardPageComposable.kt:146)");
                            }
                            if (z11) {
                                composer3.startReplaceGroup(1139112441);
                                BentoAppBar.m20576BentoCloseButtoncf5BqRc(ModifiersKt.autoLogEvents$default(TestTag3.testTag(Modifier.INSTANCE, OnboardingUpsellStandardPageFragment.CLOSE_BUTTON_TEST_TAG), null, true, false, false, true, false, null, 109, null), false, 0L, function0, composer3, (BentoAppBarScope.$stable << 12) | ((i7 << 12) & 57344), 6);
                                composer3.endReplaceGroup();
                            } else {
                                composer3.startReplaceGroup(1139524028);
                                BentoAppBar.m20575BentoBackButtondrOMvmE(ModifiersKt.autoLogEvents$default(TestTag3.testTag(Modifier.INSTANCE, OnboardingUpsellStandardPageFragment.BACK_BUTTON_TEST_TAG), null, true, false, false, true, false, null, 109, null), false, null, function0, composer3, (BentoAppBarScope.$stable << 12) | ((i7 << 12) & 57344), 6);
                                composer3.endReplaceGroup();
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer2, 54);
                    final boolean z12 = z72;
                    BentoAppBarKt.m20573BentoAppBarSGdaT3c(composableLambdaRememberComposableLambda, modifier6, composableLambdaRememberComposableLambda2, null, ComposableLambda3.rememberComposableLambda(331244481, true, new Function3<BoxScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.onboarding.ui.postfundupsell.standardpage.OnboardingUpsellStandardPageComposableKt.OnboardingUpsellStandardNavigationAppBar.1.3
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, Composer composer3, Integer num) {
                            invoke(boxScope, composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(BoxScope BentoAppBar, Composer composer3, int i6) {
                            Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                            if ((i6 & 17) == 16 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(331244481, i6, -1, "com.robinhood.android.onboarding.ui.postfundupsell.standardpage.OnboardingUpsellStandardNavigationAppBar.<anonymous>.<anonymous> (OnboardingUpsellStandardPageComposable.kt:137)");
                            }
                            if (z12) {
                                OnboardingProgress onboardingProgress = OnboardingProgress.FUND_ACCOUNT_NATIVE_GOLD_UPSELL;
                                BentoProgressBar2.m20699BentoProgressBarnBX6wN0(onboardingProgress.getSegmentIdx(), onboardingProgress.getProgress(), 5, null, 0L, 0L, false, composer3, 384, 120);
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer2, 54), z92, false, null, null, 0L, null, composer2, 1597830, 0, 1928);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 48);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier3 = modifier52;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void OnboardingUpsellStandardPageContent(final StandardPageTemplate<? extends OnboardingFundingUpsellAction> content, final Screen screen, final SduiActionHandler<? super OnboardingFundingUpsellAction> actionHandler, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(screen, "screen");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        Composer composerStartRestartGroup = composer.startRestartGroup(-117745180);
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
            i3 |= composerStartRestartGroup.changedInstance(actionHandler) ? 256 : 128;
        }
        int i4 = i2 & 8;
        if (i4 == 0) {
            if ((i & 3072) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            if ((i3 & 1171) == 1170 || !composerStartRestartGroup.getSkipping()) {
                final Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-117745180, i3, -1, "com.robinhood.android.onboarding.ui.postfundupsell.standardpage.OnboardingUpsellStandardPageContent (OnboardingUpsellStandardPageComposable.kt:180)");
                }
                AutoLoggingCompositionLocals.EventLoggable(new UserInteractionEventDescriptor(null, screen, null, null, null, null, 61, null), ComposableLambda3.rememberComposableLambda(-785918567, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.onboarding.ui.postfundupsell.standardpage.OnboardingUpsellStandardPageComposableKt.OnboardingUpsellStandardPageContent.1
                    public final void invoke(Composer composer2, int i5) {
                        Arrangement.Vertical top;
                        ImmutableList3 immutableList3PersistentListOf;
                        if ((i5 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-785918567, i5, -1, "com.robinhood.android.onboarding.ui.postfundupsell.standardpage.OnboardingUpsellStandardPageContent.<anonymous> (OnboardingUpsellStandardPageComposable.kt:186)");
                        }
                        final Modifier modifierTestTag = TestTag3.testTag(modifier4.then(content.is_full_bleed() ? WindowInsetsPadding_androidKt.navigationBarsPadding(Modifier.INSTANCE) : Modifier.INSTANCE), OnboardingUpsellStandardPageFragment.STANDARD_PAGE_TEST_TAG);
                        final StandardPageTemplate<OnboardingFundingUpsellAction> standardPageTemplate = content;
                        final SduiActionHandler<OnboardingFundingUpsellAction> sduiActionHandler = actionHandler;
                        composer2.startReplaceGroup(-962331744);
                        PageThemeOverride theme_override = standardPageTemplate.getTheme_override();
                        if (theme_override != null) {
                            composer2.startReplaceGroup(82012030);
                            BentoTheme2.BentoTheme(Boolean.valueOf(theme_override == PageThemeOverride.LIGHT), null, null, null, null, null, null, null, ComposableLambda3.rememberComposableLambda(873647597, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.onboarding.ui.postfundupsell.standardpage.OnboardingUpsellStandardPageComposableKt$OnboardingUpsellStandardPageContent$1$invoke$$inlined$SduiStandardPage$1
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                    invoke(composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                /* compiled from: SduiStandardPage.kt */
                                @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¨\u0006\u0003"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "com/robinhood/android/libdesignsystem/serverui/experimental/compose/SduiStandardPageKt$SduiStandardPage$1$1$1"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                                @DebugMetadata(m3644c = "com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiStandardPageKt$SduiStandardPage$1$1$1", m3645f = "SduiStandardPage.kt", m3646l = {}, m3647m = "invokeSuspend")
                                /* renamed from: com.robinhood.android.onboarding.ui.postfundupsell.standardpage.OnboardingUpsellStandardPageComposableKt$OnboardingUpsellStandardPageContent$1$invoke$$inlined$SduiStandardPage$1$1, reason: invalid class name */
                                public static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                    final /* synthetic */ long $backgroundedColor;
                                    final /* synthetic */ SystemUiController $systemUiController;
                                    int label;

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    public AnonymousClass1(SystemUiController systemUiController, long j, Continuation continuation) {
                                        super(2, continuation);
                                        this.$systemUiController = systemUiController;
                                        this.$backgroundedColor = j;
                                    }

                                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                        return new AnonymousClass1(this.$systemUiController, this.$backgroundedColor, continuation);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                                        return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                    }

                                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                                    public final Object invokeSuspend(Object obj) {
                                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                        if (this.label != 0) {
                                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                        }
                                        ResultKt.throwOnFailure(obj);
                                        SystemUiController.m9212setStatusBarColorek8zF_U$default(this.$systemUiController, this.$backgroundedColor, false, null, 6, null);
                                        return Unit.INSTANCE;
                                    }
                                }

                                public final void invoke(Composer composer3, int i6) {
                                    Arrangement.Vertical top2;
                                    ImmutableList3 immutableList3PersistentListOf2;
                                    if ((i6 & 3) == 2 && composer3.getSkipping()) {
                                        composer3.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(873647597, i6, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiStandardPage.<anonymous> (SduiStandardPage.kt:34)");
                                    }
                                    StandardPageTemplate standardPageTemplate2 = standardPageTemplate;
                                    SduiActionHandler sduiActionHandler2 = sduiActionHandler;
                                    Modifier modifier5 = modifierTestTag;
                                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                    int i7 = BentoTheme.$stable;
                                    Modifier modifierM4872backgroundbw27NRU$default = Background3.m4872backgroundbw27NRU$default(modifier5, bentoTheme.getColors(composer3, i7).m21371getBg0d7_KjU(), null, 2, null);
                                    composer3.startReplaceGroup(-430325605);
                                    Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(modifierM4872backgroundbw27NRU$default, 0.0f, 1, null);
                                    Arrangement arrangement = Arrangement.INSTANCE;
                                    Arrangement.Vertical top3 = arrangement.getTop();
                                    Alignment.Companion companion = Alignment.INSTANCE;
                                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top3, companion.getStart(), composer3, 0);
                                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer3, 0);
                                    CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer3, modifierFillMaxSize$default);
                                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                                    Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
                                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                                    if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                    }
                                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                                    Column6 column6 = Column6.INSTANCE;
                                    if (standardPageTemplate2 instanceof CenterAlignedListPage) {
                                        top2 = arrangement.getCenter();
                                    } else {
                                        if (!(standardPageTemplate2 instanceof TopAlignedListPage)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        top2 = arrangement.getTop();
                                    }
                                    Modifier.Companion companion3 = Modifier.INSTANCE;
                                    Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(Column5.weight$default(column6, companion3, 1.0f, false, 2, null), ScrollKt.rememberScrollState(0, composer3, 0, 1), false, null, false, 14, null);
                                    MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(top2, companion.getCenterHorizontally(), composer3, 48);
                                    int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer3, 0);
                                    CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer3, modifierVerticalScroll$default);
                                    Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
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
                                    Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy2, companion2.getSetMeasurePolicy());
                                    Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion2.getSetCompositeKeyHash();
                                    if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                        composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                        composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                    }
                                    Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion2.getSetModifier());
                                    ImmutableList3 persistentList = extensions2.toPersistentList(standardPageTemplate2.getBody());
                                    composer3.startReplaceGroup(-1772220517);
                                    HorizontalPadding horizontalPadding = HorizontalPadding.Default;
                                    SduiColumns.SduiColumn(persistentList, OnboardingFundingUpsellAction.class, companion3, null, sduiActionHandler2, horizontalPadding, arrangement.getTop(), companion.getStart(), true, composer3, 100663296, 0);
                                    composer3.endReplaceGroup();
                                    composer3.endNode();
                                    List footer = standardPageTemplate2.getFooter();
                                    if (footer == null || (immutableList3PersistentListOf2 = extensions2.toPersistentList(footer)) == null) {
                                        immutableList3PersistentListOf2 = extensions2.persistentListOf();
                                    }
                                    Modifier modifierM5144paddingVpY3zN4$default = androidx.compose.foundation.layout.PaddingKt.m5144paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null), 0.0f, bentoTheme.getSpacing(composer3, i7).m21590getDefaultD9Ej5fM(), 1, null);
                                    composer3.startReplaceGroup(-1772220517);
                                    SduiColumns.SduiColumn(immutableList3PersistentListOf2, OnboardingFundingUpsellAction.class, modifierM5144paddingVpY3zN4$default, null, sduiActionHandler2, horizontalPadding, arrangement.getTop(), companion.getStart(), true, composer3, 100666368, 0);
                                    composer3.endReplaceGroup();
                                    composer3.endNode();
                                    composer3.endReplaceGroup();
                                    SystemUiController systemUiControllerRememberSystemUiController = SystemUiController3.rememberSystemUiController(null, composer3, 0, 1);
                                    long jM21371getBg0d7_KjU = bentoTheme.getColors(composer3, i7).m21371getBg0d7_KjU();
                                    Unit unit = Unit.INSTANCE;
                                    composer3.startReplaceGroup(-1633490746);
                                    boolean zChanged = composer3.changed(systemUiControllerRememberSystemUiController) | composer3.changed(jM21371getBg0d7_KjU);
                                    Object objRememberedValue = composer3.rememberedValue();
                                    if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = new AnonymousClass1(systemUiControllerRememberSystemUiController, jM21371getBg0d7_KjU, null);
                                        composer3.updateRememberedValue(objRememberedValue);
                                    }
                                    composer3.endReplaceGroup();
                                    EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue, composer3, 6);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composer2, 54), composer2, 100663296, EnumC7081g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE);
                            composer2.endReplaceGroup();
                        } else {
                            composer2.startReplaceGroup(82611105);
                            composer2.startReplaceGroup(-430325605);
                            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(modifierTestTag, 0.0f, 1, null);
                            Arrangement arrangement = Arrangement.INSTANCE;
                            Arrangement.Vertical top2 = arrangement.getTop();
                            Alignment.Companion companion = Alignment.INSTANCE;
                            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top2, companion.getStart(), composer2, 0);
                            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, modifierFillMaxSize$default);
                            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
                            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            }
                            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                            Column6 column6 = Column6.INSTANCE;
                            if (standardPageTemplate instanceof CenterAlignedListPage) {
                                top = arrangement.getCenter();
                            } else {
                                if (!(standardPageTemplate instanceof TopAlignedListPage)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                top = arrangement.getTop();
                            }
                            Modifier.Companion companion3 = Modifier.INSTANCE;
                            Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(Column5.weight$default(column6, companion3, 1.0f, false, 2, null), ScrollKt.rememberScrollState(0, composer2, 0, 1), false, null, false, 14, null);
                            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(top, companion.getCenterHorizontally(), composer2, 48);
                            int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer2, 0);
                            CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer2, modifierVerticalScroll$default);
                            Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
                            if (composer2.getApplier() == null) {
                                Composables.invalidApplier();
                            }
                            composer2.startReusableNode();
                            if (composer2.getInserting()) {
                                composer2.createNode(constructor2);
                            } else {
                                composer2.useNode();
                            }
                            Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer2);
                            Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy2, companion2.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion2.getSetCompositeKeyHash();
                            if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                            }
                            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion2.getSetModifier());
                            ImmutableList3 persistentList = extensions2.toPersistentList(standardPageTemplate.getBody());
                            composer2.startReplaceGroup(-1772220517);
                            HorizontalPadding horizontalPadding = HorizontalPadding.Default;
                            SduiColumns.SduiColumn(persistentList, OnboardingFundingUpsellAction.class, companion3, null, sduiActionHandler, horizontalPadding, arrangement.getTop(), companion.getStart(), true, composer2, 100663296, 0);
                            composer2.endReplaceGroup();
                            composer2.endNode();
                            Iterable footer = standardPageTemplate.getFooter();
                            if (footer == null || (immutableList3PersistentListOf = extensions2.toPersistentList(footer)) == null) {
                                immutableList3PersistentListOf = extensions2.persistentListOf();
                            }
                            Modifier modifierM5144paddingVpY3zN4$default = androidx.compose.foundation.layout.PaddingKt.m5144paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null), 0.0f, BentoTheme.INSTANCE.getSpacing(composer2, BentoTheme.$stable).m21590getDefaultD9Ej5fM(), 1, null);
                            composer2.startReplaceGroup(-1772220517);
                            SduiColumns.SduiColumn(immutableList3PersistentListOf, OnboardingFundingUpsellAction.class, modifierM5144paddingVpY3zN4$default, null, sduiActionHandler, horizontalPadding, arrangement.getTop(), companion.getStart(), true, composer2, 100666368, 0);
                            composer2.endReplaceGroup();
                            composer2.endNode();
                            composer2.endReplaceGroup();
                            composer2.endReplaceGroup();
                        }
                        composer2.endReplaceGroup();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, 48);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier4;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.onboarding.ui.postfundupsell.standardpage.OnboardingUpsellStandardPageComposableKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return OnboardingUpsellStandardPageComposable.OnboardingUpsellStandardPageContent$lambda$5(content, screen, actionHandler, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 3072;
        modifier2 = modifier;
        if ((i3 & 1171) == 1170) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            AutoLoggingCompositionLocals.EventLoggable(new UserInteractionEventDescriptor(null, screen, null, null, null, null, 61, null), ComposableLambda3.rememberComposableLambda(-785918567, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.onboarding.ui.postfundupsell.standardpage.OnboardingUpsellStandardPageComposableKt.OnboardingUpsellStandardPageContent.1
                public final void invoke(Composer composer2, int i5) {
                    Arrangement.Vertical top;
                    ImmutableList3 immutableList3PersistentListOf;
                    if ((i5 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-785918567, i5, -1, "com.robinhood.android.onboarding.ui.postfundupsell.standardpage.OnboardingUpsellStandardPageContent.<anonymous> (OnboardingUpsellStandardPageComposable.kt:186)");
                    }
                    final Modifier modifierTestTag = TestTag3.testTag(modifier4.then(content.is_full_bleed() ? WindowInsetsPadding_androidKt.navigationBarsPadding(Modifier.INSTANCE) : Modifier.INSTANCE), OnboardingUpsellStandardPageFragment.STANDARD_PAGE_TEST_TAG);
                    final StandardPageTemplate standardPageTemplate = content;
                    final SduiActionHandler sduiActionHandler = actionHandler;
                    composer2.startReplaceGroup(-962331744);
                    PageThemeOverride theme_override = standardPageTemplate.getTheme_override();
                    if (theme_override != null) {
                        composer2.startReplaceGroup(82012030);
                        BentoTheme2.BentoTheme(Boolean.valueOf(theme_override == PageThemeOverride.LIGHT), null, null, null, null, null, null, null, ComposableLambda3.rememberComposableLambda(873647597, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.onboarding.ui.postfundupsell.standardpage.OnboardingUpsellStandardPageComposableKt$OnboardingUpsellStandardPageContent$1$invoke$$inlined$SduiStandardPage$1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            /* compiled from: SduiStandardPage.kt */
                            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¨\u0006\u0003"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "com/robinhood/android/libdesignsystem/serverui/experimental/compose/SduiStandardPageKt$SduiStandardPage$1$1$1"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @DebugMetadata(m3644c = "com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiStandardPageKt$SduiStandardPage$1$1$1", m3645f = "SduiStandardPage.kt", m3646l = {}, m3647m = "invokeSuspend")
                            /* renamed from: com.robinhood.android.onboarding.ui.postfundupsell.standardpage.OnboardingUpsellStandardPageComposableKt$OnboardingUpsellStandardPageContent$1$invoke$$inlined$SduiStandardPage$1$1, reason: invalid class name */
                            public static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                final /* synthetic */ long $backgroundedColor;
                                final /* synthetic */ SystemUiController $systemUiController;
                                int label;

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                public AnonymousClass1(SystemUiController systemUiController, long j, Continuation continuation) {
                                    super(2, continuation);
                                    this.$systemUiController = systemUiController;
                                    this.$backgroundedColor = j;
                                }

                                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                    return new AnonymousClass1(this.$systemUiController, this.$backgroundedColor, continuation);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                                    return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                }

                                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                                public final Object invokeSuspend(Object obj) {
                                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                    if (this.label != 0) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    ResultKt.throwOnFailure(obj);
                                    SystemUiController.m9212setStatusBarColorek8zF_U$default(this.$systemUiController, this.$backgroundedColor, false, null, 6, null);
                                    return Unit.INSTANCE;
                                }
                            }

                            public final void invoke(Composer composer3, int i6) {
                                Arrangement.Vertical top2;
                                ImmutableList3 immutableList3PersistentListOf2;
                                if ((i6 & 3) == 2 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(873647597, i6, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiStandardPage.<anonymous> (SduiStandardPage.kt:34)");
                                }
                                StandardPageTemplate standardPageTemplate2 = standardPageTemplate;
                                SduiActionHandler sduiActionHandler2 = sduiActionHandler;
                                Modifier modifier5 = modifierTestTag;
                                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                int i7 = BentoTheme.$stable;
                                Modifier modifierM4872backgroundbw27NRU$default = Background3.m4872backgroundbw27NRU$default(modifier5, bentoTheme.getColors(composer3, i7).m21371getBg0d7_KjU(), null, 2, null);
                                composer3.startReplaceGroup(-430325605);
                                Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(modifierM4872backgroundbw27NRU$default, 0.0f, 1, null);
                                Arrangement arrangement = Arrangement.INSTANCE;
                                Arrangement.Vertical top3 = arrangement.getTop();
                                Alignment.Companion companion = Alignment.INSTANCE;
                                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top3, companion.getStart(), composer3, 0);
                                int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer3, 0);
                                CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer3, modifierFillMaxSize$default);
                                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
                                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                                if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                }
                                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                                Column6 column6 = Column6.INSTANCE;
                                if (standardPageTemplate2 instanceof CenterAlignedListPage) {
                                    top2 = arrangement.getCenter();
                                } else {
                                    if (!(standardPageTemplate2 instanceof TopAlignedListPage)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    top2 = arrangement.getTop();
                                }
                                Modifier.Companion companion3 = Modifier.INSTANCE;
                                Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(Column5.weight$default(column6, companion3, 1.0f, false, 2, null), ScrollKt.rememberScrollState(0, composer3, 0, 1), false, null, false, 14, null);
                                MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(top2, companion.getCenterHorizontally(), composer3, 48);
                                int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer3, 0);
                                CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer3, modifierVerticalScroll$default);
                                Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
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
                                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy2, companion2.getSetMeasurePolicy());
                                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion2.getSetCompositeKeyHash();
                                if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                }
                                Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion2.getSetModifier());
                                ImmutableList3 persistentList = extensions2.toPersistentList(standardPageTemplate2.getBody());
                                composer3.startReplaceGroup(-1772220517);
                                HorizontalPadding horizontalPadding = HorizontalPadding.Default;
                                SduiColumns.SduiColumn(persistentList, OnboardingFundingUpsellAction.class, companion3, null, sduiActionHandler2, horizontalPadding, arrangement.getTop(), companion.getStart(), true, composer3, 100663296, 0);
                                composer3.endReplaceGroup();
                                composer3.endNode();
                                List footer = standardPageTemplate2.getFooter();
                                if (footer == null || (immutableList3PersistentListOf2 = extensions2.toPersistentList(footer)) == null) {
                                    immutableList3PersistentListOf2 = extensions2.persistentListOf();
                                }
                                Modifier modifierM5144paddingVpY3zN4$default = androidx.compose.foundation.layout.PaddingKt.m5144paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null), 0.0f, bentoTheme.getSpacing(composer3, i7).m21590getDefaultD9Ej5fM(), 1, null);
                                composer3.startReplaceGroup(-1772220517);
                                SduiColumns.SduiColumn(immutableList3PersistentListOf2, OnboardingFundingUpsellAction.class, modifierM5144paddingVpY3zN4$default, null, sduiActionHandler2, horizontalPadding, arrangement.getTop(), companion.getStart(), true, composer3, 100666368, 0);
                                composer3.endReplaceGroup();
                                composer3.endNode();
                                composer3.endReplaceGroup();
                                SystemUiController systemUiControllerRememberSystemUiController = SystemUiController3.rememberSystemUiController(null, composer3, 0, 1);
                                long jM21371getBg0d7_KjU = bentoTheme.getColors(composer3, i7).m21371getBg0d7_KjU();
                                Unit unit = Unit.INSTANCE;
                                composer3.startReplaceGroup(-1633490746);
                                boolean zChanged = composer3.changed(systemUiControllerRememberSystemUiController) | composer3.changed(jM21371getBg0d7_KjU);
                                Object objRememberedValue = composer3.rememberedValue();
                                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new AnonymousClass1(systemUiControllerRememberSystemUiController, jM21371getBg0d7_KjU, null);
                                    composer3.updateRememberedValue(objRememberedValue);
                                }
                                composer3.endReplaceGroup();
                                EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue, composer3, 6);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer2, 54), composer2, 100663296, EnumC7081g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE);
                        composer2.endReplaceGroup();
                    } else {
                        composer2.startReplaceGroup(82611105);
                        composer2.startReplaceGroup(-430325605);
                        Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(modifierTestTag, 0.0f, 1, null);
                        Arrangement arrangement = Arrangement.INSTANCE;
                        Arrangement.Vertical top2 = arrangement.getTop();
                        Alignment.Companion companion = Alignment.INSTANCE;
                        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top2, companion.getStart(), composer2, 0);
                        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, modifierFillMaxSize$default);
                        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                        Column6 column6 = Column6.INSTANCE;
                        if (standardPageTemplate instanceof CenterAlignedListPage) {
                            top = arrangement.getCenter();
                        } else {
                            if (!(standardPageTemplate instanceof TopAlignedListPage)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            top = arrangement.getTop();
                        }
                        Modifier.Companion companion3 = Modifier.INSTANCE;
                        Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(Column5.weight$default(column6, companion3, 1.0f, false, 2, null), ScrollKt.rememberScrollState(0, composer2, 0, 1), false, null, false, 14, null);
                        MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(top, companion.getCenterHorizontally(), composer2, 48);
                        int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer2, modifierVerticalScroll$default);
                        Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
                        if (composer2.getApplier() == null) {
                            Composables.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor2);
                        } else {
                            composer2.useNode();
                        }
                        Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer2);
                        Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy2, companion2.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion2.getSetCompositeKeyHash();
                        if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                            composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                            composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion2.getSetModifier());
                        ImmutableList3 persistentList = extensions2.toPersistentList(standardPageTemplate.getBody());
                        composer2.startReplaceGroup(-1772220517);
                        HorizontalPadding horizontalPadding = HorizontalPadding.Default;
                        SduiColumns.SduiColumn(persistentList, OnboardingFundingUpsellAction.class, companion3, null, sduiActionHandler, horizontalPadding, arrangement.getTop(), companion.getStart(), true, composer2, 100663296, 0);
                        composer2.endReplaceGroup();
                        composer2.endNode();
                        Iterable footer = standardPageTemplate.getFooter();
                        if (footer == null || (immutableList3PersistentListOf = extensions2.toPersistentList(footer)) == null) {
                            immutableList3PersistentListOf = extensions2.persistentListOf();
                        }
                        Modifier modifierM5144paddingVpY3zN4$default = androidx.compose.foundation.layout.PaddingKt.m5144paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null), 0.0f, BentoTheme.INSTANCE.getSpacing(composer2, BentoTheme.$stable).m21590getDefaultD9Ej5fM(), 1, null);
                        composer2.startReplaceGroup(-1772220517);
                        SduiColumns.SduiColumn(immutableList3PersistentListOf, OnboardingFundingUpsellAction.class, modifierM5144paddingVpY3zN4$default, null, sduiActionHandler, horizontalPadding, arrangement.getTop(), companion.getStart(), true, composer2, 100666368, 0);
                        composer2.endReplaceGroup();
                        composer2.endNode();
                        composer2.endReplaceGroup();
                        composer2.endReplaceGroup();
                    }
                    composer2.endReplaceGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 48);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier3 = modifier4;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }
}
