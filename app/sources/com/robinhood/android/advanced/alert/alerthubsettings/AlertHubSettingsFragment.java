package com.robinhood.android.advanced.alert.alerthubsettings;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocal3;
import androidx.compose.runtime.CompositionLocal6;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.AutoLoggableFragment;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.common.util.p090rx.ActivityErrorHandler;
import com.robinhood.android.education.contracts.AdvancedAlert4;
import com.robinhood.android.education.contracts.AlertHubSettingsKey;
import com.robinhood.android.navigation.FragmentResolver;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.models.advanced.alert.p302db.AlertHubSettings2;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.scarlet.ScarletManager;
import com.robinhood.utils.compose.LocalActivity3;
import com.robinhood.utils.extensions.ContextSystemServices;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;

/* compiled from: AlertHubSettingsFragment.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u001d2\u00020\u00012\u00020\u0002:\u0002\u001c\u001dB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u0016H\u0016J\r\u0010\u001a\u001a\u00020\u0016H\u0017¢\u0006\u0002\u0010\u001bR\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001e\u0010\u000b\u001a\u00020\f8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/android/advanced/alert/alerthubsettings/AlertHubSettingsFragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "Lcom/robinhood/android/autoeventlogging/AutoLoggableFragment;", "<init>", "()V", "duxo", "Lcom/robinhood/android/advanced/alert/alerthubsettings/AlertHubSettingsDuxo;", "getDuxo", "()Lcom/robinhood/android/advanced/alert/alerthubsettings/AlertHubSettingsDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "getEventLogger", "()Lcom/robinhood/analytics/EventLogger;", "setEventLogger", "(Lcom/robinhood/analytics/EventLogger;)V", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "configureToolbar", "", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "onResume", "ComposeContent", "(Landroidx/compose/runtime/Composer;I)V", "Args", "Companion", "feature-lib-advanced-alert_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes24.dex */
public final class AlertHubSettingsFragment extends GenericComposeFragment implements AutoLoggableFragment {

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo = DuxosKt.duxo(this, AlertHubSettingsDuxo.class);
    public EventLogger eventLogger;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$0(AlertHubSettingsFragment alertHubSettingsFragment, int i, Composer composer, int i2) {
        alertHubSettingsFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenAppearEventLogging() {
        return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenAppearEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenDisappearEventLogging() {
        return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenDisappearEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenEventLogging() {
        return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenSourceEventLogging() {
        return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenSourceEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Component getScreenEventComponent() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventComponent(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Context getScreenEventContext() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventContext(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public UserInteractionEventData getScreenEventData() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventData(this);
    }

    private final AlertHubSettingsDuxo getDuxo() {
        return (AlertHubSettingsDuxo) this.duxo.getValue();
    }

    public final EventLogger getEventLogger() {
        EventLogger eventLogger = this.eventLogger;
        if (eventLogger != null) {
            return eventLogger;
        }
        Intrinsics.throwUninitializedPropertyAccessException("eventLogger");
        return null;
    }

    public final void setEventLogger(EventLogger eventLogger) {
        Intrinsics.checkNotNullParameter(eventLogger, "<set-?>");
        this.eventLogger = eventLogger;
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Screen getEventScreen() {
        return new Screen(Screen.Name.ALERT_HUB_SETTING, null, null, null, 14, null);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        requireBaseActivity().hideToolbar();
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        AlertHubSettingsDuxo duxo = getDuxo();
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        duxo.updateAreNotificationsEnabled(ContextSystemServices.getNotificationManager(contextRequireContext).areNotificationsEnabled());
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1357769315);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1357769315, i2, -1, "com.robinhood.android.advanced.alert.alerthubsettings.AlertHubSettingsFragment.ComposeContent (AlertHubSettingsFragment.kt:45)");
            }
            CompositionLocal6<FragmentActivity> localActivity = LocalActivity3.getLocalActivity();
            FragmentActivity fragmentActivityRequireActivity = requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            CompositionLocal3.CompositionLocalProvider(localActivity.provides(fragmentActivityRequireActivity), ComposableLambda3.rememberComposableLambda(1310324957, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.advanced.alert.alerthubsettings.AlertHubSettingsFragment.ComposeContent.1
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
                        ComposerKt.traceEventStart(1310324957, i3, -1, "com.robinhood.android.advanced.alert.alerthubsettings.AlertHubSettingsFragment.ComposeContent.<anonymous> (AlertHubSettingsFragment.kt:49)");
                    }
                    Companion companion = AlertHubSettingsFragment.INSTANCE;
                    AlertHubSettings2 entityType = ((Args) companion.getArgs((Fragment) AlertHubSettingsFragment.this)).getEntityType();
                    AdvancedAlert4 entryPoint = ((Args) companion.getArgs((Fragment) AlertHubSettingsFragment.this)).getEntryPoint();
                    AlertHubSettingsFragment alertHubSettingsFragment = AlertHubSettingsFragment.this;
                    composer2.startReplaceGroup(5004770);
                    boolean zChangedInstance = composer2.changedInstance(alertHubSettingsFragment);
                    Object objRememberedValue = composer2.rememberedValue();
                    if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new AlertHubSettingsFragment2(alertHubSettingsFragment);
                        composer2.updateRememberedValue(objRememberedValue);
                    }
                    composer2.endReplaceGroup();
                    AlertHubSettingsComposable.AlertHubSettingsComposable(entityType, entryPoint, (Function1) ((KFunction) objRememberedValue), AlertHubSettingsFragment.this.getNavigator(), AlertHubSettingsFragment.this.getScarletManager(), AlertHubSettingsFragment.this.getActivityErrorHandler(), null, null, composer2, (ScarletManager.$stable << 12) | (ActivityErrorHandler.$stable << 15), 192);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, ProvidedValue.$stable | 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.advanced.alert.alerthubsettings.AlertHubSettingsFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AlertHubSettingsFragment.ComposeContent$lambda$0(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: AlertHubSettingsFragment.kt */
    @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/advanced/alert/alerthubsettings/AlertHubSettingsFragment$Args;", "Landroid/os/Parcelable;", "entityType", "Lcom/robinhood/models/advanced/alert/db/AlertHubSettingsEntityType;", "entryPoint", "Lcom/robinhood/android/education/contracts/AlertHubSettingsEntryPoint;", "<init>", "(Lcom/robinhood/models/advanced/alert/db/AlertHubSettingsEntityType;Lcom/robinhood/android/education/contracts/AlertHubSettingsEntryPoint;)V", "getEntityType", "()Lcom/robinhood/models/advanced/alert/db/AlertHubSettingsEntityType;", "getEntryPoint", "()Lcom/robinhood/android/education/contracts/AlertHubSettingsEntryPoint;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-lib-advanced-alert_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 0;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final AlertHubSettings2 entityType;
        private final AdvancedAlert4 entryPoint;

        /* compiled from: AlertHubSettingsFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args(AlertHubSettings2.valueOf(parcel.readString()), AdvancedAlert4.valueOf(parcel.readString()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, AlertHubSettings2 alertHubSettings2, AdvancedAlert4 advancedAlert4, int i, Object obj) {
            if ((i & 1) != 0) {
                alertHubSettings2 = args.entityType;
            }
            if ((i & 2) != 0) {
                advancedAlert4 = args.entryPoint;
            }
            return args.copy(alertHubSettings2, advancedAlert4);
        }

        /* renamed from: component1, reason: from getter */
        public final AlertHubSettings2 getEntityType() {
            return this.entityType;
        }

        /* renamed from: component2, reason: from getter */
        public final AdvancedAlert4 getEntryPoint() {
            return this.entryPoint;
        }

        public final Args copy(AlertHubSettings2 entityType, AdvancedAlert4 entryPoint) {
            Intrinsics.checkNotNullParameter(entityType, "entityType");
            Intrinsics.checkNotNullParameter(entryPoint, "entryPoint");
            return new Args(entityType, entryPoint);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Args)) {
                return false;
            }
            Args args = (Args) other;
            return this.entityType == args.entityType && this.entryPoint == args.entryPoint;
        }

        public int hashCode() {
            return (this.entityType.hashCode() * 31) + this.entryPoint.hashCode();
        }

        public String toString() {
            return "Args(entityType=" + this.entityType + ", entryPoint=" + this.entryPoint + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.entityType.name());
            dest.writeString(this.entryPoint.name());
        }

        public Args(AlertHubSettings2 entityType, AdvancedAlert4 entryPoint) {
            Intrinsics.checkNotNullParameter(entityType, "entityType");
            Intrinsics.checkNotNullParameter(entryPoint, "entryPoint");
            this.entityType = entityType;
            this.entryPoint = entryPoint;
        }

        public final AlertHubSettings2 getEntityType() {
            return this.entityType;
        }

        public final AdvancedAlert4 getEntryPoint() {
            return this.entryPoint;
        }
    }

    /* compiled from: AlertHubSettingsFragment.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0002H\u0016¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/advanced/alert/alerthubsettings/AlertHubSettingsFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolver;", "Lcom/robinhood/android/education/contracts/AlertHubSettingsKey;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/advanced/alert/alerthubsettings/AlertHubSettingsFragment;", "Lcom/robinhood/android/advanced/alert/alerthubsettings/AlertHubSettingsFragment$Args;", "<init>", "()V", "createFragment", "Landroidx/fragment/app/Fragment;", "key", "feature-lib-advanced-alert_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolver<AlertHubSettingsKey>, FragmentWithArgsCompanion<AlertHubSettingsFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(AlertHubSettingsFragment alertHubSettingsFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, alertHubSettingsFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public AlertHubSettingsFragment newInstance(Args args) {
            return (AlertHubSettingsFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(AlertHubSettingsFragment alertHubSettingsFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, alertHubSettingsFragment, args);
        }

        @Override // com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(AlertHubSettingsKey key) {
            Intrinsics.checkNotNullParameter(key, "key");
            return AlertHubSettingsFragment.INSTANCE.newInstance((Parcelable) new Args(key.getEntityType(), key.getEntryPoint()));
        }
    }
}
