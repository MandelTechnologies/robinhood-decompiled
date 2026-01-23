package com.robinhood.android.nightly.prompt;

import android.os.Parcelable;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.Clip;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.window.AndroidDialog_androidKt;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.fragment.app.Fragment;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.nightly.prompt.NightlyUpgradeDialogFragment;
import com.robinhood.android.utils.web.WebUtils;
import com.robinhood.compose.app.GenericComposeDialogFragment;
import com.robinhood.compose.bento.component.alerts.BentoAlertButton;
import com.robinhood.compose.bento.component.alerts.BentoAlertDialog2;
import com.robinhood.compose.bento.component.alerts.BentoAlerts2;
import com.robinhood.utils.p409ui.fragment.FragmentWithoutArgsCompanion;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: NightlyUpgradeDialogFragment.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\n\u001a\u00020\u000bH\u0017¢\u0006\u0002\u0010\fR\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/nightly/prompt/NightlyUpgradeDialogFragment;", "Lcom/robinhood/compose/app/GenericComposeDialogFragment;", "<init>", "()V", "lastNightlyPromptPref", "Lcom/robinhood/android/nightly/prompt/LastNightlyPromptDatePreference;", "getLastNightlyPromptPref", "()Lcom/robinhood/android/nightly/prompt/LastNightlyPromptDatePreference;", "setLastNightlyPromptPref", "(Lcom/robinhood/android/nightly/prompt/LastNightlyPromptDatePreference;)V", "ComposeContent", "", "(Landroidx/compose/runtime/Composer;I)V", "Companion", "lib-nightly-prompt_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class NightlyUpgradeDialogFragment extends GenericComposeDialogFragment {
    private static final String DIALOG_TAG = "nightlyUpgradeDialog";
    public LastNightlyPromptDatePreference lastNightlyPromptPref;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$2(NightlyUpgradeDialogFragment nightlyUpgradeDialogFragment, int i, Composer composer, int i2) {
        nightlyUpgradeDialogFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public final LastNightlyPromptDatePreference getLastNightlyPromptPref() {
        LastNightlyPromptDatePreference lastNightlyPromptDatePreference = this.lastNightlyPromptPref;
        if (lastNightlyPromptDatePreference != null) {
            return lastNightlyPromptDatePreference;
        }
        Intrinsics.throwUninitializedPropertyAccessException("lastNightlyPromptPref");
        return null;
    }

    public final void setLastNightlyPromptPref(LastNightlyPromptDatePreference lastNightlyPromptDatePreference) {
        Intrinsics.checkNotNullParameter(lastNightlyPromptDatePreference, "<set-?>");
        this.lastNightlyPromptPref = lastNightlyPromptDatePreference;
    }

    @Override // com.robinhood.compose.app.GenericComposeDialogFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1852850318);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1852850318, i2, -1, "com.robinhood.android.nightly.prompt.NightlyUpgradeDialogFragment.ComposeContent (NightlyUpgradeDialogFragment.kt:34)");
            }
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(this);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.nightly.prompt.NightlyUpgradeDialogFragment$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return NightlyUpgradeDialogFragment.ComposeContent$lambda$1$lambda$0(this.f$0);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            AndroidDialog_androidKt.Dialog((Function0) objRememberedValue, null, ComposableLambda3.rememberComposableLambda(1618717861, true, new C225982(), composerStartRestartGroup, 54), composerStartRestartGroup, 384, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.nightly.prompt.NightlyUpgradeDialogFragment$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return NightlyUpgradeDialogFragment.ComposeContent$lambda$2(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$1$lambda$0(NightlyUpgradeDialogFragment nightlyUpgradeDialogFragment) {
        nightlyUpgradeDialogFragment.getLastNightlyPromptPref().setPromptedToday();
        nightlyUpgradeDialogFragment.dismiss();
        return Unit.INSTANCE;
    }

    /* compiled from: NightlyUpgradeDialogFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.nightly.prompt.NightlyUpgradeDialogFragment$ComposeContent$2 */
    static final class C225982 implements Function2<Composer, Integer, Unit> {
        C225982() {
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
                ComposerKt.traceEventStart(1618717861, i, -1, "com.robinhood.android.nightly.prompt.NightlyUpgradeDialogFragment.ComposeContent.<anonymous> (NightlyUpgradeDialogFragment.kt:41)");
            }
            Modifier modifierClip = Clip.clip(Modifier.INSTANCE, RoundedCornerShape2.m5327RoundedCornerShape0680j_4(BentoAlertDialog2.INSTANCE.m20850getCornerRadiusD9Ej5fM()));
            final NightlyUpgradeDialogFragment nightlyUpgradeDialogFragment = NightlyUpgradeDialogFragment.this;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierClip);
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
            if (composer.getApplier() == null) {
                Composables.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor);
            } else {
                composer.useNode();
            }
            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            String strStringResource = StringResources_androidKt.stringResource(C22599R.string.nightly_dialog_title, composer, 0);
            String strStringResource2 = StringResources_androidKt.stringResource(C22599R.string.nightly_download, composer, 0);
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance = composer.changedInstance(nightlyUpgradeDialogFragment);
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.nightly.prompt.NightlyUpgradeDialogFragment$ComposeContent$2$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return NightlyUpgradeDialogFragment.C225982.invoke$lambda$4$lambda$1$lambda$0(nightlyUpgradeDialogFragment);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            BentoAlertButton bentoAlerts = new BentoAlertButton(strStringResource2, (Function0) objRememberedValue);
            String strStringResource3 = StringResources_androidKt.stringResource(C22599R.string.nightly_reminder_later, composer, 0);
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance2 = composer.changedInstance(nightlyUpgradeDialogFragment);
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: com.robinhood.android.nightly.prompt.NightlyUpgradeDialogFragment$ComposeContent$2$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return NightlyUpgradeDialogFragment.C225982.invoke$lambda$4$lambda$3$lambda$2(nightlyUpgradeDialogFragment);
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            composer.endReplaceGroup();
            BentoAlerts2.AlertContent(null, null, strStringResource, null, CollectionsKt.listOf((Object[]) new BentoAlertButton[]{bentoAlerts, new BentoAlertButton(strStringResource3, (Function0) objRememberedValue2)}), false, ComposableLambda3.rememberComposableLambda(1864393531, true, new NightlyUpgradeDialogFragment2(nightlyUpgradeDialogFragment), composer, 54), composer, (BentoAlertButton.$stable << 12) | 1572864, 43);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$4$lambda$1$lambda$0(NightlyUpgradeDialogFragment nightlyUpgradeDialogFragment) {
            WebUtils.viewUrl$default(nightlyUpgradeDialogFragment.requireContext(), "https://play.google.com/store/apps/details?id=com.robinhood.android.internal", 0, 4, (Object) null);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$4$lambda$3$lambda$2(NightlyUpgradeDialogFragment nightlyUpgradeDialogFragment) {
            nightlyUpgradeDialogFragment.getLastNightlyPromptPref().setPromptedToday();
            nightlyUpgradeDialogFragment.dismiss();
            return Unit.INSTANCE;
        }
    }

    /* compiled from: NightlyUpgradeDialogFragment.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/nightly/prompt/NightlyUpgradeDialogFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithoutArgsCompanion;", "Lcom/robinhood/android/nightly/prompt/NightlyUpgradeDialogFragment;", "Lcom/robinhood/android/nightly/prompt/NightlyUpgradePrompt;", "<init>", "()V", "DIALOG_TAG", "", "show", "", "activity", "Lcom/robinhood/android/common/ui/BaseActivity;", "lib-nightly-prompt_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithoutArgsCompanion<NightlyUpgradeDialogFragment>, NightlyUpgradePrompt {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public /* bridge */ /* synthetic */ Parcelable getArgs(Fragment fragment) {
            return (Parcelable) getArgs((NightlyUpgradeDialogFragment) fragment);
        }

        public Void getArgs(NightlyUpgradeDialogFragment nightlyUpgradeDialogFragment) {
            return FragmentWithoutArgsCompanion.DefaultImpls.getArgs(this, nightlyUpgradeDialogFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithoutArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentWithoutArgsCreator
        public NightlyUpgradeDialogFragment newInstance() {
            return (NightlyUpgradeDialogFragment) FragmentWithoutArgsCompanion.DefaultImpls.newInstance(this);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithoutArgsCreator
        public NightlyUpgradeDialogFragment newInstance(Void r1) {
            return (NightlyUpgradeDialogFragment) FragmentWithoutArgsCompanion.DefaultImpls.newInstance(this, r1);
        }

        @Override // com.robinhood.android.nightly.prompt.NightlyUpgradePrompt
        public void show(BaseActivity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            if (activity.getSupportFragmentManager().findFragmentByTag(NightlyUpgradeDialogFragment.DIALOG_TAG) == null) {
                ((NightlyUpgradeDialogFragment) newInstance()).showNow(activity.getSupportFragmentManager(), NightlyUpgradeDialogFragment.DIALOG_TAG);
            }
        }
    }
}
