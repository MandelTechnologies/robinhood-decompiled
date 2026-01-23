package com.robinhood.android.crypto.p094ui.upgrade.disclosureV2.views;

import androidx.compose.foundation.Background3;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.compose.bento.component.BentoAppBarKt;
import com.robinhood.compose.bento.component.BentoAppBarScope;
import com.robinhood.compose.bento.component.BentoProgressBar2;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.bento.theme.LocalShowPlaceholder;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

/* compiled from: CryptoUpgradeDisclosureHeader.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\u001a-\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0001¢\u0006\u0002\u0010\b\u001a\r\u0010\u0011\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010\u0012\u001a\r\u0010\u0013\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010\u0012\u001a\r\u0010\u0014\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010\u0012\"\u0016\u0010\t\u001a\u00020\n8\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\u000b\u0010\f\"\u0016\u0010\r\u001a\u00020\n8\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\u000e\u0010\f\"\u0016\u0010\u000f\u001a\u00020\n8\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\u0010\u0010\f¨\u0006\u0015"}, m3636d2 = {"CryptoUpgradeDisclosureHeader", "", "state", "Lcom/robinhood/android/crypto/ui/upgrade/disclosureV2/views/CryptoUpgradeDisclosureHeaderState;", "onNavButtonClicked", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/android/crypto/ui/upgrade/disclosureV2/views/CryptoUpgradeDisclosureHeaderState;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "CRYPTO_UPGRADE_DISCLOSURE_HEADER_CLOSE_BUTTON_TEST_TAG", "", "getCRYPTO_UPGRADE_DISCLOSURE_HEADER_CLOSE_BUTTON_TEST_TAG$annotations", "()V", "CRYPTO_UPGRADE_DISCLOSURE_HEADER_BACK_BUTTON_TEST_TAG", "getCRYPTO_UPGRADE_DISCLOSURE_HEADER_BACK_BUTTON_TEST_TAG$annotations", "CRYPTO_UPGRADE_DISCLOSURE_HEADER_PROGRESS_BAR_TEST_TAG", "getCRYPTO_UPGRADE_DISCLOSURE_HEADER_PROGRESS_BAR_TEST_TAG$annotations", "CryptoUpgradeDisclosureHeaderPreview_SingleSegment", "(Landroidx/compose/runtime/Composer;I)V", "CryptoUpgradeDisclosureHeaderPreview_Segment0of2", "CryptoUpgradeDisclosureHeaderPreview_Segment1Of2", "feature-crypto_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.crypto.ui.upgrade.disclosureV2.views.CryptoUpgradeDisclosureHeaderKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class CryptoUpgradeDisclosureHeader5 {
    public static final String CRYPTO_UPGRADE_DISCLOSURE_HEADER_BACK_BUTTON_TEST_TAG = "crypto_upgrade_disclosure_header_back_button_test_tag";
    public static final String CRYPTO_UPGRADE_DISCLOSURE_HEADER_CLOSE_BUTTON_TEST_TAG = "crypto_upgrade_disclosure_header_close_button_test_tag";
    public static final String CRYPTO_UPGRADE_DISCLOSURE_HEADER_PROGRESS_BAR_TEST_TAG = "crypto_upgrade_disclosure_header_progress_bar_test_tag";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoUpgradeDisclosureHeader$lambda$1(CryptoUpgradeDisclosureHeaderState cryptoUpgradeDisclosureHeaderState, Function0 function0, Modifier modifier, int i, int i2, Composer composer, int i3) {
        CryptoUpgradeDisclosureHeader(cryptoUpgradeDisclosureHeaderState, function0, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoUpgradeDisclosureHeaderPreview_Segment0of2$lambda$3(int i, Composer composer, int i2) {
        CryptoUpgradeDisclosureHeaderPreview_Segment0of2(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoUpgradeDisclosureHeaderPreview_Segment1Of2$lambda$4(int i, Composer composer, int i2) {
        CryptoUpgradeDisclosureHeaderPreview_Segment1Of2(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoUpgradeDisclosureHeaderPreview_SingleSegment$lambda$2(int i, Composer composer, int i2) {
        CryptoUpgradeDisclosureHeaderPreview_SingleSegment(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* renamed from: getCRYPTO_UPGRADE_DISCLOSURE_HEADER_BACK_BUTTON_TEST_TAG$annotations */
    public static /* synthetic */ void m1919xa1c4eecd() {
    }

    /* renamed from: getCRYPTO_UPGRADE_DISCLOSURE_HEADER_CLOSE_BUTTON_TEST_TAG$annotations */
    public static /* synthetic */ void m1920x289999c8() {
    }

    /* renamed from: getCRYPTO_UPGRADE_DISCLOSURE_HEADER_PROGRESS_BAR_TEST_TAG$annotations */
    public static /* synthetic */ void m1921x2572b760() {
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CryptoUpgradeDisclosureHeader(final CryptoUpgradeDisclosureHeaderState state, final Function0<Unit> onNavButtonClicked, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(onNavButtonClicked, "onNavButtonClicked");
        Composer composerStartRestartGroup = composer.startRestartGroup(-595456739);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(state) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onNavButtonClicked) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i3 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-595456739, i3, -1, "com.robinhood.android.crypto.ui.upgrade.disclosureV2.views.CryptoUpgradeDisclosureHeader (CryptoUpgradeDisclosureHeader.kt:22)");
                }
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null);
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i5 = BentoTheme.$stable;
                Modifier modifierM4872backgroundbw27NRU$default = Background3.m4872backgroundbw27NRU$default(modifierFillMaxWidth$default, bentoTheme.getColors(composerStartRestartGroup, i5).m21371getBg0d7_KjU(), null, 2, null);
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM4872backgroundbw27NRU$default);
                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (!composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                Column6 column6 = Column6.INSTANCE;
                Modifier.Companion companion2 = Modifier.INSTANCE;
                Modifier modifier5 = modifier4;
                BentoAppBarKt.m20573BentoAppBarSGdaT3c(ComposableLambda3.rememberComposableLambda(813643200, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.crypto.ui.upgrade.disclosureV2.views.CryptoUpgradeDisclosureHeaderKt$CryptoUpgradeDisclosureHeader$1$1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i6) {
                        if ((i6 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(813643200, i6, -1, "com.robinhood.android.crypto.ui.upgrade.disclosureV2.views.CryptoUpgradeDisclosureHeader.<anonymous>.<anonymous> (CryptoUpgradeDisclosureHeader.kt:31)");
                        }
                        String title = state.getTitle();
                        boolean z = title == null || StringsKt.isBlank(title);
                        final CryptoUpgradeDisclosureHeaderState cryptoUpgradeDisclosureHeaderState = state;
                        LocalShowPlaceholder.Loadable(z, null, null, ComposableLambda3.rememberComposableLambda(-1394632144, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.crypto.ui.upgrade.disclosureV2.views.CryptoUpgradeDisclosureHeaderKt$CryptoUpgradeDisclosureHeader$1$1.1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer3, int i7) {
                                if ((i7 & 3) == 2 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1394632144, i7, -1, "com.robinhood.android.crypto.ui.upgrade.disclosureV2.views.CryptoUpgradeDisclosureHeader.<anonymous>.<anonymous>.<anonymous> (CryptoUpgradeDisclosureHeader.kt:32)");
                                }
                                String title2 = cryptoUpgradeDisclosureHeaderState.getTitle();
                                if (title2 == null) {
                                    title2 = "----------";
                                }
                                BentoText2.m20747BentoText38GnDrw(title2, null, null, null, null, null, null, 0, false, 0, 0, null, 0, BentoTheme.INSTANCE.getTypography(composer3, BentoTheme.$stable).getTextM(), composer3, 0, 0, 8190);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer2, 54), composer2, 3072, 6);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), ComposableLambda3.rememberComposableLambda(1855369748, true, new Function3<BentoAppBarScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.crypto.ui.upgrade.disclosureV2.views.CryptoUpgradeDisclosureHeaderKt$CryptoUpgradeDisclosureHeader$1$2
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer2, Integer num) {
                        invoke(bentoAppBarScope, composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(BentoAppBarScope BentoAppBar, Composer composer2, int i6) {
                        int i7;
                        Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                        if ((i6 & 6) == 0) {
                            i7 = ((i6 & 8) == 0 ? composer2.changed(BentoAppBar) : composer2.changedInstance(BentoAppBar) ? 4 : 2) | i6;
                        } else {
                            i7 = i6;
                        }
                        if ((i7 & 19) == 18 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1855369748, i7, -1, "com.robinhood.android.crypto.ui.upgrade.disclosureV2.views.CryptoUpgradeDisclosureHeader.<anonymous>.<anonymous> (CryptoUpgradeDisclosureHeader.kt:39)");
                        }
                        if (state.getCurrentDisclosureIndex() == 0) {
                            composer2.startReplaceGroup(598903606);
                            BentoAppBar.m20576BentoCloseButtoncf5BqRc(TestTag3.testTag(Modifier.INSTANCE, CryptoUpgradeDisclosureHeader5.CRYPTO_UPGRADE_DISCLOSURE_HEADER_CLOSE_BUTTON_TEST_TAG), false, 0L, onNavButtonClicked, composer2, (BentoAppBarScope.$stable << 12) | 6 | ((i7 << 12) & 57344), 6);
                            composer2.endReplaceGroup();
                        } else {
                            composer2.startReplaceGroup(598913587);
                            BentoAppBar.m20575BentoBackButtondrOMvmE(TestTag3.testTag(Modifier.INSTANCE, CryptoUpgradeDisclosureHeader5.CRYPTO_UPGRADE_DISCLOSURE_HEADER_BACK_BUTTON_TEST_TAG), false, null, onNavButtonClicked, composer2, (BentoAppBarScope.$stable << 12) | 6 | ((i7 << 12) & 57344), 6);
                            composer2.endReplaceGroup();
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), null, null, false, false, null, null, 0L, null, composerStartRestartGroup, 438, 0, 2040);
                composerStartRestartGroup = composerStartRestartGroup;
                composerStartRestartGroup.startReplaceGroup(-1272680779);
                if (state.getTotalDisclosuresLastIndex() > 0) {
                    BentoProgressBar2.m20699BentoProgressBarnBX6wN0(state.getCurrentDisclosureIndex(), 0.0f, state.getTotalDisclosuresLastIndex() + 1, TestTag3.testTag(PaddingKt.m5146paddingqDBjuR0$default(PaddingKt.m5144paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), bentoTheme.getSpacing(composerStartRestartGroup, i5).m21592getMediumD9Ej5fM(), 0.0f, 2, null), 0.0f, 0.0f, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21593getSmallD9Ej5fM(), 7, null), CRYPTO_UPGRADE_DISCLOSURE_HEADER_PROGRESS_BAR_TEST_TAG), bentoTheme.getColors(composerStartRestartGroup, i5).m21425getFg0d7_KjU(), bentoTheme.getColors(composerStartRestartGroup, i5).m21427getFg30d7_KjU(), false, composerStartRestartGroup, 48, 64);
                }
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.endNode();
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
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.crypto.ui.upgrade.disclosureV2.views.CryptoUpgradeDisclosureHeaderKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return CryptoUpgradeDisclosureHeader5.CryptoUpgradeDisclosureHeader$lambda$1(state, onNavButtonClicked, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
            Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null);
            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
            int i52 = BentoTheme.$stable;
            Modifier modifierM4872backgroundbw27NRU$default2 = Background3.m4872backgroundbw27NRU$default(modifierFillMaxWidth$default2, bentoTheme2.getColors(composerStartRestartGroup, i52).m21371getBg0d7_KjU(), null, 2, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM4872backgroundbw27NRU$default2);
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
            }
            composerStartRestartGroup.startReusableNode();
            if (!composerStartRestartGroup.getInserting()) {
            }
            composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy2, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
            setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (!composerM6388constructorimpl.getInserting()) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion3.getSetModifier());
                Column6 column62 = Column6.INSTANCE;
                Modifier.Companion companion22 = Modifier.INSTANCE;
                Modifier modifier52 = modifier4;
                BentoAppBarKt.m20573BentoAppBarSGdaT3c(ComposableLambda3.rememberComposableLambda(813643200, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.crypto.ui.upgrade.disclosureV2.views.CryptoUpgradeDisclosureHeaderKt$CryptoUpgradeDisclosureHeader$1$1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i6) {
                        if ((i6 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(813643200, i6, -1, "com.robinhood.android.crypto.ui.upgrade.disclosureV2.views.CryptoUpgradeDisclosureHeader.<anonymous>.<anonymous> (CryptoUpgradeDisclosureHeader.kt:31)");
                        }
                        String title = state.getTitle();
                        boolean z = title == null || StringsKt.isBlank(title);
                        final CryptoUpgradeDisclosureHeaderState cryptoUpgradeDisclosureHeaderState = state;
                        LocalShowPlaceholder.Loadable(z, null, null, ComposableLambda3.rememberComposableLambda(-1394632144, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.crypto.ui.upgrade.disclosureV2.views.CryptoUpgradeDisclosureHeaderKt$CryptoUpgradeDisclosureHeader$1$1.1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer3, int i7) {
                                if ((i7 & 3) == 2 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1394632144, i7, -1, "com.robinhood.android.crypto.ui.upgrade.disclosureV2.views.CryptoUpgradeDisclosureHeader.<anonymous>.<anonymous>.<anonymous> (CryptoUpgradeDisclosureHeader.kt:32)");
                                }
                                String title2 = cryptoUpgradeDisclosureHeaderState.getTitle();
                                if (title2 == null) {
                                    title2 = "----------";
                                }
                                BentoText2.m20747BentoText38GnDrw(title2, null, null, null, null, null, null, 0, false, 0, 0, null, 0, BentoTheme.INSTANCE.getTypography(composer3, BentoTheme.$stable).getTextM(), composer3, 0, 0, 8190);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer2, 54), composer2, 3072, 6);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), SizeKt.fillMaxWidth$default(companion22, 0.0f, 1, null), ComposableLambda3.rememberComposableLambda(1855369748, true, new Function3<BentoAppBarScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.crypto.ui.upgrade.disclosureV2.views.CryptoUpgradeDisclosureHeaderKt$CryptoUpgradeDisclosureHeader$1$2
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer2, Integer num) {
                        invoke(bentoAppBarScope, composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(BentoAppBarScope BentoAppBar, Composer composer2, int i6) {
                        int i7;
                        Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                        if ((i6 & 6) == 0) {
                            i7 = ((i6 & 8) == 0 ? composer2.changed(BentoAppBar) : composer2.changedInstance(BentoAppBar) ? 4 : 2) | i6;
                        } else {
                            i7 = i6;
                        }
                        if ((i7 & 19) == 18 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1855369748, i7, -1, "com.robinhood.android.crypto.ui.upgrade.disclosureV2.views.CryptoUpgradeDisclosureHeader.<anonymous>.<anonymous> (CryptoUpgradeDisclosureHeader.kt:39)");
                        }
                        if (state.getCurrentDisclosureIndex() == 0) {
                            composer2.startReplaceGroup(598903606);
                            BentoAppBar.m20576BentoCloseButtoncf5BqRc(TestTag3.testTag(Modifier.INSTANCE, CryptoUpgradeDisclosureHeader5.CRYPTO_UPGRADE_DISCLOSURE_HEADER_CLOSE_BUTTON_TEST_TAG), false, 0L, onNavButtonClicked, composer2, (BentoAppBarScope.$stable << 12) | 6 | ((i7 << 12) & 57344), 6);
                            composer2.endReplaceGroup();
                        } else {
                            composer2.startReplaceGroup(598913587);
                            BentoAppBar.m20575BentoBackButtondrOMvmE(TestTag3.testTag(Modifier.INSTANCE, CryptoUpgradeDisclosureHeader5.CRYPTO_UPGRADE_DISCLOSURE_HEADER_BACK_BUTTON_TEST_TAG), false, null, onNavButtonClicked, composer2, (BentoAppBarScope.$stable << 12) | 6 | ((i7 << 12) & 57344), 6);
                            composer2.endReplaceGroup();
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), null, null, false, false, null, null, 0L, null, composerStartRestartGroup, 438, 0, 2040);
                composerStartRestartGroup = composerStartRestartGroup;
                composerStartRestartGroup.startReplaceGroup(-1272680779);
                if (state.getTotalDisclosuresLastIndex() > 0) {
                }
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier3 = modifier52;
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    public static final void CryptoUpgradeDisclosureHeaderPreview_SingleSegment(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(109839454);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(109839454, i, -1, "com.robinhood.android.crypto.ui.upgrade.disclosureV2.views.CryptoUpgradeDisclosureHeaderPreview_SingleSegment (CryptoUpgradeDisclosureHeader.kt:94)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, CryptoUpgradeDisclosureHeader.INSTANCE.getLambda$1872607254$feature_crypto_externalDebug(), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.crypto.ui.upgrade.disclosureV2.views.CryptoUpgradeDisclosureHeaderKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CryptoUpgradeDisclosureHeader5.CryptoUpgradeDisclosureHeaderPreview_SingleSegment$lambda$2(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void CryptoUpgradeDisclosureHeaderPreview_Segment0of2(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(955272971);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(955272971, i, -1, "com.robinhood.android.crypto.ui.upgrade.disclosureV2.views.CryptoUpgradeDisclosureHeaderPreview_Segment0of2 (CryptoUpgradeDisclosureHeader.kt:112)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, CryptoUpgradeDisclosureHeader.INSTANCE.m13154getLambda$338980669$feature_crypto_externalDebug(), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.crypto.ui.upgrade.disclosureV2.views.CryptoUpgradeDisclosureHeaderKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CryptoUpgradeDisclosureHeader5.CryptoUpgradeDisclosureHeaderPreview_Segment0of2$lambda$3(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void CryptoUpgradeDisclosureHeaderPreview_Segment1Of2(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-126535316);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-126535316, i, -1, "com.robinhood.android.crypto.ui.upgrade.disclosureV2.views.CryptoUpgradeDisclosureHeaderPreview_Segment1Of2 (CryptoUpgradeDisclosureHeader.kt:130)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, CryptoUpgradeDisclosureHeader.INSTANCE.m13153getLambda$1420788956$feature_crypto_externalDebug(), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.crypto.ui.upgrade.disclosureV2.views.CryptoUpgradeDisclosureHeaderKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CryptoUpgradeDisclosureHeader5.CryptoUpgradeDisclosureHeaderPreview_Segment1Of2$lambda$4(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
