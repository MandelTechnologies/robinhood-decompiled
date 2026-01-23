package com.robinhood.shared.posttransfer.confirmationwithlottie;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.fragment.app.Fragment;
import com.plaid.internal.EnumC7081g;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.models.p355ui.bonfire.UiPostTransferPage;
import com.robinhood.models.serverdriven.p347db.GenericButton;
import com.robinhood.shared.posttransfer.confirmationwithlottie.TransferConfirmationWithLottieFragment;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: TransferConfirmationWithLottieFragment.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\b\u001a\u00020\tH\u0017¢\u0006\u0002\u0010\nR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/shared/posttransfer/confirmationwithlottie/TransferConfirmationWithLottieFragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "<init>", "()V", "toolbarVisible", "", "getToolbarVisible", "()Z", "ComposeContent", "", "(Landroidx/compose/runtime/Composer;I)V", "Companion", "lib-post-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final class TransferConfirmationWithLottieFragment extends GenericComposeFragment {
    private final boolean toolbarVisible;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = GenericComposeFragment.$stable;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$0(TransferConfirmationWithLottieFragment transferConfirmationWithLottieFragment, int i, Composer composer, int i2) {
        transferConfirmationWithLottieFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getToolbarVisible() {
        return this.toolbarVisible;
    }

    /* compiled from: TransferConfirmationWithLottieFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.shared.posttransfer.confirmationwithlottie.TransferConfirmationWithLottieFragment$ComposeContent$1 */
    static final class C395271 implements Function2<Composer, Integer, Unit> {
        C395271() {
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
                ComposerKt.traceEventStart(988938782, i, -1, "com.robinhood.shared.posttransfer.confirmationwithlottie.TransferConfirmationWithLottieFragment.ComposeContent.<anonymous> (TransferConfirmationWithLottieFragment.kt:17)");
            }
            Companion companion = TransferConfirmationWithLottieFragment.INSTANCE;
            String title = ((UiPostTransferPage.ConfirmationWithLottie) companion.getArgs((Fragment) TransferConfirmationWithLottieFragment.this)).getTitle();
            String subtitleMarkdown = ((UiPostTransferPage.ConfirmationWithLottie) companion.getArgs((Fragment) TransferConfirmationWithLottieFragment.this)).getSubtitleMarkdown();
            String disclosureMarkdown = ((UiPostTransferPage.ConfirmationWithLottie) companion.getArgs((Fragment) TransferConfirmationWithLottieFragment.this)).getDisclosureMarkdown();
            String lottieUrlLight = ((UiPostTransferPage.ConfirmationWithLottie) companion.getArgs((Fragment) TransferConfirmationWithLottieFragment.this)).getLottieUrlLight();
            String lottieUrlDark = ((UiPostTransferPage.ConfirmationWithLottie) companion.getArgs((Fragment) TransferConfirmationWithLottieFragment.this)).getLottieUrlDark();
            GenericButton primaryButton = ((UiPostTransferPage.ConfirmationWithLottie) companion.getArgs((Fragment) TransferConfirmationWithLottieFragment.this)).getPrimaryButton();
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance = composer.changedInstance(TransferConfirmationWithLottieFragment.this);
            final TransferConfirmationWithLottieFragment transferConfirmationWithLottieFragment = TransferConfirmationWithLottieFragment.this;
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.shared.posttransfer.confirmationwithlottie.TransferConfirmationWithLottieFragment$ComposeContent$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return TransferConfirmationWithLottieFragment.C395271.invoke$lambda$1$lambda$0(transferConfirmationWithLottieFragment);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            TransferConfirmationWithLottieScreen5.TransferConfirmationWithLottieScreen(title, subtitleMarkdown, disclosureMarkdown, lottieUrlLight, lottieUrlDark, primaryButton, (Function0) objRememberedValue, null, composer, 0, 128);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(TransferConfirmationWithLottieFragment transferConfirmationWithLottieFragment) {
            transferConfirmationWithLottieFragment.requireBaseActivity().onBackPressed();
            return Unit.INSTANCE;
        }
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1401863782);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerStartRestartGroup.changed(this) : composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1401863782, i2, -1, "com.robinhood.shared.posttransfer.confirmationwithlottie.TransferConfirmationWithLottieFragment.ComposeContent (TransferConfirmationWithLottieFragment.kt:15)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, Boolean.TRUE, null, null, ComposableLambda3.rememberComposableLambda(988938782, true, new C395271(), composerStartRestartGroup, 54), composerStartRestartGroup, 100859904, EnumC7081g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.posttransfer.confirmationwithlottie.TransferConfirmationWithLottieFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return TransferConfirmationWithLottieFragment.ComposeContent$lambda$0(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: TransferConfirmationWithLottieFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/shared/posttransfer/confirmationwithlottie/TransferConfirmationWithLottieFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/shared/posttransfer/confirmationwithlottie/TransferConfirmationWithLottieFragment;", "Lcom/robinhood/models/ui/bonfire/UiPostTransferPage$ConfirmationWithLottie;", "<init>", "()V", "lib-post-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<TransferConfirmationWithLottieFragment, UiPostTransferPage.ConfirmationWithLottie> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public UiPostTransferPage.ConfirmationWithLottie getArgs(TransferConfirmationWithLottieFragment transferConfirmationWithLottieFragment) {
            return (UiPostTransferPage.ConfirmationWithLottie) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, transferConfirmationWithLottieFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public TransferConfirmationWithLottieFragment newInstance(UiPostTransferPage.ConfirmationWithLottie confirmationWithLottie) {
            return (TransferConfirmationWithLottieFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, confirmationWithLottie);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(TransferConfirmationWithLottieFragment transferConfirmationWithLottieFragment, UiPostTransferPage.ConfirmationWithLottie confirmationWithLottie) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, transferConfirmationWithLottieFragment, confirmationWithLottie);
        }
    }
}
