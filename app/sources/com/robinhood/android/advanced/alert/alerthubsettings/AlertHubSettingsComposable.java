package com.robinhood.android.advanced.alert.alerthubsettings;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import androidx.compose.foundation.Background3;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.material.ScaffoldKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.ColorFilter;
import androidx.compose.p011ui.graphics.painter.Painter;
import androidx.compose.p011ui.layout.ContentScale;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.res.PainterResources_androidKt;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.compose.FlowExtKt;
import androidx.lifecycle.compose.LocalLifecycleOwnerKt;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import com.google.accompanist.systemuicontroller.SystemUiController;
import com.google.accompanist.systemuicontroller.SystemUiController3;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.advanced.alert.C8387R;
import com.robinhood.android.advanced.alert.alerthubsettings.AlertHubSettingsComposable;
import com.robinhood.android.advanced.alert.alerthubsettings.AlertHubSettingsEvent;
import com.robinhood.android.advanced.alert.alerthubsettings.AlertHubSettingsViewState;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.util.p090rx.ActivityErrorHandler;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals4;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.designsystem.compose.ScarletComposeInterop;
import com.robinhood.android.education.contracts.AdvancedAlert;
import com.robinhood.android.education.contracts.AdvancedAlert4;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.android.util.p275rx.AbsErrorHandler;
import com.robinhood.compose.bento.component.BentoAppBarKt;
import com.robinhood.compose.bento.component.BentoAppBarScope;
import com.robinhood.compose.bento.component.BentoInfoBanner2;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.TopBarScrollState;
import com.robinhood.compose.bento.component.TopBarScrollState3;
import com.robinhood.compose.bento.component.rows.BentoBaseRowKt;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.compose.bento.theme.LocalShowPlaceholder;
import com.robinhood.compose.common.LoadingScreenComposablesKt;
import com.robinhood.compose.common.SwipeToDeleteRow2;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.librobinhood.data.store.alert.AdvancedAlertEntryPoint;
import com.robinhood.models.advanced.alert.p302db.AlertHubSettings2;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.scarlet.ScarletManager;
import com.robinhood.shared.common.contracts.RemoteDisclosureKey;
import com.robinhood.utils.Either2;
import com.robinhood.utils.compose.LocalActivity3;
import com.robinhood.utils.extensions.Contexts8;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
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
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: AlertHubSettingsComposable.kt */
@Metadata(m3635d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001ae\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0013\u0010\u0014\u001a5\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00060\u0015H\u0003¢\u0006\u0004\b\u0017\u0010\u0018\u001a/\u0010\u001b\u001a\u00020\u00062\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u0012\u001a\u00020\u0011H\u0003¢\u0006\u0004\b\u001b\u0010\u001c\u001a!\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u001d2\b\b\u0002\u0010\u0010\u001a\u00020\u000fH\u0003¢\u0006\u0004\b\u001f\u0010 \u001aK\u0010%\u001a\u00020\u00062\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0!2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u00060\u0004H\u0003¢\u0006\u0004\b%\u0010&\u001a+\u0010)\u001a\u00020\u00062\u0006\u0010(\u001a\u00020'2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0003¢\u0006\u0004\b)\u0010*\u001aM\u00100\u001a\u00020\u00062\b\u0010,\u001a\u0004\u0018\u00010+2\b\u0010-\u001a\u0004\u0018\u00010+2\u0006\u0010/\u001a\u00020.2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u0010\u001a\u00020\u000fH\u0003¢\u0006\u0004\b0\u00101\"\u0014\u00102\u001a\u00020+8\u0000X\u0080T¢\u0006\u0006\n\u0004\b2\u00103¨\u0006;²\u0006\f\u0010\u001e\u001a\u0002048\nX\u008a\u0084\u0002²\u0006\u0012\u0010#\u001a\b\u0012\u0004\u0012\u00020\"058\nX\u008a\u0084\u0002²\u0006\u0014\u00108\u001a\n\u0012\u0004\u0012\u000207\u0018\u0001068\nX\u008a\u0084\u0002²\u0006\u0014\u0010:\u001a\n\u0012\u0004\u0012\u000209\u0018\u0001068\nX\u008a\u0084\u0002"}, m3636d2 = {"Lcom/robinhood/models/advanced/alert/db/AlertHubSettingsEntityType;", "entityType", "Lcom/robinhood/android/education/contracts/AlertHubSettingsEntryPoint;", "entryPoint", "Lkotlin/Function1;", "Landroid/content/Intent;", "", "startActivity", "Lcom/robinhood/android/navigation/Navigator;", "navigator", "Lcom/robinhood/scarlet/ScarletManager;", "scarletManager", "Lcom/robinhood/android/common/util/rx/ActivityErrorHandler;", "", "activityErrorHandler", "Landroidx/compose/ui/Modifier;", "modifier", "Lcom/robinhood/android/advanced/alert/alerthubsettings/AlertHubSettingsDuxo;", "duxo", "AlertHubSettingsComposable", "(Lcom/robinhood/models/advanced/alert/db/AlertHubSettingsEntityType;Lcom/robinhood/android/education/contracts/AlertHubSettingsEntryPoint;Lkotlin/jvm/functions/Function1;Lcom/robinhood/android/navigation/Navigator;Lcom/robinhood/scarlet/ScarletManager;Lcom/robinhood/android/common/util/rx/ActivityErrorHandler;Landroidx/compose/ui/Modifier;Lcom/robinhood/android/advanced/alert/alerthubsettings/AlertHubSettingsDuxo;Landroidx/compose/runtime/Composer;II)V", "Lkotlin/Function0;", "content", "AlertHubSettingsThemeOverlay", "(Lcom/robinhood/models/advanced/alert/db/AlertHubSettingsEntityType;Lcom/robinhood/android/education/contracts/AlertHubSettingsEntryPoint;Lcom/robinhood/scarlet/ScarletManager;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/foundation/lazy/LazyListState;", "listState", "HandleEvents", "(Lcom/robinhood/android/common/util/rx/ActivityErrorHandler;Landroidx/compose/foundation/lazy/LazyListState;Lcom/robinhood/android/advanced/alert/alerthubsettings/AlertHubSettingsDuxo;Landroidx/compose/runtime/Composer;II)V", "Lcom/robinhood/android/advanced/alert/alerthubsettings/AlertHubSettingsViewState$Loaded;", "viewState", "AlertHubSettingsNoAlert", "(Lcom/robinhood/android/advanced/alert/alerthubsettings/AlertHubSettingsViewState$Loaded;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/android/advanced/alert/alerthubsettings/AlertHubSettingsViewState$Item;", "items", "onDelete", "AlertHubSettingsList", "(Lkotlinx/collections/immutable/ImmutableList;Lcom/robinhood/android/navigation/Navigator;Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "", "isNotificationsInfoBannerVisible", "AlertHubSettingsInfoBanner", "(ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "", "title", "infoActionContentfulId", "Lcom/robinhood/compose/bento/component/TopBarScrollState;", "topBarState", "AlertHubSettingsTopAppBar", "(Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/compose/bento/component/TopBarScrollState;Lcom/robinhood/models/advanced/alert/db/AlertHubSettingsEntityType;Lcom/robinhood/android/education/contracts/AlertHubSettingsEntryPoint;Lcom/robinhood/android/navigation/Navigator;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "InfoActionBannerTag", "Ljava/lang/String;", "Lcom/robinhood/android/advanced/alert/alerthubsettings/AlertHubSettingsViewState;", "", "Lcom/robinhood/android/udf/event/Event;", "Lcom/robinhood/android/advanced/alert/alerthubsettings/AlertHubSettingsEvent$FetchResponseError;", "fetchResponseErrorEvent", "Lcom/robinhood/android/advanced/alert/alerthubsettings/AlertHubSettingsEvent$RemoveFromListError;", "removeFromListErrorEvent", "feature-lib-advanced-alert_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.advanced.alert.alerthubsettings.AlertHubSettingsComposableKt, reason: use source file name */
/* loaded from: classes24.dex */
public final class AlertHubSettingsComposable {
    public static final String InfoActionBannerTag = "InfoActionBanner";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AlertHubSettingsComposable$lambda$1(AlertHubSettings2 alertHubSettings2, AdvancedAlert4 advancedAlert4, Function1 function1, Navigator navigator, ScarletManager scarletManager, ActivityErrorHandler activityErrorHandler, Modifier modifier, AlertHubSettingsDuxo alertHubSettingsDuxo, int i, int i2, Composer composer, int i3) {
        AlertHubSettingsComposable(alertHubSettings2, advancedAlert4, function1, navigator, scarletManager, activityErrorHandler, modifier, alertHubSettingsDuxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AlertHubSettingsInfoBanner$lambda$19(boolean z, Function1 function1, int i, Composer composer, int i2) {
        AlertHubSettingsInfoBanner(z, function1, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AlertHubSettingsList$lambda$16(ImmutableList immutableList, Navigator navigator, LazyListState lazyListState, Modifier modifier, Function1 function1, int i, int i2, Composer composer, int i3) {
        AlertHubSettingsList(immutableList, navigator, lazyListState, modifier, function1, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AlertHubSettingsNoAlert$lambda$10(AlertHubSettingsViewState.Loaded loaded, Modifier modifier, int i, int i2, Composer composer, int i3) {
        AlertHubSettingsNoAlert(loaded, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AlertHubSettingsThemeOverlay$lambda$2(AlertHubSettings2 alertHubSettings2, AdvancedAlert4 advancedAlert4, ScarletManager scarletManager, Function2 function2, int i, Composer composer, int i2) {
        AlertHubSettingsThemeOverlay(alertHubSettings2, advancedAlert4, scarletManager, function2, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AlertHubSettingsTopAppBar$lambda$20(String str, String str2, TopBarScrollState topBarScrollState, AlertHubSettings2 alertHubSettings2, AdvancedAlert4 advancedAlert4, Navigator navigator, Modifier modifier, int i, int i2, Composer composer, int i3) {
        AlertHubSettingsTopAppBar(str, str2, topBarScrollState, alertHubSettings2, advancedAlert4, navigator, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HandleEvents$lambda$8(ActivityErrorHandler activityErrorHandler, LazyListState lazyListState, AlertHubSettingsDuxo alertHubSettingsDuxo, int i, int i2, Composer composer, int i3) {
        HandleEvents(activityErrorHandler, lazyListState, alertHubSettingsDuxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AlertHubSettingsViewState AlertHubSettingsComposable$lambda$0(SnapshotState4<? extends AlertHubSettingsViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    private static final Event<AlertHubSettingsEvent.FetchResponseError> HandleEvents$lambda$3(SnapshotState4<Event<AlertHubSettingsEvent.FetchResponseError>> snapshotState4) {
        return snapshotState4.getValue();
    }

    private static final Event<AlertHubSettingsEvent.RemoveFromListError> HandleEvents$lambda$5(SnapshotState4<Event<AlertHubSettingsEvent.RemoveFromListError>> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:137:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x012f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AlertHubSettingsComposable(final AlertHubSettings2 entityType, final AdvancedAlert4 entryPoint, final Function1<? super Intent, Unit> startActivity, final Navigator navigator, final ScarletManager scarletManager, final ActivityErrorHandler activityErrorHandler, Modifier modifier, AlertHubSettingsDuxo alertHubSettingsDuxo, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        AlertHubSettingsDuxo alertHubSettingsDuxo2;
        Composer composer2;
        int i4;
        int i5;
        Modifier modifier3;
        AlertHubSettingsDuxo alertHubSettingsDuxo3;
        CreationExtras defaultViewModelCreationExtras;
        Composer composer3;
        final Modifier modifier4;
        final AlertHubSettingsDuxo alertHubSettingsDuxo4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(entityType, "entityType");
        Intrinsics.checkNotNullParameter(entryPoint, "entryPoint");
        Intrinsics.checkNotNullParameter(startActivity, "startActivity");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(scarletManager, "scarletManager");
        Intrinsics.checkNotNullParameter(activityErrorHandler, "activityErrorHandler");
        Composer composerStartRestartGroup = composer.startRestartGroup(68868552);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(entityType.ordinal()) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(entryPoint.ordinal()) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(startActivity) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(navigator) ? 2048 : 1024;
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            i3 |= (32768 & i) == 0 ? composerStartRestartGroup.changed(scarletManager) : composerStartRestartGroup.changedInstance(scarletManager) ? 16384 : 8192;
        }
        if ((i2 & 32) != 0) {
            i3 |= 196608;
        } else if ((i & 196608) == 0) {
            i3 |= (262144 & i) == 0 ? composerStartRestartGroup.changed(activityErrorHandler) : composerStartRestartGroup.changedInstance(activityErrorHandler) ? 131072 : 65536;
        }
        int i6 = i2 & 64;
        if (i6 == 0) {
            if ((1572864 & i) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 1048576 : 524288;
            }
            if ((12582912 & i) != 0) {
                if ((i2 & 128) == 0) {
                    alertHubSettingsDuxo2 = alertHubSettingsDuxo;
                    int i7 = composerStartRestartGroup.changedInstance(alertHubSettingsDuxo2) ? 8388608 : 4194304;
                    i3 |= i7;
                } else {
                    alertHubSettingsDuxo2 = alertHubSettingsDuxo;
                }
                i3 |= i7;
            } else {
                alertHubSettingsDuxo2 = alertHubSettingsDuxo;
            }
            if ((4793491 & i3) == 4793490 || !composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                    if (i6 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if ((i2 & 128) == 0) {
                        composerStartRestartGroup.startReplaceGroup(-747520797);
                        ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
                        if (current == null) {
                            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                        }
                        ViewModelProvider.Factory factoryCreateViewModelFactory = DuxosKt.createViewModelFactory(current, composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(1729797275);
                        if (current instanceof HasDefaultViewModelProviderFactory) {
                            defaultViewModelCreationExtras = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
                        } else {
                            defaultViewModelCreationExtras = CreationExtras.Empty.INSTANCE;
                        }
                        CreationExtras creationExtras = defaultViewModelCreationExtras;
                        i4 = 0;
                        ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(AlertHubSettingsDuxo.class), current, (String) null, factoryCreateViewModelFactory, creationExtras, composerStartRestartGroup, 0, 0);
                        composer2 = composerStartRestartGroup;
                        composer2.endReplaceableGroup();
                        final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                        final Lifecycle lifecycle = ((LifecycleOwner) composer2.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                        composer2.startReplaceGroup(-1633490746);
                        boolean zChangedInstance = composer2.changedInstance(baseDuxo) | composer2.changedInstance(lifecycle);
                        Object objRememberedValue = composer2.rememberedValue();
                        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.android.advanced.alert.alerthubsettings.AlertHubSettingsComposableKt$AlertHubSettingsComposable$$inlined$duxo$1
                                @Override // kotlin.jvm.functions.Function1
                                public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                    Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                    final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                    lifecycle.addObserver(duxoLifecycleObserver);
                                    final Lifecycle lifecycle2 = lifecycle;
                                    return new DisposableEffectResult() { // from class: com.robinhood.android.advanced.alert.alerthubsettings.AlertHubSettingsComposableKt$AlertHubSettingsComposable$$inlined$duxo$1.1
                                        @Override // androidx.compose.runtime.DisposableEffectResult
                                        public void dispose() {
                                            lifecycle2.removeObserver(duxoLifecycleObserver);
                                        }
                                    };
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue);
                        }
                        composer2.endReplaceGroup();
                        EffectsKt.DisposableEffect(lifecycle, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue, composer2, 0);
                        composer2.endReplaceGroup();
                        int i8 = i3 & (-29360129);
                        alertHubSettingsDuxo3 = (AlertHubSettingsDuxo) baseDuxo;
                        i5 = i8;
                        modifier3 = modifier2;
                    } else {
                        composer2 = composerStartRestartGroup;
                        i4 = 0;
                        i5 = i3;
                        modifier3 = modifier2;
                        alertHubSettingsDuxo3 = alertHubSettingsDuxo2;
                    }
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i2 & 128) != 0) {
                        i3 &= -29360129;
                    }
                    i5 = i3;
                    composer2 = composerStartRestartGroup;
                    modifier3 = modifier2;
                    alertHubSettingsDuxo3 = alertHubSettingsDuxo2;
                    i4 = 0;
                }
                composer2.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(68868552, i5, -1, "com.robinhood.android.advanced.alert.alerthubsettings.AlertHubSettingsComposable (AlertHubSettingsComposable.kt:85)");
                }
                Composer composer4 = composer2;
                SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(alertHubSettingsDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer4, 0, 7);
                LazyListState lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(i4, i4, composer4, i4, 3);
                TopBarScrollState topBarScrollStateRememberTopBarScrollState = TopBarScrollState3.rememberTopBarScrollState(0.0f, composer4, i4, 1);
                int i9 = i5 >> 15;
                int i10 = i5;
                HandleEvents(activityErrorHandler, lazyListStateRememberLazyListState, alertHubSettingsDuxo3, composer4, ActivityErrorHandler.$stable | (i9 & 14) | (i9 & 896), 0);
                AlertHubSettingsDuxo alertHubSettingsDuxo5 = alertHubSettingsDuxo3;
                Modifier modifier5 = modifier3;
                AlertHubSettingsThemeOverlay(entityType, entryPoint, scarletManager, ComposableLambda3.rememberComposableLambda(-2025587147, true, new C84361(snapshotState4CollectAsStateWithLifecycle, modifier5, topBarScrollStateRememberTopBarScrollState, entityType, entryPoint, navigator, lazyListStateRememberLazyListState, startActivity, alertHubSettingsDuxo5), composer4, 54), composer4, (i10 & 14) | 3072 | (i10 & 112) | (ScarletManager.$stable << 6) | ((i10 >> 6) & 896));
                composer3 = composer4;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier5;
                alertHubSettingsDuxo4 = alertHubSettingsDuxo5;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                composer3 = composerStartRestartGroup;
                modifier4 = modifier2;
                alertHubSettingsDuxo4 = alertHubSettingsDuxo2;
            }
            scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.advanced.alert.alerthubsettings.AlertHubSettingsComposableKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return AlertHubSettingsComposable.AlertHubSettingsComposable$lambda$1(entityType, entryPoint, startActivity, navigator, scarletManager, activityErrorHandler, modifier4, alertHubSettingsDuxo4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 1572864;
        modifier2 = modifier;
        if ((12582912 & i) != 0) {
        }
        if ((4793491 & i3) == 4793490) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i6 != 0) {
                }
                if ((i2 & 128) == 0) {
                }
                composer2.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                Composer composer42 = composer2;
                SnapshotState4 snapshotState4CollectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(alertHubSettingsDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer42, 0, 7);
                LazyListState lazyListStateRememberLazyListState2 = LazyListStateKt.rememberLazyListState(i4, i4, composer42, i4, 3);
                TopBarScrollState topBarScrollStateRememberTopBarScrollState2 = TopBarScrollState3.rememberTopBarScrollState(0.0f, composer42, i4, 1);
                int i92 = i5 >> 15;
                int i102 = i5;
                HandleEvents(activityErrorHandler, lazyListStateRememberLazyListState2, alertHubSettingsDuxo3, composer42, ActivityErrorHandler.$stable | (i92 & 14) | (i92 & 896), 0);
                AlertHubSettingsDuxo alertHubSettingsDuxo52 = alertHubSettingsDuxo3;
                Modifier modifier52 = modifier3;
                AlertHubSettingsThemeOverlay(entityType, entryPoint, scarletManager, ComposableLambda3.rememberComposableLambda(-2025587147, true, new C84361(snapshotState4CollectAsStateWithLifecycle2, modifier52, topBarScrollStateRememberTopBarScrollState2, entityType, entryPoint, navigator, lazyListStateRememberLazyListState2, startActivity, alertHubSettingsDuxo52), composer42, 54), composer42, (i102 & 14) | 3072 | (i102 & 112) | (ScarletManager.$stable << 6) | ((i102 >> 6) & 896));
                composer3 = composer42;
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier4 = modifier52;
                alertHubSettingsDuxo4 = alertHubSettingsDuxo52;
            }
        }
        scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* compiled from: AlertHubSettingsComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.advanced.alert.alerthubsettings.AlertHubSettingsComposableKt$AlertHubSettingsComposable$1 */
    static final class C84361 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ AlertHubSettingsDuxo $duxo;
        final /* synthetic */ AlertHubSettings2 $entityType;
        final /* synthetic */ AdvancedAlert4 $entryPoint;
        final /* synthetic */ LazyListState $listState;
        final /* synthetic */ Modifier $modifier;
        final /* synthetic */ Navigator $navigator;
        final /* synthetic */ Function1<Intent, Unit> $startActivity;
        final /* synthetic */ TopBarScrollState $topBarState;
        final /* synthetic */ SnapshotState4<AlertHubSettingsViewState> $viewState$delegate;

        /* JADX WARN: Multi-variable type inference failed */
        C84361(SnapshotState4<? extends AlertHubSettingsViewState> snapshotState4, Modifier modifier, TopBarScrollState topBarScrollState, AlertHubSettings2 alertHubSettings2, AdvancedAlert4 advancedAlert4, Navigator navigator, LazyListState lazyListState, Function1<? super Intent, Unit> function1, AlertHubSettingsDuxo alertHubSettingsDuxo) {
            this.$viewState$delegate = snapshotState4;
            this.$modifier = modifier;
            this.$topBarState = topBarScrollState;
            this.$entityType = alertHubSettings2;
            this.$entryPoint = advancedAlert4;
            this.$navigator = navigator;
            this.$listState = lazyListState;
            this.$startActivity = function1;
            this.$duxo = alertHubSettingsDuxo;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final DisposableEffectResult invoke$lambda$2$lambda$1(final SystemUiController systemUiController, final long j, DisposableEffectScope DisposableEffect) {
            Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
            SystemUiController.m9212setStatusBarColorek8zF_U$default(systemUiController, j, false, null, 6, null);
            return new DisposableEffectResult() { // from class: com.robinhood.android.advanced.alert.alerthubsettings.AlertHubSettingsComposableKt$AlertHubSettingsComposable$1$invoke$lambda$2$lambda$1$$inlined$onDispose$1
                @Override // androidx.compose.runtime.DisposableEffectResult
                public void dispose() {
                    SystemUiController.m9212setStatusBarColorek8zF_U$default(systemUiController, j, false, null, 6, null);
                }
            };
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2025587147, i, -1, "com.robinhood.android.advanced.alert.alerthubsettings.AlertHubSettingsComposable.<anonymous> (AlertHubSettingsComposable.kt:101)");
            }
            final SystemUiController systemUiControllerRememberSystemUiController = SystemUiController3.rememberSystemUiController(null, composer, 0, 1);
            final long jM21371getBg0d7_KjU = BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21371getBg0d7_KjU();
            Color colorM6701boximpl = Color.m6701boximpl(jM21371getBg0d7_KjU);
            composer.startReplaceGroup(-1633490746);
            boolean zChanged = composer.changed(systemUiControllerRememberSystemUiController) | composer.changed(jM21371getBg0d7_KjU);
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.advanced.alert.alerthubsettings.AlertHubSettingsComposableKt$AlertHubSettingsComposable$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return AlertHubSettingsComposable.C84361.invoke$lambda$2$lambda$1(systemUiControllerRememberSystemUiController, jM21371getBg0d7_KjU, (DisposableEffectScope) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            EffectsKt.DisposableEffect(colorM6701boximpl, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue, composer, 0);
            final SnapshotState4<AlertHubSettingsViewState> snapshotState4 = this.$viewState$delegate;
            final Modifier modifier = this.$modifier;
            final TopBarScrollState topBarScrollState = this.$topBarState;
            final AlertHubSettings2 alertHubSettings2 = this.$entityType;
            final AdvancedAlert4 advancedAlert4 = this.$entryPoint;
            final Navigator navigator = this.$navigator;
            final LazyListState lazyListState = this.$listState;
            final Function1<Intent, Unit> function1 = this.$startActivity;
            final AlertHubSettingsDuxo alertHubSettingsDuxo = this.$duxo;
            BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(810568650, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.advanced.alert.alerthubsettings.AlertHubSettingsComposableKt.AlertHubSettingsComposable.1.2
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i2) {
                    if ((i2 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(810568650, i2, -1, "com.robinhood.android.advanced.alert.alerthubsettings.AlertHubSettingsComposable.<anonymous>.<anonymous> (AlertHubSettingsComposable.kt:112)");
                    }
                    boolean z = AlertHubSettingsComposable.AlertHubSettingsComposable$lambda$0(snapshotState4) instanceof AlertHubSettingsViewState.Loading;
                    final Modifier modifier2 = modifier;
                    final TopBarScrollState topBarScrollState2 = topBarScrollState;
                    final AlertHubSettings2 alertHubSettings22 = alertHubSettings2;
                    final AdvancedAlert4 advancedAlert42 = advancedAlert4;
                    final Navigator navigator2 = navigator;
                    final LazyListState lazyListState2 = lazyListState;
                    final SnapshotState4<AlertHubSettingsViewState> snapshotState42 = snapshotState4;
                    final Function1<Intent, Unit> function12 = function1;
                    final AlertHubSettingsDuxo alertHubSettingsDuxo2 = alertHubSettingsDuxo;
                    LocalShowPlaceholder.Loadable(z, null, null, ComposableLambda3.rememberComposableLambda(-1658359750, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.advanced.alert.alerthubsettings.AlertHubSettingsComposableKt.AlertHubSettingsComposable.1.2.1

                        /* compiled from: AlertHubSettingsComposable.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.android.advanced.alert.alerthubsettings.AlertHubSettingsComposableKt$AlertHubSettingsComposable$1$2$1$2, reason: invalid class name and collision with other inner class name */
                        static final class C495322 implements Function3<PaddingValues, Composer, Integer, Unit> {
                            final /* synthetic */ AlertHubSettingsDuxo $duxo;
                            final /* synthetic */ LazyListState $listState;
                            final /* synthetic */ Navigator $navigator;
                            final /* synthetic */ Function1<Intent, Unit> $startActivity;
                            final /* synthetic */ SnapshotState4<AlertHubSettingsViewState> $viewState$delegate;

                            /* JADX WARN: Multi-variable type inference failed */
                            C495322(Function1<? super Intent, Unit> function1, SnapshotState4<? extends AlertHubSettingsViewState> snapshotState4, Navigator navigator, LazyListState lazyListState, AlertHubSettingsDuxo alertHubSettingsDuxo) {
                                this.$startActivity = function1;
                                this.$viewState$delegate = snapshotState4;
                                this.$navigator = navigator;
                                this.$listState = lazyListState;
                                this.$duxo = alertHubSettingsDuxo;
                            }

                            private static final List<AlertHubSettingsViewState.Item> invoke$lambda$5$lambda$4$lambda$1(SnapshotState<List<AlertHubSettingsViewState.Item>> snapshotState) {
                                return snapshotState.getValue();
                            }

                            public final void invoke(PaddingValues paddingValues, Composer composer, int i) {
                                int i2;
                                int i3;
                                Object objMutableStateOf$default;
                                Composer composer2 = composer;
                                Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                                if ((i & 6) == 0) {
                                    i2 = i | (composer2.changed(paddingValues) ? 4 : 2);
                                } else {
                                    i2 = i;
                                }
                                if ((i2 & 19) == 18 && composer2.getSkipping()) {
                                    composer2.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1664790340, i2, -1, "com.robinhood.android.advanced.alert.alerthubsettings.AlertHubSettingsComposable.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AlertHubSettingsComposable.kt:133)");
                                }
                                Modifier.Companion companion = Modifier.INSTANCE;
                                Modifier modifierPadding = PaddingKt.padding(companion, paddingValues);
                                Function1<Intent, Unit> function1 = this.$startActivity;
                                SnapshotState4<AlertHubSettingsViewState> snapshotState4 = this.$viewState$delegate;
                                Navigator navigator = this.$navigator;
                                LazyListState lazyListState = this.$listState;
                                final AlertHubSettingsDuxo alertHubSettingsDuxo = this.$duxo;
                                Arrangement arrangement = Arrangement.INSTANCE;
                                Arrangement.Vertical top = arrangement.getTop();
                                Alignment.Companion companion2 = Alignment.INSTANCE;
                                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion2.getStart(), composer2, 0);
                                int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                                CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, modifierPadding);
                                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
                                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
                                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                                if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                }
                                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                                Column6 column6 = Column6.INSTANCE;
                                AlertHubSettingsComposable.AlertHubSettingsInfoBanner(AlertHubSettingsComposable.AlertHubSettingsComposable$lambda$0(snapshotState4).getShowNotificationsBanner(), function1, composer2, 0);
                                Modifier modifierFillMaxHeight$default = SizeKt.fillMaxHeight$default(companion, 0.0f, 1, null);
                                MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), composer2, 0);
                                int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer2, 0);
                                CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer2, modifierFillMaxHeight$default);
                                Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                                if (composer2.getApplier() == null) {
                                    Composables.invalidApplier();
                                }
                                composer2.startReusableNode();
                                if (composer2.getInserting()) {
                                    composer2.createNode(constructor2);
                                } else {
                                    composer2.useNode();
                                }
                                Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer2);
                                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy2, companion3.getSetMeasurePolicy());
                                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                                if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                }
                                Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
                                AlertHubSettingsViewState alertHubSettingsViewStateAlertHubSettingsComposable$lambda$0 = AlertHubSettingsComposable.AlertHubSettingsComposable$lambda$0(snapshotState4);
                                if (alertHubSettingsViewStateAlertHubSettingsComposable$lambda$0 instanceof AlertHubSettingsViewState.Loading) {
                                    composer2.startReplaceGroup(-1449869811);
                                    LoadingScreenComposablesKt.ListLoadingScreenComposable(null, false, false, 0, composer2, 0, 15);
                                    composer2.endReplaceGroup();
                                } else {
                                    if (!(alertHubSettingsViewStateAlertHubSettingsComposable$lambda$0 instanceof AlertHubSettingsViewState.Loaded)) {
                                        composer2.startReplaceGroup(-1449872113);
                                        composer2.endReplaceGroup();
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    composer2.startReplaceGroup(-1996166466);
                                    AlertHubSettingsViewState.Loaded loaded = (AlertHubSettingsViewState.Loaded) alertHubSettingsViewStateAlertHubSettingsComposable$lambda$0;
                                    List<AlertHubSettingsViewState.Item> items = loaded.getItems();
                                    composer2.startReplaceGroup(5004770);
                                    boolean zChanged = composer2.changed(items);
                                    Object objRememberedValue = composer2.rememberedValue();
                                    if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        i3 = 2;
                                        objMutableStateOf$default = SnapshotState3.mutableStateOf$default(loaded.getItems(), null, 2, null);
                                        composer2.updateRememberedValue(objMutableStateOf$default);
                                    } else {
                                        objMutableStateOf$default = objRememberedValue;
                                        i3 = 2;
                                    }
                                    SnapshotState snapshotState = (SnapshotState) objMutableStateOf$default;
                                    composer2.endReplaceGroup();
                                    if (invoke$lambda$5$lambda$4$lambda$1(snapshotState).isEmpty()) {
                                        composer2.startReplaceGroup(-1996026408);
                                        AlertHubSettingsComposable.AlertHubSettingsNoAlert(loaded, null, composer2, 0, i3);
                                        composer2.endReplaceGroup();
                                    } else {
                                        composer2.startReplaceGroup(-1995888830);
                                        ImmutableList immutableList = extensions2.toImmutableList(invoke$lambda$5$lambda$4$lambda$1(snapshotState));
                                        composer2.startReplaceGroup(5004770);
                                        boolean zChangedInstance = composer2.changedInstance(alertHubSettingsDuxo);
                                        Object objRememberedValue2 = composer2.rememberedValue();
                                        if (zChangedInstance || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue2 = new Function1() { // from class: com.robinhood.android.advanced.alert.alerthubsettings.AlertHubSettingsComposableKt$AlertHubSettingsComposable$1$2$1$2$$ExternalSyntheticLambda0
                                                @Override // kotlin.jvm.functions.Function1
                                                public final Object invoke(Object obj) {
                                                    return AlertHubSettingsComposable.C84361.AnonymousClass2.AnonymousClass1.C495322.invoke$lambda$5$lambda$4$lambda$3$lambda$2(alertHubSettingsDuxo, (AlertHubSettingsViewState.Item) obj);
                                                }
                                            };
                                            composer2.updateRememberedValue(objRememberedValue2);
                                        }
                                        composer2.endReplaceGroup();
                                        AlertHubSettingsComposable.AlertHubSettingsList(immutableList, navigator, lazyListState, null, (Function1) objRememberedValue2, composer, 0, 8);
                                        composer2 = composer;
                                        composer2.endReplaceGroup();
                                    }
                                    composer2.endReplaceGroup();
                                }
                                composer2.endNode();
                                composer2.endNode();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer, Integer num) {
                                invoke(paddingValues, composer, num.intValue());
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: Access modifiers changed from: private */
                            public static final Unit invoke$lambda$5$lambda$4$lambda$3$lambda$2(AlertHubSettingsDuxo alertHubSettingsDuxo, AlertHubSettingsViewState.Item item) {
                                Intrinsics.checkNotNullParameter(item, "item");
                                alertHubSettingsDuxo.removeItem(item.getId(), item.getEntityType());
                                return Unit.INSTANCE;
                            }
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer3, int i3) {
                            if ((i3 & 3) == 2 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1658359750, i3, -1, "com.robinhood.android.advanced.alert.alerthubsettings.AlertHubSettingsComposable.<anonymous>.<anonymous>.<anonymous> (AlertHubSettingsComposable.kt:113)");
                            }
                            BentoTheme bentoTheme = BentoTheme.INSTANCE;
                            int i4 = BentoTheme.$stable;
                            long jM21371getBg0d7_KjU2 = bentoTheme.getColors(composer3, i4).m21371getBg0d7_KjU();
                            long jM21425getFg0d7_KjU = bentoTheme.getColors(composer3, i4).m21425getFg0d7_KjU();
                            Modifier modifier3 = modifier2;
                            final TopBarScrollState topBarScrollState3 = topBarScrollState2;
                            final AlertHubSettings2 alertHubSettings23 = alertHubSettings22;
                            final AdvancedAlert4 advancedAlert43 = advancedAlert42;
                            final Navigator navigator3 = navigator2;
                            final LazyListState lazyListState3 = lazyListState2;
                            final SnapshotState4<AlertHubSettingsViewState> snapshotState43 = snapshotState42;
                            ScaffoldKt.m5625Scaffold27mzLpw(modifier3, null, ComposableLambda3.rememberComposableLambda(541508693, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.advanced.alert.alerthubsettings.AlertHubSettingsComposableKt.AlertHubSettingsComposable.1.2.1.1
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                    invoke(composer4, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer4, int i5) {
                                    String title;
                                    if ((i5 & 3) == 2 && composer4.getSkipping()) {
                                        composer4.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(541508693, i5, -1, "com.robinhood.android.advanced.alert.alerthubsettings.AlertHubSettingsComposable.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AlertHubSettingsComposable.kt:117)");
                                    }
                                    AlertHubSettingsViewState alertHubSettingsViewStateAlertHubSettingsComposable$lambda$0 = AlertHubSettingsComposable.AlertHubSettingsComposable$lambda$0(snapshotState43);
                                    AlertHubSettingsViewState.Loaded loaded = alertHubSettingsViewStateAlertHubSettingsComposable$lambda$0 instanceof AlertHubSettingsViewState.Loaded ? (AlertHubSettingsViewState.Loaded) alertHubSettingsViewStateAlertHubSettingsComposable$lambda$0 : null;
                                    if (loaded == null || (title = loaded.getTitle()) == null) {
                                        title = "----------";
                                    }
                                    String str = title;
                                    AlertHubSettingsViewState alertHubSettingsViewStateAlertHubSettingsComposable$lambda$02 = AlertHubSettingsComposable.AlertHubSettingsComposable$lambda$0(snapshotState43);
                                    AlertHubSettingsViewState.Loaded loaded2 = alertHubSettingsViewStateAlertHubSettingsComposable$lambda$02 instanceof AlertHubSettingsViewState.Loaded ? (AlertHubSettingsViewState.Loaded) alertHubSettingsViewStateAlertHubSettingsComposable$lambda$02 : null;
                                    String infoActionContentfulId = loaded2 != null ? loaded2.getInfoActionContentfulId() : null;
                                    TopBarScrollState topBarScrollState4 = topBarScrollState3;
                                    AlertHubSettingsComposable.AlertHubSettingsTopAppBar(str, infoActionContentfulId, topBarScrollState4, alertHubSettings23, advancedAlert43, navigator3, TopBarScrollState3.scrollableTopBarState(Modifier.INSTANCE, lazyListState3, topBarScrollState4), composer4, TopBarScrollState.$stable << 6, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composer3, 54), null, null, null, 0, false, null, false, null, 0.0f, 0L, 0L, 0L, jM21371getBg0d7_KjU2, jM21425getFg0d7_KjU, ComposableLambda3.rememberComposableLambda(-1664790340, true, new C495322(function12, snapshotState42, navigator2, lazyListState2, alertHubSettingsDuxo2), composer3, 54), composer3, 384, 12582912, 32762);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer2, 54), composer2, 3072, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composer, 54), composer, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* compiled from: AlertHubSettingsComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.advanced.alert.alerthubsettings.AlertHubSettingsComposableKt$AlertHubSettingsTopAppBar$1 */
    static final class C84391 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ Context $context;
        final /* synthetic */ String $infoActionContentfulId;
        final /* synthetic */ Navigator $navigator;
        final /* synthetic */ String $title;

        C84391(String str, String str2, Navigator navigator, Context context) {
            this.$title = str;
            this.$infoActionContentfulId = str2;
            this.$navigator = navigator;
            this.$context = context;
        }

        public final void invoke(Composer composer, int i) {
            String str;
            Navigator navigator;
            Context context;
            Modifier.Companion companion;
            int i2;
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1517859800, i, -1, "com.robinhood.android.advanced.alert.alerthubsettings.AlertHubSettingsTopAppBar.<anonymous> (AlertHubSettingsComposable.kt:357)");
            }
            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
            String str2 = this.$title;
            String str3 = this.$infoActionContentfulId;
            Navigator navigator2 = this.$navigator;
            Context context2 = this.$context;
            Modifier.Companion companion2 = Modifier.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composer, 48);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, companion2);
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
            Row6 row6 = Row6.INSTANCE;
            composer.startReplaceGroup(1202492040);
            if (str2 != null) {
                companion = companion2;
                str = str3;
                navigator = navigator2;
                context = context2;
                i2 = 0;
                BentoText2.m20747BentoText38GnDrw(str2, TestTag3.testTag(companion2, "alertHubSettingsTitle"), null, null, null, null, null, 0, false, 0, 0, null, 0, BentoTheme.INSTANCE.getTypography(composer, BentoTheme.$stable).getTextL(), composer, 48, 0, 8188);
            } else {
                str = str3;
                navigator = navigator2;
                context = context2;
                companion = companion2;
                i2 = 0;
            }
            composer.endReplaceGroup();
            composer.startReplaceGroup(1202502721);
            if (str != null) {
                Painter painterPainterResource = PainterResources_androidKt.painterResource(C20690R.drawable.ic_rds_info_16dp, composer, i2);
                String strStringResource = StringResources_androidKt.stringResource(C11048R.string.general_menu_info, composer, i2);
                ColorFilter.Companion companion4 = ColorFilter.INSTANCE;
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i3 = BentoTheme.$stable;
                ColorFilter colorFilterM6729tintxETnrds$default = ColorFilter.Companion.m6729tintxETnrds$default(companion4, bentoTheme.getColors(composer, i3).m21426getFg20d7_KjU(), 0, 2, null);
                Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(companion, bentoTheme.getSpacing(composer, i3).m21593getSmallD9Ej5fM(), 0.0f, 0.0f, 0.0f, 14, null);
                composer.startReplaceGroup(-1746271574);
                final Navigator navigator3 = navigator;
                final Context context3 = context;
                final String str4 = str;
                boolean zChangedInstance = composer.changedInstance(navigator3) | composer.changedInstance(context3) | composer.changed(str4);
                Object objRememberedValue = composer.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.advanced.alert.alerthubsettings.AlertHubSettingsComposableKt$AlertHubSettingsTopAppBar$1$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return AlertHubSettingsComposable.C84391.invoke$lambda$3$lambda$2$lambda$1$lambda$0(navigator3, context3, str4);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceGroup();
                ImageKt.Image(painterPainterResource, strStringResource, TestTag3.testTag(ClickableKt.m4893clickableXHw0xAI$default(modifierM5146paddingqDBjuR0$default, false, null, null, (Function0) objRememberedValue, 7, null), "alertHubSettingsInfoAction"), (Alignment) null, (ContentScale) null, 0.0f, colorFilterM6729tintxETnrds$default, composer, 0, 56);
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
        public static final Unit invoke$lambda$3$lambda$2$lambda$1$lambda$0(Navigator navigator, Context context, String str) {
            Navigator.DefaultImpls.startActivity$default(navigator, context, new RemoteDisclosureKey(str, null, false, false, null, null, null, false, 250, null), null, false, null, null, 60, null);
            return Unit.INSTANCE;
        }
    }

    private static final void AlertHubSettingsThemeOverlay(final AlertHubSettings2 alertHubSettings2, final AdvancedAlert4 advancedAlert4, final ScarletManager scarletManager, final Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1407237201);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(alertHubSettings2.ordinal()) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(advancedAlert4.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? composerStartRestartGroup.changed(scarletManager) : composerStartRestartGroup.changedInstance(scarletManager) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function2) ? 2048 : 1024;
        }
        if ((i2 & 1171) != 1170 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1407237201, i2, -1, "com.robinhood.android.advanced.alert.alerthubsettings.AlertHubSettingsThemeOverlay (AlertHubSettingsComposable.kt:171)");
            }
            if (alertHubSettings2 == AlertHubSettings2.CRYPTO && advancedAlert4 == AdvancedAlert4.ADVANCED_ALERT) {
                composerStartRestartGroup.startReplaceGroup(-171987083);
                BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, ComposableLambda3.rememberComposableLambda(-682213340, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.advanced.alert.alerthubsettings.AlertHubSettingsComposableKt.AlertHubSettingsThemeOverlay.1
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
                            ComposerKt.traceEventStart(-682213340, i3, -1, "com.robinhood.android.advanced.alert.alerthubsettings.AlertHubSettingsThemeOverlay.<anonymous> (AlertHubSettingsComposable.kt:174)");
                        }
                        function2.invoke(composer2, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, 100663296, 255);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(-171917147);
                BentoTheme2.BentoTheme(ScarletComposeInterop.themeChangesForCompose(scarletManager), ScarletComposeInterop.themesForCompose(scarletManager), ComposableLambda3.rememberComposableLambda(2081440423, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.advanced.alert.alerthubsettings.AlertHubSettingsComposableKt.AlertHubSettingsThemeOverlay.2
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
                            ComposerKt.traceEventStart(2081440423, i3, -1, "com.robinhood.android.advanced.alert.alerthubsettings.AlertHubSettingsThemeOverlay.<anonymous> (AlertHubSettingsComposable.kt:181)");
                        }
                        function2.invoke(composer2, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, 384, 0);
                composerStartRestartGroup.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.advanced.alert.alerthubsettings.AlertHubSettingsComposableKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AlertHubSettingsComposable.AlertHubSettingsThemeOverlay$lambda$2(alertHubSettings2, advancedAlert4, scarletManager, function2, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void HandleEvents(final ActivityErrorHandler activityErrorHandler, final LazyListState lazyListState, AlertHubSettingsDuxo alertHubSettingsDuxo, Composer composer, final int i, final int i2) {
        int i3;
        AlertHubSettingsDuxo alertHubSettingsDuxo2;
        final AlertHubSettingsDuxo alertHubSettingsDuxo3;
        EventLogger current;
        Event<AlertHubSettingsEvent> event;
        final Event<AlertHubSettingsEvent.FetchResponseError> eventHandleEvents$lambda$3;
        Event<AlertHubSettingsEvent> event2;
        final Event<AlertHubSettingsEvent.RemoveFromListError> eventHandleEvents$lambda$5;
        boolean zChangedInstance;
        Object objRememberedValue;
        EventConsumer<AlertHubSettingsEvent.RemoveFromListError> eventConsumerInvoke;
        EventConsumer<AlertHubSettingsEvent.FetchResponseError> eventConsumerInvoke2;
        Composer composerStartRestartGroup = composer.startRestartGroup(514355740);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? composerStartRestartGroup.changed(activityErrorHandler) : composerStartRestartGroup.changedInstance(activityErrorHandler) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(lazyListState) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            if ((i2 & 4) == 0) {
                alertHubSettingsDuxo2 = alertHubSettingsDuxo;
                int i4 = composerStartRestartGroup.changedInstance(alertHubSettingsDuxo2) ? 256 : 128;
                i3 |= i4;
            } else {
                alertHubSettingsDuxo2 = alertHubSettingsDuxo;
            }
            i3 |= i4;
        } else {
            alertHubSettingsDuxo2 = alertHubSettingsDuxo;
        }
        if ((i3 & 147) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            alertHubSettingsDuxo3 = alertHubSettingsDuxo2;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                if ((i2 & 4) != 0) {
                    composerStartRestartGroup.startReplaceGroup(-747520797);
                    ViewModelStoreOwner current2 = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
                    if (current2 == null) {
                        throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    }
                    ViewModelProvider.Factory factoryCreateViewModelFactory = DuxosKt.createViewModelFactory(current2, composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(1729797275);
                    ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(AlertHubSettingsDuxo.class), current2, (String) null, factoryCreateViewModelFactory, current2 instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current2).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 0, 0);
                    composerStartRestartGroup.endReplaceableGroup();
                    final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                    final Lifecycle lifecycle = ((LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                    boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(baseDuxo) | composerStartRestartGroup.changedInstance(lifecycle);
                    Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.android.advanced.alert.alerthubsettings.AlertHubSettingsComposableKt$HandleEvents$$inlined$duxo$1
                            @Override // kotlin.jvm.functions.Function1
                            public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                lifecycle.addObserver(duxoLifecycleObserver);
                                final Lifecycle lifecycle2 = lifecycle;
                                return new DisposableEffectResult() { // from class: com.robinhood.android.advanced.alert.alerthubsettings.AlertHubSettingsComposableKt$HandleEvents$$inlined$duxo$1.1
                                    @Override // androidx.compose.runtime.DisposableEffectResult
                                    public void dispose() {
                                        lifecycle2.removeObserver(duxoLifecycleObserver);
                                    }
                                };
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    EffectsKt.DisposableEffect(lifecycle, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue2, composerStartRestartGroup, 0);
                    composerStartRestartGroup.endReplaceGroup();
                    alertHubSettingsDuxo2 = (AlertHubSettingsDuxo) baseDuxo;
                    i3 &= -897;
                }
                AlertHubSettingsDuxo alertHubSettingsDuxo4 = alertHubSettingsDuxo2;
                int i5 = i3;
                alertHubSettingsDuxo3 = alertHubSettingsDuxo4;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(514355740, i5, -1, "com.robinhood.android.advanced.alert.alerthubsettings.HandleEvents (AlertHubSettingsComposable.kt:191)");
                }
                current = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composerStartRestartGroup, AutoLoggingCompositionLocals4.$stable);
                final StateFlow<Event<AlertHubSettingsEvent>> eventFlow = alertHubSettingsDuxo3.getEventFlow();
                composerStartRestartGroup.startReplaceGroup(-523522313);
                LifecycleOwner lifecycleOwner = (LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
                Lifecycle.State state = Lifecycle.State.STARTED;
                CoroutineContextImpl6 coroutineContextImpl6 = CoroutineContextImpl6.INSTANCE;
                Flow<Event<?>> flow = new Flow<Event<?>>() { // from class: com.robinhood.android.advanced.alert.alerthubsettings.AlertHubSettingsComposableKt$HandleEvents$$inlined$collectEventAsStateWithLifecycle$1
                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super Event<?>> flowCollector, Continuation continuation) {
                        Object objCollect = eventFlow.collect(new AnonymousClass2(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.advanced.alert.alerthubsettings.AlertHubSettingsComposableKt$HandleEvents$$inlined$collectEventAsStateWithLifecycle$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.advanced.alert.alerthubsettings.AlertHubSettingsComposableKt$HandleEvents$$inlined$collectEventAsStateWithLifecycle$1$2", m3645f = "AlertHubSettingsComposable.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.android.advanced.alert.alerthubsettings.AlertHubSettingsComposableKt$HandleEvents$$inlined$collectEventAsStateWithLifecycle$1$2$1, reason: invalid class name */
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
                                if ((event != null ? event.getData() : null) instanceof AlertHubSettingsEvent.FetchResponseError) {
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
                };
                Event<AlertHubSettingsEvent> value = eventFlow.getValue();
                event = value;
                if (!((event == null ? event.getData() : null) instanceof AlertHubSettingsEvent.FetchResponseError)) {
                    value = null;
                }
                SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(flow, value, lifecycleOwner.getLifecycle(), state, coroutineContextImpl6, composerStartRestartGroup, 0, 0);
                composerStartRestartGroup.endReplaceGroup();
                eventHandleEvents$lambda$3 = HandleEvents$lambda$3(snapshotState4CollectAsStateWithLifecycle);
                if (eventHandleEvents$lambda$3 != null && (eventHandleEvents$lambda$3.getData() instanceof AlertHubSettingsEvent.FetchResponseError) && (eventConsumerInvoke2 = eventHandleEvents$lambda$3.getGetEventConsumer().invoke()) != null) {
                    eventConsumerInvoke2.consume(eventHandleEvents$lambda$3, new Function1() { // from class: com.robinhood.android.advanced.alert.alerthubsettings.AlertHubSettingsComposableKt$HandleEvents$$inlined$consumeIfType$1
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            m10939invoke(obj);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m10939invoke(Object it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            AbsErrorHandler.handleError$default(activityErrorHandler, ((AlertHubSettingsEvent.FetchResponseError) eventHandleEvents$lambda$3.getData()).getThrowable(), false, 2, null);
                        }
                    });
                }
                final StateFlow<Event<AlertHubSettingsEvent>> eventFlow2 = alertHubSettingsDuxo3.getEventFlow();
                composerStartRestartGroup.startReplaceGroup(-523522313);
                LifecycleOwner lifecycleOwner2 = (LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
                Flow<Event<?>> flow2 = new Flow<Event<?>>() { // from class: com.robinhood.android.advanced.alert.alerthubsettings.AlertHubSettingsComposableKt$HandleEvents$$inlined$collectEventAsStateWithLifecycle$2
                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super Event<?>> flowCollector, Continuation continuation) {
                        Object objCollect = eventFlow2.collect(new AnonymousClass2(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.advanced.alert.alerthubsettings.AlertHubSettingsComposableKt$HandleEvents$$inlined$collectEventAsStateWithLifecycle$2$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.advanced.alert.alerthubsettings.AlertHubSettingsComposableKt$HandleEvents$$inlined$collectEventAsStateWithLifecycle$2$2", m3645f = "AlertHubSettingsComposable.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.android.advanced.alert.alerthubsettings.AlertHubSettingsComposableKt$HandleEvents$$inlined$collectEventAsStateWithLifecycle$2$2$1, reason: invalid class name */
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
                                if ((event != null ? event.getData() : null) instanceof AlertHubSettingsEvent.RemoveFromListError) {
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
                };
                Event<AlertHubSettingsEvent> value2 = eventFlow2.getValue();
                event2 = value2;
                if (!((event2 == null ? event2.getData() : null) instanceof AlertHubSettingsEvent.RemoveFromListError)) {
                    value2 = null;
                }
                SnapshotState4 snapshotState4CollectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(flow2, value2, lifecycleOwner2.getLifecycle(), state, coroutineContextImpl6, composerStartRestartGroup, 0, 0);
                composerStartRestartGroup.endReplaceGroup();
                eventHandleEvents$lambda$5 = HandleEvents$lambda$5(snapshotState4CollectAsStateWithLifecycle2);
                if (eventHandleEvents$lambda$5 != null && (eventHandleEvents$lambda$5.getData() instanceof AlertHubSettingsEvent.RemoveFromListError) && (eventConsumerInvoke = eventHandleEvents$lambda$5.getGetEventConsumer().invoke()) != null) {
                    eventConsumerInvoke.consume(eventHandleEvents$lambda$5, new Function1() { // from class: com.robinhood.android.advanced.alert.alerthubsettings.AlertHubSettingsComposableKt$HandleEvents$$inlined$consumeIfType$2
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            m10940invoke(obj);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m10940invoke(Object it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            AbsErrorHandler.handleError$default(activityErrorHandler, ((AlertHubSettingsEvent.RemoveFromListError) eventHandleEvents$lambda$5.getData()).getThrowable(), false, 2, null);
                        }
                    });
                }
                Unit unit = Unit.INSTANCE;
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                zChangedInstance = composerStartRestartGroup.changedInstance(current) | ((i5 & 112) != 32);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new AlertHubSettingsComposable5(lazyListState, current, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue, composerStartRestartGroup, 6);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i2 & 4) != 0) {
                    i3 &= -897;
                }
                AlertHubSettingsDuxo alertHubSettingsDuxo42 = alertHubSettingsDuxo2;
                int i52 = i3;
                alertHubSettingsDuxo3 = alertHubSettingsDuxo42;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                current = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composerStartRestartGroup, AutoLoggingCompositionLocals4.$stable);
                final Flow eventFlow3 = alertHubSettingsDuxo3.getEventFlow();
                composerStartRestartGroup.startReplaceGroup(-523522313);
                LifecycleOwner lifecycleOwner3 = (LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
                Lifecycle.State state2 = Lifecycle.State.STARTED;
                CoroutineContextImpl6 coroutineContextImpl62 = CoroutineContextImpl6.INSTANCE;
                Flow<Event<?>> flow3 = new Flow<Event<?>>() { // from class: com.robinhood.android.advanced.alert.alerthubsettings.AlertHubSettingsComposableKt$HandleEvents$$inlined$collectEventAsStateWithLifecycle$1
                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super Event<?>> flowCollector, Continuation continuation) {
                        Object objCollect = eventFlow3.collect(new AnonymousClass2(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.advanced.alert.alerthubsettings.AlertHubSettingsComposableKt$HandleEvents$$inlined$collectEventAsStateWithLifecycle$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.advanced.alert.alerthubsettings.AlertHubSettingsComposableKt$HandleEvents$$inlined$collectEventAsStateWithLifecycle$1$2", m3645f = "AlertHubSettingsComposable.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.android.advanced.alert.alerthubsettings.AlertHubSettingsComposableKt$HandleEvents$$inlined$collectEventAsStateWithLifecycle$1$2$1, reason: invalid class name */
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
                                if ((event != null ? event.getData() : null) instanceof AlertHubSettingsEvent.FetchResponseError) {
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
                };
                Event<AlertHubSettingsEvent> value3 = eventFlow3.getValue();
                event = value3;
                if (!((event == null ? event.getData() : null) instanceof AlertHubSettingsEvent.FetchResponseError)) {
                }
                SnapshotState4 snapshotState4CollectAsStateWithLifecycle3 = FlowExtKt.collectAsStateWithLifecycle(flow3, value3, lifecycleOwner3.getLifecycle(), state2, coroutineContextImpl62, composerStartRestartGroup, 0, 0);
                composerStartRestartGroup.endReplaceGroup();
                eventHandleEvents$lambda$3 = HandleEvents$lambda$3(snapshotState4CollectAsStateWithLifecycle3);
                if (eventHandleEvents$lambda$3 != null) {
                    eventConsumerInvoke2.consume(eventHandleEvents$lambda$3, new Function1() { // from class: com.robinhood.android.advanced.alert.alerthubsettings.AlertHubSettingsComposableKt$HandleEvents$$inlined$consumeIfType$1
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            m10939invoke(obj);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m10939invoke(Object it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            AbsErrorHandler.handleError$default(activityErrorHandler, ((AlertHubSettingsEvent.FetchResponseError) eventHandleEvents$lambda$3.getData()).getThrowable(), false, 2, null);
                        }
                    });
                }
                final Flow eventFlow22 = alertHubSettingsDuxo3.getEventFlow();
                composerStartRestartGroup.startReplaceGroup(-523522313);
                LifecycleOwner lifecycleOwner22 = (LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
                Flow<Event<?>> flow22 = new Flow<Event<?>>() { // from class: com.robinhood.android.advanced.alert.alerthubsettings.AlertHubSettingsComposableKt$HandleEvents$$inlined$collectEventAsStateWithLifecycle$2
                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super Event<?>> flowCollector, Continuation continuation) {
                        Object objCollect = eventFlow22.collect(new AnonymousClass2(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.advanced.alert.alerthubsettings.AlertHubSettingsComposableKt$HandleEvents$$inlined$collectEventAsStateWithLifecycle$2$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.advanced.alert.alerthubsettings.AlertHubSettingsComposableKt$HandleEvents$$inlined$collectEventAsStateWithLifecycle$2$2", m3645f = "AlertHubSettingsComposable.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.android.advanced.alert.alerthubsettings.AlertHubSettingsComposableKt$HandleEvents$$inlined$collectEventAsStateWithLifecycle$2$2$1, reason: invalid class name */
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
                                if ((event != null ? event.getData() : null) instanceof AlertHubSettingsEvent.RemoveFromListError) {
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
                };
                Event<AlertHubSettingsEvent> value22 = eventFlow22.getValue();
                event2 = value22;
                if (!((event2 == null ? event2.getData() : null) instanceof AlertHubSettingsEvent.RemoveFromListError)) {
                }
                SnapshotState4 snapshotState4CollectAsStateWithLifecycle22 = FlowExtKt.collectAsStateWithLifecycle(flow22, value22, lifecycleOwner22.getLifecycle(), state2, coroutineContextImpl62, composerStartRestartGroup, 0, 0);
                composerStartRestartGroup.endReplaceGroup();
                eventHandleEvents$lambda$5 = HandleEvents$lambda$5(snapshotState4CollectAsStateWithLifecycle22);
                if (eventHandleEvents$lambda$5 != null) {
                    eventConsumerInvoke.consume(eventHandleEvents$lambda$5, new Function1() { // from class: com.robinhood.android.advanced.alert.alerthubsettings.AlertHubSettingsComposableKt$HandleEvents$$inlined$consumeIfType$2
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            m10940invoke(obj);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m10940invoke(Object it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            AbsErrorHandler.handleError$default(activityErrorHandler, ((AlertHubSettingsEvent.RemoveFromListError) eventHandleEvents$lambda$5.getData()).getThrowable(), false, 2, null);
                        }
                    });
                }
                Unit unit2 = Unit.INSTANCE;
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                zChangedInstance = composerStartRestartGroup.changedInstance(current) | ((i52 & 112) != 32);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance) {
                    objRememberedValue = new AlertHubSettingsComposable5(lazyListState, current, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    composerStartRestartGroup.endReplaceGroup();
                    EffectsKt.LaunchedEffect(unit2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue, composerStartRestartGroup, 6);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                }
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.advanced.alert.alerthubsettings.AlertHubSettingsComposableKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AlertHubSettingsComposable.HandleEvents$lambda$8(activityErrorHandler, lazyListState, alertHubSettingsDuxo3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AlertHubSettingsNoAlert(final AlertHubSettingsViewState.Loaded loaded, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        final Modifier modifier2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        Composer composer2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-446841104);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(loaded) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 == 0) {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i3 & 19) != 18 && composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.skipToGroupEnd();
                composer2 = composerStartRestartGroup;
            } else {
                Modifier modifier3 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-446841104, i3, -1, "com.robinhood.android.advanced.alert.alerthubsettings.AlertHubSettingsNoAlert (AlertHubSettingsComposable.kt:217)");
                }
                Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
                Modifier modifierFillMaxHeight$default = SizeKt.fillMaxHeight$default(modifier3, 0.0f, 1, null);
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i5 = BentoTheme.$stable;
                Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(modifierFillMaxHeight$default, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21590getDefaultD9Ej5fM(), 0.0f, 2, null);
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(center, centerHorizontally, composerStartRestartGroup, 54);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5144paddingVpY3zN4$default);
                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (!composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                Column6 column6 = Column6.INSTANCE;
                String noAlertsTitle = loaded.getNoAlertsTitle();
                long jM21425getFg0d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i5).m21425getFg0d7_KjU();
                TextStyle displayCapsuleSmall = bentoTheme.getTypography(composerStartRestartGroup, i5).getDisplayCapsuleSmall();
                TextAlign.Companion companion2 = TextAlign.INSTANCE;
                int iM7919getCentere0LSkKk = companion2.m7919getCentere0LSkKk();
                Modifier.Companion companion3 = Modifier.INSTANCE;
                Modifier modifierTestTag = TestTag3.testTag(companion3, "alertHubSettingsNoAlertsTitle");
                Color colorM6701boximpl = Color.m6701boximpl(jM21425getFg0d7_KjU);
                TextAlign textAlignM7912boximpl = TextAlign.m7912boximpl(iM7919getCentere0LSkKk);
                Modifier modifier4 = modifier3;
                composer2 = composerStartRestartGroup;
                BentoText2.m20747BentoText38GnDrw(noAlertsTitle, modifierTestTag, colorM6701boximpl, null, null, null, textAlignM7912boximpl, 0, false, 0, 0, null, 0, displayCapsuleSmall, composer2, 48, 0, 8120);
                BentoText2.m20747BentoText38GnDrw(loaded.getNoAlertsSubtitle(), TestTag3.testTag(PaddingKt.m5146paddingqDBjuR0$default(companion3, 0.0f, bentoTheme.getSpacing(composer2, i5).m21593getSmallD9Ej5fM(), 0.0f, 0.0f, 13, null), "alertHubSettingsNoAlertsSubtitle"), Color.m6701boximpl(bentoTheme.getColors(composer2, i5).m21425getFg0d7_KjU()), null, null, null, TextAlign.m7912boximpl(companion2.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer2, i5).getTextM(), composer2, 0, 0, 8120);
                composer2.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier4;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.advanced.alert.alerthubsettings.AlertHubSettingsComposableKt$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return AlertHubSettingsComposable.AlertHubSettingsNoAlert$lambda$10(loaded, modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        modifier2 = modifier;
        if ((i3 & 19) != 18) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            Alignment.Horizontal centerHorizontally2 = Alignment.INSTANCE.getCenterHorizontally();
            Arrangement.HorizontalOrVertical center2 = Arrangement.INSTANCE.getCenter();
            Modifier modifierFillMaxHeight$default2 = SizeKt.fillMaxHeight$default(modifier3, 0.0f, 1, null);
            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
            int i52 = BentoTheme.$stable;
            Modifier modifierM5144paddingVpY3zN4$default2 = PaddingKt.m5144paddingVpY3zN4$default(modifierFillMaxHeight$default2, bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21590getDefaultD9Ej5fM(), 0.0f, 2, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(center2, centerHorizontally2, composerStartRestartGroup, 54);
            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5144paddingVpY3zN4$default2);
            ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
            }
            composerStartRestartGroup.startReusableNode();
            if (!composerStartRestartGroup.getInserting()) {
            }
            composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy2, companion4.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion4.getSetResolvedCompositionLocals());
            setCompositeKeyHash = companion4.getSetCompositeKeyHash();
            if (!composerM6388constructorimpl.getInserting()) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion4.getSetModifier());
                Column6 column62 = Column6.INSTANCE;
                String noAlertsTitle2 = loaded.getNoAlertsTitle();
                long jM21425getFg0d7_KjU2 = bentoTheme2.getColors(composerStartRestartGroup, i52).m21425getFg0d7_KjU();
                TextStyle displayCapsuleSmall2 = bentoTheme2.getTypography(composerStartRestartGroup, i52).getDisplayCapsuleSmall();
                TextAlign.Companion companion22 = TextAlign.INSTANCE;
                int iM7919getCentere0LSkKk2 = companion22.m7919getCentere0LSkKk();
                Modifier.Companion companion32 = Modifier.INSTANCE;
                Modifier modifierTestTag2 = TestTag3.testTag(companion32, "alertHubSettingsNoAlertsTitle");
                Color colorM6701boximpl2 = Color.m6701boximpl(jM21425getFg0d7_KjU2);
                TextAlign textAlignM7912boximpl2 = TextAlign.m7912boximpl(iM7919getCentere0LSkKk2);
                Modifier modifier42 = modifier3;
                composer2 = composerStartRestartGroup;
                BentoText2.m20747BentoText38GnDrw(noAlertsTitle2, modifierTestTag2, colorM6701boximpl2, null, null, null, textAlignM7912boximpl2, 0, false, 0, 0, null, 0, displayCapsuleSmall2, composer2, 48, 0, 8120);
                BentoText2.m20747BentoText38GnDrw(loaded.getNoAlertsSubtitle(), TestTag3.testTag(PaddingKt.m5146paddingqDBjuR0$default(companion32, 0.0f, bentoTheme2.getSpacing(composer2, i52).m21593getSmallD9Ej5fM(), 0.0f, 0.0f, 13, null), "alertHubSettingsNoAlertsSubtitle"), Color.m6701boximpl(bentoTheme2.getColors(composer2, i52).m21425getFg0d7_KjU()), null, null, null, TextAlign.m7912boximpl(companion22.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composer2, i52).getTextM(), composer2, 0, 0, 8120);
                composer2.endNode();
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier2 = modifier42;
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:83:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AlertHubSettingsList(final ImmutableList<? extends AlertHubSettingsViewState.Item> immutableList, final Navigator navigator, final LazyListState lazyListState, Modifier modifier, final Function1<? super AlertHubSettingsViewState.Item, Unit> function1, Composer composer, final int i, final int i2) {
        int i3;
        LazyListState lazyListState2;
        Modifier modifier2;
        final Context context;
        boolean zChangedInstance;
        Object objRememberedValue;
        Composer composer2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(76754043);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(immutableList) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(navigator) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
            lazyListState2 = lazyListState;
        } else {
            lazyListState2 = lazyListState;
            if ((i & 384) == 0) {
                i3 |= composerStartRestartGroup.changed(lazyListState2) ? 256 : 128;
            }
        }
        int i4 = i2 & 8;
        if (i4 == 0) {
            if ((i & 3072) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            if ((i2 & 16) == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(function1) ? 16384 : 8192;
            }
            if ((i3 & 9363) == 9362 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(76754043, i3, -1, "com.robinhood.android.advanced.alert.alerthubsettings.AlertHubSettingsList (AlertHubSettingsComposable.kt:251)");
                }
                context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                Modifier modifier5 = modifier4;
                Modifier modifierTestTag = TestTag3.testTag(PaddingKt.m5146paddingqDBjuR0$default(modifier4, 0.0f, BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21590getDefaultD9Ej5fM(), 0.0f, 0.0f, 13, null), "alertHubSettingsColumn");
                composerStartRestartGroup.startReplaceGroup(-1224400529);
                zChangedInstance = composerStartRestartGroup.changedInstance(immutableList) | composerStartRestartGroup.changedInstance(navigator) | composerStartRestartGroup.changedInstance(context) | ((57344 & i3) != 16384);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function1() { // from class: com.robinhood.android.advanced.alert.alerthubsettings.AlertHubSettingsComposableKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return AlertHubSettingsComposable.AlertHubSettingsList$lambda$15$lambda$14(immutableList, function1, navigator, context, (LazyListScope) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                composer2 = composerStartRestartGroup;
                LazyDslKt.LazyColumn(modifierTestTag, lazyListState2, null, false, null, null, null, false, null, (Function1) objRememberedValue, composer2, (i3 >> 3) & 112, 508);
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
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.advanced.alert.alerthubsettings.AlertHubSettingsComposableKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return AlertHubSettingsComposable.AlertHubSettingsList$lambda$16(immutableList, navigator, lazyListState, modifier3, function1, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 3072;
        modifier2 = modifier;
        if ((i2 & 16) == 0) {
        }
        if ((i3 & 9363) == 9362) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            Modifier modifier52 = modifier4;
            Modifier modifierTestTag2 = TestTag3.testTag(PaddingKt.m5146paddingqDBjuR0$default(modifier4, 0.0f, BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21590getDefaultD9Ej5fM(), 0.0f, 0.0f, 13, null), "alertHubSettingsColumn");
            composerStartRestartGroup.startReplaceGroup(-1224400529);
            zChangedInstance = composerStartRestartGroup.changedInstance(immutableList) | composerStartRestartGroup.changedInstance(navigator) | composerStartRestartGroup.changedInstance(context) | ((57344 & i3) != 16384);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (!zChangedInstance) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.advanced.alert.alerthubsettings.AlertHubSettingsComposableKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return AlertHubSettingsComposable.AlertHubSettingsList$lambda$15$lambda$14(immutableList, function1, navigator, context, (LazyListScope) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                composerStartRestartGroup.endReplaceGroup();
                composer2 = composerStartRestartGroup;
                LazyDslKt.LazyColumn(modifierTestTag2, lazyListState2, null, false, null, null, null, false, null, (Function1) objRememberedValue, composer2, (i3 >> 3) & 112, 508);
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier3 = modifier52;
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AlertHubSettingsList$lambda$15$lambda$14(final ImmutableList immutableList, final Function1 function1, final Navigator navigator, final Context context, LazyListScope LazyColumn) {
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        final Function2 function2 = new Function2() { // from class: com.robinhood.android.advanced.alert.alerthubsettings.AlertHubSettingsComposableKt$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return AlertHubSettingsComposable.AlertHubSettingsList$lambda$15$lambda$14$lambda$11(((Integer) obj).intValue(), (AlertHubSettingsViewState.Item) obj2);
            }
        };
        LazyColumn.items(immutableList.size(), new Function1<Integer, Object>() { // from class: com.robinhood.android.advanced.alert.alerthubsettings.AlertHubSettingsComposableKt$AlertHubSettingsList$lambda$15$lambda$14$$inlined$itemsIndexed$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int i) {
                return function2.invoke(Integer.valueOf(i), immutableList.get(i));
            }
        }, new Function1<Integer, Object>() { // from class: com.robinhood.android.advanced.alert.alerthubsettings.AlertHubSettingsComposableKt$AlertHubSettingsList$lambda$15$lambda$14$$inlined$itemsIndexed$default$2
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
        }, ComposableLambda3.composableLambdaInstance(-1091073711, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.robinhood.android.advanced.alert.alerthubsettings.AlertHubSettingsComposableKt$AlertHubSettingsList$lambda$15$lambda$14$$inlined$itemsIndexed$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(4);
            }

            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
                invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(LazyItemScope lazyItemScope, int i, Composer composer, int i2) {
                int i3;
                if ((i2 & 6) == 0) {
                    i3 = i2 | (composer.changed(lazyItemScope) ? 4 : 2);
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
                final AlertHubSettingsViewState.Item item = (AlertHubSettingsViewState.Item) immutableList.get(i);
                composer.startReplaceGroup(-570038737);
                Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(Modifier.INSTANCE, new UserInteractionEventDescriptor(null, new Screen(Screen.Name.ALERT_HUB_SETTING, null, null, null, 14, null), null, new com.robinhood.rosetta.eventlogging.Context(i, immutableList.size(), 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -4, -1, -1, -1, -1, -1, 16383, null), new Component(Component.ComponentType.ROW, item.getLoggingIdentifier(), null, 4, null), null, 37, null), true, false, false, true, false, null, 108, null);
                final Navigator navigator2 = navigator;
                final Context context2 = context;
                ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(-1004355770, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.advanced.alert.alerthubsettings.AlertHubSettingsComposableKt$AlertHubSettingsList$1$1$2$1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i4) {
                        if ((i4 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1004355770, i4, -1, "com.robinhood.android.advanced.alert.alerthubsettings.AlertHubSettingsList.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AlertHubSettingsComposable.kt:263)");
                        }
                        String symbol = item.getSymbol();
                        String subtitle = item.getSubtitle();
                        Modifier modifierM4872backgroundbw27NRU$default = Background3.m4872backgroundbw27NRU$default(Modifier.INSTANCE, BentoTheme.INSTANCE.getColors(composer2, BentoTheme.$stable).m21371getBg0d7_KjU(), null, 2, null);
                        composer2.startReplaceGroup(-1746271574);
                        boolean zChangedInstance = composer2.changedInstance(item) | composer2.changedInstance(navigator2) | composer2.changedInstance(context2);
                        final AlertHubSettingsViewState.Item item2 = item;
                        final Navigator navigator3 = navigator2;
                        final Context context3 = context2;
                        Object objRememberedValue = composer2.rememberedValue();
                        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function0<Unit>() { // from class: com.robinhood.android.advanced.alert.alerthubsettings.AlertHubSettingsComposableKt$AlertHubSettingsList$1$1$2$1$1$1
                                @Override // kotlin.jvm.functions.Function0
                                public /* bridge */ /* synthetic */ Unit invoke() {
                                    invoke2();
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2() {
                                    AlertHubSettingsViewState.Item item3 = item2;
                                    if (item3 instanceof AlertHubSettingsViewState.Item.InstrumentItem) {
                                        Navigator.DefaultImpls.showFragment$default(navigator3, context3, new AdvancedAlert(Either2.asLeft(((AlertHubSettingsViewState.Item.InstrumentItem) item2).getInstrument()), true, null, AdvancedAlertEntryPoint.ALERT_HUB_SETTING, 4, null), false, false, false, null, false, null, false, false, null, null, 4092, null);
                                    } else {
                                        if (!(item3 instanceof AlertHubSettingsViewState.Item.CryptoItem)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        Navigator.DefaultImpls.showFragment$default(navigator3, context3, new AdvancedAlert(Either2.asRight(((AlertHubSettingsViewState.Item.CryptoItem) item2).getCurrencyPair()), true, null, AdvancedAlertEntryPoint.ALERT_HUB_SETTING, 4, null), false, false, false, null, false, null, false, false, null, null, 4092, null);
                                    }
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue);
                        }
                        composer2.endReplaceGroup();
                        BentoBaseRowKt.m20916BentoBaseRowygcbOzY(modifierM4872backgroundbw27NRU$default, null, symbol, subtitle, null, null, null, false, false, false, 0L, (Function0) objRememberedValue, composer2, 0, 0, 2034);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composer, 54);
                composer.startReplaceGroup(-1633490746);
                boolean zChanged = composer.changed(function1) | composer.changedInstance(item);
                Object objRememberedValue = composer.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    final Function1 function12 = function1;
                    objRememberedValue = new Function0<Unit>() { // from class: com.robinhood.android.advanced.alert.alerthubsettings.AlertHubSettingsComposableKt$AlertHubSettingsList$1$1$2$2$1
                        @Override // kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            function12.invoke(item);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceGroup();
                SwipeToDeleteRow2.SwipeToDeleteRow(composableLambdaRememberComposableLambda, modifierAutoLogEvents$default, null, null, (Function0) objRememberedValue, composer, 6, 12);
                composer.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object AlertHubSettingsList$lambda$15$lambda$14$lambda$11(int i, AlertHubSettingsViewState.Item item) {
        Intrinsics.checkNotNullParameter(item, "item");
        return item.getId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"InlinedApi", "NewApi"})
    public static final void AlertHubSettingsInfoBanner(final boolean z, final Function1<? super Intent, Unit> function1, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-504693350);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if ((i2 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-504693350, i2, -1, "com.robinhood.android.advanced.alert.alerthubsettings.AlertHubSettingsInfoBanner (AlertHubSettingsComposable.kt:317)");
            }
            if (z) {
                final Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                String strStringResource = StringResources_androidKt.stringResource(C8387R.string.advanced_alert_notification_banner_message, composerStartRestartGroup, 0);
                String strStringResource2 = StringResources_androidKt.stringResource(C8387R.string.advanced_alert_notification_banner_ctx_text, composerStartRestartGroup, 0);
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i3 = BentoTheme.$stable;
                long jM21425getFg0d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i3).m21425getFg0d7_KjU();
                long jM21372getBg20d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i3).m21372getBg20d7_KjU();
                Modifier modifierTestTag = TestTag3.testTag(PaddingKt.m5146paddingqDBjuR0$default(Modifier.INSTANCE, bentoTheme.getSpacing(composerStartRestartGroup, i3).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composerStartRestartGroup, i3).m21593getSmallD9Ej5fM(), bentoTheme.getSpacing(composerStartRestartGroup, i3).m21592getMediumD9Ej5fM(), 0.0f, 8, null), InfoActionBannerTag);
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                boolean zChangedInstance = composerStartRestartGroup.changedInstance(context) | ((i2 & 112) == 32);
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.advanced.alert.alerthubsettings.AlertHubSettingsComposableKt$$ExternalSyntheticLambda8
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return AlertHubSettingsComposable.AlertHubSettingsInfoBanner$lambda$18$lambda$17(context, function1);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                BentoInfoBanner2.m20653BentoInfoBannerSxpAMN0(modifierTestTag, strStringResource, null, strStringResource2, (Function0) objRememberedValue, null, jM21425getFg0d7_KjU, jM21372getBg20d7_KjU, composerStartRestartGroup, 0, 36);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.advanced.alert.alerthubsettings.AlertHubSettingsComposableKt$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AlertHubSettingsComposable.AlertHubSettingsInfoBanner$lambda$19(z, function1, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AlertHubSettingsInfoBanner$lambda$18$lambda$17(Context context, Function1 function1) {
        Intent intentPutExtra = new Intent("android.settings.APP_NOTIFICATION_SETTINGS").putExtra("android.provider.extra.APP_PACKAGE", Contexts8.getPackageInfo$default(context, 0, 1, null).packageName);
        Intrinsics.checkNotNullExpressionValue(intentPutExtra, "putExtra(...)");
        function1.invoke(intentPutExtra);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:86:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AlertHubSettingsTopAppBar(final String str, final String str2, final TopBarScrollState topBarScrollState, final AlertHubSettings2 alertHubSettings2, final AdvancedAlert4 advancedAlert4, final Navigator navigator, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        final Modifier modifier3;
        Composer composer2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(623711781);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(str2) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= (i & 512) == 0 ? composerStartRestartGroup.changed(topBarScrollState) : composerStartRestartGroup.changedInstance(topBarScrollState) ? 256 : 128;
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            i3 |= composerStartRestartGroup.changed(advancedAlert4.ordinal()) ? 16384 : 8192;
        }
        if ((i2 & 32) != 0) {
            i3 |= 196608;
        } else if ((i & 196608) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(navigator) ? 131072 : 65536;
        }
        int i4 = i2 & 64;
        if (i4 == 0) {
            if ((1572864 & i) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 1048576 : 524288;
            }
            if ((598163 & i3) == 598162 || !composerStartRestartGroup.getSkipping()) {
                modifier3 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(623711781, i3, -1, "com.robinhood.android.advanced.alert.alerthubsettings.AlertHubSettingsTopAppBar (AlertHubSettingsComposable.kt:350)");
                }
                composer2 = composerStartRestartGroup;
                BentoAppBarKt.m20573BentoAppBarSGdaT3c(ComposableLambda3.rememberComposableLambda(1517859800, true, new C84391(str, str2, navigator, (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext())), composerStartRestartGroup, 54), TestTag3.testTag(modifier3, "alertHubSettingsTopBar"), ComposableLambda3.rememberComposableLambda(-1580613884, true, new C84402(advancedAlert4, (FragmentActivity) composerStartRestartGroup.consume(LocalActivity3.getLocalActivity())), composerStartRestartGroup, 54), null, null, false, topBarScrollState.getShowDivider(), null, null, 0L, null, composer2, 390, 0, 1976);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                composer2 = composerStartRestartGroup;
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.advanced.alert.alerthubsettings.AlertHubSettingsComposableKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return AlertHubSettingsComposable.AlertHubSettingsTopAppBar$lambda$20(str, str2, topBarScrollState, alertHubSettings2, advancedAlert4, navigator, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 1572864;
        modifier2 = modifier;
        if ((598163 & i3) == 598162) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            composer2 = composerStartRestartGroup;
            BentoAppBarKt.m20573BentoAppBarSGdaT3c(ComposableLambda3.rememberComposableLambda(1517859800, true, new C84391(str, str2, navigator, (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext())), composerStartRestartGroup, 54), TestTag3.testTag(modifier3, "alertHubSettingsTopBar"), ComposableLambda3.rememberComposableLambda(-1580613884, true, new C84402(advancedAlert4, (FragmentActivity) composerStartRestartGroup.consume(LocalActivity3.getLocalActivity())), composerStartRestartGroup, 54), null, null, false, topBarScrollState.getShowDivider(), null, null, 0L, null, composer2, 390, 0, 1976);
            if (ComposerKt.isTraceInProgress()) {
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* compiled from: AlertHubSettingsComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.advanced.alert.alerthubsettings.AlertHubSettingsComposableKt$AlertHubSettingsTopAppBar$2 */
    static final class C84402 implements Function3<BentoAppBarScope, Composer, Integer, Unit> {
        final /* synthetic */ FragmentActivity $activity;
        final /* synthetic */ AdvancedAlert4 $entryPoint;

        C84402(AdvancedAlert4 advancedAlert4, FragmentActivity fragmentActivity) {
            this.$entryPoint = advancedAlert4;
            this.$activity = fragmentActivity;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer, Integer num) {
            invoke(bentoAppBarScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(FragmentActivity fragmentActivity) {
            fragmentActivity.getOnBackPressedDispatcher().onBackPressed();
            return Unit.INSTANCE;
        }

        public final void invoke(BentoAppBarScope BentoAppBar, Composer composer, int i) {
            int i2;
            Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
            if ((i & 6) == 0) {
                i2 = ((i & 8) == 0 ? composer.changed(BentoAppBar) : composer.changedInstance(BentoAppBar) ? 4 : 2) | i;
            } else {
                i2 = i;
            }
            if ((i2 & 19) == 18 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1580613884, i2, -1, "com.robinhood.android.advanced.alert.alerthubsettings.AlertHubSettingsTopAppBar.<anonymous> (AlertHubSettingsComposable.kt:390)");
            }
            if (this.$entryPoint == AdvancedAlert4.DEEP_LINK) {
                composer.startReplaceGroup(1953291765);
                Modifier modifierTestTag = TestTag3.testTag(Modifier.INSTANCE, "alertHubSettingsBackButton");
                composer.startReplaceGroup(5004770);
                boolean zChangedInstance = composer.changedInstance(this.$activity);
                final FragmentActivity fragmentActivity = this.$activity;
                Object objRememberedValue = composer.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.advanced.alert.alerthubsettings.AlertHubSettingsComposableKt$AlertHubSettingsTopAppBar$2$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return AlertHubSettingsComposable.C84402.invoke$lambda$1$lambda$0(fragmentActivity);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceGroup();
                BentoAppBar.m20575BentoBackButtondrOMvmE(modifierTestTag, false, null, (Function0) objRememberedValue, composer, (BentoAppBarScope.$stable << 12) | 6 | ((i2 << 12) & 57344), 6);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(1953528946);
                Modifier modifierTestTag2 = TestTag3.testTag(Modifier.INSTANCE, "alertHubSettingsCloseButton");
                composer.startReplaceGroup(5004770);
                boolean zChangedInstance2 = composer.changedInstance(this.$activity);
                final FragmentActivity fragmentActivity2 = this.$activity;
                Object objRememberedValue2 = composer.rememberedValue();
                if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new Function0() { // from class: com.robinhood.android.advanced.alert.alerthubsettings.AlertHubSettingsComposableKt$AlertHubSettingsTopAppBar$2$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return AlertHubSettingsComposable.C84402.invoke$lambda$3$lambda$2(fragmentActivity2);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue2);
                }
                composer.endReplaceGroup();
                BentoAppBar.m20576BentoCloseButtoncf5BqRc(modifierTestTag2, false, 0L, (Function0) objRememberedValue2, composer, (BentoAppBarScope.$stable << 12) | 6 | ((i2 << 12) & 57344), 6);
                composer.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$3$lambda$2(FragmentActivity fragmentActivity) {
            fragmentActivity.getOnBackPressedDispatcher().onBackPressed();
            return Unit.INSTANCE;
        }
    }
}
