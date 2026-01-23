package com.robinhood.android.retirement.p239ui.funded;

import androidx.compose.foundation.Background3;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.dashboard.lib.footer.AnimatedFooterContent;
import com.robinhood.android.retirement.C26959R;
import com.robinhood.android.retirement.p239ui.RetirementComponent;
import com.robinhood.android.retirement.p239ui.UtilKt;
import com.robinhood.android.retirement.p239ui.funded.RetirementContributeFooterButton3;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoDivider;
import com.robinhood.compose.bento.theme.BentoTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: RetirementContributeFooterButton.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a1\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0001¢\u0006\u0002\u0010\f\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000¨\u0006\r"}, m3636d2 = {"FooterDividerTag", "", "ContributeFooterButton", "", "state", "Lcom/robinhood/android/retirement/ui/funded/ContributeButtonState;", "isButtonVisible", "", "callbacks", "Lcom/robinhood/android/retirement/ui/funded/RetirementContributeFooterButtonCallbacks;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/android/retirement/ui/funded/ContributeButtonState;ZLcom/robinhood/android/retirement/ui/funded/RetirementContributeFooterButtonCallbacks;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "feature-retirement-tab_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.retirement.ui.funded.RetirementContributeFooterButtonKt, reason: use source file name */
/* loaded from: classes5.dex */
public final class RetirementContributeFooterButton3 {
    public static final String FooterDividerTag = "footer_divider";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ContributeFooterButton$lambda$0(ContributeButtonState contributeButtonState, boolean z, RetirementContributeFooterButton2 retirementContributeFooterButton2, Modifier modifier, int i, int i2, Composer composer, int i3) {
        ContributeFooterButton(contributeButtonState, z, retirementContributeFooterButton2, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ContributeFooterButton(final ContributeButtonState contributeButtonState, final boolean z, final RetirementContributeFooterButton2 callbacks, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        Composer composerStartRestartGroup = composer.startRestartGroup(389347804);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(contributeButtonState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= (i & 512) == 0 ? composerStartRestartGroup.changed(callbacks) : composerStartRestartGroup.changedInstance(callbacks) ? 256 : 128;
        }
        int i4 = i2 & 8;
        if (i4 == 0) {
            if ((i & 3072) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            if ((i3 & 1171) == 1170 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(389347804, i3, -1, "com.robinhood.android.retirement.ui.funded.ContributeFooterButton (RetirementContributeFooterButton.kt:39)");
                }
                if (contributeButtonState == null) {
                    composerStartRestartGroup.startReplaceGroup(-1645976169);
                    AnimatedFooterContent.AnimatedFooterContent(z, ComposableLambda3.rememberComposableLambda(-2125960558, true, new C272061(modifier4, callbacks, contributeButtonState), composerStartRestartGroup, 54), null, composerStartRestartGroup, ((i3 >> 3) & 14) | 48, 4);
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    composerStartRestartGroup.startReplaceGroup(-1645059313);
                    BentoDivider.m20635BentoHorizontalDivideraMcp0Q(TestTag3.testTag(Modifier.INSTANCE, FooterDividerTag), BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21373getBg30d7_KjU(), 0.0f, composerStartRestartGroup, 6, 4);
                    composerStartRestartGroup = composerStartRestartGroup;
                    composerStartRestartGroup.endReplaceGroup();
                }
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
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.retirement.ui.funded.RetirementContributeFooterButtonKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return RetirementContributeFooterButton3.ContributeFooterButton$lambda$0(contributeButtonState, z, callbacks, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
            if (contributeButtonState == null) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier3 = modifier4;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* compiled from: RetirementContributeFooterButton.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.retirement.ui.funded.RetirementContributeFooterButtonKt$ContributeFooterButton$1 */
    static final class C272061 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ RetirementContributeFooterButton2 $callbacks;
        final /* synthetic */ Modifier $modifier;
        final /* synthetic */ ContributeButtonState $state;

        C272061(Modifier modifier, RetirementContributeFooterButton2 retirementContributeFooterButton2, ContributeButtonState contributeButtonState) {
            this.$modifier = modifier;
            this.$callbacks = retirementContributeFooterButton2;
            this.$state = contributeButtonState;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2125960558, i, -1, "com.robinhood.android.retirement.ui.funded.ContributeFooterButton.<anonymous> (RetirementContributeFooterButton.kt:44)");
            }
            String strStringResource = StringResources_androidKt.stringResource(C26959R.string.retirement_dashboard_contribute_cta, composer, 0);
            Modifier modifier = this.$modifier;
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i2 = BentoTheme.$stable;
            Modifier modifierM5143paddingVpY3zN4 = PaddingKt.m5143paddingVpY3zN4(SizeKt.fillMaxWidth$default(UtilKt.autoLogEvents(Background3.m4872backgroundbw27NRU$default(modifier, bentoTheme.getColors(composer, i2).m21371getBg0d7_KjU(), null, 2, null), RetirementComponent.ContributionCta.INSTANCE), 0.0f, 1, null), bentoTheme.getSpacing(composer, i2).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composer, i2).m21590getDefaultD9Ej5fM());
            composer.startReplaceGroup(-1633490746);
            boolean zChangedInstance = composer.changedInstance(this.$callbacks) | composer.changed(this.$state);
            final RetirementContributeFooterButton2 retirementContributeFooterButton2 = this.$callbacks;
            final ContributeButtonState contributeButtonState = this.$state;
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.retirement.ui.funded.RetirementContributeFooterButtonKt$ContributeFooterButton$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return RetirementContributeFooterButton3.C272061.invoke$lambda$1$lambda$0(retirementContributeFooterButton2, contributeButtonState);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            BentoButtonKt.m20586BentoButtonEikTQX8((Function0) objRememberedValue, strStringResource, modifierM5143paddingVpY3zN4, null, null, false, false, null, null, null, null, false, null, composer, 0, 0, 8184);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(RetirementContributeFooterButton2 retirementContributeFooterButton2, ContributeButtonState contributeButtonState) {
            retirementContributeFooterButton2.onContributeClicked(contributeButtonState.getAccountType(), contributeButtonState.getAccountNumber());
            return Unit.INSTANCE;
        }
    }
}
