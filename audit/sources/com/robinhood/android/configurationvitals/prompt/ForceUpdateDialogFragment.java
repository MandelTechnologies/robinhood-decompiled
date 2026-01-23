package com.robinhood.android.configurationvitals.prompt;

import android.os.Parcel;
import android.os.Parcelable;
import android.widget.Toast;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.configurationvitals.ForceUpdatePrompt;
import com.robinhood.android.configurationvitals.LastVitalsDismissPref;
import com.robinhood.android.util.play.GooglePlay;
import com.robinhood.android.utils.web.WebUtils;
import com.robinhood.compose.app.GenericComposeDialogFragment;
import com.robinhood.compose.bento.component.alerts.BentoAlertButton;
import com.robinhood.compose.bento.component.alerts.BentoAlertDialog;
import com.robinhood.compose.bento.component.alerts.BentoAlertDialog2;
import com.robinhood.compose.bento.component.alerts.BentoAlertSheet6;
import com.robinhood.models.api.UnsupportedVersionContent;
import com.robinhood.prefs.StringPreference;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p479j$.time.LocalDateTime;
import timber.log.Timber;

/* compiled from: ForceUpdateDialogFragment.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00152\u00020\u0001:\u0003\u0013\u0014\u0015B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u000b\u001a\u00020\fH\u0017¢\u0006\u0002\u0010\rJ\u000e\u0010\u000e\u001a\u0004\u0018\u00010\u000f*\u00020\u0010H\u0002J\r\u0010\u0011\u001a\u00020\u000fH\u0003¢\u0006\u0002\u0010\u0012R$\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u0014\n\u0000\u0012\u0004\b\u0006\u0010\u0003\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/configurationvitals/prompt/ForceUpdateDialogFragment;", "Lcom/robinhood/compose/app/GenericComposeDialogFragment;", "<init>", "()V", "lastVitalsDismissPref", "Lcom/robinhood/prefs/StringPreference;", "getLastVitalsDismissPref$annotations", "getLastVitalsDismissPref", "()Lcom/robinhood/prefs/StringPreference;", "setLastVitalsDismissPref", "(Lcom/robinhood/prefs/StringPreference;)V", "ComposeContent", "", "(Landroidx/compose/runtime/Composer;I)V", "toBentoAlertButton", "Lcom/robinhood/compose/bento/component/alerts/BentoAlertButton;", "Lcom/robinhood/models/api/UnsupportedVersionContent$Button;", "bentoAlertButtonOk", "(Landroidx/compose/runtime/Composer;I)Lcom/robinhood/compose/bento/component/alerts/BentoAlertButton;", "Action", "Args", "Companion", "lib-configuration-vitals-prompt_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes17.dex */
public final class ForceUpdateDialogFragment extends GenericComposeDialogFragment {
    private static final String DIALOG_TAG = "forceUpdateDialog";
    public StringPreference lastVitalsDismissPref;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$5(ForceUpdateDialogFragment forceUpdateDialogFragment, int i, Composer composer, int i2) {
        forceUpdateDialogFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    @LastVitalsDismissPref
    public static /* synthetic */ void getLastVitalsDismissPref$annotations() {
    }

    public final StringPreference getLastVitalsDismissPref() {
        StringPreference stringPreference = this.lastVitalsDismissPref;
        if (stringPreference != null) {
            return stringPreference;
        }
        Intrinsics.throwUninitializedPropertyAccessException("lastVitalsDismissPref");
        return null;
    }

    public final void setLastVitalsDismissPref(StringPreference stringPreference) {
        Intrinsics.checkNotNullParameter(stringPreference, "<set-?>");
        this.lastVitalsDismissPref = stringPreference;
    }

    @Override // com.robinhood.compose.app.GenericComposeDialogFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-2011441436);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2011441436, i2, -1, "com.robinhood.android.configurationvitals.prompt.ForceUpdateDialogFragment.ComposeContent (ForceUpdateDialogFragment.kt:32)");
            }
            UnsupportedVersionContent unsupportedVersionContent = ((Args) INSTANCE.getArgs((Fragment) this)).getUnsupportedVersionContent();
            composerStartRestartGroup.startReplaceGroup(-259928468);
            List listSortedWith = CollectionsKt.sortedWith(unsupportedVersionContent.getButtons(), new Comparator() { // from class: com.robinhood.android.configurationvitals.prompt.ForceUpdateDialogFragment$ComposeContent$$inlined$sortedByDescending$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return ComparisonsKt.compareValues(Boolean.valueOf(((UnsupportedVersionContent.Button) t2).isPrimary()), Boolean.valueOf(((UnsupportedVersionContent.Button) t).isPrimary()));
                }
            });
            List arrayList = new ArrayList();
            Iterator it = listSortedWith.iterator();
            while (it.hasNext()) {
                BentoAlertButton bentoAlertButton = toBentoAlertButton((UnsupportedVersionContent.Button) it.next());
                if (bentoAlertButton != null) {
                    arrayList.add(bentoAlertButton);
                }
            }
            if (arrayList.isEmpty()) {
                arrayList = CollectionsKt.listOf(bentoAlertButtonOk(composerStartRestartGroup, i2 & 14));
            }
            List list = arrayList;
            composerStartRestartGroup.endReplaceGroup();
            String messageTitle = unsupportedVersionContent.getMessageTitle();
            BentoAlertDialog2.Body.MarkdownText markdownText = new BentoAlertDialog2.Body.MarkdownText(unsupportedVersionContent.getMessageBodyMarkdown());
            BentoAlertButton bentoAlerts = (BentoAlertButton) CollectionsKt.first(list);
            BentoAlertButton bentoAlerts2 = (BentoAlertButton) CollectionsKt.getOrNull(list, 1);
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.configurationvitals.prompt.ForceUpdateDialogFragment$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Unit.INSTANCE;
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            Function0 function0 = (Function0) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            int i3 = (BentoAlertDialog2.Body.MarkdownText.$stable << 3) | 100663296;
            int i4 = BentoAlertButton.$stable;
            BentoAlertDialog.BentoAlertDialog(messageTitle, markdownText, bentoAlerts, null, bentoAlerts2, null, false, null, function0, composerStartRestartGroup, i3 | (i4 << 6) | (i4 << 12), EnumC7081g.SDK_ASSET_ILLUSTRATION_FIRST_DEPOSIT_CIRCLE_VALUE);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.configurationvitals.prompt.ForceUpdateDialogFragment$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ForceUpdateDialogFragment.ComposeContent$lambda$5(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private final BentoAlertButton toBentoAlertButton(UnsupportedVersionContent.Button button) {
        final Action dismiss;
        UnsupportedVersionContent.Button.Action action = button.getAction();
        if (action instanceof UnsupportedVersionContent.Button.Action.Url) {
            dismiss = new Action.Url(((UnsupportedVersionContent.Button.Action.Url) action).getUrl());
        } else if (action instanceof UnsupportedVersionContent.Button.Action.Cancel) {
            dismiss = Action.Cancel.INSTANCE;
        } else if (action instanceof UnsupportedVersionContent.Button.Action.OpenPlayStore) {
            dismiss = Action.OpenPlayStore.INSTANCE;
        } else if (action instanceof UnsupportedVersionContent.Button.Action.Dismiss) {
            dismiss = new Action.Dismiss(getLastVitalsDismissPref());
        } else {
            if (!(action instanceof UnsupportedVersionContent.Button.Action.Unknown)) {
                throw new NoWhenBranchMatchedException();
            }
            dismiss = null;
        }
        if (dismiss == null) {
            return null;
        }
        return new BentoAlertButton(button.getLabel(), new Function0() { // from class: com.robinhood.android.configurationvitals.prompt.ForceUpdateDialogFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ForceUpdateDialogFragment.toBentoAlertButton$lambda$6(this.f$0, dismiss);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit toBentoAlertButton$lambda$6(ForceUpdateDialogFragment forceUpdateDialogFragment, Action action) {
        forceUpdateDialogFragment.dismiss();
        FragmentActivity fragmentActivityRequireActivity = forceUpdateDialogFragment.requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        action.execute(fragmentActivityRequireActivity);
        return Unit.INSTANCE;
    }

    private final BentoAlertButton bentoAlertButtonOk(Composer composer, int i) {
        composer.startReplaceGroup(-1951863773);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1951863773, i, -1, "com.robinhood.android.configurationvitals.prompt.ForceUpdateDialogFragment.bentoAlertButtonOk (ForceUpdateDialogFragment.kt:73)");
        }
        String strStringResource = StringResources_androidKt.stringResource(C11048R.string.general_label_ok, composer, 0);
        composer.startReplaceGroup(5004770);
        boolean zChangedInstance = composer.changedInstance(this);
        Object objRememberedValue = composer.rememberedValue();
        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function0() { // from class: com.robinhood.android.configurationvitals.prompt.ForceUpdateDialogFragment$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ForceUpdateDialogFragment.bentoAlertButtonOk$lambda$8$lambda$7(this.f$0);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        BentoAlertButton bentoAlerts = new BentoAlertButton(strStringResource, (Function0) objRememberedValue);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return bentoAlerts;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bentoAlertButtonOk$lambda$8$lambda$7(ForceUpdateDialogFragment forceUpdateDialogFragment) {
        forceUpdateDialogFragment.dismiss();
        forceUpdateDialogFragment.requireActivity().finishAffinity();
        return Unit.INSTANCE;
    }

    /* compiled from: ForceUpdateDialogFragment.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\b\t\n\u000bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&\u0082\u0001\u0004\f\r\u000e\u000f¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/configurationvitals/prompt/ForceUpdateDialogFragment$Action;", "", "<init>", "()V", "execute", "", "activity", "Landroidx/fragment/app/FragmentActivity;", "Url", "Cancel", "OpenPlayStore", BentoAlertSheet6.button2Title, "Lcom/robinhood/android/configurationvitals/prompt/ForceUpdateDialogFragment$Action$Cancel;", "Lcom/robinhood/android/configurationvitals/prompt/ForceUpdateDialogFragment$Action$Dismiss;", "Lcom/robinhood/android/configurationvitals/prompt/ForceUpdateDialogFragment$Action$OpenPlayStore;", "Lcom/robinhood/android/configurationvitals/prompt/ForceUpdateDialogFragment$Action$Url;", "lib-configuration-vitals-prompt_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes2.dex */
    public static abstract class Action {
        public static final int $stable = 0;

        public /* synthetic */ Action(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public abstract void execute(FragmentActivity activity);

        private Action() {
        }

        /* compiled from: ForceUpdateDialogFragment.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/configurationvitals/prompt/ForceUpdateDialogFragment$Action$Url;", "Lcom/robinhood/android/configurationvitals/prompt/ForceUpdateDialogFragment$Action;", "url", "", "<init>", "(Ljava/lang/String;)V", "getUrl", "()Ljava/lang/String;", "execute", "", "activity", "Landroidx/fragment/app/FragmentActivity;", "lib-configuration-vitals-prompt_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Url extends Action {
            public static final int $stable = 0;
            private final String url;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Url(String url) {
                super(null);
                Intrinsics.checkNotNullParameter(url, "url");
                this.url = url;
            }

            public final String getUrl() {
                return this.url;
            }

            @Override // com.robinhood.android.configurationvitals.prompt.ForceUpdateDialogFragment.Action
            public void execute(FragmentActivity activity) {
                Intrinsics.checkNotNullParameter(activity, "activity");
                WebUtils.viewUrl$default(activity, this.url, 0, 4, (Object) null);
            }
        }

        /* compiled from: ForceUpdateDialogFragment.kt */
        @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/configurationvitals/prompt/ForceUpdateDialogFragment$Action$Cancel;", "Lcom/robinhood/android/configurationvitals/prompt/ForceUpdateDialogFragment$Action;", "<init>", "()V", "execute", "", "activity", "Landroidx/fragment/app/FragmentActivity;", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-configuration-vitals-prompt_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Cancel extends Action {
            public static final int $stable = 0;
            public static final Cancel INSTANCE = new Cancel();

            public boolean equals(Object other) {
                return this == other || (other instanceof Cancel);
            }

            public int hashCode() {
                return -375759989;
            }

            public String toString() {
                return "Cancel";
            }

            private Cancel() {
                super(null);
            }

            @Override // com.robinhood.android.configurationvitals.prompt.ForceUpdateDialogFragment.Action
            public void execute(FragmentActivity activity) {
                Intrinsics.checkNotNullParameter(activity, "activity");
                activity.finishAffinity();
            }
        }

        /* compiled from: ForceUpdateDialogFragment.kt */
        @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/configurationvitals/prompt/ForceUpdateDialogFragment$Action$OpenPlayStore;", "Lcom/robinhood/android/configurationvitals/prompt/ForceUpdateDialogFragment$Action;", "<init>", "()V", "execute", "", "activity", "Landroidx/fragment/app/FragmentActivity;", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-configuration-vitals-prompt_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class OpenPlayStore extends Action {
            public static final int $stable = 0;
            public static final OpenPlayStore INSTANCE = new OpenPlayStore();

            public boolean equals(Object other) {
                return this == other || (other instanceof OpenPlayStore);
            }

            public int hashCode() {
                return 15268018;
            }

            public String toString() {
                return "OpenPlayStore";
            }

            private OpenPlayStore() {
                super(null);
            }

            @Override // com.robinhood.android.configurationvitals.prompt.ForceUpdateDialogFragment.Action
            public void execute(FragmentActivity activity) {
                Intrinsics.checkNotNullParameter(activity, "activity");
                if (GooglePlay.INSTANCE.launchStore(activity)) {
                    return;
                }
                Toast.makeText(activity, activity.getResources().getString(C11048R.string.force_update_error_no_play_store, "Robinhood"), 1).show();
                activity.finish();
            }
        }

        /* compiled from: ForceUpdateDialogFragment.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/configurationvitals/prompt/ForceUpdateDialogFragment$Action$Dismiss;", "Lcom/robinhood/android/configurationvitals/prompt/ForceUpdateDialogFragment$Action;", "lastVitalsDismissPref", "Lcom/robinhood/prefs/StringPreference;", "<init>", "(Lcom/robinhood/prefs/StringPreference;)V", "execute", "", "activity", "Landroidx/fragment/app/FragmentActivity;", "lib-configuration-vitals-prompt_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Dismiss extends Action {
            public static final int $stable = 8;
            private final StringPreference lastVitalsDismissPref;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Dismiss(StringPreference lastVitalsDismissPref) {
                super(null);
                Intrinsics.checkNotNullParameter(lastVitalsDismissPref, "lastVitalsDismissPref");
                this.lastVitalsDismissPref = lastVitalsDismissPref;
            }

            @Override // com.robinhood.android.configurationvitals.prompt.ForceUpdateDialogFragment.Action
            public void execute(FragmentActivity activity) {
                Intrinsics.checkNotNullParameter(activity, "activity");
                this.lastVitalsDismissPref.set(LocalDateTime.now().toString());
            }
        }
    }

    /* compiled from: ForceUpdateDialogFragment.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/configurationvitals/prompt/ForceUpdateDialogFragment$Args;", "Landroid/os/Parcelable;", "unsupportedVersionContent", "Lcom/robinhood/models/api/UnsupportedVersionContent;", "<init>", "(Lcom/robinhood/models/api/UnsupportedVersionContent;)V", "getUnsupportedVersionContent", "()Lcom/robinhood/models/api/UnsupportedVersionContent;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-configuration-vitals-prompt_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes2.dex */
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final UnsupportedVersionContent unsupportedVersionContent;

        /* compiled from: ForceUpdateDialogFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args((UnsupportedVersionContent) parcel.readParcelable(Args.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, UnsupportedVersionContent unsupportedVersionContent, int i, Object obj) {
            if ((i & 1) != 0) {
                unsupportedVersionContent = args.unsupportedVersionContent;
            }
            return args.copy(unsupportedVersionContent);
        }

        /* renamed from: component1, reason: from getter */
        public final UnsupportedVersionContent getUnsupportedVersionContent() {
            return this.unsupportedVersionContent;
        }

        public final Args copy(UnsupportedVersionContent unsupportedVersionContent) {
            Intrinsics.checkNotNullParameter(unsupportedVersionContent, "unsupportedVersionContent");
            return new Args(unsupportedVersionContent);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Args) && Intrinsics.areEqual(this.unsupportedVersionContent, ((Args) other).unsupportedVersionContent);
        }

        public int hashCode() {
            return this.unsupportedVersionContent.hashCode();
        }

        public String toString() {
            return "Args(unsupportedVersionContent=" + this.unsupportedVersionContent + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.unsupportedVersionContent, flags);
        }

        public Args(UnsupportedVersionContent unsupportedVersionContent) {
            Intrinsics.checkNotNullParameter(unsupportedVersionContent, "unsupportedVersionContent");
            this.unsupportedVersionContent = unsupportedVersionContent;
        }

        public final UnsupportedVersionContent getUnsupportedVersionContent() {
            return this.unsupportedVersionContent;
        }
    }

    /* compiled from: ForceUpdateDialogFragment.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/configurationvitals/prompt/ForceUpdateDialogFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/configurationvitals/prompt/ForceUpdateDialogFragment;", "Lcom/robinhood/android/configurationvitals/prompt/ForceUpdateDialogFragment$Args;", "Lcom/robinhood/android/configurationvitals/ForceUpdatePrompt;", "<init>", "()V", "DIALOG_TAG", "", "show", "", "activity", "Landroidx/fragment/app/FragmentActivity;", "unsupportedVersionContent", "Lcom/robinhood/models/api/UnsupportedVersionContent;", "dismiss", "lib-configuration-vitals-prompt_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<ForceUpdateDialogFragment, Args>, ForceUpdatePrompt {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(ForceUpdateDialogFragment forceUpdateDialogFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, forceUpdateDialogFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public ForceUpdateDialogFragment newInstance(Args args) {
            return (ForceUpdateDialogFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(ForceUpdateDialogFragment forceUpdateDialogFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, forceUpdateDialogFragment, args);
        }

        @Override // com.robinhood.android.configurationvitals.ForceUpdatePrompt
        public void show(FragmentActivity activity, UnsupportedVersionContent unsupportedVersionContent) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intrinsics.checkNotNullParameter(unsupportedVersionContent, "unsupportedVersionContent");
            if (!(activity instanceof BaseActivity)) {
                Timber.INSTANCE.mo3350d("ForceUpdateDialogFragment can only be shown from BaseActivity", new Object[0]);
                return;
            }
            BaseActivity baseActivity = (BaseActivity) activity;
            if (baseActivity.getSupportFragmentManager().findFragmentByTag(ForceUpdateDialogFragment.DIALOG_TAG) == null) {
                ((ForceUpdateDialogFragment) newInstance((Parcelable) new Args(unsupportedVersionContent))).showNow(baseActivity.getSupportFragmentManager(), ForceUpdateDialogFragment.DIALOG_TAG);
            }
        }

        @Override // com.robinhood.android.configurationvitals.ForceUpdatePrompt
        public void dismiss(FragmentActivity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Fragment fragmentFindFragmentByTag = activity.getSupportFragmentManager().findFragmentByTag(ForceUpdateDialogFragment.DIALOG_TAG);
            ForceUpdateDialogFragment forceUpdateDialogFragment = fragmentFindFragmentByTag instanceof ForceUpdateDialogFragment ? (ForceUpdateDialogFragment) fragmentFindFragmentByTag : null;
            if (forceUpdateDialogFragment != null) {
                forceUpdateDialogFragment.dismiss();
            }
        }
    }
}
