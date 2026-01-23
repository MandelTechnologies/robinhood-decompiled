package com.robinhood.shared.settings.iibsettings;

import android.R;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import androidx.appcompat.R$attr;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentResultListener;
import androidx.recyclerview.widget.RecyclerView;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.AutoLoggableFragment;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.BindSavedState2;
import com.robinhood.android.common.p088ui.RhDialogFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.util.p090rx.ActivityErrorHandler;
import com.robinhood.android.common.util.transition.ToolbarScrollAnimator;
import com.robinhood.android.designsystem.selectioncontrol.RdsToggleView;
import com.robinhood.android.designsystem.style.GoldOverlay;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.keys.LegacyDialogFragmentKey;
import com.robinhood.android.navigation.app.keys.LegacyFragmentKey;
import com.robinhood.android.options.portfolioriskanalyzer.components.topnavrow.OptionsPortfolioRiskAnalyzerTopNavRowComposable;
import com.robinhood.android.serverclientcomponents.alert.ClientComponentAlertSheetFragment;
import com.robinhood.android.settings.models.api.ApiSettingsPage;
import com.robinhood.android.settings.models.p253ui.SettingsDialog;
import com.robinhood.android.settings.models.p253ui.TypedSettingsItem;
import com.robinhood.android.settings.p254ui.C28356R;
import com.robinhood.android.settings.p254ui.SettingsAdapter;
import com.robinhood.android.settings.p254ui.SettingsHeaderView;
import com.robinhood.android.settings.p254ui.SettingsPlaceholderAdapter;
import com.robinhood.models.serverdriven.p347db.GenericAction;
import com.robinhood.models.serverdriven.p347db.ServerDrivenButton;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.scarlet.ScarletContextWrapper;
import com.robinhood.scarlet.ScarletManager;
import com.robinhood.scarlet.ScarletManager2;
import com.robinhood.scarlet.util.resource.ResourceReferences4;
import com.robinhood.scarlet.util.resource.ResourceType;
import com.robinhood.scarlet.util.resource.ThemedResourceReference;
import com.robinhood.shared.settings.contracts.Constants6;
import com.robinhood.shared.settings.libsettings.C39787R;
import com.robinhood.shared.settings.libsettings.databinding.FragmentSettingsBinding;
import com.robinhood.utils.ClipboardUtil;
import com.robinhood.utils.p409ui.view.recyclerview.CompositeAdapter;
import com.robinhood.utils.p409ui.view.recyclerview.SingleItemAdapter;
import io.reactivex.disposables.Disposable;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.properties.Interfaces3;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: BaseSettingsFragment.kt */
@Metadata(m3635d1 = {"\u0000º\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010#\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b'\u0018\u0000 ¹\u00012\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u0004º\u0001¹\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0011\u0010\u0007J\u001f\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ!\u0010 \u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\nH\u0016¢\u0006\u0004\b\"\u0010\u0007J\u000f\u0010#\u001a\u00020\nH\u0016¢\u0006\u0004\b#\u0010\u0007JW\u0010-\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020$2\u0006\u0010'\u001a\u00020$2\u0006\u0010(\u001a\u00020$2\u0006\u0010)\u001a\u00020$2\u0006\u0010*\u001a\u00020$2\u0006\u0010+\u001a\u00020$2\u0006\u0010,\u001a\u00020$H\u0016¢\u0006\u0004\b-\u0010.J;\u00107\u001a\u00020\n2\b\u00100\u001a\u0004\u0018\u00010/2\b\u00101\u001a\u0004\u0018\u00010\b2\u000e\u00104\u001a\n\u0012\u0004\u0012\u000203\u0018\u0001022\u0006\u00106\u001a\u000205H\u0004¢\u0006\u0004\b7\u00108J\u0017\u0010;\u001a\u00020\n2\u0006\u0010:\u001a\u000209H\u0004¢\u0006\u0004\b;\u0010<J\u001d\u0010?\u001a\u00020\n2\f\u0010>\u001a\b\u0012\u0004\u0012\u00020\n0=H\u0004¢\u0006\u0004\b?\u0010@J\u001f\u0010B\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010A\u001a\u000203H\u0016¢\u0006\u0004\bB\u0010CJ\u0017\u0010F\u001a\u0002052\u0006\u0010E\u001a\u00020DH\u0016¢\u0006\u0004\bF\u0010GJ\u0017\u0010I\u001a\u0002052\u0006\u0010\u000e\u001a\u00020HH\u0016¢\u0006\u0004\bI\u0010JJ\u0017\u0010L\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020KH\u0016¢\u0006\u0004\bL\u0010MJ'\u0010S\u001a\u00020\n2\u0006\u0010O\u001a\u00020N2\u0006\u0010P\u001a\u0002052\u0006\u0010R\u001a\u00020QH\u0016¢\u0006\u0004\bS\u0010TJ\u001f\u0010U\u001a\u0002052\u0006\u0010O\u001a\u00020N2\u0006\u0010P\u001a\u000205H\u0016¢\u0006\u0004\bU\u0010VJ-\u0010\\\u001a\u00020\n2\u0006\u0010X\u001a\u00020W2\u0006\u0010Z\u001a\u00020Y2\f\u0010[\u001a\b\u0012\u0004\u0012\u00020\n0=H\u0016¢\u0006\u0004\b\\\u0010]J!\u0010`\u001a\u0002052\u0006\u0010^\u001a\u00020$2\b\u0010_\u001a\u0004\u0018\u00010\u001eH\u0016¢\u0006\u0004\b`\u0010aJ!\u0010b\u001a\u0002052\u0006\u0010^\u001a\u00020$2\b\u0010_\u001a\u0004\u0018\u00010\u001eH\u0016¢\u0006\u0004\bb\u0010aJ\u001f\u0010f\u001a\u00020\n2\u0006\u0010d\u001a\u00020c2\u0006\u0010e\u001a\u00020\u001cH\u0016¢\u0006\u0004\bf\u0010gJ\u001f\u0010j\u001a\u00020\n2\u0006\u0010X\u001a\u00020h2\u0006\u0010i\u001a\u000205H\u0016¢\u0006\u0004\bj\u0010kR\"\u0010m\u001a\u00020l8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bm\u0010n\u001a\u0004\bo\u0010p\"\u0004\bq\u0010rR\u001a\u0010s\u001a\u00020\u00148\u0016X\u0096\u0004¢\u0006\f\n\u0004\bs\u0010t\u001a\u0004\bu\u0010vR\u001b\u0010|\u001a\u00020w8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bx\u0010y\u001a\u0004\bz\u0010{R\u0014\u0010~\u001a\u00020}8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b~\u0010\u007fR%\u0010\u0082\u0001\u001a\u0010\u0012\u0005\u0012\u00030\u0081\u0001\u0012\u0004\u0012\u00020\b0\u0080\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0082\u0001\u0010\u0083\u0001R\u0018\u0010\u0085\u0001\u001a\u00030\u0084\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0085\u0001\u0010\u0086\u0001R\u0018\u0010\u0088\u0001\u001a\u00030\u0087\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0088\u0001\u0010\u0089\u0001R\u001c\u0010\u008b\u0001\u001a\u0005\u0018\u00010\u008a\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008b\u0001\u0010\u008c\u0001R(\u0010\u008e\u0001\u001a\u0011\u0012\u0004\u0012\u00020N\u0012\u0004\u0012\u000205\u0018\u00010\u008d\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008e\u0001\u0010\u008f\u0001R)\u0010R\u001a\u0004\u0018\u00010Q8\u0004@\u0004X\u0084\u000e¢\u0006\u0017\n\u0005\bR\u0010\u0090\u0001\u001a\u0006\b\u0091\u0001\u0010\u0092\u0001\"\u0006\b\u0093\u0001\u0010\u0094\u0001R!\u0010\u0095\u0001\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010=8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0095\u0001\u0010\u0096\u0001R'\u0010\u009c\u0001\u001a\t\u0012\u0004\u0012\u00020\u00140\u0097\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u0098\u0001\u0010\u0099\u0001\u001a\u0006\b\u009a\u0001\u0010\u009b\u0001R.\u0010\u009e\u0001\u001a\u0004\u0018\u00010/2\t\u0010\u009d\u0001\u001a\u0004\u0018\u00010/8\u0002@BX\u0082\u000e¢\u0006\u0010\n\u0006\b\u009e\u0001\u0010\u009f\u0001\"\u0006\b \u0001\u0010¡\u0001R\u001f\u0010¢\u0001\u001a\u0002058\u0016X\u0096D¢\u0006\u0010\n\u0006\b¢\u0001\u0010£\u0001\u001a\u0006\b¤\u0001\u0010¥\u0001R \u0010§\u0001\u001a\t\u0012\u0002\b\u0003\u0018\u00010¦\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b§\u0001\u0010¨\u0001R\u0018\u0010¬\u0001\u001a\u00030©\u00018&X¦\u0004¢\u0006\b\u001a\u0006\bª\u0001\u0010«\u0001R\u0018\u0010°\u0001\u001a\u00030\u00ad\u00018&X¦\u0004¢\u0006\b\u001a\u0006\b®\u0001\u0010¯\u0001R\u0016\u0010²\u0001\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b±\u0001\u0010vR\u0018\u0010¶\u0001\u001a\u00030³\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b´\u0001\u0010µ\u0001R\u0015\u0010¸\u0001\u001a\u0004\u0018\u00010\u00148F¢\u0006\u0007\u001a\u0005\b·\u0001\u0010v¨\u0006»\u0001"}, m3636d2 = {"Lcom/robinhood/shared/settings/iibsettings/BaseSettingsFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "Lcom/robinhood/android/autoeventlogging/AutoLoggableFragment;", "Lcom/robinhood/android/settings/ui/SettingsAdapter$Callbacks;", "Landroid/view/View$OnLayoutChangeListener;", "Lcom/robinhood/android/serverclientcomponents/alert/ClientComponentAlertSheetFragment$Callbacks;", "<init>", "()V", "Lcom/robinhood/android/settings/models/api/ApiSettingsPage;", "page", "", "bindHeader", "(Lcom/robinhood/android/settings/models/api/ApiSettingsPage;)V", "Lcom/robinhood/models/serverdriven/db/GenericAction;", "action", "handleGenericAction", "(Lcom/robinhood/models/serverdriven/db/GenericAction;)V", "updateToggleSetting", "Lcom/robinhood/android/settings/models/ui/SettingsDialog;", "dialog", "", "settingId", "showToggleConfirmationDialog", "(Lcom/robinhood/android/settings/models/ui/SettingsDialog;Ljava/lang/String;)V", "Landroid/content/Context;", "context", "onAttach", "(Landroid/content/Context;)V", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onStop", "onDestroyView", "", "left", "top", "right", "bottom", "oldLeft", "oldTop", "oldRight", "oldBottom", "onLayoutChange", "(Landroid/view/View;IIIIIIII)V", "Lcom/robinhood/android/settings/models/api/ApiSettingsPage$Theme;", "theme", "settingsPage", "", "Lcom/robinhood/android/settings/models/ui/TypedSettingsItem;", "settingsItems", "", "showSettingsPlaceholder", "bind", "(Lcom/robinhood/android/settings/models/api/ApiSettingsPage$Theme;Lcom/robinhood/android/settings/models/api/ApiSettingsPage;Ljava/util/List;Z)V", "", "error", "handleError", "(Ljava/lang/Throwable;)V", "Lkotlin/Function0;", "content", "bindComposeView", "(Lkotlin/jvm/functions/Function2;)V", "settingsItem", "onSettingsActionTriggered", "(Lcom/robinhood/models/serverdriven/db/GenericAction;Lcom/robinhood/android/settings/models/ui/TypedSettingsItem;)V", "Lcom/robinhood/models/serverdriven/db/ServerDrivenButton;", "button", "onActionClicked", "(Lcom/robinhood/models/serverdriven/db/ServerDrivenButton;)Z", "Lcom/robinhood/models/serverdriven/db/GenericAction$DeeplinkAction;", "handleDeeplinkAction", "(Lcom/robinhood/models/serverdriven/db/GenericAction$DeeplinkAction;)Z", "Lcom/robinhood/models/serverdriven/db/GenericAction$GoldDowngradeAction;", "handleGoldDowngradeAction", "(Lcom/robinhood/models/serverdriven/db/GenericAction$GoldDowngradeAction;)V", "Lcom/robinhood/android/settings/models/ui/TypedSettingsItem$ToggleItem;", "toggleItem", "newToggleState", "Lcom/robinhood/android/designsystem/selectioncontrol/RdsToggleView;", "toggleView", "onToggleClicked", "(Lcom/robinhood/android/settings/models/ui/TypedSettingsItem$ToggleItem;ZLcom/robinhood/android/designsystem/selectioncontrol/RdsToggleView;)V", "handleToggleClick", "(Lcom/robinhood/android/settings/models/ui/TypedSettingsItem$ToggleItem;Z)Z", "Lcom/robinhood/android/settings/models/ui/TypedSettingsItem$SelectOneItem;", OptionsPortfolioRiskAnalyzerTopNavRowComposable.TEST_TAG_NAV_ROW_ITEM, "Lcom/robinhood/android/settings/models/ui/TypedSettingsItem$SelectOneItem$Option;", "selection", "stopLoading", "onSelectOneItemClicked", "(Lcom/robinhood/android/settings/models/ui/TypedSettingsItem$SelectOneItem;Lcom/robinhood/android/settings/models/ui/TypedSettingsItem$SelectOneItem$Option;Lkotlin/jvm/functions/Function0;)V", "id", "passthroughArgs", "onPositiveButtonClicked", "(ILandroid/os/Bundle;)Z", "onNegativeButtonClicked", "Lcom/robinhood/android/settings/models/ui/TypedSettingsItem$ValueItem;", "valueItem", "rowView", "onValueItemClicked", "(Lcom/robinhood/android/settings/models/ui/TypedSettingsItem$ValueItem;Landroid/view/View;)V", "Lcom/robinhood/android/settings/models/ui/TypedSettingsItem$AccordionItem;", "expanded", "onAccordionItemExpandedStateChanged", "(Lcom/robinhood/android/settings/models/ui/TypedSettingsItem$AccordionItem;Z)V", "Lcom/robinhood/analytics/EventLogger;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "getEventLogger", "()Lcom/robinhood/analytics/EventLogger;", "setEventLogger", "(Lcom/robinhood/analytics/EventLogger;)V", "screenName", "Ljava/lang/String;", "getScreenName", "()Ljava/lang/String;", "Lcom/robinhood/shared/settings/libsettings/databinding/FragmentSettingsBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "getBinding", "()Lcom/robinhood/shared/settings/libsettings/databinding/FragmentSettingsBinding;", "binding", "Lcom/robinhood/android/settings/ui/SettingsPlaceholderAdapter;", "placeholderAdapter", "Lcom/robinhood/android/settings/ui/SettingsPlaceholderAdapter;", "Lcom/robinhood/utils/ui/view/recyclerview/SingleItemAdapter;", "Lcom/robinhood/android/settings/ui/SettingsHeaderView;", "headerAdapter", "Lcom/robinhood/utils/ui/view/recyclerview/SingleItemAdapter;", "Lcom/robinhood/android/settings/ui/SettingsAdapter;", "settingsAdapter", "Lcom/robinhood/android/settings/ui/SettingsAdapter;", "Lcom/robinhood/utils/ui/view/recyclerview/CompositeAdapter;", "compositeAdapter", "Lcom/robinhood/utils/ui/view/recyclerview/CompositeAdapter;", "Lio/reactivex/disposables/Disposable;", "toolbarScrollDisposable", "Lio/reactivex/disposables/Disposable;", "Lkotlin/Pair;", "toggleItemAndNewValue", "Lkotlin/Pair;", "Lcom/robinhood/android/designsystem/selectioncontrol/RdsToggleView;", "getToggleView", "()Lcom/robinhood/android/designsystem/selectioncontrol/RdsToggleView;", "setToggleView", "(Lcom/robinhood/android/designsystem/selectioncontrol/RdsToggleView;)V", "selectOneStopLoadingCallback", "Lkotlin/jvm/functions/Function0;", "", "expandedAccordionItemIds$delegate", "Lkotlin/properties/ReadWriteProperty;", "getExpandedAccordionItemIds", "()Ljava/util/Set;", "expandedAccordionItemIds", "value", "settingsPageTheme", "Lcom/robinhood/android/settings/models/api/ApiSettingsPage$Theme;", "setSettingsPageTheme", "(Lcom/robinhood/android/settings/models/api/ApiSettingsPage$Theme;)V", "useDesignSystemToolbar", "Z", "getUseDesignSystemToolbar", "()Z", "Lcom/robinhood/scarlet/util/resource/ResourceReference;", "toolbarOriginalBackgroundTint", "Lcom/robinhood/scarlet/util/resource/ResourceReference;", "Lcom/robinhood/shared/settings/iibsettings/BaseSettingsFragment$Args;", "getArguments", "()Lcom/robinhood/shared/settings/iibsettings/BaseSettingsFragment$Args;", "arguments", "Lcom/robinhood/shared/settings/iibsettings/BaseSettingsDuxo;", "getDuxo", "()Lcom/robinhood/shared/settings/iibsettings/BaseSettingsDuxo;", "duxo", "getScreenDescription", "screenDescription", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "eventScreen", "getEntryPointIdentifier", "entryPointIdentifier", "Companion", "Args", "lib-settings_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes6.dex */
public abstract class BaseSettingsFragment extends BaseFragment implements AutoLoggableFragment, SettingsAdapter.Callbacks, View.OnLayoutChangeListener, ClientComponentAlertSheetFragment.Callbacks {
    public static final String APP_VERSION_ITEM_ID = "support_disclosures_app_version_row";

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;
    private final CompositeAdapter compositeAdapter;
    public EventLogger eventLogger;

    /* renamed from: expandedAccordionItemIds$delegate, reason: from kotlin metadata */
    private final Interfaces3 expandedAccordionItemIds;
    private final SingleItemAdapter<SettingsHeaderView, ApiSettingsPage> headerAdapter;
    private final SettingsPlaceholderAdapter placeholderAdapter;
    private final String screenName;
    private Function0<Unit> selectOneStopLoadingCallback;
    private final SettingsAdapter settingsAdapter;
    private ApiSettingsPage.Theme settingsPageTheme;
    private Tuples2<TypedSettingsItem.ToggleItem, Boolean> toggleItemAndNewValue;
    private RdsToggleView toggleView;
    private ResourceReferences4<?> toolbarOriginalBackgroundTint;
    private Disposable toolbarScrollDisposable;
    private final boolean useDesignSystemToolbar;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(BaseSettingsFragment.class, "binding", "getBinding()Lcom/robinhood/shared/settings/libsettings/databinding/FragmentSettingsBinding;", 0)), Reflection.property1(new PropertyReference1Impl(BaseSettingsFragment.class, "expandedAccordionItemIds", "getExpandedAccordionItemIds()Ljava/util/Set;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final Set<String> BLACKLISTED_SETTINGS_IDS = SetsKt.setOf("account_preferences_app_diagnostics_row");

    /* compiled from: BaseSettingsFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[ApiSettingsPage.Theme.values().length];
            try {
                iArr[ApiSettingsPage.Theme.GOLD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ApiSettingsPage.Theme.DEFAULT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[ApiSettingsPage.Header.Style.values().length];
            try {
                iArr2[ApiSettingsPage.Header.Style.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[ApiSettingsPage.Header.Style.HERO.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public abstract Args getArguments();

    public abstract BaseSettingsDuxo getDuxo();

    public boolean handleDeeplinkAction(GenericAction.DeeplinkAction action) {
        Intrinsics.checkNotNullParameter(action, "action");
        return false;
    }

    public void handleGoldDowngradeAction(GenericAction.GoldDowngradeAction action) {
        Intrinsics.checkNotNullParameter(action, "action");
    }

    public boolean handleToggleClick(TypedSettingsItem.ToggleItem toggleItem, boolean newToggleState) {
        Intrinsics.checkNotNullParameter(toggleItem, "toggleItem");
        return false;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(View view, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
        Intrinsics.checkNotNullParameter(view, "view");
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

    @Override // com.robinhood.android.settings.ui.SettingsAdapter.Callbacks
    public void onSettingsActionAppeared(TypedSettingsItem typedSettingsItem) {
        SettingsAdapter.Callbacks.DefaultImpls.onSettingsActionAppeared(this, typedSettingsItem);
    }

    public BaseSettingsFragment() {
        super(C39787R.layout.fragment_settings);
        this.screenName = "BONFIRE_SETTINGS_PAGE";
        this.binding = ViewBinding5.viewBinding(this, BaseSettingsFragment2.INSTANCE);
        this.placeholderAdapter = new SettingsPlaceholderAdapter(false);
        SingleItemAdapter<SettingsHeaderView, ApiSettingsPage> singleItemAdapterOf$default = SingleItemAdapter.Companion.of$default(SingleItemAdapter.INSTANCE, SettingsHeaderView.INSTANCE.inflater(this), null, 2, null);
        this.headerAdapter = singleItemAdapterOf$default;
        SettingsAdapter settingsAdapter = new SettingsAdapter(this);
        this.settingsAdapter = settingsAdapter;
        this.compositeAdapter = new CompositeAdapter((RecyclerView.Adapter<?>[]) new RecyclerView.Adapter[]{singleItemAdapterOf$default, settingsAdapter});
        this.expandedAccordionItemIds = (Interfaces3) BindSavedState2.savedSerializable(this, new LinkedHashSet()).provideDelegate(this, $$delegatedProperties[1]);
        this.useDesignSystemToolbar = true;
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

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.util.UiCallbacks.ScreenViewAnalyticable
    public String getScreenName() {
        return this.screenName;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.util.UiCallbacks.ScreenViewAnalyticable
    public String getScreenDescription() {
        return getArguments().getPageId();
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Screen getEventScreen() {
        return new Screen(Screen.Name.BONFIRE_SETTINGS_PAGE, null, getArguments().getPageId(), null, 10, null);
    }

    public final String getEntryPointIdentifier() {
        return getArguments().getEntryPointIdentifier();
    }

    private final FragmentSettingsBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentSettingsBinding) value;
    }

    protected final RdsToggleView getToggleView() {
        return this.toggleView;
    }

    protected final void setToggleView(RdsToggleView rdsToggleView) {
        this.toggleView = rdsToggleView;
    }

    private final Set<String> getExpandedAccordionItemIds() {
        return (Set) this.expandedAccordionItemIds.getValue(this, $$delegatedProperties[1]);
    }

    private final void setSettingsPageTheme(ApiSettingsPage.Theme theme) {
        ScarletManager scarletManager;
        if (theme == this.settingsPageTheme) {
            return;
        }
        this.settingsPageTheme = theme;
        ScarletContextWrapper scarletContextWrapper = getScarletContextWrapper();
        if (scarletContextWrapper == null || (scarletManager = ScarletManager2.getScarletManager(scarletContextWrapper)) == null) {
            return;
        }
        int i = theme == null ? -1 : WhenMappings.$EnumSwitchMapping$0[theme.ordinal()];
        if (i != -1) {
            if (i == 1) {
                ScarletManager.putOverlay$default(scarletManager, GoldOverlay.INSTANCE, null, 2, null);
                return;
            } else if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
        }
        ScarletManager.removeOverlay$default(scarletManager, GoldOverlay.INSTANCE.getPriority(), null, 2, null);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getUseDesignSystemToolbar() {
        return this.useDesignSystemToolbar;
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, com.robinhood.hammer.android.fragment.HammerFragment, androidx.fragment.app.Fragment
    public void onAttach(android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        ScarletContextWrapper scarletContextWrapper = new ScarletContextWrapper(context, null, null, 6, null);
        putDesignSystemOverlay(scarletContextWrapper);
        setScarletContextWrapper(scarletContextWrapper);
        if (Intrinsics.areEqual(getArguments().getPageId(), Constants6.MARGIN_SETTINGS_PAGE_ID)) {
            requireBaseActivity().getSupportFragmentManager().setFragmentResultListener(LegacyFragmentKey.MarginInvesting.DisableMarginInvesting.RESULT_KEY, this, new FragmentResultListener() { // from class: com.robinhood.shared.settings.iibsettings.BaseSettingsFragment.onAttach.2
                @Override // androidx.fragment.app.FragmentResultListener
                public final void onFragmentResult(String str, Bundle bundle) {
                    Intrinsics.checkNotNullParameter(str, "<unused var>");
                    Intrinsics.checkNotNullParameter(bundle, "<unused var>");
                    BaseSettingsFragment.this.popNearestParentBackStack();
                }
            });
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        getBinding().settingsRecyclerView.setAdapter(this.settingsAdapter.getSize() > 0 ? this.compositeAdapter : this.placeholderAdapter);
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        requireBaseActivity().resetStatusBarStyleOverride();
        RhToolbar rhToolbarRequireToolbar = requireToolbar();
        ScarletManager2.overrideAttribute(rhToolbarRequireToolbar, R.attr.backgroundTint, this.toolbarOriginalBackgroundTint);
        rhToolbarRequireToolbar.setColorControlNormalOverride(null);
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        Disposable disposable = this.toolbarScrollDisposable;
        if (disposable != null) {
            disposable.dispose();
        }
        this.toolbarScrollDisposable = null;
    }

    protected final void bind(ApiSettingsPage.Theme theme, ApiSettingsPage settingsPage, List<? extends TypedSettingsItem> settingsItems, boolean showSettingsPlaceholder) throws Resources.NotFoundException {
        ArrayList arrayList;
        setSettingsPageTheme(theme);
        bindHeader(settingsPage);
        if (showSettingsPlaceholder) {
            RecyclerView recyclerView = getBinding().settingsRecyclerView;
            if (!Intrinsics.areEqual(recyclerView.getAdapter(), this.placeholderAdapter)) {
                recyclerView.setAdapter(this.placeholderAdapter);
            }
            Intrinsics.checkNotNull(recyclerView);
            return;
        }
        RecyclerView recyclerView2 = getBinding().settingsRecyclerView;
        if (!Intrinsics.areEqual(recyclerView2.getAdapter(), this.compositeAdapter)) {
            recyclerView2.setAdapter(this.compositeAdapter);
        }
        if (settingsItems != null) {
            List<? extends TypedSettingsItem> list = settingsItems;
            arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            for (TypedSettingsItem typedSettingsItemCopy$default : list) {
                if (getExpandedAccordionItemIds().contains(typedSettingsItemCopy$default.getId())) {
                    Intrinsics.checkNotNull(typedSettingsItemCopy$default, "null cannot be cast to non-null type com.robinhood.android.settings.models.ui.TypedSettingsItem.AccordionItem");
                    typedSettingsItemCopy$default = TypedSettingsItem.AccordionItem.copy$default((TypedSettingsItem.AccordionItem) typedSettingsItemCopy$default, null, null, null, null, null, true, 31, null);
                }
                arrayList.add(typedSettingsItemCopy$default);
            }
        } else {
            arrayList = null;
        }
        this.settingsAdapter.submitList(arrayList);
    }

    protected final void handleError(Throwable error) throws Throwable {
        Intrinsics.checkNotNullParameter(error, "error");
        RdsToggleView rdsToggleView = this.toggleView;
        if (rdsToggleView != null) {
            rdsToggleView.setLoading(false);
        }
        Function0<Unit> function0 = this.selectOneStopLoadingCallback;
        if (function0 != null) {
            function0.invoke();
        }
        ActivityErrorHandler.Companion companion = ActivityErrorHandler.INSTANCE;
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        ActivityErrorHandler.Companion.handle$default(companion, fragmentActivityRequireActivity, error, true, false, 0, null, 56, null);
    }

    protected final void bindComposeView(final Function2<? super Composer, ? super Integer, Unit> content) {
        Intrinsics.checkNotNullParameter(content, "content");
        getBinding().composeView.setContent(ComposableLambda3.composableLambdaInstance(-1087492443, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.settings.iibsettings.BaseSettingsFragment.bindComposeView.1
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
                    ComposerKt.traceEventStart(-1087492443, i, -1, "com.robinhood.shared.settings.iibsettings.BaseSettingsFragment.bindComposeView.<anonymous> (BaseSettingsFragment.kt:215)");
                }
                content.invoke(composer, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
    }

    private final void bindHeader(ApiSettingsPage page) throws Resources.NotFoundException {
        ApiSettingsPage.Header.Data data;
        ApiSettingsPage.Header.Data data2;
        String title;
        this.headerAdapter.setData(page);
        String subtitle = null;
        String display_title = page != null ? page.getDisplay_title() : null;
        ApiSettingsPage.Header header = page != null ? page.getHeader() : null;
        RhToolbar rhToolbarRequireToolbar = requireToolbar();
        float dimension = getResources().getDimension(C11048R.dimen.toolbar_scroll_height);
        ApiSettingsPage.Header.Style style = header != null ? header.getStyle() : null;
        ApiSettingsPage.Header.Style style2 = ApiSettingsPage.Header.Style.HERO;
        ToolbarScrollAnimator toolbarScrollAnimator = new ToolbarScrollAnimator(rhToolbarRequireToolbar, dimension, (header != null ? header.getStyle() : null) == style2, style == style2, (header != null ? header.getStyle() : null) == style2, Float.valueOf(1.0f));
        Disposable disposable = this.toolbarScrollDisposable;
        if (disposable != null) {
            disposable.dispose();
        }
        RecyclerView settingsRecyclerView = getBinding().settingsRecyclerView;
        Intrinsics.checkNotNullExpressionValue(settingsRecyclerView, "settingsRecyclerView");
        this.toolbarScrollDisposable = ToolbarScrollAnimator.subscribe$default(toolbarScrollAnimator, settingsRecyclerView, this, null, 4, null);
        ApiSettingsPage.Header.Style style3 = header != null ? header.getStyle() : null;
        int i = style3 == null ? -1 : WhenMappings.$EnumSwitchMapping$1[style3.ordinal()];
        if (i == -1 || i == 1) {
            if (header != null && (data2 = header.getData()) != null && (title = data2.getTitle()) != null) {
                display_title = title;
            }
            rhToolbarRequireToolbar.setTitle(display_title);
            if (header != null && (data = header.getData()) != null) {
                subtitle = data.getSubtitle();
            }
            rhToolbarRequireToolbar.setSubtitle(subtitle);
            return;
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        rhToolbarRequireToolbar.setTitle(header.getData().getTitle());
        rhToolbarRequireToolbar.setSubtitle(header.getData().getSubtitle());
        if (this.toolbarOriginalBackgroundTint == null) {
            this.toolbarOriginalBackgroundTint = ScarletManager2.getAttribute(rhToolbarRequireToolbar, R$attr.backgroundTint);
            requireBaseActivity().overrideStatusBarStyle(false);
            ScarletManager2.overrideAttribute(rhToolbarRequireToolbar, R.attr.backgroundTint, new ThemedResourceReference(ResourceType.COLOR.INSTANCE, C20690R.attr.colorBlack));
            rhToolbarRequireToolbar.setColorControlNormalOverride(new ThemedResourceReference(ResourceType.COLOR_STATE_LIST.INSTANCE, C20690R.attr.colorWhite));
            rhToolbarRequireToolbar.getToolbar().setTitleTextColor(-1);
        }
    }

    @Override // com.robinhood.android.settings.ui.SettingsAdapter.Callbacks
    public void onSettingsActionTriggered(GenericAction action, TypedSettingsItem settingsItem) {
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(settingsItem, "settingsItem");
        handleGenericAction(action);
        SettingsItemLoggingUtils.logSettingsItemTap(getEventLogger(), settingsItem, getScreenDescription(), getEntryPointIdentifier());
    }

    @Override // com.robinhood.android.serverclientcomponents.actionbutton.ClientComponentButtonView.Callbacks
    public boolean onActionClicked(ServerDrivenButton button) {
        Intrinsics.checkNotNullParameter(button, "button");
        GenericAction typedAction = button.getTypedAction();
        if (typedAction == null) {
            return true;
        }
        handleGenericAction(typedAction);
        return true;
    }

    private final void handleGenericAction(GenericAction action) {
        if (action instanceof GenericAction.DeeplinkAction) {
            if (handleDeeplinkAction((GenericAction.DeeplinkAction) action)) {
                return;
            }
            BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C397831(action, null), 3, null);
        } else {
            if (action instanceof GenericAction.GoldDowngradeAction) {
                handleGoldDowngradeAction((GenericAction.GoldDowngradeAction) action);
                return;
            }
            if (action instanceof GenericAction.InfoAlertAction) {
                GenericAction.InfoAlertAction infoAlertAction = (GenericAction.InfoAlertAction) action;
                Navigator.DefaultImpls.createDialogFragment$default(getNavigator(), new LegacyDialogFragmentKey.ClientComponentAlertSheet(infoAlertAction.getAlert(), true, false, 0, 12, (DefaultConstructorMarker) null), null, 2, null).show(getChildFragmentManager(), infoAlertAction.getAlert().getTitle());
                return;
            }
            throw new IllegalStateException("Item action not supported in server-driven settings");
        }
    }

    /* compiled from: BaseSettingsFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.settings.iibsettings.BaseSettingsFragment$handleGenericAction$1", m3645f = "BaseSettingsFragment.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_CURSOR_POINTER_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.settings.iibsettings.BaseSettingsFragment$handleGenericAction$1 */
    static final class C397831 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ GenericAction $action;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C397831(GenericAction genericAction, Continuation<? super C397831> continuation) {
            super(2, continuation);
            this.$action = genericAction;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return BaseSettingsFragment.this.new C397831(this.$action, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C397831) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Navigator navigator = BaseSettingsFragment.this.getNavigator();
                android.content.Context contextRequireContext = BaseSettingsFragment.this.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                Uri uri = ((GenericAction.DeeplinkAction) this.$action).getUri();
                this.label = 1;
                if (Navigator.DefaultImpls.handleDeepLinkDirect$default(navigator, contextRequireContext, uri, false, false, null, this, 28, null) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Override // com.robinhood.android.settings.ui.SettingsAdapter.Callbacks
    public void onToggleClicked(TypedSettingsItem.ToggleItem toggleItem, boolean newToggleState, RdsToggleView toggleView) throws Resources.NotFoundException {
        SettingsDialog turnOffConfirmationAlert;
        Intrinsics.checkNotNullParameter(toggleItem, "toggleItem");
        Intrinsics.checkNotNullParameter(toggleView, "toggleView");
        toggleView.setCheckedProgrammatically(!newToggleState);
        this.toggleView = toggleView;
        this.toggleItemAndNewValue = new Tuples2<>(toggleItem, Boolean.valueOf(newToggleState));
        if (handleToggleClick(toggleItem, newToggleState)) {
            return;
        }
        if (newToggleState) {
            turnOffConfirmationAlert = toggleItem.getTurnOnConfirmationAlert();
        } else {
            turnOffConfirmationAlert = toggleItem.getTurnOffConfirmationAlert();
        }
        if (turnOffConfirmationAlert != null) {
            showToggleConfirmationDialog(turnOffConfirmationAlert, toggleItem.getSettingId());
        } else {
            updateToggleSetting();
        }
        SettingsItemLoggingUtils.logSettingsItemTap(getEventLogger(), toggleItem, getScreenDescription(), getEntryPointIdentifier());
    }

    private final void updateToggleSetting() {
        RdsToggleView rdsToggleView = this.toggleView;
        if (rdsToggleView != null) {
            rdsToggleView.setLoading(true);
        }
        BaseSettingsDuxo duxo = getDuxo();
        Tuples2<TypedSettingsItem.ToggleItem, Boolean> tuples2 = this.toggleItemAndNewValue;
        if (tuples2 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        TypedSettingsItem.ToggleItem first = tuples2.getFirst();
        Tuples2<TypedSettingsItem.ToggleItem, Boolean> tuples22 = this.toggleItemAndNewValue;
        if (tuples22 != null) {
            duxo.updateToggleSetting(first, tuples22.getSecond().booleanValue());
            return;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    @Override // com.robinhood.android.settings.ui.SettingsAdapter.Callbacks
    public void onSelectOneItemClicked(TypedSettingsItem.SelectOneItem item, TypedSettingsItem.SelectOneItem.Option selection, Function0<Unit> stopLoading) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(selection, "selection");
        Intrinsics.checkNotNullParameter(stopLoading, "stopLoading");
        this.selectOneStopLoadingCallback = stopLoading;
        getDuxo().updateSelectOneSetting(item, selection);
    }

    private final void showToggleConfirmationDialog(SettingsDialog dialog, String settingId) {
        RhDialogFragment.Companion companion = RhDialogFragment.INSTANCE;
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        RhDialogFragment.Builder positiveButton = companion.create(contextRequireContext).setUseDesignSystemOverlay(true).setId(C28356R.id.dialog_id_settings_toggle_confirmation_dialog).setTitle(dialog.getTitle()).setMessage(dialog.getSubtitleMarkdown()).setNegativeButton(dialog.getCancelButtonTitle()).setPositiveButton(dialog.getConfirmButtonTitle());
        FragmentManager parentFragmentManager = getParentFragmentManager();
        Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "getParentFragmentManager(...)");
        RhDialogFragment.Builder.show$default(positiveButton, parentFragmentManager, settingId, false, 4, null);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.ui.RhDialogFragment.OnClickListener
    public boolean onPositiveButtonClicked(int id, Bundle passthroughArgs) {
        if (id == C28356R.id.dialog_id_settings_toggle_confirmation_dialog) {
            updateToggleSetting();
            return true;
        }
        return super.onPositiveButtonClicked(id, passthroughArgs);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.ui.RhDialogFragment.OnClickListener
    public boolean onNegativeButtonClicked(int id, Bundle passthroughArgs) {
        if (id == C28356R.id.dialog_id_settings_toggle_confirmation_dialog) {
            return true;
        }
        return super.onNegativeButtonClicked(id, passthroughArgs);
    }

    @Override // com.robinhood.android.settings.ui.SettingsAdapter.Callbacks
    public void onValueItemClicked(TypedSettingsItem.ValueItem valueItem, View rowView) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(valueItem, "valueItem");
        Intrinsics.checkNotNullParameter(rowView, "rowView");
        ClipboardUtil.INSTANCE.copyToClipboardWithHapticFeedback(valueItem.getValue(), valueItem.getTitle(), rowView, true);
    }

    @Override // com.robinhood.android.settings.ui.SettingsAdapter.Callbacks
    public void onAccordionItemExpandedStateChanged(TypedSettingsItem.AccordionItem item, boolean expanded) {
        Intrinsics.checkNotNullParameter(item, "item");
        if (expanded) {
            getExpandedAccordionItemIds().add(item.getId());
        } else {
            getExpandedAccordionItemIds().remove(item.getId());
        }
    }

    /* compiled from: BaseSettingsFragment.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J+\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\u0010\u001a\u00020\u0011J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0011R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/shared/settings/iibsettings/BaseSettingsFragment$Args;", "Landroid/os/Parcelable;", "pageId", "", "accountNumber", "entryPointIdentifier", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getPageId", "()Ljava/lang/String;", "getAccountNumber", "getEntryPointIdentifier", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-settings_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 0;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final String accountNumber;
        private final String entryPointIdentifier;
        private final String pageId;

        /* compiled from: BaseSettingsFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args(parcel.readString(), parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = args.pageId;
            }
            if ((i & 2) != 0) {
                str2 = args.accountNumber;
            }
            if ((i & 4) != 0) {
                str3 = args.entryPointIdentifier;
            }
            return args.copy(str, str2, str3);
        }

        /* renamed from: component1, reason: from getter */
        public final String getPageId() {
            return this.pageId;
        }

        /* renamed from: component2, reason: from getter */
        public final String getAccountNumber() {
            return this.accountNumber;
        }

        /* renamed from: component3, reason: from getter */
        public final String getEntryPointIdentifier() {
            return this.entryPointIdentifier;
        }

        public final Args copy(String pageId, String accountNumber, String entryPointIdentifier) {
            Intrinsics.checkNotNullParameter(pageId, "pageId");
            return new Args(pageId, accountNumber, entryPointIdentifier);
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
            return Intrinsics.areEqual(this.pageId, args.pageId) && Intrinsics.areEqual(this.accountNumber, args.accountNumber) && Intrinsics.areEqual(this.entryPointIdentifier, args.entryPointIdentifier);
        }

        public int hashCode() {
            int iHashCode = this.pageId.hashCode() * 31;
            String str = this.accountNumber;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.entryPointIdentifier;
            return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            return "Args(pageId=" + this.pageId + ", accountNumber=" + this.accountNumber + ", entryPointIdentifier=" + this.entryPointIdentifier + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.pageId);
            dest.writeString(this.accountNumber);
            dest.writeString(this.entryPointIdentifier);
        }

        public Args(String pageId, String str, String str2) {
            Intrinsics.checkNotNullParameter(pageId, "pageId");
            this.pageId = pageId;
            this.accountNumber = str;
            this.entryPointIdentifier = str2;
        }

        public /* synthetic */ Args(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
        }

        public final String getPageId() {
            return this.pageId;
        }

        public final String getAccountNumber() {
            return this.accountNumber;
        }

        public final String getEntryPointIdentifier() {
            return this.entryPointIdentifier;
        }
    }

    /* compiled from: BaseSettingsFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/shared/settings/iibsettings/BaseSettingsFragment$Companion;", "", "<init>", "()V", "BLACKLISTED_SETTINGS_IDS", "", "", "getBLACKLISTED_SETTINGS_IDS", "()Ljava/util/Set;", "APP_VERSION_ITEM_ID", "lib-settings_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final Set<String> getBLACKLISTED_SETTINGS_IDS() {
            return BaseSettingsFragment.BLACKLISTED_SETTINGS_IDS;
        }
    }
}
