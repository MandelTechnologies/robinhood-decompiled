package com.robinhood.android.settings.p254ui.notification;

import android.content.Context;
import android.net.Uri;
import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.TextLayoutResult;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocal3;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.FlowExtKt;
import androidx.lifecycle.compose.LocalLifecycleOwnerKt;
import androidx.view.OnBackPressedDispatcher;
import androidx.view.OnBackPressedDispatcherOwner;
import androidx.view.compose.BackHandler5;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.BentoRichText;
import com.robinhood.android.navigation.LocalNavigator;
import com.robinhood.android.navigation.NavigationType;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.settings.C28315R;
import com.robinhood.android.settings.p254ui.notification.NotificationSettings4Composable2;
import com.robinhood.android.settings.p254ui.notification.NotificationSettings4ComposeEvent;
import com.robinhood.android.settings.p254ui.notification.NotificationSettings4ComposeViewState;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.compose.bento.component.BentoAppBarKt;
import com.robinhood.compose.bento.component.BentoAppBarScope;
import com.robinhood.compose.bento.component.BentoDivider;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoProgressIndicator2;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.rows.BentoBaseRowKt;
import com.robinhood.compose.bento.component.rows.BentoBaseRowLayout;
import com.robinhood.compose.bento.component.rows.BentoBaseRowState;
import com.robinhood.compose.bento.component.rows.BentoSelectionRow2;
import com.robinhood.compose.bento.component.rows.BentoSelectionRowState;
import com.robinhood.compose.bento.component.rows.BentoToggleRow3;
import com.robinhood.compose.bento.component.rows.BentoToggleRowState;
import com.robinhood.compose.bento.component.text.BentoTextWithTrailingIcon;
import com.robinhood.compose.bento.component.text.BentoTextWithTrailingIconState;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.models.api.ApiNotificationSettingsToggleSettingsItem;
import com.robinhood.models.serverdriven.api.ApiGenericAction;
import com.robinhood.models.serverdriven.p347db.RichText;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.shared.settings.contracts.NotificationSettings4FragmentKey3;
import com.robinhood.shared.settings.contracts.NotificationSettings4FragmentKey4;
import com.robinhood.utils.resource.StringResource;
import com.robinhood.utils.resource.StringResources6;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.CoroutineContextImpl6;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.ImmutableMap;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;
import p479j$.time.Instant;
import p479j$.time.ZoneId;
import p479j$.time.format.DateTimeFormatter;

/* compiled from: NotificationSettings4Composable.kt */
@Metadata(m3635d1 = {"\u0000¢\u0001\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u001a\u0091\u0001\u0010\u0000\u001a\u00020\u00012!\u0010\u0002\u001a\u001d\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\u00010\u00032\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\u00032\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\u000b2!\u0010\f\u001a\u001d\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u00010\u00032\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00010\u00032\u0006\u0010\u0011\u001a\u00020\u0012H\u0001¢\u0006\u0002\u0010\u0013\u001a\r\u0010\u0014\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0015\u001av\u0010\u0016\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u00182\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00010\u00032K\u0010\u001a\u001aG\u0012\u0013\u0012\u00110\u001c¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u001d\u0012\u0013\u0012\u00110\u001c¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u001e\u0012\u0013\u0012\u00110\u001c¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u001f\u0012\u0004\u0012\u00020\u00010\u001bH\u0003¢\u0006\u0002\u0010 \u001a\u001d\u0010!\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\"2\u0006\u0010#\u001a\u00020$H\u0003¢\u0006\u0002\u0010%\u001a8\u0010&\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020'2!\u0010\f\u001a\u001d\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u00010\u0003H\u0003¢\u0006\u0002\u0010(\u001a\u001d\u0010)\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020*2\u0006\u0010+\u001a\u00020$H\u0003¢\u0006\u0002\u0010,\u001a8\u0010-\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020.2!\u0010\u0002\u001a\u001d\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\u00010\u0003H\u0003¢\u0006\u0002\u0010/\u001a\u0092\u0001\u00100\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u0002012\u0006\u00102\u001a\u00020$2\u0012\u00103\u001a\u000e\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u00020\u00010\u00032K\u00104\u001aG\u0012\u0013\u0012\u00110\u001c¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(5\u0012\u0013\u0012\u00110\u001c¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u001e\u0012\u0013\u0012\u001106¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(7\u0012\u0004\u0012\u00020\u00010\u001b2\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\u0003H\u0003¢\u0006\u0002\u00108\" \u00109\u001a\u0004\u0018\u00010:*\u00020\t8@X\u0081\u0004¢\u0006\f\u0012\u0004\b;\u0010<\u001a\u0004\b=\u0010>\"\u0018\u0010?\u001a\u00020\u001c*\u00020@8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bA\u0010B\"\u0016\u0010C\u001a\u00020\u001c8\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\bD\u0010E\"\u0016\u0010F\u001a\u00020\u001c8\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\bG\u0010E¨\u0006H²\u0006\n\u0010I\u001a\u00020JX\u008a\u0084\u0002²\u0006\u0012\u0010K\u001a\n\u0012\u0004\u0012\u00020M\u0018\u00010LX\u008a\u0084\u0002"}, m3636d2 = {"NotificationSettings4Composable", "", "onActionTriggered", "Lkotlin/Function1;", "Lcom/robinhood/models/serverdriven/api/ApiGenericAction;", "Lkotlin/ParameterName;", "name", "action", "onBottomSheetEntryPointRowClick", "Lcom/robinhood/shared/settings/contracts/ViewType$BottomSheetEntryPointRow;", "presentSurveyIfNecessary", "Lkotlin/Function0;", "onSubPageClicked", "Lcom/robinhood/shared/settings/contracts/SubPageReference;", "subPageReference", "onSettingsError", "", "duxo", "Lcom/robinhood/android/settings/ui/notification/NotificationSettings4ComposeDuxo;", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lcom/robinhood/android/settings/ui/notification/NotificationSettings4ComposeDuxo;Landroidx/compose/runtime/Composer;I)V", "Padding", "(Landroidx/compose/runtime/Composer;I)V", "RadioGroup", "state", "Lcom/robinhood/shared/settings/contracts/ViewType$RadioGroup;", "onRadioGroupAppeared", "onSettingsSelected", "Lkotlin/Function3;", "", "parentId", "itemId", "value", "(Lcom/robinhood/shared/settings/contracts/ViewType$RadioGroup;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)V", "SectionTitle", "Lcom/robinhood/shared/settings/contracts/ViewType$SectionTitle;", "isTop", "", "(Lcom/robinhood/shared/settings/contracts/ViewType$SectionTitle;ZLandroidx/compose/runtime/Composer;I)V", "SubPageEntry", "Lcom/robinhood/shared/settings/contracts/ViewType$SubPageEntry;", "(Lcom/robinhood/shared/settings/contracts/ViewType$SubPageEntry;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "RichTextSection", "Lcom/robinhood/shared/settings/contracts/ViewType$SubtitleRichText;", "isFirstItem", "(Lcom/robinhood/shared/settings/contracts/ViewType$SubtitleRichText;ZLandroidx/compose/runtime/Composer;I)V", "TitleSubtitle", "Lcom/robinhood/shared/settings/contracts/ViewType$TitleSubtitle;", "(Lcom/robinhood/shared/settings/contracts/ViewType$TitleSubtitle;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "Toggle", "Lcom/robinhood/shared/settings/contracts/ViewType$Toggle;", "isNextItemToggle", "onToggleAppeared", "onSettingsToggled", "sectionId", "Lcom/robinhood/models/api/ApiNotificationSettingsToggleSettingsItem$Status;", "status", "(Lcom/robinhood/shared/settings/contracts/ViewType$Toggle;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "selectedValueText", "Lcom/robinhood/utils/resource/StringResource;", "getSelectedValueText$annotations", "(Lcom/robinhood/shared/settings/contracts/ViewType$BottomSheetEntryPointRow;)V", "getSelectedValueText", "(Lcom/robinhood/shared/settings/contracts/ViewType$BottomSheetEntryPointRow;)Lcom/robinhood/utils/resource/StringResource;", "firstSelectedChoiceDisplayTitle", "Lcom/robinhood/shared/settings/contracts/ViewType$BottomSheetEntryPointRow$BottomSheetMultipleChoiceRow$BottomSheetData;", "getFirstSelectedChoiceDisplayTitle", "(Lcom/robinhood/shared/settings/contracts/ViewType$BottomSheetEntryPointRow$BottomSheetMultipleChoiceRow$BottomSheetData;)Ljava/lang/String;", NotificationSettings4Composable2.TEST_TAG_SECTION_TITLE_WITH_INFO_ICON, "getTEST_TAG_SECTION_TITLE_WITH_INFO_ICON$annotations", "()V", NotificationSettings4Composable2.TEST_TAG_LOADING_STATE, "getTEST_TAG_LOADING_STATE$annotations", "feature-settings_externalRelease", "viewState", "Lcom/robinhood/android/settings/ui/notification/NotificationSettings4ComposeViewState;", "event", "Lcom/robinhood/android/udf/event/Event;", "Lcom/robinhood/android/settings/ui/notification/NotificationSettings4ComposeEvent;"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.settings.ui.notification.NotificationSettings4ComposableKt, reason: use source file name */
/* loaded from: classes5.dex */
public final class NotificationSettings4Composable2 {
    public static final String TEST_TAG_LOADING_STATE = "TEST_TAG_LOADING_STATE";
    public static final String TEST_TAG_SECTION_TITLE_WITH_INFO_ICON = "TEST_TAG_SECTION_TITLE_WITH_INFO_ICON";

    /* compiled from: NotificationSettings4Composable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.settings.ui.notification.NotificationSettings4ComposableKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ApiNotificationSettingsToggleSettingsItem.Status.values().length];
            try {
                iArr[ApiNotificationSettingsToggleSettingsItem.Status.f5427ON.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ApiNotificationSettingsToggleSettingsItem.Status.OFF.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ApiNotificationSettingsToggleSettingsItem.Status.REQUIRED_ON.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit NotificationSettings4Composable$lambda$3(Function1 function1, Function1 function12, Function0 function0, Function1 function13, Function1 function14, NotificationSettings4ComposeDuxo notificationSettings4ComposeDuxo, int i, Composer composer, int i2) {
        NotificationSettings4Composable(function1, function12, function0, function13, function14, notificationSettings4ComposeDuxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Padding$lambda$4(int i, Composer composer, int i2) {
        Padding(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RadioGroup$lambda$6(NotificationSettings4FragmentKey4.RadioGroup radioGroup, Function1 function1, Function3 function3, int i, Composer composer, int i2) {
        RadioGroup(radioGroup, function1, function3, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RichTextSection$lambda$16(NotificationSettings4FragmentKey4.SubtitleRichText subtitleRichText, boolean z, int i, Composer composer, int i2) {
        RichTextSection(subtitleRichText, z, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SectionTitle$lambda$7(NotificationSettings4FragmentKey4.SectionTitle sectionTitle, boolean z, int i, Composer composer, int i2) {
        SectionTitle(sectionTitle, z, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SectionTitle$lambda$9(NotificationSettings4FragmentKey4.SectionTitle sectionTitle, boolean z, int i, Composer composer, int i2) {
        SectionTitle(sectionTitle, z, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SubPageEntry$lambda$12(NotificationSettings4FragmentKey4.SubPageEntry subPageEntry, Function1 function1, int i, Composer composer, int i2) {
        SubPageEntry(subPageEntry, function1, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TitleSubtitle$lambda$19(NotificationSettings4FragmentKey4.TitleSubtitle titleSubtitle, Function1 function1, int i, Composer composer, int i2) {
        TitleSubtitle(titleSubtitle, function1, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Toggle$lambda$25(NotificationSettings4FragmentKey4.Toggle toggle, boolean z, Function1 function1, Function3 function3, Function1 function12, int i, Composer composer, int i2) {
        Toggle(toggle, z, function1, function3, function12, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void getSelectedValueText$annotations(NotificationSettings4FragmentKey4.BottomSheetEntryPointRow bottomSheetEntryPointRow) {
    }

    public static /* synthetic */ void getTEST_TAG_LOADING_STATE$annotations() {
    }

    public static /* synthetic */ void getTEST_TAG_SECTION_TITLE_WITH_INFO_ICON$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NotificationSettings4ComposeViewState NotificationSettings4Composable$lambda$0(SnapshotState4<? extends NotificationSettings4ComposeViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    private static final Event<NotificationSettings4ComposeEvent> NotificationSettings4Composable$lambda$1(SnapshotState4<Event<NotificationSettings4ComposeEvent>> snapshotState4) {
        return snapshotState4.getValue();
    }

    public static final void NotificationSettings4Composable(final Function1<? super ApiGenericAction, Unit> onActionTriggered, final Function1<? super NotificationSettings4FragmentKey4.BottomSheetEntryPointRow, Unit> onBottomSheetEntryPointRowClick, final Function0<Unit> presentSurveyIfNecessary, final Function1<? super NotificationSettings4FragmentKey3, Unit> onSubPageClicked, final Function1<? super Throwable, Unit> onSettingsError, final NotificationSettings4ComposeDuxo duxo, Composer composer, final int i) {
        int i2;
        EventConsumer<NotificationSettings4ComposeEvent> eventConsumerInvoke;
        Intrinsics.checkNotNullParameter(onActionTriggered, "onActionTriggered");
        Intrinsics.checkNotNullParameter(onBottomSheetEntryPointRowClick, "onBottomSheetEntryPointRowClick");
        Intrinsics.checkNotNullParameter(presentSurveyIfNecessary, "presentSurveyIfNecessary");
        Intrinsics.checkNotNullParameter(onSubPageClicked, "onSubPageClicked");
        Intrinsics.checkNotNullParameter(onSettingsError, "onSettingsError");
        Intrinsics.checkNotNullParameter(duxo, "duxo");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1893233618);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(onActionTriggered) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onBottomSheetEntryPointRowClick) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(presentSurveyIfNecessary) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onSubPageClicked) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onSettingsError) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(duxo) ? 131072 : 65536;
        }
        if ((74899 & i2) != 74898 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1893233618, i2, -1, "com.robinhood.android.settings.ui.notification.NotificationSettings4Composable (NotificationSettings4Composable.kt:86)");
            }
            final SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(duxo.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
            final StateFlow<Event<NotificationSettings4ComposeEvent>> eventFlow = duxo.getEventFlow();
            composerStartRestartGroup.startReplaceGroup(-523522313);
            LifecycleOwner lifecycleOwner = (LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
            Lifecycle.State state = Lifecycle.State.STARTED;
            CoroutineContextImpl6 coroutineContextImpl6 = CoroutineContextImpl6.INSTANCE;
            Flow<Event<?>> flow = new Flow<Event<?>>() { // from class: com.robinhood.android.settings.ui.notification.NotificationSettings4ComposableKt$NotificationSettings4Composable$$inlined$collectEventAsStateWithLifecycle$1

                /* compiled from: Emitters.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.android.settings.ui.notification.NotificationSettings4ComposableKt$NotificationSettings4Composable$$inlined$collectEventAsStateWithLifecycle$1$2, reason: invalid class name */
                public static final class AnonymousClass2<T> implements FlowCollector {
                    final /* synthetic */ FlowCollector $this_unsafeFlow;

                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @DebugMetadata(m3644c = "com.robinhood.android.settings.ui.notification.NotificationSettings4ComposableKt$NotificationSettings4Composable$$inlined$collectEventAsStateWithLifecycle$1$2", m3645f = "NotificationSettings4Composable.kt", m3646l = {50}, m3647m = "emit")
                    /* renamed from: com.robinhood.android.settings.ui.notification.NotificationSettings4ComposableKt$NotificationSettings4Composable$$inlined$collectEventAsStateWithLifecycle$1$2$1, reason: invalid class name */
                    public static final class AnonymousClass1 extends ContinuationImpl {
                        Object L$0;
                        Object L$1;
                        int label;
                        /* synthetic */ Object result;

                        public AnonymousClass1(Continuation continuation) {
                            super(continuation);
                        }

                        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                        public final Object invokeSuspend(Object obj) {
                            this.result = obj;
                            this.label |= Integer.MIN_VALUE;
                            return AnonymousClass2.this.emit(null, this);
                        }
                    }

                    public AnonymousClass2(FlowCollector flowCollector) {
                        this.$this_unsafeFlow = flowCollector;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final Object emit(Object obj, Continuation continuation) {
                        AnonymousClass1 anonymousClass1;
                        if (continuation instanceof AnonymousClass1) {
                            anonymousClass1 = (AnonymousClass1) continuation;
                            int i = anonymousClass1.label;
                            if ((i & Integer.MIN_VALUE) != 0) {
                                anonymousClass1.label = i - Integer.MIN_VALUE;
                            } else {
                                anonymousClass1 = new AnonymousClass1(continuation);
                            }
                        }
                        Object obj2 = anonymousClass1.result;
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i2 = anonymousClass1.label;
                        if (i2 == 0) {
                            ResultKt.throwOnFailure(obj2);
                            FlowCollector flowCollector = this.$this_unsafeFlow;
                            Event event = (Event) obj;
                            if ((event != null ? event.getData() : null) instanceof NotificationSettings4ComposeEvent) {
                                anonymousClass1.label = 1;
                                if (flowCollector.emit(obj, anonymousClass1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            }
                        } else {
                            if (i2 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj2);
                        }
                        return Unit.INSTANCE;
                    }
                }

                @Override // kotlinx.coroutines.flow.Flow
                public Object collect(FlowCollector<? super Event<?>> flowCollector, Continuation continuation) {
                    Object objCollect = eventFlow.collect(new AnonymousClass2(flowCollector), continuation);
                    return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                }
            };
            Event<NotificationSettings4ComposeEvent> value = eventFlow.getValue();
            Event<NotificationSettings4ComposeEvent> event = value;
            if (!((event != null ? event.getData() : null) instanceof NotificationSettings4ComposeEvent)) {
                value = null;
            }
            SnapshotState4 snapshotState4CollectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(flow, value, lifecycleOwner.getLifecycle(), state, coroutineContextImpl6, composerStartRestartGroup, 0, 0);
            composerStartRestartGroup = composerStartRestartGroup;
            composerStartRestartGroup.endReplaceGroup();
            final Event<NotificationSettings4ComposeEvent> eventNotificationSettings4Composable$lambda$1 = NotificationSettings4Composable$lambda$1(snapshotState4CollectAsStateWithLifecycle2);
            if (eventNotificationSettings4Composable$lambda$1 != null && (eventNotificationSettings4Composable$lambda$1.getData() instanceof NotificationSettings4ComposeEvent) && (eventConsumerInvoke = eventNotificationSettings4Composable$lambda$1.getGetEventConsumer().invoke()) != null) {
                eventConsumerInvoke.consume(eventNotificationSettings4Composable$lambda$1, new Function1() { // from class: com.robinhood.android.settings.ui.notification.NotificationSettings4ComposableKt$NotificationSettings4Composable$$inlined$consumeIfType$1
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        m18860invoke(obj);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m18860invoke(Object it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        NotificationSettings4ComposeEvent notificationSettings4ComposeEvent = (NotificationSettings4ComposeEvent) eventNotificationSettings4Composable$lambda$1.getData();
                        if (notificationSettings4ComposeEvent instanceof NotificationSettings4ComposeEvent.NotificationSettingsError) {
                            onSettingsError.invoke(((NotificationSettings4ComposeEvent.NotificationSettingsError) notificationSettings4ComposeEvent).getThrowable());
                            return;
                        }
                        if (notificationSettings4ComposeEvent instanceof NotificationSettings4ComposeEvent.OpenMultipleChoiceBottomSheet) {
                            onBottomSheetEntryPointRowClick.invoke(((NotificationSettings4ComposeEvent.OpenMultipleChoiceBottomSheet) notificationSettings4ComposeEvent).getBottomSheetRow());
                        } else if (notificationSettings4ComposeEvent instanceof NotificationSettings4ComposeEvent.PresentSurveyIfNecessary) {
                            presentSurveyIfNecessary.invoke();
                        } else {
                            if (!(notificationSettings4ComposeEvent instanceof NotificationSettings4ComposeEvent.OpenSubPageEntry)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            onSubPageClicked.invoke(((NotificationSettings4ComposeEvent.OpenSubPageEntry) notificationSettings4ComposeEvent).getReference());
                        }
                    }
                });
            }
            CompositionLocal3.CompositionLocalProvider(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor().provides(new UserInteractionEventDescriptor(null, new Screen(null, duxo.getScreenDescription(), duxo.getScreenName(), null, 9, null), null, null, null, null, 61, null)), ComposableLambda3.rememberComposableLambda(1095880558, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.settings.ui.notification.NotificationSettings4ComposableKt.NotificationSettings4Composable.2
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
                        ComposerKt.traceEventStart(1095880558, i3, -1, "com.robinhood.android.settings.ui.notification.NotificationSettings4Composable.<anonymous> (NotificationSettings4Composable.kt:105)");
                    }
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i4 = BentoTheme.$stable;
                    long jM21425getFg0d7_KjU = bentoTheme.getColors(composer2, i4).m21425getFg0d7_KjU();
                    long jM21371getBg0d7_KjU = bentoTheme.getColors(composer2, i4).m21371getBg0d7_KjU();
                    final SnapshotState4<NotificationSettings4ComposeViewState> snapshotState4 = snapshotState4CollectAsStateWithLifecycle;
                    ScaffoldKt.m5939ScaffoldTvnljyQ(null, ComposableLambda3.rememberComposableLambda(-17098198, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.settings.ui.notification.NotificationSettings4ComposableKt.NotificationSettings4Composable.2.1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer3, int i5) {
                            if ((i5 & 3) == 2 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-17098198, i5, -1, "com.robinhood.android.settings.ui.notification.NotificationSettings4Composable.<anonymous>.<anonymous> (NotificationSettings4Composable.kt:107)");
                            }
                            OnBackPressedDispatcherOwner current = BackHandler5.INSTANCE.getCurrent(composer3, BackHandler5.$stable);
                            OnBackPressedDispatcher onBackPressedDispatcher = current != null ? current.getOnBackPressedDispatcher() : null;
                            final SnapshotState4<NotificationSettings4ComposeViewState> snapshotState42 = snapshotState4;
                            BentoAppBarKt.m20573BentoAppBarSGdaT3c(ComposableLambda3.rememberComposableLambda(-810895075, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.settings.ui.notification.NotificationSettings4ComposableKt.NotificationSettings4Composable.2.1.1
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                    invoke(composer4, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer4, int i6) {
                                    if ((i6 & 3) == 2 && composer4.getSkipping()) {
                                        composer4.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-810895075, i6, -1, "com.robinhood.android.settings.ui.notification.NotificationSettings4Composable.<anonymous>.<anonymous>.<anonymous> (NotificationSettings4Composable.kt:110)");
                                    }
                                    BentoText2.m20747BentoText38GnDrw(StringResources6.getTextAsString(NotificationSettings4Composable2.NotificationSettings4Composable$lambda$0(snapshotState42).getToolbarTitle(), composer4, StringResource.$stable), null, null, null, null, null, null, 0, false, 0, 0, null, 0, BentoTheme.INSTANCE.getTypography(composer4, BentoTheme.$stable).getTextL(), composer4, 0, 0, 8190);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composer3, 54), null, ComposableLambda3.rememberComposableLambda(1482715465, true, new AnonymousClass2(onBackPressedDispatcher), composer3, 54), null, null, false, false, null, null, 0L, null, composer3, 390, 0, 2042);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }

                        /* compiled from: NotificationSettings4Composable.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.android.settings.ui.notification.NotificationSettings4ComposableKt$NotificationSettings4Composable$2$1$2, reason: invalid class name */
                        static final class AnonymousClass2 implements Function3<BentoAppBarScope, Composer, Integer, Unit> {
                            final /* synthetic */ OnBackPressedDispatcher $onBackPressedDispatcher;

                            AnonymousClass2(OnBackPressedDispatcher onBackPressedDispatcher) {
                                this.$onBackPressedDispatcher = onBackPressedDispatcher;
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer, Integer num) {
                                invoke(bentoAppBarScope, composer, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(BentoAppBarScope BentoAppBar, Composer composer, int i) {
                                Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                                if ((i & 6) == 0) {
                                    i |= (i & 8) == 0 ? composer.changed(BentoAppBar) : composer.changedInstance(BentoAppBar) ? 4 : 2;
                                }
                                if ((i & 19) == 18 && composer.getSkipping()) {
                                    composer.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1482715465, i, -1, "com.robinhood.android.settings.ui.notification.NotificationSettings4Composable.<anonymous>.<anonymous>.<anonymous> (NotificationSettings4Composable.kt:116)");
                                }
                                composer.startReplaceGroup(5004770);
                                boolean zChangedInstance = composer.changedInstance(this.$onBackPressedDispatcher);
                                final OnBackPressedDispatcher onBackPressedDispatcher = this.$onBackPressedDispatcher;
                                Object objRememberedValue = composer.rememberedValue();
                                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new Function0() { // from class: com.robinhood.android.settings.ui.notification.NotificationSettings4ComposableKt$NotificationSettings4Composable$2$1$2$$ExternalSyntheticLambda0
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return NotificationSettings4Composable2.C283812.AnonymousClass1.AnonymousClass2.invoke$lambda$1$lambda$0(onBackPressedDispatcher);
                                        }
                                    };
                                    composer.updateRememberedValue(objRememberedValue);
                                }
                                composer.endReplaceGroup();
                                BentoAppBar.m20575BentoBackButtondrOMvmE(null, false, null, (Function0) objRememberedValue, composer, (BentoAppBarScope.$stable << 12) | ((i << 12) & 57344), 7);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }

                            /* JADX INFO: Access modifiers changed from: private */
                            public static final Unit invoke$lambda$1$lambda$0(OnBackPressedDispatcher onBackPressedDispatcher) {
                                if (onBackPressedDispatcher != null) {
                                    onBackPressedDispatcher.onBackPressed();
                                }
                                return Unit.INSTANCE;
                            }
                        }
                    }, composer2, 54), null, null, null, 0, jM21371getBg0d7_KjU, jM21425getFg0d7_KjU, null, ComposableLambda3.rememberComposableLambda(-636412929, true, new AnonymousClass2(duxo, onSubPageClicked, onActionTriggered, onBottomSheetEntryPointRowClick, snapshotState4CollectAsStateWithLifecycle), composer2, 54), composer2, 805306416, EnumC7081g.SDK_ASSET_ILLUSTRATION_CONSUMER_REPORT_VALUE);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }

                /* compiled from: NotificationSettings4Composable.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.android.settings.ui.notification.NotificationSettings4ComposableKt$NotificationSettings4Composable$2$2, reason: invalid class name */
                static final class AnonymousClass2 implements Function3<PaddingValues, Composer, Integer, Unit> {
                    final /* synthetic */ NotificationSettings4ComposeDuxo $duxo;
                    final /* synthetic */ Function1<ApiGenericAction, Unit> $onActionTriggered;
                    final /* synthetic */ Function1<NotificationSettings4FragmentKey4.BottomSheetEntryPointRow, Unit> $onBottomSheetEntryPointRowClick;
                    final /* synthetic */ Function1<NotificationSettings4FragmentKey3, Unit> $onSubPageClicked;
                    final /* synthetic */ SnapshotState4<NotificationSettings4ComposeViewState> $viewState$delegate;

                    /* JADX WARN: Multi-variable type inference failed */
                    AnonymousClass2(NotificationSettings4ComposeDuxo notificationSettings4ComposeDuxo, Function1<? super NotificationSettings4FragmentKey3, Unit> function1, Function1<? super ApiGenericAction, Unit> function12, Function1<? super NotificationSettings4FragmentKey4.BottomSheetEntryPointRow, Unit> function13, SnapshotState4<? extends NotificationSettings4ComposeViewState> snapshotState4) {
                        this.$duxo = notificationSettings4ComposeDuxo;
                        this.$onSubPageClicked = function1;
                        this.$onActionTriggered = function12;
                        this.$onBottomSheetEntryPointRowClick = function13;
                        this.$viewState$delegate = snapshotState4;
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer, Integer num) {
                        invoke(paddingValues, composer, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(PaddingValues paddingValues, Composer composer, int i) {
                        int i2;
                        Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                        if ((i & 6) == 0) {
                            i2 = i | (composer.changed(paddingValues) ? 4 : 2);
                        } else {
                            i2 = i;
                        }
                        if ((i2 & 19) == 18 && composer.getSkipping()) {
                            composer.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-636412929, i2, -1, "com.robinhood.android.settings.ui.notification.NotificationSettings4Composable.<anonymous>.<anonymous> (NotificationSettings4Composable.kt:127)");
                        }
                        NotificationSettings4ComposeViewState notificationSettings4ComposeViewStateNotificationSettings4Composable$lambda$0 = NotificationSettings4Composable2.NotificationSettings4Composable$lambda$0(this.$viewState$delegate);
                        if (notificationSettings4ComposeViewStateNotificationSettings4Composable$lambda$0 instanceof NotificationSettings4ComposeViewState.Loading) {
                            composer.startReplaceGroup(-1391774338);
                            Modifier modifierTestTag = TestTag3.testTag(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), NotificationSettings4Composable2.TEST_TAG_LOADING_STATE);
                            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getCenter(), false);
                            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierTestTag);
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
                            BentoProgressIndicator2.m20700BentoCircularProgressIndicatorFNF3uiM(null, null, 0L, composer, 0, 7);
                            composer.endNode();
                            composer.endReplaceGroup();
                        } else {
                            if (!(notificationSettings4ComposeViewStateNotificationSettings4Composable$lambda$0 instanceof NotificationSettings4ComposeViewState.Loaded)) {
                                composer.startReplaceGroup(-1707464871);
                                composer.endReplaceGroup();
                                throw new NoWhenBranchMatchedException();
                            }
                            composer.startReplaceGroup(-1391291668);
                            final ImmutableList<NotificationSettings4FragmentKey4> viewTypes = ((NotificationSettings4ComposeViewState.Loaded) notificationSettings4ComposeViewStateNotificationSettings4Composable$lambda$0).getViewTypes();
                            Modifier modifierPadding = PaddingKt.padding(Modifier.INSTANCE, paddingValues);
                            PaddingValues paddingValuesM5139PaddingValuesa9UjIt4$default = PaddingKt.m5139PaddingValuesa9UjIt4$default(0.0f, 0.0f, 0.0f, BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21594getXlargeD9Ej5fM(), 7, null);
                            composer.startReplaceGroup(-1224400529);
                            boolean zChangedInstance = composer.changedInstance(viewTypes) | composer.changedInstance(this.$duxo) | composer.changed(this.$onSubPageClicked) | composer.changed(this.$onActionTriggered) | composer.changed(this.$onBottomSheetEntryPointRowClick);
                            final NotificationSettings4ComposeDuxo notificationSettings4ComposeDuxo = this.$duxo;
                            final Function1<NotificationSettings4FragmentKey3, Unit> function1 = this.$onSubPageClicked;
                            final Function1<ApiGenericAction, Unit> function12 = this.$onActionTriggered;
                            final Function1<NotificationSettings4FragmentKey4.BottomSheetEntryPointRow, Unit> function13 = this.$onBottomSheetEntryPointRowClick;
                            Object objRememberedValue = composer.rememberedValue();
                            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                Object obj = new Function1() { // from class: com.robinhood.android.settings.ui.notification.NotificationSettings4ComposableKt$NotificationSettings4Composable$2$2$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj2) {
                                        return NotificationSettings4Composable2.C283812.AnonymousClass2.invoke$lambda$7$lambda$6(viewTypes, notificationSettings4ComposeDuxo, function1, function12, function13, (LazyListScope) obj2);
                                    }
                                };
                                composer.updateRememberedValue(obj);
                                objRememberedValue = obj;
                            }
                            composer.endReplaceGroup();
                            LazyDslKt.LazyColumn(modifierPadding, null, paddingValuesM5139PaddingValuesa9UjIt4$default, false, null, null, null, false, null, (Function1) objRememberedValue, composer, 0, 506);
                            composer.endReplaceGroup();
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$7$lambda$6(final ImmutableList immutableList, final NotificationSettings4ComposeDuxo notificationSettings4ComposeDuxo, final Function1 function1, final Function1 function12, final Function1 function13, LazyListScope LazyColumn) {
                        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
                        LazyColumn.items(immutableList.size(), null, new Function1<Integer, Object>() { // from class: com.robinhood.android.settings.ui.notification.NotificationSettings4ComposableKt$NotificationSettings4Composable$2$2$invoke$lambda$7$lambda$6$$inlined$itemsIndexed$default$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                                return invoke(num.intValue());
                            }

                            public final Object invoke(int i) {
                                immutableList.get(i);
                                return null;
                            }
                        }, ComposableLambda3.composableLambdaInstance(-1091073711, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.robinhood.android.settings.ui.notification.NotificationSettings4ComposableKt$NotificationSettings4Composable$2$2$invoke$lambda$7$lambda$6$$inlined$itemsIndexed$default$3
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(4);
                            }

                            @Override // kotlin.jvm.functions.Function4
                            public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
                                invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
                                return Unit.INSTANCE;
                            }

                            /* JADX WARN: Removed duplicated region for block: B:78:0x01a3  */
                            /* JADX WARN: Removed duplicated region for block: B:84:? A[RETURN, SYNTHETIC] */
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public final void invoke(LazyItemScope lazyItemScope, int i, Composer composer, int i2) {
                                int i3;
                                Composer composer2;
                                if ((i2 & 6) == 0) {
                                    i3 = (composer.changed(lazyItemScope) ? 4 : 2) | i2;
                                } else {
                                    i3 = i2;
                                }
                                if ((i2 & 48) == 0) {
                                    i3 |= composer.changed(i) ? 32 : 16;
                                }
                                if (!composer.shouldExecute((i3 & 147) != 146, i3 & 1)) {
                                    composer.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1091073711, i3, -1, "androidx.compose.foundation.lazy.itemsIndexed.<anonymous> (LazyDsl.kt:214)");
                                }
                                NotificationSettings4FragmentKey4 notificationSettings4FragmentKey4 = (NotificationSettings4FragmentKey4) immutableList.get(i);
                                composer.startReplaceGroup(-813594162);
                                if (Intrinsics.areEqual(notificationSettings4FragmentKey4, NotificationSettings4FragmentKey4.Padding.INSTANCE)) {
                                    composer.startReplaceGroup(-2104454591);
                                    NotificationSettings4Composable2.Padding(composer, 0);
                                    composer.endReplaceGroup();
                                } else if (notificationSettings4FragmentKey4 instanceof NotificationSettings4FragmentKey4.RadioGroup) {
                                    composer.startReplaceGroup(-2104452123);
                                    NotificationSettings4FragmentKey4.RadioGroup radioGroup = (NotificationSettings4FragmentKey4.RadioGroup) notificationSettings4FragmentKey4;
                                    composer.startReplaceGroup(5004770);
                                    boolean zChangedInstance = composer.changedInstance(notificationSettings4ComposeDuxo);
                                    Object objRememberedValue = composer.rememberedValue();
                                    if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = new NotificationSettings4Composable3(notificationSettings4ComposeDuxo);
                                        composer.updateRememberedValue(objRememberedValue);
                                    }
                                    composer.endReplaceGroup();
                                    Function1 function14 = (Function1) ((KFunction) objRememberedValue);
                                    composer.startReplaceGroup(5004770);
                                    boolean zChangedInstance2 = composer.changedInstance(notificationSettings4ComposeDuxo);
                                    Object objRememberedValue2 = composer.rememberedValue();
                                    if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue2 = new NotificationSettings4Composable4(notificationSettings4ComposeDuxo);
                                        composer.updateRememberedValue(objRememberedValue2);
                                    }
                                    composer.endReplaceGroup();
                                    NotificationSettings4Composable2.RadioGroup(radioGroup, function14, (Function3) ((KFunction) objRememberedValue2), composer, 0);
                                    composer.endReplaceGroup();
                                } else if (notificationSettings4FragmentKey4 instanceof NotificationSettings4FragmentKey4.SectionTitle) {
                                    composer.startReplaceGroup(-2104441643);
                                    NotificationSettings4Composable2.SectionTitle((NotificationSettings4FragmentKey4.SectionTitle) notificationSettings4FragmentKey4, i == 0, composer, 0);
                                    composer.endReplaceGroup();
                                } else if (notificationSettings4FragmentKey4 instanceof NotificationSettings4FragmentKey4.SubPageEntry) {
                                    composer.startReplaceGroup(-2104434618);
                                    NotificationSettings4Composable2.SubPageEntry((NotificationSettings4FragmentKey4.SubPageEntry) notificationSettings4FragmentKey4, function1, composer, 0);
                                    composer.endReplaceGroup();
                                } else if (notificationSettings4FragmentKey4 instanceof NotificationSettings4FragmentKey4.SubtitleRichText) {
                                    composer.startReplaceGroup(-2104426946);
                                    NotificationSettings4Composable2.RichTextSection((NotificationSettings4FragmentKey4.SubtitleRichText) notificationSettings4FragmentKey4, i == 0, composer, 0);
                                    composer.endReplaceGroup();
                                } else {
                                    if (!(notificationSettings4FragmentKey4 instanceof NotificationSettings4FragmentKey4.TitleSubtitle)) {
                                        if (!(notificationSettings4FragmentKey4 instanceof NotificationSettings4FragmentKey4.Toggle)) {
                                            composer.startReplaceGroup(-2104454955);
                                            composer.endReplaceGroup();
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        composer.startReplaceGroup(-2104411864);
                                        NotificationSettings4FragmentKey4.Toggle toggle = (NotificationSettings4FragmentKey4.Toggle) notificationSettings4FragmentKey4;
                                        boolean z = CollectionsKt.getOrNull(immutableList, i + 1) instanceof NotificationSettings4FragmentKey4.Toggle;
                                        composer.startReplaceGroup(5004770);
                                        boolean zChangedInstance3 = composer.changedInstance(notificationSettings4ComposeDuxo);
                                        Object objRememberedValue3 = composer.rememberedValue();
                                        if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue3 = new NotificationSettings4Composable5(notificationSettings4ComposeDuxo);
                                            composer.updateRememberedValue(objRememberedValue3);
                                        }
                                        composer.endReplaceGroup();
                                        Function1 function15 = (Function1) ((KFunction) objRememberedValue3);
                                        composer.startReplaceGroup(5004770);
                                        boolean zChangedInstance4 = composer.changedInstance(notificationSettings4ComposeDuxo);
                                        Object objRememberedValue4 = composer.rememberedValue();
                                        if (zChangedInstance4 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue4 = new NotificationSettings4Composable6(notificationSettings4ComposeDuxo);
                                            composer.updateRememberedValue(objRememberedValue4);
                                        }
                                        composer.endReplaceGroup();
                                        composer2 = composer;
                                        NotificationSettings4Composable2.Toggle(toggle, z, function15, (Function3) ((KFunction) objRememberedValue4), function13, composer2, 0);
                                        composer2.endReplaceGroup();
                                        composer2.endReplaceGroup();
                                        if (ComposerKt.isTraceInProgress()) {
                                            return;
                                        }
                                        ComposerKt.traceEventEnd();
                                        return;
                                    }
                                    composer.startReplaceGroup(-2104419607);
                                    NotificationSettings4Composable2.TitleSubtitle((NotificationSettings4FragmentKey4.TitleSubtitle) notificationSettings4FragmentKey4, function12, composer, 0);
                                    composer.endReplaceGroup();
                                }
                                composer2 = composer;
                                composer2.endReplaceGroup();
                                if (ComposerKt.isTraceInProgress()) {
                                }
                            }
                        }));
                        return Unit.INSTANCE;
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.settings.ui.notification.NotificationSettings4ComposableKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return NotificationSettings4Composable2.NotificationSettings4Composable$lambda$3(onActionTriggered, onBottomSheetEntryPointRowClick, presentSurveyIfNecessary, onSubPageClicked, onSettingsError, duxo, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: NotificationSettings4Composable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.settings.ui.notification.NotificationSettings4ComposableKt$RadioGroup$2 */
    static final class C283862 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ Function3<String, String, String, Unit> $onSettingsSelected;
        final /* synthetic */ NotificationSettings4FragmentKey4.RadioGroup $state;

        /* JADX WARN: Multi-variable type inference failed */
        C283862(NotificationSettings4FragmentKey4.RadioGroup radioGroup, Function3<? super String, ? super String, ? super String, Unit> function3) {
            this.$state = radioGroup;
            this.$onSettingsSelected = function3;
        }

        public final void invoke(Composer composer, int i) {
            Composer composer2 = composer;
            if ((i & 3) == 2 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1230989944, i, -1, "com.robinhood.android.settings.ui.notification.RadioGroup.<anonymous> (NotificationSettings4Composable.kt:206)");
            }
            final NotificationSettings4FragmentKey4.RadioGroup radioGroup = this.$state;
            final Function3<String, String, String, Unit> function3 = this.$onSettingsSelected;
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
            composer2.startReplaceGroup(164589098);
            int i2 = 0;
            for (Object obj : radioGroup.getOptions()) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                String str = (String) obj;
                final String str2 = radioGroup.getOptionValues().get(i2);
                BentoSelectionRowState.Type type2 = BentoSelectionRowState.Type.RadioButton;
                String str3 = (String) CollectionsKt.getOrNull(radioGroup.getOptionsSubtitle(), i2);
                BentoSelectionRowState bentoSelectionRowState = new BentoSelectionRowState(type2, str, Intrinsics.areEqual(radioGroup.getSelectedValue(), str2), (BentoBaseRowState.Text) (str3 != null ? new BentoBaseRowState.Text.Plain(str3) : null), false, i2 != CollectionsKt.getLastIndex(radioGroup.getOptions()), (BentoSelectionRowState.IconPosition) null, false, false, (ImmutableMap) null, (Function0) null, 2000, (DefaultConstructorMarker) null);
                composer2.startReplaceGroup(-1746271574);
                boolean zChanged = composer2.changed(function3) | composer2.changedInstance(radioGroup) | composer2.changed(str2);
                Object objRememberedValue = composer2.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.settings.ui.notification.NotificationSettings4ComposableKt$RadioGroup$2$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return NotificationSettings4Composable2.C283862.invoke$lambda$4$lambda$3$lambda$2$lambda$1(function3, radioGroup, str2);
                        }
                    };
                    composer2.updateRememberedValue(objRememberedValue);
                }
                composer2.endReplaceGroup();
                BentoSelectionRow2.BentoSelectionRow(null, bentoSelectionRowState, (Function0) objRememberedValue, composer2, BentoSelectionRowState.$stable << 3, 1);
                composer2 = composer;
                i2 = i3;
            }
            composer.endReplaceGroup();
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$4$lambda$3$lambda$2$lambda$1(Function3 function3, NotificationSettings4FragmentKey4.RadioGroup radioGroup, String str) {
            function3.invoke(radioGroup.getParentId(), radioGroup.getId(), str);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Padding(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1860305244);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1860305244, i, -1, "com.robinhood.android.settings.ui.notification.Padding (NotificationSettings4Composable.kt:191)");
            }
            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(Modifier.INSTANCE, BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21590getDefaultD9Ej5fM()), composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.settings.ui.notification.NotificationSettings4ComposableKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return NotificationSettings4Composable2.Padding$lambda$4(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void RadioGroup(final NotificationSettings4FragmentKey4.RadioGroup radioGroup, final Function1<? super NotificationSettings4FragmentKey4.RadioGroup, Unit> function1, final Function3<? super String, ? super String, ? super String, Unit> function3, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(320836653);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(radioGroup) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function3) ? 256 : 128;
        }
        if ((i2 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(320836653, i2, -1, "com.robinhood.android.settings.ui.notification.RadioGroup (NotificationSettings4Composable.kt:200)");
            }
            Unit unit = Unit.INSTANCE;
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            boolean zChangedInstance = ((i2 & 112) == 32) | composerStartRestartGroup.changedInstance(radioGroup);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new NotificationSettings4Composable7(function1, radioGroup, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue, composerStartRestartGroup, 6);
            BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(1230989944, true, new C283862(radioGroup, function3), composerStartRestartGroup, 54), composerStartRestartGroup, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.settings.ui.notification.NotificationSettings4ComposableKt$$ExternalSyntheticLambda10
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return NotificationSettings4Composable2.RadioGroup$lambda$6(radioGroup, function1, function3, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void SectionTitle(final NotificationSettings4FragmentKey4.SectionTitle sectionTitle, final boolean z, Composer composer, final int i) {
        int i2;
        float fM21594getXlargeD9Ej5fM;
        int i3;
        int i4;
        Modifier.Companion companion;
        Composer composer2;
        Composer composer3;
        Composer composerStartRestartGroup = composer.startRestartGroup(716258061);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(sectionTitle) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer3 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(716258061, i2, -1, "com.robinhood.android.settings.ui.notification.SectionTitle (NotificationSettings4Composable.kt:232)");
            }
            if (sectionTitle.getTitle().length() == 0) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.settings.ui.notification.NotificationSettings4ComposableKt$$ExternalSyntheticLambda8
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return NotificationSettings4Composable2.SectionTitle$lambda$7(sectionTitle, z, i, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            Modifier.Companion companion2 = Modifier.INSTANCE;
            if (z) {
                composerStartRestartGroup.startReplaceGroup(646797796);
                fM21594getXlargeD9Ej5fM = BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21592getMediumD9Ej5fM();
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(646852356);
                fM21594getXlargeD9Ej5fM = BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21594getXlargeD9Ej5fM();
                composerStartRestartGroup.endReplaceGroup();
            }
            float f = fM21594getXlargeD9Ej5fM;
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i5 = BentoTheme.$stable;
            Modifier modifierM21622defaultHorizontalPaddingWMci_g0 = com.robinhood.compose.bento.util.PaddingKt.m21622defaultHorizontalPaddingWMci_g0(companion2, f, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21595getXsmallD9Ej5fM(), composerStartRestartGroup, 6, 0);
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM21622defaultHorizontalPaddingWMci_g0);
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            if (sectionTitle.getShowInfoIcon()) {
                composerStartRestartGroup.startReplaceGroup(268533941);
                BentoTextWithTrailingIcon.BentoTextWithTrailingIcon(new BentoTextWithTrailingIconState(sectionTitle.getTitle(), new BentoIcon4.Size16(ServerToBentoAssetMapper2.INFO_16), null, bentoTheme.getColors(composerStartRestartGroup, i5).m21425getFg0d7_KjU(), null, null, FontWeight.INSTANCE.getBold(), null, null, 0, false, 0, 0, null, false, null, null, false, 262064, null), TestTag3.testTag(companion2, TEST_TAG_SECTION_TITLE_WITH_INFO_ICON), null, null, composerStartRestartGroup, BentoTextWithTrailingIconState.$stable | 48, 12);
                composer2 = composerStartRestartGroup;
                composer2.endReplaceGroup();
                i4 = i5;
                companion = companion2;
                i3 = 0;
            } else {
                composerStartRestartGroup.startReplaceGroup(269014813);
                i3 = 0;
                i4 = i5;
                companion = companion2;
                BentoText2.m20747BentoText38GnDrw(sectionTitle.getTitle(), null, null, null, FontWeight.INSTANCE.getBold(), null, null, 0, false, 0, 0, null, 0, null, composerStartRestartGroup, 24576, 0, 16366);
                composer2 = composerStartRestartGroup;
                composer2.endReplaceGroup();
            }
            String subtitle = sectionTitle.getSubtitle();
            composer2.startReplaceGroup(-129863615);
            if (subtitle == null || subtitle.length() == 0) {
                composer3 = composer2;
            } else {
                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, bentoTheme.getSpacing(composer2, i4).m21595getXsmallD9Ej5fM()), composer2, i3);
                composer3 = composer2;
                BentoText2.m20747BentoText38GnDrw(subtitle, null, Color.m6701boximpl(bentoTheme.getColors(composer2, i4).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer2, i4).getTextS(), composer3, 0, 0, 8186);
            }
            composer3.endReplaceGroup();
            composer3.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composer3.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup2 != null) {
            scopeUpdateScopeEndRestartGroup2.updateScope(new Function2() { // from class: com.robinhood.android.settings.ui.notification.NotificationSettings4ComposableKt$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return NotificationSettings4Composable2.SectionTitle$lambda$9(sectionTitle, z, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void SubPageEntry(final NotificationSettings4FragmentKey4.SubPageEntry subPageEntry, final Function1<? super NotificationSettings4FragmentKey3, Unit> function1, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(368683198);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(subPageEntry) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if ((i2 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(368683198, i2, -1, "com.robinhood.android.settings.ui.notification.SubPageEntry (NotificationSettings4Composable.kt:280)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            boolean zChangedInstance = ((i2 & 112) == 32) | composerStartRestartGroup.changedInstance(subPageEntry);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.settings.ui.notification.NotificationSettings4ComposableKt$$ExternalSyntheticLambda11
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return NotificationSettings4Composable2.SubPageEntry$lambda$11$lambda$10(function1, subPageEntry);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            BentoBaseRowLayout.BentoBaseRowLayout(ClickableKt.m4893clickableXHw0xAI$default(companion, false, null, null, (Function0) objRememberedValue, 7, null), null, null, ComposableLambda3.rememberComposableLambda(3809915, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.settings.ui.notification.NotificationSettings4ComposableKt.SubPageEntry.2
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
                        ComposerKt.traceEventStart(3809915, i3, -1, "com.robinhood.android.settings.ui.notification.SubPageEntry.<anonymous> (NotificationSettings4Composable.kt:288)");
                    }
                    BentoText2.m20747BentoText38GnDrw(subPageEntry.getPrimaryText(), null, null, null, null, null, null, 0, false, 0, 0, null, 0, null, composer2, 0, 0, 16382);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(705744508, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.settings.ui.notification.NotificationSettings4ComposableKt.SubPageEntry.3
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
                        ComposerKt.traceEventStart(705744508, i3, -1, "com.robinhood.android.settings.ui.notification.SubPageEntry.<anonymous> (NotificationSettings4Composable.kt:291)");
                    }
                    Integer secondaryTextRes = subPageEntry.getSecondaryTextRes();
                    if (secondaryTextRes != null) {
                        String strStringResource = StringResources_androidKt.stringResource(secondaryTextRes.intValue(), composer2, 0);
                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                        int i4 = BentoTheme.$stable;
                        TextStyle textS = bentoTheme.getTypography(composer2, i4).getTextS();
                        long jM21456getPositive0d7_KjU = bentoTheme.getColors(composer2, i4).m21456getPositive0d7_KjU();
                        BentoText2.m20747BentoText38GnDrw(strStringResource, null, Color.m6701boximpl(jM21456getPositive0d7_KjU), null, FontWeight.INSTANCE.getBold(), null, null, 0, false, 0, 0, null, 0, textS, composer2, 24576, 0, 8170);
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), null, null, true, false, false, null, composerStartRestartGroup, 12610560, 0, 1894);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.settings.ui.notification.NotificationSettings4ComposableKt$$ExternalSyntheticLambda12
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return NotificationSettings4Composable2.SubPageEntry$lambda$12(subPageEntry, function1, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SubPageEntry$lambda$11$lambda$10(Function1 function1, NotificationSettings4FragmentKey4.SubPageEntry subPageEntry) {
        function1.invoke(subPageEntry.getSubPageReference());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void RichTextSection(final NotificationSettings4FragmentKey4.SubtitleRichText subtitleRichText, final boolean z, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-2060280274);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(subtitleRichText) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i2 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2060280274, i2, -1, "com.robinhood.android.settings.ui.notification.RichTextSection (NotificationSettings4Composable.kt:309)");
            }
            final Navigator navigator = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
            final Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            RichText content = subtitleRichText.getContent();
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i3 = BentoTheme.$stable;
            TextStyle textS = bentoTheme.getTypography(composerStartRestartGroup, i3).getTextS();
            long jM21426getFg20d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i3).m21426getFg20d7_KjU();
            long jM21426getFg20d7_KjU2 = bentoTheme.getColors(composerStartRestartGroup, i3).m21426getFg20d7_KjU();
            composerStartRestartGroup.startReplaceGroup(50594634);
            Modifier modifierM21619defaultFillMaxWidthPadding3ABfNKs$default = com.robinhood.compose.bento.util.PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(Modifier.INSTANCE, 0.0f, 1, null);
            if (!z) {
                modifierM21619defaultFillMaxWidthPadding3ABfNKs$default = PaddingKt.m5146paddingqDBjuR0$default(modifierM21619defaultFillMaxWidthPadding3ABfNKs$default, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i3).m21594getXlargeD9Ej5fM(), 0.0f, 0.0f, 13, null);
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(navigator) | composerStartRestartGroup.changedInstance(context);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.settings.ui.notification.NotificationSettings4ComposableKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return NotificationSettings4Composable2.RichTextSection$lambda$15$lambda$14(navigator, context, (Uri) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            composer2 = composerStartRestartGroup;
            BentoRichText.m15948BentoRichText0sCZWFg(content, modifierM21619defaultFillMaxWidthPadding3ABfNKs$default, textS, jM21426getFg20d7_KjU, jM21426getFg20d7_KjU2, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (Function1<? super Uri, Unit>) objRememberedValue, composer2, 0, 480);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.settings.ui.notification.NotificationSettings4ComposableKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return NotificationSettings4Composable2.RichTextSection$lambda$16(subtitleRichText, z, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RichTextSection$lambda$15$lambda$14(Navigator navigator, Context context, Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        Navigator.DefaultImpls.handleDeepLink$default(navigator, context, uri, null, null, false, NavigationType.PRESENT, 28, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void TitleSubtitle(final NotificationSettings4FragmentKey4.TitleSubtitle titleSubtitle, final Function1<? super ApiGenericAction, Unit> function1, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1365961966);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(titleSubtitle) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if ((i2 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1365961966, i2, -1, "com.robinhood.android.settings.ui.notification.TitleSubtitle (NotificationSettings4Composable.kt:336)");
            }
            BentoBaseRowState bentoBaseRowState = new BentoBaseRowState((BentoBaseRowState.Start) null, titleSubtitle.getTitle(), titleSubtitle.getSubtitle(), (String) null, (BentoBaseRowState.Meta) null, (BentoBaseRowState.End) null, false, false, EnumC7081g.f2779x59907a3d, (DefaultConstructorMarker) null);
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            boolean zChangedInstance = ((i2 & 112) == 32) | composerStartRestartGroup.changedInstance(titleSubtitle);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.settings.ui.notification.NotificationSettings4ComposableKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return NotificationSettings4Composable2.TitleSubtitle$lambda$18$lambda$17(function1, titleSubtitle);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            BentoBaseRowKt.m20915BentoBaseRowcd68TDI(null, bentoBaseRowState, true, false, false, 0L, (Function0) objRememberedValue, composerStartRestartGroup, (BentoBaseRowState.$stable << 3) | 384, 57);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.settings.ui.notification.NotificationSettings4ComposableKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return NotificationSettings4Composable2.TitleSubtitle$lambda$19(titleSubtitle, function1, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TitleSubtitle$lambda$18$lambda$17(Function1 function1, NotificationSettings4FragmentKey4.TitleSubtitle titleSubtitle) {
        function1.invoke(titleSubtitle.getAction());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01d9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void Toggle(final NotificationSettings4FragmentKey4.Toggle toggle, final boolean z, final Function1<? super NotificationSettings4FragmentKey4.Toggle, Unit> function1, final Function3<? super String, ? super String, ? super ApiNotificationSettingsToggleSettingsItem.Status, Unit> function3, final Function1<? super NotificationSettings4FragmentKey4.BottomSheetEntryPointRow, Unit> function12, Composer composer, final int i) {
        int i2;
        boolean z2;
        boolean z3;
        BentoIcon4.Size16 size16;
        boolean zChangedInstance;
        Object objRememberedValue;
        NotificationSettings4FragmentKey4.BottomSheetEntryPointRow.SnoozeBottomSheetMultipleChoiceRow.SnoozeOptionItem snoozeOptionItem;
        Composer composerStartRestartGroup = composer.startRestartGroup(288779926);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(toggle) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function3) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function12) ? 16384 : 8192;
        }
        if ((i2 & 9363) == 9362 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(288779926, i2, -1, "com.robinhood.android.settings.ui.notification.Toggle (NotificationSettings4Composable.kt:356)");
            }
            Unit unit = Unit.INSTANCE;
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            boolean zChangedInstance2 = ((i2 & 896) == 256) | composerStartRestartGroup.changedInstance(toggle);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new NotificationSettings4Composable8(function1, toggle, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceGroup();
            EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, 6);
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
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
            int i3 = WhenMappings.$EnumSwitchMapping$0[toggle.getStatus().ordinal()];
            if (i3 == 1) {
                z2 = true;
                z3 = true;
            } else if (i3 == 2) {
                z2 = true;
                z3 = false;
            } else {
                if (i3 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                z3 = true;
                size16 = new BentoIcon4.Size16(ServerToBentoAssetMapper2.LOCK_16);
                z2 = false;
                String title = toggle.getTitle();
                String description = toggle.getDescription();
                BentoToggleRowState bentoToggleRowState = new BentoToggleRowState(null, title, description == null ? new BentoToggleRowState.Text.Plain(description) : null, z2, z3, size16, null, false, false, false, 449, null);
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                zChangedInstance = ((i2 & 7168) != 2048) | composerStartRestartGroup.changedInstance(toggle);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function1() { // from class: com.robinhood.android.settings.ui.notification.NotificationSettings4ComposableKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return NotificationSettings4Composable2.Toggle$lambda$24$lambda$23$lambda$22(function3, toggle, ((Boolean) obj).booleanValue());
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                BentoToggleRow3.BentoToggleRow(bentoToggleRowState, (Function1) objRememberedValue, null, composerStartRestartGroup, BentoToggleRowState.$stable, 4);
                NotificationSettings4FragmentKey4.BottomSheetEntryPointRow.BottomSheetMultipleChoiceRow bottomSheetMultipleChoiceRow = toggle.getBottomSheetMultipleChoiceRow();
                boolean z4 = (z3 || bottomSheetMultipleChoiceRow == null) ? false : true;
                NotificationSettings4FragmentKey4.BottomSheetEntryPointRow.SnoozeBottomSheetMultipleChoiceRow snoozeBottomSheetMultipleChoiceRow = toggle.getSnoozeBottomSheetMultipleChoiceRow();
                AnimatedVisibilityKt.AnimatedVisibility(column6, !z4 || (z3 && snoozeBottomSheetMultipleChoiceRow != null && (snoozeOptionItem = (NotificationSettings4FragmentKey4.BottomSheetEntryPointRow.SnoozeBottomSheetMultipleChoiceRow.SnoozeOptionItem) CollectionsKt.firstOrNull((List) snoozeBottomSheetMultipleChoiceRow.getSelectedItems())) != null && !snoozeOptionItem.getHideWhenSelected()), (Modifier) null, EnterExitTransitionKt.expandVertically$default(AnimationSpecKt.tween$default(400, 0, null, 6, null), null, false, null, 14, null).plus(EnterExitTransitionKt.fadeIn$default(AnimationSpecKt.tween$default(200, 100, null, 4, null), 0.0f, 2, null)), EnterExitTransitionKt.shrinkVertically$default(AnimationSpecKt.tween$default(400, 0, null, 6, null), null, false, null, 14, null).plus(EnterExitTransitionKt.fadeOut$default(AnimationSpecKt.tween$default(200, 0, null, 6, null), 0.0f, 2, null)), (String) null, ComposableLambda3.rememberComposableLambda(512058468, true, new NotificationSettings4Composable9(z4, bottomSheetMultipleChoiceRow, function12, snoozeBottomSheetMultipleChoiceRow, z), composerStartRestartGroup, 54), composerStartRestartGroup, 1600518, 18);
                composerStartRestartGroup = composerStartRestartGroup;
                composerStartRestartGroup.startReplaceGroup(1237276693);
                if (!toggle.isFromConfigurableTypePage() && bottomSheetMultipleChoiceRow == null && snoozeBottomSheetMultipleChoiceRow == null) {
                    BentoDivider.m20635BentoHorizontalDivideraMcp0Q(com.robinhood.compose.bento.util.PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(companion, 0.0f, 1, null), BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21373getBg30d7_KjU(), 0.0f, composerStartRestartGroup, 0, 4);
                    composerStartRestartGroup = composerStartRestartGroup;
                }
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            size16 = null;
            String title2 = toggle.getTitle();
            String description2 = toggle.getDescription();
            BentoToggleRowState bentoToggleRowState2 = new BentoToggleRowState(null, title2, description2 == null ? new BentoToggleRowState.Text.Plain(description2) : null, z2, z3, size16, null, false, false, false, 449, null);
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            zChangedInstance = ((i2 & 7168) != 2048) | composerStartRestartGroup.changedInstance(toggle);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (!zChangedInstance) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.settings.ui.notification.NotificationSettings4ComposableKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return NotificationSettings4Composable2.Toggle$lambda$24$lambda$23$lambda$22(function3, toggle, ((Boolean) obj).booleanValue());
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                composerStartRestartGroup.endReplaceGroup();
                BentoToggleRow3.BentoToggleRow(bentoToggleRowState2, (Function1) objRememberedValue, null, composerStartRestartGroup, BentoToggleRowState.$stable, 4);
                NotificationSettings4FragmentKey4.BottomSheetEntryPointRow.BottomSheetMultipleChoiceRow bottomSheetMultipleChoiceRow2 = toggle.getBottomSheetMultipleChoiceRow();
                if (z3) {
                    NotificationSettings4FragmentKey4.BottomSheetEntryPointRow.SnoozeBottomSheetMultipleChoiceRow snoozeBottomSheetMultipleChoiceRow2 = toggle.getSnoozeBottomSheetMultipleChoiceRow();
                    if (z3) {
                        if (z4) {
                            AnimatedVisibilityKt.AnimatedVisibility(column6, !z4 || (z3 && snoozeBottomSheetMultipleChoiceRow2 != null && (snoozeOptionItem = (NotificationSettings4FragmentKey4.BottomSheetEntryPointRow.SnoozeBottomSheetMultipleChoiceRow.SnoozeOptionItem) CollectionsKt.firstOrNull((List) snoozeBottomSheetMultipleChoiceRow2.getSelectedItems())) != null && !snoozeOptionItem.getHideWhenSelected()), (Modifier) null, EnterExitTransitionKt.expandVertically$default(AnimationSpecKt.tween$default(400, 0, null, 6, null), null, false, null, 14, null).plus(EnterExitTransitionKt.fadeIn$default(AnimationSpecKt.tween$default(200, 100, null, 4, null), 0.0f, 2, null)), EnterExitTransitionKt.shrinkVertically$default(AnimationSpecKt.tween$default(400, 0, null, 6, null), null, false, null, 14, null).plus(EnterExitTransitionKt.fadeOut$default(AnimationSpecKt.tween$default(200, 0, null, 6, null), 0.0f, 2, null)), (String) null, ComposableLambda3.rememberComposableLambda(512058468, true, new NotificationSettings4Composable9(z4, bottomSheetMultipleChoiceRow2, function12, snoozeBottomSheetMultipleChoiceRow2, z), composerStartRestartGroup, 54), composerStartRestartGroup, 1600518, 18);
                            composerStartRestartGroup = composerStartRestartGroup;
                            composerStartRestartGroup.startReplaceGroup(1237276693);
                            if (!toggle.isFromConfigurableTypePage()) {
                                BentoDivider.m20635BentoHorizontalDivideraMcp0Q(com.robinhood.compose.bento.util.PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(companion, 0.0f, 1, null), BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21373getBg30d7_KjU(), 0.0f, composerStartRestartGroup, 0, 4);
                                composerStartRestartGroup = composerStartRestartGroup;
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            composerStartRestartGroup.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                        }
                    }
                }
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.settings.ui.notification.NotificationSettings4ComposableKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return NotificationSettings4Composable2.Toggle$lambda$25(toggle, z, function1, function3, function12, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Toggle$lambda$24$lambda$23$lambda$22(Function3 function3, NotificationSettings4FragmentKey4.Toggle toggle, boolean z) {
        function3.invoke(toggle.getSectionId(), toggle.getId(), z ? ApiNotificationSettingsToggleSettingsItem.Status.f5427ON : ApiNotificationSettingsToggleSettingsItem.Status.OFF);
        return Unit.INSTANCE;
    }

    public static final StringResource getSelectedValueText(NotificationSettings4FragmentKey4.BottomSheetEntryPointRow bottomSheetEntryPointRow) {
        Intrinsics.checkNotNullParameter(bottomSheetEntryPointRow, "<this>");
        if (bottomSheetEntryPointRow instanceof NotificationSettings4FragmentKey4.BottomSheetEntryPointRow.BottomSheetMultipleChoiceRow) {
            NotificationSettings4FragmentKey4.BottomSheetEntryPointRow.BottomSheetMultipleChoiceRow bottomSheetMultipleChoiceRow = (NotificationSettings4FragmentKey4.BottomSheetEntryPointRow.BottomSheetMultipleChoiceRow) bottomSheetEntryPointRow;
            if (bottomSheetMultipleChoiceRow.getBottomSheetData().getSelectedValues().size() > 1) {
                int size = bottomSheetMultipleChoiceRow.getBottomSheetData().getSelectedValues().size() - 1;
                return StringResource.INSTANCE.invoke(new StringResource.PluralsResource(C28315R.plurals.settings_multiple_choice_bottom_sheet_selected_and_more, size), getFirstSelectedChoiceDisplayTitle(bottomSheetMultipleChoiceRow.getBottomSheetData()), Integer.valueOf(size));
            }
            if (bottomSheetMultipleChoiceRow.getBottomSheetData().getSelectedValues().size() == 1) {
                return StringResource.INSTANCE.invoke(getFirstSelectedChoiceDisplayTitle(bottomSheetMultipleChoiceRow.getBottomSheetData()));
            }
            return null;
        }
        if (!(bottomSheetEntryPointRow instanceof NotificationSettings4FragmentKey4.BottomSheetEntryPointRow.SnoozeBottomSheetMultipleChoiceRow)) {
            throw new NoWhenBranchMatchedException();
        }
        NotificationSettings4FragmentKey4.BottomSheetEntryPointRow.SnoozeBottomSheetMultipleChoiceRow snoozeBottomSheetMultipleChoiceRow = (NotificationSettings4FragmentKey4.BottomSheetEntryPointRow.SnoozeBottomSheetMultipleChoiceRow) bottomSheetEntryPointRow;
        if (((NotificationSettings4FragmentKey4.BottomSheetEntryPointRow.SnoozeBottomSheetMultipleChoiceRow.SnoozeOptionItem) CollectionsKt.firstOrNull((List) snoozeBottomSheetMultipleChoiceRow.getSelectedItems())) == null) {
            return null;
        }
        String str = Instant.ofEpochSecond(snoozeBottomSheetMultipleChoiceRow.getBottomSheetData().getLastSelectedAtSeconds() + r0.getSnoozeDurationInSeconds()).atZone(ZoneId.systemDefault()).format(DateTimeFormatter.ofPattern("MMM d"));
        StringResource.Companion companion = StringResource.INSTANCE;
        Intrinsics.checkNotNull(str);
        return companion.invoke(str);
    }

    private static final String getFirstSelectedChoiceDisplayTitle(NotificationSettings4FragmentKey4.BottomSheetEntryPointRow.BottomSheetMultipleChoiceRow.BottomSheetData bottomSheetData) {
        for (NotificationSettings4FragmentKey4.BottomSheetEntryPointRow.BottomSheetMultipleChoiceRow.OptionItem optionItem : bottomSheetData.getChoices()) {
            if (bottomSheetData.getSelectedValues().contains(optionItem.getValue())) {
                return optionItem.getDisplayTitle();
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }
}
