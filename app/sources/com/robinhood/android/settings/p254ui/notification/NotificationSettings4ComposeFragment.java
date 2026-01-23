package com.robinhood.android.settings.p254ui.notification;

import android.content.Context;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.common.util.p090rx.ActivityErrorHandler;
import com.robinhood.android.navigation.FragmentResolverWithArgsCompanion;
import com.robinhood.android.navigation.fragment.DialogFragments;
import com.robinhood.android.settings.p254ui.notification.NotificationSettingsMultipleChoiceBottomSheetFragment;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.scarlet.ScarletContextWrapper;
import com.robinhood.shared.settings.contracts.NotificationSettings4ComposeFragmentKey;
import com.robinhood.shared.settings.contracts.NotificationSettings4FragmentKey;
import com.robinhood.shared.settings.contracts.NotificationSettings4FragmentKey3;
import com.robinhood.shared.settings.contracts.NotificationSettings4FragmentKey4;
import com.robinhood.shared.settings.iibsettings.NotificationSettingsCallbacks;
import com.robinhood.userleap.SurveyManager3;
import com.robinhood.userleap.survey.Survey;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.DialogFragmentWithArgsCompanion;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KFunction;
import kotlin.reflect.KProperty;
import kotlin.text.StringsKt;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.ImmutableSet3;
import kotlinx.collections.immutable.extensions2;
import p479j$.time.Instant;
import p479j$.time.ZoneId;
import p479j$.time.format.DateTimeFormatter;

/* compiled from: NotificationSettings4ComposeFragment.kt */
@Metadata(m3635d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\b\u0002\b\u0007\u0018\u0000 42\u00020\u00012\u00020\u0002:\u00014B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&H\u0016J\r\u0010'\u001a\u00020$H\u0017¢\u0006\u0002\u0010(J\u0010\u0010)\u001a\u00020$2\u0006\u0010*\u001a\u00020+H\u0002J\u0010\u0010,\u001a\u00020$2\u0006\u0010-\u001a\u00020.H\u0002J&\u0010/\u001a\u00020$2\u0006\u00100\u001a\u00020\u001e2\u0006\u00101\u001a\u00020\u001e2\f\u00102\u001a\b\u0012\u0004\u0012\u00020\u001e03H\u0016R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u0011\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u0018X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\u0018X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\u001e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0016\u0010!\u001a\u0004\u0018\u00010\u001e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010 ¨\u00065"}, m3636d2 = {"Lcom/robinhood/android/settings/ui/notification/NotificationSettings4ComposeFragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "Lcom/robinhood/android/settings/ui/notification/NotificationSettingsMultipleChoiceBottomSheetFragment$Callbacks;", "<init>", "()V", "userLeapManager", "Lcom/robinhood/userleap/UserLeapManager;", "getUserLeapManager", "()Lcom/robinhood/userleap/UserLeapManager;", "setUserLeapManager", "(Lcom/robinhood/userleap/UserLeapManager;)V", "callbacks", "Lcom/robinhood/shared/settings/iibsettings/NotificationSettingsCallbacks;", "getCallbacks", "()Lcom/robinhood/shared/settings/iibsettings/NotificationSettingsCallbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "duxo", "Lcom/robinhood/android/settings/ui/notification/NotificationSettings4ComposeDuxo;", "getDuxo", "()Lcom/robinhood/android/settings/ui/notification/NotificationSettings4ComposeDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "toolbarVisible", "", "getToolbarVisible", "()Z", "popNearestParentBackStackOnBackPressed", "getPopNearestParentBackStackOnBackPressed", "screenName", "", "getScreenName", "()Ljava/lang/String;", "screenDescription", "getScreenDescription", "onAttach", "", "context", "Landroid/content/Context;", "ComposeContent", "(Landroidx/compose/runtime/Composer;I)V", "onSubPageClicked", "subPageReference", "Lcom/robinhood/shared/settings/contracts/SubPageReference;", "onBottomSheetEntryPointRowClick", "entryPointRow", "Lcom/robinhood/shared/settings/contracts/ViewType$BottomSheetEntryPointRow;", "onBottomSheetMultipleChoiceSelectionCompleted", "itemId", "parentId", "selectedValues", "", "Companion", "feature-settings_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
public final class NotificationSettings4ComposeFragment extends GenericComposeFragment implements NotificationSettingsMultipleChoiceBottomSheetFragment.Callbacks {

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(NotificationSettingsCallbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.settings.ui.notification.NotificationSettings4ComposeFragment$special$$inlined$parentFragmentCallbacks$1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Fragment CallbacksProperty) {
            Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
            Fragment fragmentRequireParentFragment = CallbacksProperty.requireParentFragment();
            Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "requireParentFragment(...)");
            return fragmentRequireParentFragment;
        }
    });

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo = DuxosKt.duxo(this, NotificationSettings4ComposeDuxo.class);
    private final boolean popNearestParentBackStackOnBackPressed = true;
    private final boolean toolbarVisible;
    public SurveyManager3 userLeapManager;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(NotificationSettings4ComposeFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/shared/settings/iibsettings/NotificationSettingsCallbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$7(NotificationSettings4ComposeFragment notificationSettings4ComposeFragment, int i, Composer composer, int i2) {
        notificationSettings4ComposeFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public final SurveyManager3 getUserLeapManager() {
        SurveyManager3 surveyManager3 = this.userLeapManager;
        if (surveyManager3 != null) {
            return surveyManager3;
        }
        Intrinsics.throwUninitializedPropertyAccessException("userLeapManager");
        return null;
    }

    public final void setUserLeapManager(SurveyManager3 surveyManager3) {
        Intrinsics.checkNotNullParameter(surveyManager3, "<set-?>");
        this.userLeapManager = surveyManager3;
    }

    private final NotificationSettingsCallbacks getCallbacks() {
        return (NotificationSettingsCallbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    private final NotificationSettings4ComposeDuxo getDuxo() {
        return (NotificationSettings4ComposeDuxo) this.duxo.getValue();
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getToolbarVisible() {
        return this.toolbarVisible;
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public boolean getPopNearestParentBackStackOnBackPressed() {
        return this.popNearestParentBackStackOnBackPressed;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.util.UiCallbacks.ScreenViewAnalyticable
    public String getScreenName() {
        return getDuxo().getScreenName();
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.util.UiCallbacks.ScreenViewAnalyticable
    public String getScreenDescription() {
        return getDuxo().getScreenDescription();
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, com.robinhood.hammer.android.fragment.HammerFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        ScarletContextWrapper scarletContextWrapper = new ScarletContextWrapper(context, null, null, 6, null);
        putDesignSystemOverlay(scarletContextWrapper);
        setScarletContextWrapper(scarletContextWrapper);
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1739885025);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1739885025, i2, -1, "com.robinhood.android.settings.ui.notification.NotificationSettings4ComposeFragment.ComposeContent (NotificationSettings4ComposeFragment.kt:58)");
            }
            NotificationSettingsCallbacks callbacks = getCallbacks();
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(callbacks);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new NotificationSettings4ComposeFragment2(callbacks);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            Function1 function1 = (Function1) ((KFunction) objRememberedValue);
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(this);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new NotificationSettings4ComposeFragment3(this);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceGroup();
            Function1 function12 = (Function1) ((KFunction) objRememberedValue2);
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChangedInstance3 = composerStartRestartGroup.changedInstance(this);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new Function0() { // from class: com.robinhood.android.settings.ui.notification.NotificationSettings4ComposeFragment$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return NotificationSettings4ComposeFragment.ComposeContent$lambda$4$lambda$3(this.f$0);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            Function0 function0 = (Function0) objRememberedValue3;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChangedInstance4 = composerStartRestartGroup.changedInstance(this);
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance4 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue4 = new NotificationSettings4ComposeFragment4(this);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            composerStartRestartGroup.endReplaceGroup();
            Function1 function13 = (Function1) ((KFunction) objRememberedValue4);
            ActivityErrorHandler activityErrorHandler = getActivityErrorHandler();
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChangedInstance5 = composerStartRestartGroup.changedInstance(activityErrorHandler);
            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance5 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue5 = new NotificationSettings4ComposeFragment5(activityErrorHandler);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            }
            composerStartRestartGroup.endReplaceGroup();
            NotificationSettings4Composable2.NotificationSettings4Composable(function1, function12, function0, function13, (Function1) objRememberedValue5, getDuxo(), composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.settings.ui.notification.NotificationSettings4ComposeFragment$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return NotificationSettings4ComposeFragment.ComposeContent$lambda$7(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$4$lambda$3(NotificationSettings4ComposeFragment notificationSettings4ComposeFragment) {
        notificationSettings4ComposeFragment.getUserLeapManager().presentSurveyIfNecessary(notificationSettings4ComposeFragment, Survey.CRYPTO_ALERT_CHURN_SETTING);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onSubPageClicked(NotificationSettings4FragmentKey3 subPageReference) {
        if (Intrinsics.areEqual(subPageReference.getId(), NotificationSettings4FragmentKey.SETTINGS_MUTED)) {
            getCallbacks().onNotificationSettings4MutedClicked();
        } else {
            getCallbacks().onNotificationSettings4SubPageClicked(subPageReference);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onBottomSheetEntryPointRowClick(NotificationSettings4FragmentKey4.BottomSheetEntryPointRow entryPointRow) {
        String headerText;
        String subheaderText;
        ImmutableSet3 immutableSet3PersistentSetOf;
        String str;
        NotificationSettingsMultipleChoiceBottomSheetFragment.Args args;
        String preselectValue;
        Screen screen = new Screen(null, getDuxo().getScreenDescription(), getDuxo().getScreenName(), null, 9, null);
        if (entryPointRow instanceof NotificationSettings4FragmentKey4.BottomSheetEntryPointRow.BottomSheetMultipleChoiceRow) {
            NotificationSettings4FragmentKey4.BottomSheetEntryPointRow.BottomSheetMultipleChoiceRow bottomSheetMultipleChoiceRow = (NotificationSettings4FragmentKey4.BottomSheetEntryPointRow.BottomSheetMultipleChoiceRow) entryPointRow;
            NotificationSettings4FragmentKey4.BottomSheetEntryPointRow.BottomSheetMultipleChoiceRow.BottomSheetData bottomSheetData = bottomSheetMultipleChoiceRow.getBottomSheetData();
            String parentId = bottomSheetMultipleChoiceRow.getParentId();
            String id = bottomSheetMultipleChoiceRow.getId();
            String headerText2 = bottomSheetData.getHeaderText();
            List<NotificationSettings4FragmentKey4.BottomSheetEntryPointRow.BottomSheetMultipleChoiceRow.OptionItem> choices = bottomSheetData.getChoices();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(choices, 10));
            for (NotificationSettings4FragmentKey4.BottomSheetEntryPointRow.BottomSheetMultipleChoiceRow.OptionItem optionItem : choices) {
                arrayList.add(new NotificationSettingsMultipleChoiceBottomSheetFragment.Args.ChoiceItem(optionItem.getValue(), optionItem.getDisplayTitle()));
            }
            args = new NotificationSettingsMultipleChoiceBottomSheetFragment.Args(screen, parentId, id, headerText2, null, extensions2.toImmutableList(arrayList), extensions2.toImmutableSet(bottomSheetData.getSelectedValues()), bottomSheetData.getCanSelectMultiple(), bottomSheetMultipleChoiceRow.getId());
        } else {
            if (!(entryPointRow instanceof NotificationSettings4FragmentKey4.BottomSheetEntryPointRow.SnoozeBottomSheetMultipleChoiceRow)) {
                throw new NoWhenBranchMatchedException();
            }
            NotificationSettings4FragmentKey4.BottomSheetEntryPointRow.SnoozeBottomSheetMultipleChoiceRow snoozeBottomSheetMultipleChoiceRow = (NotificationSettings4FragmentKey4.BottomSheetEntryPointRow.SnoozeBottomSheetMultipleChoiceRow) entryPointRow;
            NotificationSettings4FragmentKey4.BottomSheetEntryPointRow.SnoozeBottomSheetMultipleChoiceRow.SnoozeBottomSheetData bottomSheetData2 = snoozeBottomSheetMultipleChoiceRow.getBottomSheetData();
            NotificationSettings4FragmentKey4.BottomSheetEntryPointRow.SnoozeBottomSheetMultipleChoiceRow.SnoozeOptionItem snoozeOptionItem = (NotificationSettings4FragmentKey4.BottomSheetEntryPointRow.SnoozeBottomSheetMultipleChoiceRow.SnoozeOptionItem) CollectionsKt.firstOrNull((List) snoozeBottomSheetMultipleChoiceRow.getSelectedItems());
            if (snoozeOptionItem != null && snoozeOptionItem.getUseSnoozeDisplayHeaders()) {
                headerText = bottomSheetData2.getAdjustSnoozeHeaderText();
                String str2 = Instant.ofEpochSecond(bottomSheetData2.getLastSelectedAtSeconds() + snoozeOptionItem.getSnoozeDurationInSeconds()).atZone(ZoneId.systemDefault()).format(DateTimeFormatter.ofPattern("MMMM d"));
                String adjustSnoozeSubheaderText = bottomSheetData2.getAdjustSnoozeSubheaderText();
                Intrinsics.checkNotNull(str2);
                subheaderText = StringsKt.replace$default(adjustSnoozeSubheaderText, "{$date}", str2, false, 4, (Object) null);
            } else {
                headerText = bottomSheetData2.getHeaderText();
                subheaderText = bottomSheetData2.getSubheaderText();
            }
            String str3 = headerText;
            String str4 = subheaderText;
            List listCreateListBuilder = CollectionsKt.createListBuilder();
            if (snoozeOptionItem != null && snoozeOptionItem.getIfSelectedIncludeKeepCurrentSnoozeOption()) {
                NotificationSettings4FragmentKey4.BottomSheetEntryPointRow.SnoozeBottomSheetMultipleChoiceRow.KeepCurrentOptionItem keepCurrentOptionItem = bottomSheetData2.getKeepCurrentOptionItem();
                listCreateListBuilder.add(new NotificationSettingsMultipleChoiceBottomSheetFragment.Args.ChoiceItem(keepCurrentOptionItem.getValue(), keepCurrentOptionItem.getDisplayTitle()));
            }
            for (NotificationSettings4FragmentKey4.BottomSheetEntryPointRow.SnoozeBottomSheetMultipleChoiceRow.SnoozeOptionItem snoozeOptionItem2 : bottomSheetData2.getChoices()) {
                listCreateListBuilder.add(new NotificationSettingsMultipleChoiceBottomSheetFragment.Args.ChoiceItem(snoozeOptionItem2.getValue(), snoozeOptionItem2.getDisplayTitle()));
            }
            ImmutableList immutableList = extensions2.toImmutableList(CollectionsKt.build(listCreateListBuilder));
            String parentId2 = snoozeBottomSheetMultipleChoiceRow.getParentId();
            String id2 = snoozeBottomSheetMultipleChoiceRow.getId();
            if (snoozeOptionItem == null || (preselectValue = snoozeOptionItem.getPreselectValue()) == null || (immutableSet3PersistentSetOf = extensions2.persistentSetOf(preselectValue)) == null) {
                immutableSet3PersistentSetOf = extensions2.persistentSetOf();
            }
            ImmutableSet3 immutableSet3 = immutableSet3PersistentSetOf;
            if (snoozeOptionItem != null && snoozeOptionItem.getUseSnoozeDisplayHeaders()) {
                str = snoozeBottomSheetMultipleChoiceRow.getId() + "_snooze_adjust";
            } else {
                str = snoozeBottomSheetMultipleChoiceRow.getId() + "_snooze_select";
            }
            args = new NotificationSettingsMultipleChoiceBottomSheetFragment.Args(screen, parentId2, id2, str3, str4, immutableList, immutableSet3, false, str);
        }
        DialogFragment dialogFragmentNewInstance$default = DialogFragmentWithArgsCompanion.DefaultImpls.newInstance$default(NotificationSettingsMultipleChoiceBottomSheetFragment.INSTANCE, args, 0, 2, null);
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        DialogFragments.showIfNotFound(dialogFragmentNewInstance$default, childFragmentManager, "multipleChoiceBottomSheet");
    }

    @Override // com.robinhood.android.settings.ui.notification.NotificationSettingsMultipleChoiceBottomSheetFragment.Callbacks
    public void onBottomSheetMultipleChoiceSelectionCompleted(String itemId, String parentId, Set<String> selectedValues) {
        Intrinsics.checkNotNullParameter(itemId, "itemId");
        Intrinsics.checkNotNullParameter(parentId, "parentId");
        Intrinsics.checkNotNullParameter(selectedValues, "selectedValues");
        getDuxo().onBottomSheetMultipleChoiceSelectionCompleted(itemId, parentId, selectedValues);
    }

    /* compiled from: NotificationSettings4ComposeFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/settings/ui/notification/NotificationSettings4ComposeFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolverWithArgsCompanion;", "Lcom/robinhood/android/settings/ui/notification/NotificationSettings4ComposeFragment;", "Lcom/robinhood/shared/settings/contracts/NotificationSettings4ComposeFragmentKey;", "<init>", "()V", "feature-settings_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolverWithArgsCompanion<NotificationSettings4ComposeFragment, NotificationSettings4ComposeFragmentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolverWithArgsCompanion, com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(NotificationSettings4ComposeFragmentKey notificationSettings4ComposeFragmentKey) {
            return FragmentResolverWithArgsCompanion.DefaultImpls.createFragment(this, notificationSettings4ComposeFragmentKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public NotificationSettings4ComposeFragmentKey getArgs(NotificationSettings4ComposeFragment notificationSettings4ComposeFragment) {
            return (NotificationSettings4ComposeFragmentKey) FragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, notificationSettings4ComposeFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public NotificationSettings4ComposeFragment newInstance(NotificationSettings4ComposeFragmentKey notificationSettings4ComposeFragmentKey) {
            return (NotificationSettings4ComposeFragment) FragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, notificationSettings4ComposeFragmentKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(NotificationSettings4ComposeFragment notificationSettings4ComposeFragment, NotificationSettings4ComposeFragmentKey notificationSettings4ComposeFragmentKey) {
            FragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, notificationSettings4ComposeFragment, notificationSettings4ComposeFragmentKey);
        }
    }
}
