package com.robinhood.shared.update.password.reset;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
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
import com.robinhood.compose.bento.component.BentoButtonBar2;
import com.robinhood.compose.bento.component.BentoButtonBar3;
import com.robinhood.compose.bento.component.BentoButtonBarScreenLayout;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.shared.update.password.C41211R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: ResetPasswordComposable.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aA\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\bH\u0001¢\u0006\u0002\u0010\n\u001a\u0015\u0010\u000b\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\u0003¢\u0006\u0002\u0010\f¨\u0006\r"}, m3636d2 = {"ResetPasswordComposable", "", "isLoading", "", "email", "", "showUpdateEmailAddressCta", "onPrimaryCtaClicked", "Lkotlin/Function0;", "onSecondaryCtaClicked", "(ZLjava/lang/String;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "MainContent", "(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V", "feature-update-password_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.update.password.reset.ResetPasswordComposableKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class ResetPasswordComposable {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MainContent$lambda$2(String str, int i, Composer composer, int i2) {
        MainContent(str, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ResetPasswordComposable$lambda$0(boolean z, String str, boolean z2, Function0 function0, Function0 function02, int i, Composer composer, int i2) {
        ResetPasswordComposable(z, str, z2, function0, function02, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void ResetPasswordComposable(final boolean z, final String email, final boolean z2, final Function0<Unit> onPrimaryCtaClicked, final Function0<Unit> onSecondaryCtaClicked, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(email, "email");
        Intrinsics.checkNotNullParameter(onPrimaryCtaClicked, "onPrimaryCtaClicked");
        Intrinsics.checkNotNullParameter(onSecondaryCtaClicked, "onSecondaryCtaClicked");
        Composer composerStartRestartGroup = composer.startRestartGroup(-586485862);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(email) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(z2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onPrimaryCtaClicked) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onSecondaryCtaClicked) ? 16384 : 8192;
        }
        if ((i2 & 9363) != 9362 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-586485862, i2, -1, "com.robinhood.shared.update.password.reset.ResetPasswordComposable (ResetPasswordComposable.kt:23)");
            }
            BentoButtonBarScreenLayout.BentoButtonBarScreenLayout(PaddingKt.m5144paddingVpY3zN4$default(Modifier.INSTANCE, BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21592getMediumD9Ej5fM(), 0.0f, 2, null), false, ComposableLambda3.rememberComposableLambda(-781027633, true, new Function3<BentoButtonBar3, Composer, Integer, Unit>() { // from class: com.robinhood.shared.update.password.reset.ResetPasswordComposableKt.ResetPasswordComposable.1
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(BentoButtonBar3 bentoButtonBar3, Composer composer2, Integer num) {
                    invoke(bentoButtonBar3, composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(BentoButtonBar3 BentoButtonBarScreenLayout, Composer composer2, int i3) {
                    Intrinsics.checkNotNullParameter(BentoButtonBarScreenLayout, "$this$BentoButtonBarScreenLayout");
                    if ((i3 & 17) == 16 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-781027633, i3, -1, "com.robinhood.shared.update.password.reset.ResetPasswordComposable.<anonymous> (ResetPasswordComposable.kt:27)");
                    }
                    Function0<Unit> function0 = onPrimaryCtaClicked;
                    String strStringResource = StringResources_androidKt.stringResource(C41211R.string.reset_password_primary_cta_label, composer2, 0);
                    boolean z3 = z;
                    Function0<Unit> function02 = onSecondaryCtaClicked;
                    composer2.startReplaceGroup(1051732451);
                    String strStringResource2 = z2 ? StringResources_androidKt.stringResource(C41211R.string.reset_password_secondary_cta_label, composer2, 0) : null;
                    composer2.endReplaceGroup();
                    BentoButtonBar2.BentoButtonBar(null, null, null, false, null, null, function0, strStringResource, z3, null, false, function02, strStringResource2, false, null, false, composer2, 0, 0, 58943);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(1181308546, true, new Function3<BoxScope, Composer, Integer, Unit>() { // from class: com.robinhood.shared.update.password.reset.ResetPasswordComposableKt.ResetPasswordComposable.2
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, Composer composer2, Integer num) {
                    invoke(boxScope, composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(BoxScope BentoButtonBarScreenLayout, Composer composer2, int i3) {
                    Intrinsics.checkNotNullParameter(BentoButtonBarScreenLayout, "$this$BentoButtonBarScreenLayout");
                    if ((i3 & 17) == 16 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1181308546, i3, -1, "com.robinhood.shared.update.password.reset.ResetPasswordComposable.<anonymous> (ResetPasswordComposable.kt:40)");
                    }
                    ResetPasswordComposable.MainContent(email, composer2, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 3456, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.update.password.reset.ResetPasswordComposableKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ResetPasswordComposable.ResetPasswordComposable$lambda$0(z, email, z2, onPrimaryCtaClicked, onSecondaryCtaClicked, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void MainContent(String str, Composer composer, final int i) {
        int i2;
        final String str2 = str;
        Composer composerStartRestartGroup = composer.startRestartGroup(-726734695);
        if ((i & 6) == 0) {
            i2 = i | (composerStartRestartGroup.changed(str2) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-726734695, i2, -1, "com.robinhood.shared.update.password.reset.MainContent (ResetPasswordComposable.kt:45)");
            }
            Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, composerStartRestartGroup, 48);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, companion);
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
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i3 = BentoTheme.$stable;
            int i4 = i2;
            BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C41211R.string.reset_password_title, composerStartRestartGroup, 0), PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i3).m21592getMediumD9Ej5fM(), 0.0f, 0.0f, 13, null), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i3).getDisplayCapsuleMedium(), composerStartRestartGroup, 0, 0, 8188);
            Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i3).m21593getSmallD9Ej5fM(), 0.0f, 0.0f, 13, null);
            String strStringResource = StringResources_androidKt.stringResource(C41211R.string.reset_password_subtitle, composerStartRestartGroup, 0);
            TextAlign.Companion companion3 = TextAlign.INSTANCE;
            BentoText2.m20747BentoText38GnDrw(strStringResource, modifierM5146paddingqDBjuR0$default, null, null, null, null, TextAlign.m7912boximpl(companion3.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, null, composerStartRestartGroup, 0, 0, 16316);
            composerStartRestartGroup = composerStartRestartGroup;
            Spacer2.Spacer(Column5.weight$default(column6, companion, 1.0f, false, 2, null), composerStartRestartGroup, 0);
            str2 = str;
            BentoText2.m20747BentoText38GnDrw(str2, null, null, null, null, null, TextAlign.m7912boximpl(companion3.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i3).getTextL(), composerStartRestartGroup, i4 & 14, 0, 8126);
            Spacer2.Spacer(Column5.weight$default(column6, companion, 1.0f, false, 2, null), composerStartRestartGroup, 0);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.update.password.reset.ResetPasswordComposableKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ResetPasswordComposable.MainContent$lambda$2(str2, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
