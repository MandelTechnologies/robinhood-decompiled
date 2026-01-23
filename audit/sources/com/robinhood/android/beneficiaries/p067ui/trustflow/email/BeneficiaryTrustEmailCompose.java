package com.robinhood.android.beneficiaries.p067ui.trustflow.email;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.material3.ScaffoldDefaults;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.beneficiaries.p067ui.trustflow.email.BeneficiaryTrustEmailCompose;
import com.robinhood.android.markdown.compose.MarkdownStyle;
import com.robinhood.compose.bento.component.BentoButtonBar3;
import com.robinhood.compose.bento.component.BentoButtonBarScreenLayout;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.BentoTextInput4;
import com.robinhood.compose.bento.component.text.BentoMarkdownText;
import com.robinhood.compose.bento.component.text.BentoMarkdownText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.util.StringResource2;
import com.robinhood.utils.compose.extensions.WindowInsetsKt;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: BeneficiaryTrustEmailCompose.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\u001a'\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0007¢\u0006\u0002\u0010\b\u001a'\u0010\t\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0003¢\u0006\u0002\u0010\b\"\u000e\u0010\n\u001a\u00020\u000bX\u0080T¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"BeneficiaryTrustEmailScaffold", "", "viewState", "Lcom/robinhood/android/beneficiaries/ui/trustflow/email/BeneficiaryTrustEmailViewState;", "callbacks", "Lcom/robinhood/android/beneficiaries/ui/trustflow/email/BeneficiaryTrustEmailCallbacks;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/android/beneficiaries/ui/trustflow/email/BeneficiaryTrustEmailViewState;Lcom/robinhood/android/beneficiaries/ui/trustflow/email/BeneficiaryTrustEmailCallbacks;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "BeneficiaryTrustEmailContent", BeneficiaryTrustEmailCompose.BeneficiaryTrustEmailInput, "", "feature-beneficiaries_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.beneficiaries.ui.trustflow.email.BeneficiaryTrustEmailComposeKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class BeneficiaryTrustEmailCompose {
    public static final String BeneficiaryTrustEmailInput = "BeneficiaryTrustEmailInput";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BeneficiaryTrustEmailContent$lambda$1(BeneficiaryTrustEmailViewState beneficiaryTrustEmailViewState, BeneficiaryTrustEmailCallbacks beneficiaryTrustEmailCallbacks, Modifier modifier, int i, int i2, Composer composer, int i3) {
        BeneficiaryTrustEmailContent(beneficiaryTrustEmailViewState, beneficiaryTrustEmailCallbacks, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BeneficiaryTrustEmailScaffold$lambda$0(BeneficiaryTrustEmailViewState beneficiaryTrustEmailViewState, BeneficiaryTrustEmailCallbacks beneficiaryTrustEmailCallbacks, Modifier modifier, int i, int i2, Composer composer, int i3) {
        BeneficiaryTrustEmailScaffold(beneficiaryTrustEmailViewState, beneficiaryTrustEmailCallbacks, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void BeneficiaryTrustEmailScaffold(final BeneficiaryTrustEmailViewState viewState, final BeneficiaryTrustEmailCallbacks callbacks, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        Composer composer2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(viewState, "viewState");
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        Composer composerStartRestartGroup = composer.startRestartGroup(-369396668);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(viewState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= (i & 64) == 0 ? composerStartRestartGroup.changed(callbacks) : composerStartRestartGroup.changedInstance(callbacks) ? 32 : 16;
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
                    ComposerKt.traceEventStart(-369396668, i3, -1, "com.robinhood.android.beneficiaries.ui.trustflow.email.BeneficiaryTrustEmailScaffold (BeneficiaryTrustEmailCompose.kt:29)");
                }
                int i5 = ((i3 >> 6) & 14) | 805306368;
                Modifier modifier5 = modifier4;
                composer2 = composerStartRestartGroup;
                ScaffoldKt.m5939ScaffoldTvnljyQ(modifier5, null, null, null, null, 0, 0L, 0L, WindowInsetsKt.excludeTop(ScaffoldDefaults.INSTANCE.getContentWindowInsets(composerStartRestartGroup, ScaffoldDefaults.$stable)), ComposableLambda3.rememberComposableLambda(1958531411, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.android.beneficiaries.ui.trustflow.email.BeneficiaryTrustEmailComposeKt.BeneficiaryTrustEmailScaffold.1
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer3, Integer num) {
                        invoke(paddingValues, composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(PaddingValues paddingValues, Composer composer3, int i6) {
                        Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                        if ((i6 & 6) == 0) {
                            i6 |= composer3.changed(paddingValues) ? 4 : 2;
                        }
                        if ((i6 & 19) == 18 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1958531411, i6, -1, "com.robinhood.android.beneficiaries.ui.trustflow.email.BeneficiaryTrustEmailScaffold.<anonymous> (BeneficiaryTrustEmailCompose.kt:34)");
                        }
                        BeneficiaryTrustEmailCompose.BeneficiaryTrustEmailContent(viewState, callbacks, PaddingKt.m5144paddingVpY3zN4$default(PaddingKt.padding(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), paddingValues), BentoTheme.INSTANCE.getSpacing(composer3, BentoTheme.$stable).m21592getMediumD9Ej5fM(), 0.0f, 2, null), composer3, 0, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composer2, i5, EnumC7081g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                composer2 = composerStartRestartGroup;
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.beneficiaries.ui.trustflow.email.BeneficiaryTrustEmailComposeKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return BeneficiaryTrustEmailCompose.BeneficiaryTrustEmailScaffold$lambda$0(viewState, callbacks, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
            int i52 = ((i3 >> 6) & 14) | 805306368;
            Modifier modifier52 = modifier4;
            composer2 = composerStartRestartGroup;
            ScaffoldKt.m5939ScaffoldTvnljyQ(modifier52, null, null, null, null, 0, 0L, 0L, WindowInsetsKt.excludeTop(ScaffoldDefaults.INSTANCE.getContentWindowInsets(composerStartRestartGroup, ScaffoldDefaults.$stable)), ComposableLambda3.rememberComposableLambda(1958531411, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.android.beneficiaries.ui.trustflow.email.BeneficiaryTrustEmailComposeKt.BeneficiaryTrustEmailScaffold.1
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer3, Integer num) {
                    invoke(paddingValues, composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(PaddingValues paddingValues, Composer composer3, int i6) {
                    Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                    if ((i6 & 6) == 0) {
                        i6 |= composer3.changed(paddingValues) ? 4 : 2;
                    }
                    if ((i6 & 19) == 18 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1958531411, i6, -1, "com.robinhood.android.beneficiaries.ui.trustflow.email.BeneficiaryTrustEmailScaffold.<anonymous> (BeneficiaryTrustEmailCompose.kt:34)");
                    }
                    BeneficiaryTrustEmailCompose.BeneficiaryTrustEmailContent(viewState, callbacks, PaddingKt.m5144paddingVpY3zN4$default(PaddingKt.padding(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), paddingValues), BentoTheme.INSTANCE.getSpacing(composer3, BentoTheme.$stable).m21592getMediumD9Ej5fM(), 0.0f, 2, null), composer3, 0, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composer2, i52, EnumC7081g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier3 = modifier52;
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void BeneficiaryTrustEmailContent(final BeneficiaryTrustEmailViewState beneficiaryTrustEmailViewState, final BeneficiaryTrustEmailCallbacks beneficiaryTrustEmailCallbacks, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        final Modifier modifier2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-540378703);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(beneficiaryTrustEmailViewState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= (i & 64) == 0 ? composerStartRestartGroup.changed(beneficiaryTrustEmailCallbacks) : composerStartRestartGroup.changedInstance(beneficiaryTrustEmailCallbacks) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 256 : 128;
        }
        if ((i3 & 147) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            modifier2 = modifier;
        } else {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            Modifier modifier3 = modifier;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-540378703, i3, -1, "com.robinhood.android.beneficiaries.ui.trustflow.email.BeneficiaryTrustEmailContent (BeneficiaryTrustEmailCompose.kt:50)");
            }
            BentoButtonBarScreenLayout.BentoButtonBarScreenLayout(modifier3, false, ComposableLambda3.rememberComposableLambda(619669926, true, new C98231(beneficiaryTrustEmailViewState, beneficiaryTrustEmailCallbacks), composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(-1718200679, true, new C98242(beneficiaryTrustEmailViewState, beneficiaryTrustEmailCallbacks), composerStartRestartGroup, 54), composerStartRestartGroup, ((i3 >> 6) & 14) | 3504, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = modifier3;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.beneficiaries.ui.trustflow.email.BeneficiaryTrustEmailComposeKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BeneficiaryTrustEmailCompose.BeneficiaryTrustEmailContent$lambda$1(beneficiaryTrustEmailViewState, beneficiaryTrustEmailCallbacks, modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: BeneficiaryTrustEmailCompose.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.beneficiaries.ui.trustflow.email.BeneficiaryTrustEmailComposeKt$BeneficiaryTrustEmailContent$2 */
    static final class C98242 implements Function3<BoxScope, Composer, Integer, Unit> {
        final /* synthetic */ BeneficiaryTrustEmailCallbacks $callbacks;
        final /* synthetic */ BeneficiaryTrustEmailViewState $viewState;

        C98242(BeneficiaryTrustEmailViewState beneficiaryTrustEmailViewState, BeneficiaryTrustEmailCallbacks beneficiaryTrustEmailCallbacks) {
            this.$viewState = beneficiaryTrustEmailViewState;
            this.$callbacks = beneficiaryTrustEmailCallbacks;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, Composer composer, Integer num) {
            invoke(boxScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$2$lambda$1$lambda$0(BeneficiaryTrustEmailCallbacks beneficiaryTrustEmailCallbacks, String it) {
            Intrinsics.checkNotNullParameter(it, "it");
            beneficiaryTrustEmailCallbacks.onTrustEmailInput(it);
            return Unit.INSTANCE;
        }

        public final void invoke(BoxScope BentoButtonBarScreenLayout, Composer composer, int i) {
            Composer composer2 = composer;
            Intrinsics.checkNotNullParameter(BentoButtonBarScreenLayout, "$this$BentoButtonBarScreenLayout");
            if ((i & 17) == 16 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1718200679, i, -1, "com.robinhood.android.beneficiaries.ui.trustflow.email.BeneficiaryTrustEmailContent.<anonymous> (BeneficiaryTrustEmailCompose.kt:54)");
            }
            BeneficiaryTrustEmailViewState beneficiaryTrustEmailViewState = this.$viewState;
            final BeneficiaryTrustEmailCallbacks beneficiaryTrustEmailCallbacks = this.$callbacks;
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, companion);
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
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i2 = BentoTheme.$stable;
            Spacer2.Spacer(SizeKt.m5169size3ABfNKs(companion, bentoTheme.getSpacing(composer2, i2).m21592getMediumD9Ej5fM()), composer2, 0);
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            TextAlign.Companion companion3 = TextAlign.INSTANCE;
            int iM7919getCentere0LSkKk = companion3.m7919getCentere0LSkKk();
            BentoText2.m20747BentoText38GnDrw(beneficiaryTrustEmailViewState.getTrustEmailViewModel().getTitle(), modifierFillMaxWidth$default, Color.m6701boximpl(bentoTheme.getColors(composer2, i2).m21425getFg0d7_KjU()), null, null, null, TextAlign.m7912boximpl(iM7919getCentere0LSkKk), 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer2, i2).getDisplayCapsuleMedium(), composer2, 48, 0, 8120);
            Spacer2.Spacer(SizeKt.m5169size3ABfNKs(companion, bentoTheme.getSpacing(composer2, i2).m21593getSmallD9Ej5fM()), composer2, 0);
            String subtitle_markdown = beneficiaryTrustEmailViewState.getTrustEmailViewModel().getSubtitle_markdown();
            composer2.startReplaceGroup(106079252);
            if (subtitle_markdown != null) {
                BentoMarkdownText2.BentoMarkdownText(subtitle_markdown, SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), BentoMarkdownText.INSTANCE.m21100withTextStylesYhh7B2I(bentoTheme.getTypography(composer2, i2).getTextM(), companion3.m7919getCentere0LSkKk(), bentoTheme.getColors(composer2, i2).m21425getFg0d7_KjU(), 0L, false, composer2, BentoMarkdownText.$stable << 15, 24), (Function0<Unit>) null, (Function1<? super String, Unit>) null, composer, (MarkdownStyle.$stable << 6) | 48, 24);
                composer2 = composer;
            }
            composer2.endReplaceGroup();
            Spacer2.Spacer(SizeKt.m5169size3ABfNKs(companion, C2002Dp.m7995constructorimpl(64)), composer2, 6);
            Modifier modifierTestTag = TestTag3.testTag(companion, BeneficiaryTrustEmailCompose.BeneficiaryTrustEmailInput);
            String trustEmailInputString = beneficiaryTrustEmailViewState.getTrustEmailInputString();
            String email_hint = beneficiaryTrustEmailViewState.getTrustEmailViewModel().getEmail_hint();
            composer2.startReplaceGroup(5004770);
            boolean zChangedInstance = composer2.changedInstance(beneficiaryTrustEmailCallbacks);
            Object objRememberedValue = composer2.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.beneficiaries.ui.trustflow.email.BeneficiaryTrustEmailComposeKt$BeneficiaryTrustEmailContent$2$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return BeneficiaryTrustEmailCompose.C98242.invoke$lambda$2$lambda$1$lambda$0(beneficiaryTrustEmailCallbacks, (String) obj);
                    }
                };
                composer2.updateRememberedValue(objRememberedValue);
            }
            composer2.endReplaceGroup();
            BentoTextInput4.BentoHeroTextInput(trustEmailInputString, (Function1) objRememberedValue, modifierTestTag, null, null, email_hint, null, null, null, null, null, null, false, false, composer2, 384, 0, 16344);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* compiled from: BeneficiaryTrustEmailCompose.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.beneficiaries.ui.trustflow.email.BeneficiaryTrustEmailComposeKt$BeneficiaryTrustEmailContent$1 */
    static final class C98231 implements Function3<BentoButtonBar3, Composer, Integer, Unit> {
        final /* synthetic */ BeneficiaryTrustEmailCallbacks $callbacks;
        final /* synthetic */ BeneficiaryTrustEmailViewState $viewState;

        C98231(BeneficiaryTrustEmailViewState beneficiaryTrustEmailViewState, BeneficiaryTrustEmailCallbacks beneficiaryTrustEmailCallbacks) {
            this.$viewState = beneficiaryTrustEmailViewState;
            this.$callbacks = beneficiaryTrustEmailCallbacks;
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
                ComposerKt.traceEventStart(619669926, i, -1, "com.robinhood.android.beneficiaries.ui.trustflow.email.BeneficiaryTrustEmailContent.<anonymous> (BeneficiaryTrustEmailCompose.kt:91)");
            }
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i2 = BentoTheme.$stable;
            Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(modifierFillMaxWidth$default, 0.0f, bentoTheme.getSpacing(composer, i2).m21590getDefaultD9Ej5fM(), 1, null);
            String string2 = StringResource2.getString(this.$viewState.getBottomButtonText(), composer, StringResource.$stable);
            boolean bottomButtonEnabled = this.$viewState.getBottomButtonEnabled();
            long jM21425getFg0d7_KjU = bentoTheme.getColors(composer, i2).m21425getFg0d7_KjU();
            long jM21371getBg0d7_KjU = bentoTheme.getColors(composer, i2).m21371getBg0d7_KjU();
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance = composer.changedInstance(this.$callbacks);
            final BeneficiaryTrustEmailCallbacks beneficiaryTrustEmailCallbacks = this.$callbacks;
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.beneficiaries.ui.trustflow.email.BeneficiaryTrustEmailComposeKt$BeneficiaryTrustEmailContent$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return BeneficiaryTrustEmailCompose.C98231.invoke$lambda$1$lambda$0(beneficiaryTrustEmailCallbacks);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            BentoButtonKt.m20586BentoButtonEikTQX8((Function0) objRememberedValue, string2, modifierM5144paddingVpY3zN4$default, null, null, bottomButtonEnabled, false, Color.m6701boximpl(jM21425getFg0d7_KjU), Color.m6701boximpl(jM21371getBg0d7_KjU), null, null, false, null, composer, 0, 0, 7768);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(BeneficiaryTrustEmailCallbacks beneficiaryTrustEmailCallbacks) {
            beneficiaryTrustEmailCallbacks.onTrustEmailConfirmed();
            return Unit.INSTANCE;
        }
    }
}
