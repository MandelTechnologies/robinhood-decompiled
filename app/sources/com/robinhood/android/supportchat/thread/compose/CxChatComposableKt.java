package com.robinhood.android.supportchat.thread.compose;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.foundation.layout.WindowInsetsPadding6;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.foundation.layout.WindowInsetsSides;
import androidx.compose.foundation.layout.WindowInsets_androidKt;
import androidx.compose.material3.ModalBottomSheetKt;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.material3.SheetState;
import androidx.compose.material3.TopAppBarDefaults;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.res.PrimitiveResources_androidKt;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.core.net.Uri2;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.FlowExtKt;
import androidx.lifecycle.compose.LocalLifecycleOwnerKt;
import androidx.view.compose.ActivityResultRegistry3;
import androidx.view.compose.ActivityResultRegistry8;
import androidx.view.result.ActivityResult;
import androidx.view.result.contract.ActivityResultContracts$RequestPermission;
import androidx.view.result.contract.ActivityResultContracts$StartActivityForResult;
import com.google.accompanist.permissions.PermissionState;
import com.google.accompanist.permissions.PermissionState2;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.common.composebottomsheet.RhModalBottomSheet3;
import com.robinhood.android.common.composebottomsheet.RhModalBottomSheet5;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.mediaservice.CameraUtils;
import com.robinhood.android.mediaservice.CropImageArgs;
import com.robinhood.android.mediaservice.ImagePicker;
import com.robinhood.android.mediaservice.p181ui.CropImageActivity;
import com.robinhood.android.navigation.LocalNavigator;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.supportchat.C29104R;
import com.robinhood.android.supportchat.SupportChatImageViewerKey;
import com.robinhood.android.supportchat.thread.CxChatDuxo;
import com.robinhood.android.supportchat.thread.CxChatEvent;
import com.robinhood.android.supportchat.thread.CxChatViewState;
import com.robinhood.android.supportchat.thread.compose.CxChatBottomSheetData;
import com.robinhood.android.supportchat.thread.compose.CxChatComposableKt;
import com.robinhood.android.supportchat.thread.compose.CxChatDialogData;
import com.robinhood.android.supportchat.thread.compose.CxChatTopBar5;
import com.robinhood.android.supportchat.thread.compose.dialog.CxChatDialog;
import com.robinhood.android.supportchat.view.SupportChatThreadBanner2;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.android.util.extensions.BannerVisibility;
import com.robinhood.android.utils.web.WebUtils;
import com.robinhood.compose.bento.component.BentoAppBarKt;
import com.robinhood.compose.bento.component.BentoAppBarScope;
import com.robinhood.compose.bento.component.BentoProgressBar2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.models.p355ui.p356v2.ChatbotSuggestedResponse;
import com.robinhood.models.p355ui.p356v2.SelectionMenuRowModel;
import com.robinhood.models.p355ui.pathfinder.messaging.ChatMode;
import com.robinhood.models.supportchat.p353db.SupportChatBanner;
import com.robinhood.rosetta.eventlogging.CXIssue;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.shared.crypto.transfer.send.address.saved.CryptoTransferSendSavedAddressComposableKt;
import com.robinhood.shared.support.contracts.HelpCenterWebViewFragmentKey;
import com.robinhood.shared.support.supportchat.p396ui.models.UiChatAction;
import com.robinhood.shared.support.supportchat.p396ui.models.UiChatMessage;
import com.robinhood.shared.support.supportchat.p396ui.models.UiChatMessage2;
import com.robinhood.store.supportchat.ChatImageUtils;
import com.robinhood.utils.Either;
import com.robinhood.utils.Either2;
import com.robinhood.utils.extensions.StringsKt;
import io.reactivex.Single;
import java.io.File;
import java.util.List;
import java.util.UUID;
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
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.rx2.RxAwait3;
import okhttp3.HttpUrl;

/* compiled from: CxChatComposable.kt */
@Metadata(m3635d1 = {"\u0000Ü\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aa\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0001¢\u0006\u0004\b\u000e\u0010\u000f\u001a]\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00102\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\f\u001a\u00020\u000b2\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00030\u0015H\u0003¢\u0006\u0004\b\u0018\u0010\u0019\u001aE\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00102\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\f\u001a\u00020\u000bH\u0003¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u001d\u0010\u001f\u001a\u00020\u001e*\u0004\u0018\u00010\u00132\u0006\u0010\u001d\u001a\u00020\u001cH\u0003¢\u0006\u0004\b\u001f\u0010 \u001a°\u0003\u0010?\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\"\u001a\u00020!2\u000e\u0010%\u001a\n\u0012\u0004\u0012\u00020$\u0018\u00010#2\u0012\u0010'\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\u00030\u00152\u0012\u0010)\u001a\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\u00030\u00152\u0018\u0010,\u001a\u0014\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020\u00030*2'\u00100\u001a#\u0012\u0004\u0012\u00020\u0013\u0012\u0013\u0012\u00110\u001e¢\u0006\f\b-\u0012\b\b.\u0012\u0004\b\b(/\u0012\u0004\u0012\u00020\u00030*2\f\u00101\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0012\u00102\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u00030\u00152\f\u00103\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u00104\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u00105\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u00106\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022:\u0010:\u001a6\u0012\u0015\u0012\u0013\u0018\u00010\u001e¢\u0006\f\b-\u0012\b\b.\u0012\u0004\b\b(7\u0012\u0015\u0012\u0013\u0018\u000108¢\u0006\f\b-\u0012\b\b.\u0012\u0004\b\b(9\u0012\u0004\u0012\u00020\u00030*2!\u0010;\u001a\u001d\u0012\u0013\u0012\u00110\u0013¢\u0006\f\b-\u0012\b\b.\u0012\u0004\b\b(\u0014\u0012\u0004\u0012\u00020\u00030\u00152!\u0010>\u001a\u001d\u0012\u0013\u0012\u00110<¢\u0006\f\b-\u0012\b\b.\u0012\u0004\b\b(=\u0012\u0004\u0012\u00020\u00030\u0015H\u0003¢\u0006\u0004\b?\u0010@\u001a§\u0002\u0010H\u001a\u00020\u00032\u0006\u0010B\u001a\u00020A2\u0006\u0010C\u001a\u00020\u001e2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010E\u001a\u00020D2\u0006\u0010G\u001a\u00020F2\u0012\u0010'\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\u00030\u00152\u0012\u0010)\u001a\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\u00030\u00152\u0018\u0010,\u001a\u0014\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020\u00030*2\u0018\u00100\u001a\u0014\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u00030*2\f\u00101\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u00103\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0012\u00102\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u00030\u00152\f\u0010:\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022!\u0010;\u001a\u001d\u0012\u0013\u0012\u00110\u0013¢\u0006\f\b-\u0012\b\b.\u0012\u0004\b\b(\u0014\u0012\u0004\u0012\u00020\u00030\u00152\u000e\u0010%\u001a\n\u0012\u0004\u0012\u00020$\u0018\u00010#2!\u0010>\u001a\u001d\u0012\u0013\u0012\u00110<¢\u0006\f\b-\u0012\b\b.\u0012\u0004\b\b(=\u0012\u0004\u0012\u00020\u00030\u0015H\u0003¢\u0006\u0004\bH\u0010I\u001a0\u0010N\u001a\u000e\u0012\u0004\u0012\u00020L\u0012\u0004\u0012\u00020M0K*\u00020J2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0006\u001a\u00020\u0005H\u0082@¢\u0006\u0004\bN\u0010O\u001a;\u0010T\u001a\u00020\u0003*\u00020\u00002\u0006\u0010B\u001a\u00020A2\u0006\u0010/\u001a\u00020&2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010Q\u001a\u00020P2\u0006\u0010S\u001a\u00020RH\u0002¢\u0006\u0004\bT\u0010U\u001a;\u0010W\u001a\u00020\u0003*\u00020\u00002\u0006\u0010B\u001a\u00020A2\u0006\u0010V\u001a\u00020(2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010Q\u001a\u00020P2\u0006\u0010S\u001a\u00020RH\u0002¢\u0006\u0004\bW\u0010X\u001a;\u0010Z\u001a\u00020\u0003*\u00020\u00002\u0006\u0010B\u001a\u00020A2\u0006\u0010/\u001a\u00020Y2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010Q\u001a\u00020P2\u0006\u0010S\u001a\u00020RH\u0002¢\u0006\u0004\bZ\u0010[¨\u0006d²\u0006\f\u0010]\u001a\u00020\\8\nX\u008a\u0084\u0002²\u0006\u0014\u0010%\u001a\n\u0012\u0004\u0012\u00020$\u0018\u00010#8\nX\u008a\u0084\u0002²\u0006\u000e\u0010^\u001a\u00020\u000b8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010_\u001a\u00020\u000b8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010`\u001a\u00020\u000b8\n@\nX\u008a\u008e\u0002²\u0006\u0010\u0010b\u001a\u0004\u0018\u00010a8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010c\u001a\u00020\u000b8\n@\nX\u008a\u008e\u0002"}, m3636d2 = {"Lcom/robinhood/android/supportchat/thread/CxChatDuxo;", "duxo", "Lkotlin/Function0;", "", "onBackPressed", "Lcom/robinhood/android/mediaservice/ImagePicker;", "imagePicker", "Lcom/robinhood/android/mediaservice/CameraUtils;", "cameraUtils", "openPermissionSetting", "showPushSettings", "", "hideBackButton", "navigateBackWhenChatEnded", "CxChatComposable", "(Lcom/robinhood/android/supportchat/thread/CxChatDuxo;Lkotlin/jvm/functions/Function0;Lcom/robinhood/android/mediaservice/ImagePicker;Lcom/robinhood/android/mediaservice/CameraUtils;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;ZZLandroidx/compose/runtime/Composer;I)V", "Lcom/robinhood/android/supportchat/thread/CxChatViewState$TopBarState;", "topBarState", "onClickEndCta", "Lcom/robinhood/models/ui/pathfinder/messaging/ChatMode;", "chatMode", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/PaddingValues;", "content", "CxChatScaffold", "(Lcom/robinhood/android/supportchat/thread/CxChatViewState$TopBarState;Lkotlin/jvm/functions/Function0;ZLkotlin/jvm/functions/Function0;Lcom/robinhood/models/ui/pathfinder/messaging/ChatMode;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "CxChatToolBar", "(Lcom/robinhood/android/supportchat/thread/CxChatViewState$TopBarState;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lcom/robinhood/models/ui/pathfinder/messaging/ChatMode;ZLandroidx/compose/runtime/Composer;I)V", "Lcom/robinhood/android/supportchat/thread/compose/CxChatTopBars$AvatarStatus;", "avatarStatus", "", "toA11Description", "(Lcom/robinhood/models/ui/pathfinder/messaging/ChatMode;Lcom/robinhood/android/supportchat/thread/compose/CxChatTopBars$AvatarStatus;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;", "Lcom/robinhood/android/supportchat/thread/CxChatViewState$Success;", "state", "Lcom/robinhood/android/udf/event/Event;", "Lcom/robinhood/android/supportchat/thread/CxChatEvent;", "event", "Lcom/robinhood/shared/support/supportchat/ui/models/UiChatMessage$Regular;", "onClickMessageBubble", "Lcom/robinhood/shared/support/supportchat/ui/models/UiChatAction;", "onClickAction", "Lkotlin/Function2;", "Lcom/robinhood/models/ui/v2/ChatbotSuggestedResponse;", "onClickSuggestedResponse", "Lkotlin/ParameterName;", "name", "message", "onClickSend", "onClickImageIcon", "onInputChanged", "onCharacterLimitExceeded", "escalateToAgent", "endChat", "dismissDialog", "chatbotChatCursor", "", "agentChatCursor", "fetchPreviousMessages", "markAllMessagesAsRead", "Lcom/robinhood/models/ui/v2/SelectionMenuRowModel;", "row", "onClickUserSelectionRow", "CxChatSuccess", "(Lcom/robinhood/android/supportchat/thread/CxChatDuxo;Lcom/robinhood/android/supportchat/thread/CxChatViewState$Success;Lcom/robinhood/android/udf/event/Event;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lcom/robinhood/android/mediaservice/ImagePicker;Lcom/robinhood/android/mediaservice/CameraUtils;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V", "Ljava/util/UUID;", "inquiryId", "initialInput", "Lcom/robinhood/android/supportchat/thread/CxChatViewState$ContentState;", "contentState", "Lcom/robinhood/android/supportchat/thread/CxChatViewState$BottomControlState;", "bottomControlStatus", "Content", "(Ljava/util/UUID;Ljava/lang/String;Lcom/robinhood/models/ui/pathfinder/messaging/ChatMode;Lcom/robinhood/android/supportchat/thread/CxChatViewState$ContentState;Lcom/robinhood/android/supportchat/thread/CxChatViewState$BottomControlState;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lcom/robinhood/android/udf/event/Event;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Landroid/content/Intent;", "Lcom/robinhood/utils/Either;", "Landroid/graphics/Bitmap;", "Ljava/io/File;", "extractImageData", "(Landroid/content/Intent;Lcom/robinhood/models/ui/pathfinder/messaging/ChatMode;Lcom/robinhood/android/mediaservice/ImagePicker;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/robinhood/android/navigation/Navigator;", "navigator", "Landroid/content/Context;", "context", "handleMessageBubbleClick", "(Lcom/robinhood/android/supportchat/thread/CxChatDuxo;Ljava/util/UUID;Lcom/robinhood/shared/support/supportchat/ui/models/UiChatMessage$Regular;Lcom/robinhood/models/ui/pathfinder/messaging/ChatMode;Lcom/robinhood/android/navigation/Navigator;Landroid/content/Context;)V", "action", "handleAction", "(Lcom/robinhood/android/supportchat/thread/CxChatDuxo;Ljava/util/UUID;Lcom/robinhood/shared/support/supportchat/ui/models/UiChatAction;Lcom/robinhood/models/ui/pathfinder/messaging/ChatMode;Lcom/robinhood/android/navigation/Navigator;Landroid/content/Context;)V", "Lcom/robinhood/shared/support/supportchat/ui/models/UiChatMessage$Regular$Image;", "resendUserImage", "(Lcom/robinhood/android/supportchat/thread/CxChatDuxo;Ljava/util/UUID;Lcom/robinhood/shared/support/supportchat/ui/models/UiChatMessage$Regular$Image;Lcom/robinhood/models/ui/pathfinder/messaging/ChatMode;Lcom/robinhood/android/navigation/Navigator;Landroid/content/Context;)V", "Lcom/robinhood/android/supportchat/thread/CxChatViewState;", "viewState", "showGlobalDialog", "showDialog", "showImageProcessingIndicator", "Landroid/net/Uri;", "cameraFileUri", "triggerCameraFlow", "feature-support-chat_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class CxChatComposableKt {

    /* compiled from: CxChatComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CxChatTopBar5.AvatarStatus.values().length];
            try {
                iArr[CxChatTopBar5.AvatarStatus.Online.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CxChatTopBar5.AvatarStatus.Offline.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CxChatTopBar5.AvatarStatus.Hidden.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: CxChatComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.supportchat.thread.compose.CxChatComposableKt", m3645f = "CxChatComposable.kt", m3646l = {1053}, m3647m = "extractImageData")
    /* renamed from: com.robinhood.android.supportchat.thread.compose.CxChatComposableKt$extractImageData$1 */
    static final class C291911 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C291911(Continuation<? super C291911> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CxChatComposableKt.extractImageData(null, null, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Content$lambda$49(UUID uuid, String str, ChatMode chatMode, CxChatViewState.ContentState contentState, CxChatViewState.BottomControlState bottomControlState, Function1 function1, Function1 function12, Function2 function2, Function2 function22, Function0 function0, Function0 function02, Function1 function13, Function0 function03, Function1 function14, Event event, Function1 function15, int i, int i2, Composer composer, int i3) {
        Content(uuid, str, chatMode, contentState, bottomControlState, function1, function12, function2, function22, function0, function02, function13, function03, function14, event, function15, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), RecomposeScopeImpl4.updateChangedFlags(i2));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CxChatComposable$lambda$8(CxChatDuxo cxChatDuxo, Function0 function0, ImagePicker imagePicker, CameraUtils cameraUtils, Function0 function02, Function0 function03, boolean z, boolean z2, int i, Composer composer, int i2) {
        CxChatComposable(cxChatDuxo, function0, imagePicker, cameraUtils, function02, function03, z, z2, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CxChatScaffold$lambda$11(CxChatViewState.TopBarState topBarState, Function0 function0, boolean z, Function0 function02, ChatMode chatMode, Function3 function3, int i, int i2, Composer composer, int i3) {
        CxChatScaffold(topBarState, function0, z, function02, chatMode, function3, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CxChatSuccess$lambda$45(CxChatDuxo cxChatDuxo, CxChatViewState.Success success, Event event, Function1 function1, Function1 function12, Function2 function2, Function2 function22, Function0 function0, Function1 function13, Function0 function02, ImagePicker imagePicker, CameraUtils cameraUtils, Function0 function03, Function0 function04, Function0 function05, Function0 function06, Function0 function07, Function0 function08, Function2 function23, Function1 function14, Function1 function15, int i, int i2, int i3, Composer composer, int i4) {
        CxChatSuccess(cxChatDuxo, success, event, function1, function12, function2, function22, function0, function13, function02, imagePicker, cameraUtils, function03, function04, function05, function06, function07, function08, function23, function14, function15, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), RecomposeScopeImpl4.updateChangedFlags(i2), RecomposeScopeImpl4.updateChangedFlags(i3));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CxChatToolBar$lambda$12(CxChatViewState.TopBarState topBarState, Function0 function0, Function0 function02, ChatMode chatMode, boolean z, int i, Composer composer, int i2) {
        CxChatToolBar(topBarState, function0, function02, chatMode, z, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CxChatViewState CxChatComposable$lambda$0(SnapshotState4<? extends CxChatViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Event<CxChatEvent> CxChatComposable$lambda$1(SnapshotState4<Event<CxChatEvent>> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean CxChatComposable$lambda$3(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    private static final boolean CxChatSuccess$lambda$14(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean CxChatSuccess$lambda$17(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Uri CxChatSuccess$lambda$20(SnapshotState<Uri> snapshotState) {
        return snapshotState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean CxChatSuccess$lambda$27(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    public static final void CxChatComposable(final CxChatDuxo duxo, final Function0<Unit> onBackPressed, final ImagePicker imagePicker, final CameraUtils cameraUtils, final Function0<Unit> openPermissionSetting, final Function0<Unit> showPushSettings, final boolean z, final boolean z2, Composer composer, final int i) {
        int i2;
        boolean z3;
        Composer composer2;
        final Event<CxChatEvent> eventCxChatComposable$lambda$1;
        EventConsumer<CxChatEvent> eventConsumerInvoke;
        final Event<CxChatEvent> eventCxChatComposable$lambda$12;
        EventConsumer<CxChatEvent> eventConsumerInvoke2;
        Intrinsics.checkNotNullParameter(duxo, "duxo");
        Intrinsics.checkNotNullParameter(onBackPressed, "onBackPressed");
        Intrinsics.checkNotNullParameter(imagePicker, "imagePicker");
        Intrinsics.checkNotNullParameter(cameraUtils, "cameraUtils");
        Intrinsics.checkNotNullParameter(openPermissionSetting, "openPermissionSetting");
        Intrinsics.checkNotNullParameter(showPushSettings, "showPushSettings");
        Composer composerStartRestartGroup = composer.startRestartGroup(1525504257);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(duxo) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onBackPressed) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? composerStartRestartGroup.changed(imagePicker) : composerStartRestartGroup.changedInstance(imagePicker) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= (i & 4096) == 0 ? composerStartRestartGroup.changed(cameraUtils) : composerStartRestartGroup.changedInstance(cameraUtils) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(openPermissionSetting) ? 16384 : 8192;
        }
        if ((i & 196608) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(showPushSettings) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= composerStartRestartGroup.changed(z) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            z3 = z2;
            i2 |= composerStartRestartGroup.changed(z3) ? 8388608 : 4194304;
        } else {
            z3 = z2;
        }
        if ((4793491 & i2) != 4793490 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1525504257, i2, -1, "com.robinhood.android.supportchat.thread.compose.CxChatComposable (CxChatComposable.kt:118)");
            }
            Navigator navigator = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
            Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(duxo.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
            final StateFlow<Event<CxChatEvent>> eventFlow = duxo.getEventFlow();
            composerStartRestartGroup.startReplaceGroup(-523522313);
            LifecycleOwner lifecycleOwner = (LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
            Lifecycle.State state = Lifecycle.State.STARTED;
            CoroutineContextImpl6 coroutineContextImpl6 = CoroutineContextImpl6.INSTANCE;
            Flow<Event<?>> flow = new Flow<Event<?>>() { // from class: com.robinhood.android.supportchat.thread.compose.CxChatComposableKt$CxChatComposable$$inlined$collectEventAsStateWithLifecycle$1
                @Override // kotlinx.coroutines.flow.Flow
                public Object collect(FlowCollector<? super Event<?>> flowCollector, Continuation continuation) {
                    Object objCollect = eventFlow.collect(new AnonymousClass2(flowCollector), continuation);
                    return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                }

                /* compiled from: Emitters.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.android.supportchat.thread.compose.CxChatComposableKt$CxChatComposable$$inlined$collectEventAsStateWithLifecycle$1$2, reason: invalid class name */
                public static final class AnonymousClass2<T> implements FlowCollector {
                    final /* synthetic */ FlowCollector $this_unsafeFlow;

                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @DebugMetadata(m3644c = "com.robinhood.android.supportchat.thread.compose.CxChatComposableKt$CxChatComposable$$inlined$collectEventAsStateWithLifecycle$1$2", m3645f = "CxChatComposable.kt", m3646l = {50}, m3647m = "emit")
                    /* renamed from: com.robinhood.android.supportchat.thread.compose.CxChatComposableKt$CxChatComposable$$inlined$collectEventAsStateWithLifecycle$1$2$1, reason: invalid class name */
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
                            if ((event != null ? event.getData() : null) instanceof CxChatEvent) {
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
            Event<CxChatEvent> value = eventFlow.getValue();
            Event<CxChatEvent> event = value;
            if (!((event != null ? event.getData() : null) instanceof CxChatEvent)) {
                value = null;
            }
            SnapshotState4 snapshotState4CollectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(flow, value, lifecycleOwner.getLifecycle(), state, coroutineContextImpl6, composerStartRestartGroup, 0, 0);
            composer2 = composerStartRestartGroup;
            composer2.endReplaceGroup();
            composer2.startReplaceGroup(1849434622);
            Object objRememberedValue = composer2.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composer2.updateRememberedValue(objRememberedValue);
            }
            final SnapshotState snapshotState = (SnapshotState) objRememberedValue;
            composer2.endReplaceGroup();
            if ((duxo.getStateFlow().getValue().getDialogData() instanceof CxChatDialogData.CxChatExistingLiveCase) && (eventCxChatComposable$lambda$12 = CxChatComposable$lambda$1(snapshotState4CollectAsStateWithLifecycle2)) != null && (eventCxChatComposable$lambda$12.getData() instanceof CxChatEvent.OpenDialog) && (eventConsumerInvoke2 = eventCxChatComposable$lambda$12.getGetEventConsumer().invoke()) != null) {
                eventConsumerInvoke2.consume(eventCxChatComposable$lambda$12, new Function1() { // from class: com.robinhood.android.supportchat.thread.compose.CxChatComposableKt$CxChatComposable$$inlined$consumeIfType$1
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        m19167invoke(obj);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m19167invoke(Object it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        CxChatComposableKt.CxChatComposable$lambda$4(snapshotState, true);
                    }
                });
            }
            if ((duxo.getStateFlow().getValue().getDialogData() instanceof CxChatDialogData.CxChatExistingLiveCase) && (eventCxChatComposable$lambda$1 = CxChatComposable$lambda$1(snapshotState4CollectAsStateWithLifecycle2)) != null && (eventCxChatComposable$lambda$1.getData() instanceof CxChatEvent.DismissDialog) && (eventConsumerInvoke = eventCxChatComposable$lambda$1.getGetEventConsumer().invoke()) != null) {
                eventConsumerInvoke.consume(eventCxChatComposable$lambda$1, new Function1() { // from class: com.robinhood.android.supportchat.thread.compose.CxChatComposableKt$CxChatComposable$$inlined$consumeIfType$2
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        m19168invoke(obj);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m19168invoke(Object it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        CxChatComposableKt.CxChatComposable$lambda$4(snapshotState, false);
                    }
                });
            }
            CxChatViewState.TopBarState topBarState = CxChatComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle).getTopBarState();
            composer2.startReplaceGroup(5004770);
            boolean zChangedInstance = composer2.changedInstance(duxo);
            Object objRememberedValue2 = composer2.rememberedValue();
            if (zChangedInstance || objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new CxChatComposableKt$CxChatComposable$3$1(duxo);
                composer2.updateRememberedValue(objRememberedValue2);
            }
            composer2.endReplaceGroup();
            int i3 = i2;
            CxChatScaffold(topBarState, onBackPressed, z, (Function0) ((KFunction) objRememberedValue2), null, ComposableLambda3.rememberComposableLambda(1921551401, true, new C291844(duxo, onBackPressed, navigator, context, imagePicker, cameraUtils, openPermissionSetting, z3, showPushSettings, snapshotState4CollectAsStateWithLifecycle, snapshotState4CollectAsStateWithLifecycle2, snapshotState), composer2, 54), composer2, (i3 & 112) | 196608 | ((i3 >> 12) & 896), 16);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.supportchat.thread.compose.CxChatComposableKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CxChatComposableKt.CxChatComposable$lambda$8(duxo, onBackPressed, imagePicker, cameraUtils, openPermissionSetting, showPushSettings, z, z2, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void CxChatComposable$lambda$4(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* compiled from: CxChatComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.supportchat.thread.compose.CxChatComposableKt$CxChatComposable$4 */
    static final class C291844 implements Function3<PaddingValues, Composer, Integer, Unit> {
        final /* synthetic */ CameraUtils $cameraUtils;
        final /* synthetic */ Context $context;
        final /* synthetic */ CxChatDuxo $duxo;
        final /* synthetic */ SnapshotState4<Event<CxChatEvent>> $event$delegate;
        final /* synthetic */ ImagePicker $imagePicker;
        final /* synthetic */ boolean $navigateBackWhenChatEnded;
        final /* synthetic */ Navigator $navigator;
        final /* synthetic */ Function0<Unit> $onBackPressed;
        final /* synthetic */ Function0<Unit> $openPermissionSetting;
        final /* synthetic */ SnapshotState<Boolean> $showGlobalDialog$delegate;
        final /* synthetic */ Function0<Unit> $showPushSettings;
        final /* synthetic */ SnapshotState4<CxChatViewState> $viewState$delegate;

        /* JADX WARN: Multi-variable type inference failed */
        C291844(CxChatDuxo cxChatDuxo, Function0<Unit> function0, Navigator navigator, Context context, ImagePicker imagePicker, CameraUtils cameraUtils, Function0<Unit> function02, boolean z, Function0<Unit> function03, SnapshotState4<? extends CxChatViewState> snapshotState4, SnapshotState4<Event<CxChatEvent>> snapshotState42, SnapshotState<Boolean> snapshotState) {
            this.$duxo = cxChatDuxo;
            this.$onBackPressed = function0;
            this.$navigator = navigator;
            this.$context = context;
            this.$imagePicker = imagePicker;
            this.$cameraUtils = cameraUtils;
            this.$openPermissionSetting = function02;
            this.$navigateBackWhenChatEnded = z;
            this.$showPushSettings = function03;
            this.$viewState$delegate = snapshotState4;
            this.$event$delegate = snapshotState42;
            this.$showGlobalDialog$delegate = snapshotState;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer, Integer num) {
            invoke(paddingValues, composer, num.intValue());
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$25$lambda$1$lambda$0(CxChatDuxo cxChatDuxo, CxChatViewState cxChatViewState) {
            cxChatDuxo.fetchSupportChat(((CxChatViewState.FailedFetching) cxChatViewState).getInquiryId());
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$25$lambda$3$lambda$2(CxChatDuxo cxChatDuxo) {
            cxChatDuxo.createSupportChat();
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$25$lambda$10$lambda$9(CxChatDuxo cxChatDuxo, CxChatViewState cxChatViewState, Navigator navigator, Context context, UiChatMessage.Regular message) {
            Intrinsics.checkNotNullParameter(message, "message");
            CxChatViewState.Success success = (CxChatViewState.Success) cxChatViewState;
            CxChatComposableKt.handleMessageBubbleClick(cxChatDuxo, success.getInquiryId(), message, success.getChatMode(), navigator, context);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$25$lambda$12$lambda$11(CxChatDuxo cxChatDuxo, CxChatViewState cxChatViewState, Navigator navigator, Context context, UiChatAction action) {
            Intrinsics.checkNotNullParameter(action, "action");
            CxChatViewState.Success success = (CxChatViewState.Success) cxChatViewState;
            CxChatComposableKt.handleAction(cxChatDuxo, success.getInquiryId(), action, success.getChatMode(), navigator, context);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$25$lambda$14$lambda$13(CxChatDuxo cxChatDuxo, CxChatViewState cxChatViewState, ChatMode chatMode, ChatbotSuggestedResponse suggestedResponse) {
            Intrinsics.checkNotNullParameter(chatMode, "chatMode");
            Intrinsics.checkNotNullParameter(suggestedResponse, "suggestedResponse");
            CxChatDuxo.sendSuggestedResponseSelection$default(cxChatDuxo, ((CxChatViewState.Success) cxChatViewState).getInquiryId(), chatMode, suggestedResponse, null, 8, null);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$25$lambda$16$lambda$15(CxChatDuxo cxChatDuxo, CxChatViewState cxChatViewState, ChatMode chatMode, String message) {
            Intrinsics.checkNotNullParameter(chatMode, "chatMode");
            Intrinsics.checkNotNullParameter(message, "message");
            CxChatDuxo.sendTextMessage$default(cxChatDuxo, ((CxChatViewState.Success) cxChatViewState).getInquiryId(), chatMode, message, null, 8, null);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$25$lambda$18$lambda$17(CxChatDuxo cxChatDuxo, CxChatViewState cxChatViewState) {
            CxChatViewState.Success success = (CxChatViewState.Success) cxChatViewState;
            cxChatDuxo.escalateToAgent(success.getInquiryId(), null, success.getChatMode());
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$25$lambda$22$lambda$21(CxChatDuxo cxChatDuxo, CxChatViewState cxChatViewState, String str, Long l) {
            CxChatViewState.Success success = (CxChatViewState.Success) cxChatViewState;
            cxChatDuxo.fetchPreviousMessages(success.getInquiryId(), success.getChatMode(), str, l);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$25$lambda$20$lambda$19(CxChatDuxo cxChatDuxo, CxChatViewState cxChatViewState, boolean z, Function0 function0) {
            CxChatViewState.Success success = (CxChatViewState.Success) cxChatViewState;
            cxChatDuxo.endChat(success.getInquiryId(), null, success.getChatMode());
            if (z) {
                function0.invoke();
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$25$lambda$24$lambda$23(CxChatDuxo cxChatDuxo, CxChatViewState cxChatViewState, SelectionMenuRowModel row) {
            Intrinsics.checkNotNullParameter(row, "row");
            CxChatViewState.Success success = (CxChatViewState.Success) cxChatViewState;
            cxChatDuxo.sendSelectionMenuSelection(success.getInquiryId(), success.getChatMode(), row);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$27$lambda$26(CxChatDuxo cxChatDuxo, SnapshotState snapshotState) {
            cxChatDuxo.dismissDialog();
            CxChatComposableKt.CxChatComposable$lambda$4(snapshotState, false);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$29$lambda$28(Function0 function0, CxChatDuxo cxChatDuxo, SnapshotState snapshotState) {
            function0.invoke();
            cxChatDuxo.dismissDialog();
            CxChatComposableKt.CxChatComposable$lambda$4(snapshotState, false);
            return Unit.INSTANCE;
        }

        /* JADX WARN: Removed duplicated region for block: B:101:0x0303  */
        /* JADX WARN: Removed duplicated region for block: B:104:0x0332  */
        /* JADX WARN: Removed duplicated region for block: B:107:0x033d  */
        /* JADX WARN: Removed duplicated region for block: B:111:0x0370  */
        /* JADX WARN: Removed duplicated region for block: B:113:0x0378  */
        /* JADX WARN: Removed duplicated region for block: B:118:0x03a9  */
        /* JADX WARN: Removed duplicated region for block: B:121:0x03d2  */
        /* JADX WARN: Removed duplicated region for block: B:124:0x03dd  */
        /* JADX WARN: Removed duplicated region for block: B:87:0x02a2  */
        /* JADX WARN: Removed duplicated region for block: B:90:0x02ad  */
        /* JADX WARN: Removed duplicated region for block: B:94:0x02d1  */
        /* JADX WARN: Removed duplicated region for block: B:96:0x02d9  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void invoke(PaddingValues paddingValues, Composer composer, int i) {
            int i2;
            KFunction kFunction;
            boolean zChangedInstance;
            Function1 function1;
            boolean zChangedInstance2;
            Object objRememberedValue;
            boolean zChangedInstance3;
            Object objRememberedValue2;
            boolean zChangedInstance4;
            Function2 function2;
            boolean zChangedInstance5;
            Object objRememberedValue3;
            boolean zChangedInstance6;
            Object objRememberedValue4;
            boolean zChangedInstance7;
            Function0 function0;
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
                ComposerKt.traceEventStart(1921551401, i2, -1, "com.robinhood.android.supportchat.thread.compose.CxChatComposable.<anonymous> (CxChatComposable.kt:144)");
            }
            Modifier modifierNavigationBarsPadding = WindowInsetsPadding_androidKt.navigationBarsPadding(PaddingKt.padding(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), paddingValues));
            final CxChatDuxo cxChatDuxo = this.$duxo;
            final Function0<Unit> function02 = this.$onBackPressed;
            final Navigator navigator = this.$navigator;
            final Context context = this.$context;
            ImagePicker imagePicker = this.$imagePicker;
            CameraUtils cameraUtils = this.$cameraUtils;
            Function0<Unit> function03 = this.$openPermissionSetting;
            final boolean z = this.$navigateBackWhenChatEnded;
            Function0<Unit> function04 = this.$showPushSettings;
            SnapshotState4<CxChatViewState> snapshotState4 = this.$viewState$delegate;
            SnapshotState4<Event<CxChatEvent>> snapshotState42 = this.$event$delegate;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, modifierNavigationBarsPadding);
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            final CxChatViewState cxChatViewStateCxChatComposable$lambda$0 = CxChatComposableKt.CxChatComposable$lambda$0(snapshotState4);
            if (cxChatViewStateCxChatComposable$lambda$0 instanceof CxChatViewState.Loading) {
                composer2.startReplaceGroup(-1799208984);
                CxChatLoadingComposable.CxChatLoadingComposable(composer2, 0);
                composer2.endReplaceGroup();
            } else if (cxChatViewStateCxChatComposable$lambda$0 instanceof CxChatViewState.FailedFetching) {
                composer2.startReplaceGroup(-1799206236);
                composer2.startReplaceGroup(-1633490746);
                boolean zChangedInstance8 = composer2.changedInstance(cxChatDuxo) | composer2.changedInstance(cxChatViewStateCxChatComposable$lambda$0);
                Object objRememberedValue5 = composer2.rememberedValue();
                if (zChangedInstance8 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue5 = new Function0() { // from class: com.robinhood.android.supportchat.thread.compose.CxChatComposableKt$CxChatComposable$4$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return CxChatComposableKt.C291844.invoke$lambda$25$lambda$1$lambda$0(cxChatDuxo, cxChatViewStateCxChatComposable$lambda$0);
                        }
                    };
                    composer2.updateRememberedValue(objRememberedValue5);
                }
                composer2.endReplaceGroup();
                CxChatErrorComposable.CxChatErrorComposable((Function0) objRememberedValue5, function02, null, null, composer2, 0, 12);
                composer2.endReplaceGroup();
            } else if (cxChatViewStateCxChatComposable$lambda$0 instanceof CxChatViewState.FailedCreating) {
                composer2.startReplaceGroup(-1799197637);
                composer2.startReplaceGroup(5004770);
                boolean zChangedInstance9 = composer2.changedInstance(cxChatDuxo);
                Object objRememberedValue6 = composer2.rememberedValue();
                if (zChangedInstance9 || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue6 = new Function0() { // from class: com.robinhood.android.supportchat.thread.compose.CxChatComposableKt$CxChatComposable$4$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return CxChatComposableKt.C291844.invoke$lambda$25$lambda$3$lambda$2(cxChatDuxo);
                        }
                    };
                    composer2.updateRememberedValue(objRememberedValue6);
                }
                composer2.endReplaceGroup();
                CxChatErrorComposable.CxChatErrorComposable((Function0) objRememberedValue6, function02, null, null, composer2, 3072, 4);
                composer2.endReplaceGroup();
            } else {
                if (!(cxChatViewStateCxChatComposable$lambda$0 instanceof CxChatViewState.Success)) {
                    composer2.startReplaceGroup(-1799206705);
                    composer2.endReplaceGroup();
                    throw new NoWhenBranchMatchedException();
                }
                composer2.startReplaceGroup(59847910);
                CxChatViewState.Success success = (CxChatViewState.Success) cxChatViewStateCxChatComposable$lambda$0;
                Event eventCxChatComposable$lambda$1 = CxChatComposableKt.CxChatComposable$lambda$1(snapshotState42);
                composer2.startReplaceGroup(5004770);
                boolean zChangedInstance10 = composer2.changedInstance(cxChatDuxo);
                Object objRememberedValue7 = composer2.rememberedValue();
                if (zChangedInstance10 || objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue7 = new CxChatComposableKt$CxChatComposable$4$1$3$1(cxChatDuxo);
                    composer2.updateRememberedValue(objRememberedValue7);
                }
                KFunction kFunction2 = (KFunction) objRememberedValue7;
                composer2.endReplaceGroup();
                composer2.startReplaceGroup(5004770);
                boolean zChangedInstance11 = composer2.changedInstance(cxChatDuxo);
                Object objRememberedValue8 = composer2.rememberedValue();
                if (zChangedInstance11 || objRememberedValue8 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue8 = new CxChatComposableKt$CxChatComposable$4$1$4$1(cxChatDuxo);
                    composer2.updateRememberedValue(objRememberedValue8);
                }
                KFunction kFunction3 = (KFunction) objRememberedValue8;
                composer2.endReplaceGroup();
                composer2.startReplaceGroup(5004770);
                boolean zChangedInstance12 = composer2.changedInstance(cxChatDuxo);
                Object objRememberedValue9 = composer2.rememberedValue();
                if (zChangedInstance12 || objRememberedValue9 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue9 = new CxChatComposableKt$CxChatComposable$4$1$5$1(cxChatDuxo);
                    composer2.updateRememberedValue(objRememberedValue9);
                }
                KFunction kFunction4 = (KFunction) objRememberedValue9;
                composer2.endReplaceGroup();
                composer2.startReplaceGroup(5004770);
                boolean zChangedInstance13 = composer2.changedInstance(cxChatDuxo);
                Object objRememberedValue10 = composer2.rememberedValue();
                if (zChangedInstance13 || objRememberedValue10 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue10 = new CxChatComposableKt$CxChatComposable$4$1$6$1(cxChatDuxo);
                    composer2.updateRememberedValue(objRememberedValue10);
                }
                KFunction kFunction5 = (KFunction) objRememberedValue10;
                composer2.endReplaceGroup();
                composer2.startReplaceGroup(5004770);
                boolean zChangedInstance14 = composer2.changedInstance(cxChatDuxo);
                Object objRememberedValue11 = composer2.rememberedValue();
                if (zChangedInstance14 || objRememberedValue11 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue11 = new CxChatComposableKt$CxChatComposable$4$1$7$1(cxChatDuxo);
                    composer2.updateRememberedValue(objRememberedValue11);
                }
                KFunction kFunction6 = (KFunction) objRememberedValue11;
                composer2.endReplaceGroup();
                composer2.startReplaceGroup(-1224400529);
                boolean zChangedInstance15 = composer2.changedInstance(cxChatDuxo) | composer2.changedInstance(cxChatViewStateCxChatComposable$lambda$0) | composer2.changedInstance(navigator) | composer2.changedInstance(context);
                Object objRememberedValue12 = composer2.rememberedValue();
                if (zChangedInstance15) {
                    kFunction = kFunction6;
                } else {
                    kFunction = kFunction6;
                    if (objRememberedValue12 == Composer.INSTANCE.getEmpty()) {
                    }
                    Function1 function12 = (Function1) objRememberedValue12;
                    composer2.endReplaceGroup();
                    composer2.startReplaceGroup(-1224400529);
                    zChangedInstance = composer2.changedInstance(cxChatDuxo) | composer2.changedInstance(cxChatViewStateCxChatComposable$lambda$0) | composer2.changedInstance(navigator) | composer2.changedInstance(context);
                    Object objRememberedValue13 = composer2.rememberedValue();
                    if (zChangedInstance) {
                        function1 = function12;
                        if (objRememberedValue13 == Composer.INSTANCE.getEmpty()) {
                        }
                        Function1 function13 = (Function1) objRememberedValue13;
                        composer2.endReplaceGroup();
                        composer2.startReplaceGroup(-1633490746);
                        zChangedInstance2 = composer2.changedInstance(cxChatDuxo) | composer2.changedInstance(cxChatViewStateCxChatComposable$lambda$0);
                        objRememberedValue = composer2.rememberedValue();
                        if (zChangedInstance2 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function2() { // from class: com.robinhood.android.supportchat.thread.compose.CxChatComposableKt$CxChatComposable$4$$ExternalSyntheticLambda6
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return CxChatComposableKt.C291844.invoke$lambda$25$lambda$14$lambda$13(cxChatDuxo, cxChatViewStateCxChatComposable$lambda$0, (ChatMode) obj, (ChatbotSuggestedResponse) obj2);
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue);
                        }
                        Function2 function22 = (Function2) objRememberedValue;
                        composer2.endReplaceGroup();
                        composer2.startReplaceGroup(-1633490746);
                        zChangedInstance3 = composer2.changedInstance(cxChatDuxo) | composer2.changedInstance(cxChatViewStateCxChatComposable$lambda$0);
                        objRememberedValue2 = composer2.rememberedValue();
                        if (!zChangedInstance3 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = new Function2() { // from class: com.robinhood.android.supportchat.thread.compose.CxChatComposableKt$CxChatComposable$4$$ExternalSyntheticLambda7
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return CxChatComposableKt.C291844.invoke$lambda$25$lambda$16$lambda$15(cxChatDuxo, cxChatViewStateCxChatComposable$lambda$0, (ChatMode) obj, (String) obj2);
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue2);
                        }
                        Function2 function23 = (Function2) objRememberedValue2;
                        composer2.endReplaceGroup();
                        Function0 function05 = (Function0) kFunction2;
                        Function1 function14 = (Function1) kFunction3;
                        Function0 function06 = (Function0) kFunction4;
                        composer2.startReplaceGroup(-1633490746);
                        zChangedInstance4 = composer2.changedInstance(cxChatDuxo) | composer2.changedInstance(cxChatViewStateCxChatComposable$lambda$0);
                        Object objRememberedValue14 = composer2.rememberedValue();
                        if (zChangedInstance4) {
                            function2 = function22;
                            if (objRememberedValue14 == Composer.INSTANCE.getEmpty()) {
                            }
                            Function0 function07 = (Function0) objRememberedValue14;
                            composer2.endReplaceGroup();
                            composer2.startReplaceGroup(-1224400529);
                            zChangedInstance5 = composer2.changedInstance(cxChatDuxo) | composer2.changedInstance(cxChatViewStateCxChatComposable$lambda$0) | composer2.changed(z) | composer2.changed(function02);
                            objRememberedValue3 = composer2.rememberedValue();
                            if (zChangedInstance5 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue3 = new Function0() { // from class: com.robinhood.android.supportchat.thread.compose.CxChatComposableKt$CxChatComposable$4$$ExternalSyntheticLambda9
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return CxChatComposableKt.C291844.invoke$lambda$25$lambda$20$lambda$19(cxChatDuxo, cxChatViewStateCxChatComposable$lambda$0, z, function02);
                                    }
                                };
                                composer2.updateRememberedValue(objRememberedValue3);
                            }
                            Function0 function08 = (Function0) objRememberedValue3;
                            composer2.endReplaceGroup();
                            Function0 function09 = (Function0) kFunction5;
                            composer2.startReplaceGroup(-1633490746);
                            zChangedInstance6 = composer2.changedInstance(cxChatDuxo) | composer2.changedInstance(cxChatViewStateCxChatComposable$lambda$0);
                            objRememberedValue4 = composer2.rememberedValue();
                            if (!zChangedInstance6 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue4 = new Function2() { // from class: com.robinhood.android.supportchat.thread.compose.CxChatComposableKt$CxChatComposable$4$$ExternalSyntheticLambda10
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        return CxChatComposableKt.C291844.invoke$lambda$25$lambda$22$lambda$21(cxChatDuxo, cxChatViewStateCxChatComposable$lambda$0, (String) obj, (Long) obj2);
                                    }
                                };
                                composer2.updateRememberedValue(objRememberedValue4);
                            }
                            Function2 function24 = (Function2) objRememberedValue4;
                            composer2.endReplaceGroup();
                            Function1 function15 = (Function1) kFunction;
                            composer2.startReplaceGroup(-1633490746);
                            zChangedInstance7 = composer2.changedInstance(cxChatDuxo) | composer2.changedInstance(cxChatViewStateCxChatComposable$lambda$0);
                            Object objRememberedValue15 = composer2.rememberedValue();
                            if (zChangedInstance7) {
                                function0 = function09;
                                if (objRememberedValue15 == Composer.INSTANCE.getEmpty()) {
                                }
                                composer2.endReplaceGroup();
                                Function1 function16 = function1;
                                CxChatComposableKt.CxChatSuccess(cxChatDuxo, success, eventCxChatComposable$lambda$1, function16, function13, function2, function23, function05, function14, function06, imagePicker, cameraUtils, function03, function07, function02, function08, function04, function0, function24, function15, (Function1) objRememberedValue15, composer, 0, ImagePicker.$stable | (CameraUtils.$stable << 3), 0);
                                composer2 = composer;
                                composer2.endReplaceGroup();
                            } else {
                                function0 = function09;
                            }
                            objRememberedValue15 = new Function1() { // from class: com.robinhood.android.supportchat.thread.compose.CxChatComposableKt$CxChatComposable$4$$ExternalSyntheticLambda11
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return CxChatComposableKt.C291844.invoke$lambda$25$lambda$24$lambda$23(cxChatDuxo, cxChatViewStateCxChatComposable$lambda$0, (SelectionMenuRowModel) obj);
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue15);
                            composer2.endReplaceGroup();
                            Function1 function162 = function1;
                            CxChatComposableKt.CxChatSuccess(cxChatDuxo, success, eventCxChatComposable$lambda$1, function162, function13, function2, function23, function05, function14, function06, imagePicker, cameraUtils, function03, function07, function02, function08, function04, function0, function24, function15, (Function1) objRememberedValue15, composer, 0, ImagePicker.$stable | (CameraUtils.$stable << 3), 0);
                            composer2 = composer;
                            composer2.endReplaceGroup();
                        } else {
                            function2 = function22;
                        }
                        objRememberedValue14 = new Function0() { // from class: com.robinhood.android.supportchat.thread.compose.CxChatComposableKt$CxChatComposable$4$$ExternalSyntheticLambda8
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return CxChatComposableKt.C291844.invoke$lambda$25$lambda$18$lambda$17(cxChatDuxo, cxChatViewStateCxChatComposable$lambda$0);
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue14);
                        Function0 function072 = (Function0) objRememberedValue14;
                        composer2.endReplaceGroup();
                        composer2.startReplaceGroup(-1224400529);
                        zChangedInstance5 = composer2.changedInstance(cxChatDuxo) | composer2.changedInstance(cxChatViewStateCxChatComposable$lambda$0) | composer2.changed(z) | composer2.changed(function02);
                        objRememberedValue3 = composer2.rememberedValue();
                        if (zChangedInstance5) {
                            objRememberedValue3 = new Function0() { // from class: com.robinhood.android.supportchat.thread.compose.CxChatComposableKt$CxChatComposable$4$$ExternalSyntheticLambda9
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return CxChatComposableKt.C291844.invoke$lambda$25$lambda$20$lambda$19(cxChatDuxo, cxChatViewStateCxChatComposable$lambda$0, z, function02);
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue3);
                            Function0 function082 = (Function0) objRememberedValue3;
                            composer2.endReplaceGroup();
                            Function0 function092 = (Function0) kFunction5;
                            composer2.startReplaceGroup(-1633490746);
                            zChangedInstance6 = composer2.changedInstance(cxChatDuxo) | composer2.changedInstance(cxChatViewStateCxChatComposable$lambda$0);
                            objRememberedValue4 = composer2.rememberedValue();
                            if (!zChangedInstance6) {
                                objRememberedValue4 = new Function2() { // from class: com.robinhood.android.supportchat.thread.compose.CxChatComposableKt$CxChatComposable$4$$ExternalSyntheticLambda10
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        return CxChatComposableKt.C291844.invoke$lambda$25$lambda$22$lambda$21(cxChatDuxo, cxChatViewStateCxChatComposable$lambda$0, (String) obj, (Long) obj2);
                                    }
                                };
                                composer2.updateRememberedValue(objRememberedValue4);
                                Function2 function242 = (Function2) objRememberedValue4;
                                composer2.endReplaceGroup();
                                Function1 function152 = (Function1) kFunction;
                                composer2.startReplaceGroup(-1633490746);
                                zChangedInstance7 = composer2.changedInstance(cxChatDuxo) | composer2.changedInstance(cxChatViewStateCxChatComposable$lambda$0);
                                Object objRememberedValue152 = composer2.rememberedValue();
                                if (zChangedInstance7) {
                                }
                                objRememberedValue152 = new Function1() { // from class: com.robinhood.android.supportchat.thread.compose.CxChatComposableKt$CxChatComposable$4$$ExternalSyntheticLambda11
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return CxChatComposableKt.C291844.invoke$lambda$25$lambda$24$lambda$23(cxChatDuxo, cxChatViewStateCxChatComposable$lambda$0, (SelectionMenuRowModel) obj);
                                    }
                                };
                                composer2.updateRememberedValue(objRememberedValue152);
                                composer2.endReplaceGroup();
                                Function1 function1622 = function1;
                                CxChatComposableKt.CxChatSuccess(cxChatDuxo, success, eventCxChatComposable$lambda$1, function1622, function13, function2, function23, function05, function14, function06, imagePicker, cameraUtils, function03, function072, function02, function082, function04, function0, function242, function152, (Function1) objRememberedValue152, composer, 0, ImagePicker.$stable | (CameraUtils.$stable << 3), 0);
                                composer2 = composer;
                                composer2.endReplaceGroup();
                            }
                        }
                    } else {
                        function1 = function12;
                    }
                    objRememberedValue13 = new Function1() { // from class: com.robinhood.android.supportchat.thread.compose.CxChatComposableKt$CxChatComposable$4$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return CxChatComposableKt.C291844.invoke$lambda$25$lambda$12$lambda$11(cxChatDuxo, cxChatViewStateCxChatComposable$lambda$0, navigator, context, (UiChatAction) obj);
                        }
                    };
                    composer2.updateRememberedValue(objRememberedValue13);
                    Function1 function132 = (Function1) objRememberedValue13;
                    composer2.endReplaceGroup();
                    composer2.startReplaceGroup(-1633490746);
                    zChangedInstance2 = composer2.changedInstance(cxChatDuxo) | composer2.changedInstance(cxChatViewStateCxChatComposable$lambda$0);
                    objRememberedValue = composer2.rememberedValue();
                    if (zChangedInstance2) {
                        objRememberedValue = new Function2() { // from class: com.robinhood.android.supportchat.thread.compose.CxChatComposableKt$CxChatComposable$4$$ExternalSyntheticLambda6
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return CxChatComposableKt.C291844.invoke$lambda$25$lambda$14$lambda$13(cxChatDuxo, cxChatViewStateCxChatComposable$lambda$0, (ChatMode) obj, (ChatbotSuggestedResponse) obj2);
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue);
                        Function2 function222 = (Function2) objRememberedValue;
                        composer2.endReplaceGroup();
                        composer2.startReplaceGroup(-1633490746);
                        zChangedInstance3 = composer2.changedInstance(cxChatDuxo) | composer2.changedInstance(cxChatViewStateCxChatComposable$lambda$0);
                        objRememberedValue2 = composer2.rememberedValue();
                        if (!zChangedInstance3) {
                            objRememberedValue2 = new Function2() { // from class: com.robinhood.android.supportchat.thread.compose.CxChatComposableKt$CxChatComposable$4$$ExternalSyntheticLambda7
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return CxChatComposableKt.C291844.invoke$lambda$25$lambda$16$lambda$15(cxChatDuxo, cxChatViewStateCxChatComposable$lambda$0, (ChatMode) obj, (String) obj2);
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue2);
                            Function2 function232 = (Function2) objRememberedValue2;
                            composer2.endReplaceGroup();
                            Function0 function052 = (Function0) kFunction2;
                            Function1 function142 = (Function1) kFunction3;
                            Function0 function062 = (Function0) kFunction4;
                            composer2.startReplaceGroup(-1633490746);
                            zChangedInstance4 = composer2.changedInstance(cxChatDuxo) | composer2.changedInstance(cxChatViewStateCxChatComposable$lambda$0);
                            Object objRememberedValue142 = composer2.rememberedValue();
                            if (zChangedInstance4) {
                            }
                            objRememberedValue142 = new Function0() { // from class: com.robinhood.android.supportchat.thread.compose.CxChatComposableKt$CxChatComposable$4$$ExternalSyntheticLambda8
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return CxChatComposableKt.C291844.invoke$lambda$25$lambda$18$lambda$17(cxChatDuxo, cxChatViewStateCxChatComposable$lambda$0);
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue142);
                            Function0 function0722 = (Function0) objRememberedValue142;
                            composer2.endReplaceGroup();
                            composer2.startReplaceGroup(-1224400529);
                            zChangedInstance5 = composer2.changedInstance(cxChatDuxo) | composer2.changedInstance(cxChatViewStateCxChatComposable$lambda$0) | composer2.changed(z) | composer2.changed(function02);
                            objRememberedValue3 = composer2.rememberedValue();
                            if (zChangedInstance5) {
                            }
                        }
                    }
                }
                objRememberedValue12 = new Function1() { // from class: com.robinhood.android.supportchat.thread.compose.CxChatComposableKt$CxChatComposable$4$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return CxChatComposableKt.C291844.invoke$lambda$25$lambda$10$lambda$9(cxChatDuxo, cxChatViewStateCxChatComposable$lambda$0, navigator, context, (UiChatMessage.Regular) obj);
                    }
                };
                composer2.updateRememberedValue(objRememberedValue12);
                Function1 function122 = (Function1) objRememberedValue12;
                composer2.endReplaceGroup();
                composer2.startReplaceGroup(-1224400529);
                zChangedInstance = composer2.changedInstance(cxChatDuxo) | composer2.changedInstance(cxChatViewStateCxChatComposable$lambda$0) | composer2.changedInstance(navigator) | composer2.changedInstance(context);
                Object objRememberedValue132 = composer2.rememberedValue();
                if (zChangedInstance) {
                }
                objRememberedValue132 = new Function1() { // from class: com.robinhood.android.supportchat.thread.compose.CxChatComposableKt$CxChatComposable$4$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return CxChatComposableKt.C291844.invoke$lambda$25$lambda$12$lambda$11(cxChatDuxo, cxChatViewStateCxChatComposable$lambda$0, navigator, context, (UiChatAction) obj);
                    }
                };
                composer2.updateRememberedValue(objRememberedValue132);
                Function1 function1322 = (Function1) objRememberedValue132;
                composer2.endReplaceGroup();
                composer2.startReplaceGroup(-1633490746);
                zChangedInstance2 = composer2.changedInstance(cxChatDuxo) | composer2.changedInstance(cxChatViewStateCxChatComposable$lambda$0);
                objRememberedValue = composer2.rememberedValue();
                if (zChangedInstance2) {
                }
            }
            composer2.endNode();
            if (CxChatComposableKt.CxChatComposable$lambda$3(this.$showGlobalDialog$delegate)) {
                CxChatDialogData dialogData = this.$duxo.getStateFlow().getValue().getDialogData();
                if (dialogData instanceof CxChatDialogData.CxChatExistingLiveCase) {
                    composer2.startReplaceGroup(-1633490746);
                    boolean zChangedInstance16 = composer2.changedInstance(this.$duxo);
                    final CxChatDuxo cxChatDuxo2 = this.$duxo;
                    final SnapshotState<Boolean> snapshotState = this.$showGlobalDialog$delegate;
                    Object objRememberedValue16 = composer2.rememberedValue();
                    if (zChangedInstance16 || objRememberedValue16 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue16 = new Function0() { // from class: com.robinhood.android.supportchat.thread.compose.CxChatComposableKt$CxChatComposable$4$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return CxChatComposableKt.C291844.invoke$lambda$27$lambda$26(cxChatDuxo2, snapshotState);
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue16);
                    }
                    Function0 function010 = (Function0) objRememberedValue16;
                    composer2.endReplaceGroup();
                    composer2.startReplaceGroup(-1746271574);
                    boolean zChanged = composer2.changed(this.$onBackPressed) | composer2.changedInstance(this.$duxo);
                    final Function0<Unit> function011 = this.$onBackPressed;
                    final CxChatDuxo cxChatDuxo3 = this.$duxo;
                    final SnapshotState<Boolean> snapshotState2 = this.$showGlobalDialog$delegate;
                    Object objRememberedValue17 = composer2.rememberedValue();
                    if (zChanged || objRememberedValue17 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue17 = new Function0() { // from class: com.robinhood.android.supportchat.thread.compose.CxChatComposableKt$CxChatComposable$4$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return CxChatComposableKt.C291844.invoke$lambda$29$lambda$28(function011, cxChatDuxo3, snapshotState2);
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue17);
                    }
                    composer2.endReplaceGroup();
                    CxChatDialog.CxChatDialog(dialogData, null, null, null, null, null, null, null, null, function010, (Function0) objRememberedValue17, composer, 0, 0, 510);
                } else {
                    this.$onBackPressed.invoke();
                    this.$duxo.dismissDialog();
                    CxChatComposableKt.CxChatComposable$lambda$4(this.$showGlobalDialog$delegate, false);
                }
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:94:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void CxChatScaffold(final CxChatViewState.TopBarState topBarState, final Function0<Unit> function0, final boolean z, Function0<Unit> function02, ChatMode chatMode, final Function3<? super PaddingValues, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i, final int i2) {
        int i3;
        Function0<Unit> function03;
        final boolean z2;
        int i4;
        Function0<Unit> function04;
        int i5;
        ChatMode chatMode2;
        Composer composer2;
        final ChatMode chatMode3;
        final Function0<Unit> function05;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-2129568648);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? composerStartRestartGroup.changed(topBarState) : composerStartRestartGroup.changedInstance(topBarState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                function03 = function0;
                i3 |= composerStartRestartGroup.changedInstance(function03) ? 32 : 16;
            }
            if ((i2 & 4) == 0) {
                i3 |= 384;
                z2 = z;
            } else {
                z2 = z;
                if ((i & 384) == 0) {
                    i3 |= composerStartRestartGroup.changed(z2) ? 256 : 128;
                }
            }
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else {
                if ((i & 3072) == 0) {
                    function04 = function02;
                    i3 |= composerStartRestartGroup.changedInstance(function04) ? 2048 : 1024;
                }
                i5 = i2 & 16;
                if (i5 == 0) {
                    if ((i & 24576) == 0) {
                        chatMode2 = chatMode;
                        i3 |= composerStartRestartGroup.changedInstance(chatMode2) ? 16384 : 8192;
                    }
                    if ((i2 & 32) == 0) {
                        i3 |= 196608;
                    } else if ((i & 196608) == 0) {
                        i3 |= composerStartRestartGroup.changedInstance(function3) ? 131072 : 65536;
                    }
                    if ((74899 & i3) == 74898 || !composerStartRestartGroup.getSkipping()) {
                        if (i4 != 0) {
                            composerStartRestartGroup.startReplaceGroup(1849434622);
                            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new Function0() { // from class: com.robinhood.android.supportchat.thread.compose.CxChatComposableKt$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return Unit.INSTANCE;
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            function04 = (Function0) objRememberedValue;
                        }
                        final ChatMode chatMode4 = i5 == 0 ? null : chatMode2;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-2129568648, i3, -1, "com.robinhood.android.supportchat.thread.compose.CxChatScaffold (CxChatComposable.kt:285)");
                        }
                        final Function0<Unit> function06 = function03;
                        final Function0<Unit> function07 = function04;
                        composer2 = composerStartRestartGroup;
                        ScaffoldKt.m5939ScaffoldTvnljyQ(null, ComposableLambda3.rememberComposableLambda(-133024716, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.supportchat.thread.compose.CxChatComposableKt.CxChatScaffold.2
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer3, int i6) {
                                if ((i6 & 3) == 2 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-133024716, i6, -1, "com.robinhood.android.supportchat.thread.compose.CxChatScaffold.<anonymous> (CxChatComposable.kt:290)");
                                }
                                CxChatComposableKt.CxChatToolBar(topBarState, function06, function07, chatMode4, z2, composer3, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composerStartRestartGroup, 54), null, null, null, 0, BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21371getBg0d7_KjU(), 0L, WindowInsetsKt.WindowInsets(0, 0, 0, 0), ComposableLambda3.rememberComposableLambda(-1206241847, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.android.supportchat.thread.compose.CxChatComposableKt.CxChatScaffold.3
                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer3, Integer num) {
                                invoke(paddingValues, composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(PaddingValues paddingValues, Composer composer3, int i6) {
                                Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                                if ((i6 & 6) == 0) {
                                    i6 |= composer3.changed(paddingValues) ? 4 : 2;
                                }
                                if ((i6 & 19) == 18 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1206241847, i6, -1, "com.robinhood.android.supportchat.thread.compose.CxChatScaffold.<anonymous> (CxChatComposable.kt:299)");
                                }
                                function3.invoke(paddingValues, composer3, Integer.valueOf(i6 & 14));
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composerStartRestartGroup, 54), composer2, 805306416, EnumC7081g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_2_VALUE);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        chatMode3 = chatMode4;
                        function05 = function07;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        composer2 = composerStartRestartGroup;
                        function05 = function04;
                        chatMode3 = chatMode2;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.supportchat.thread.compose.CxChatComposableKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return CxChatComposableKt.CxChatScaffold$lambda$11(topBarState, function0, z, function05, chatMode3, function3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                i3 |= 24576;
                chatMode2 = chatMode;
                if ((i2 & 32) == 0) {
                }
                if ((74899 & i3) == 74898) {
                    if (i4 != 0) {
                    }
                    if (i5 == 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    final Function0<Unit> function062 = function03;
                    final Function0<Unit> function072 = function04;
                    composer2 = composerStartRestartGroup;
                    ScaffoldKt.m5939ScaffoldTvnljyQ(null, ComposableLambda3.rememberComposableLambda(-133024716, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.supportchat.thread.compose.CxChatComposableKt.CxChatScaffold.2
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer3, int i6) {
                            if ((i6 & 3) == 2 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-133024716, i6, -1, "com.robinhood.android.supportchat.thread.compose.CxChatScaffold.<anonymous> (CxChatComposable.kt:290)");
                            }
                            CxChatComposableKt.CxChatToolBar(topBarState, function062, function072, chatMode4, z2, composer3, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composerStartRestartGroup, 54), null, null, null, 0, BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21371getBg0d7_KjU(), 0L, WindowInsetsKt.WindowInsets(0, 0, 0, 0), ComposableLambda3.rememberComposableLambda(-1206241847, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.android.supportchat.thread.compose.CxChatComposableKt.CxChatScaffold.3
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer3, Integer num) {
                            invoke(paddingValues, composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(PaddingValues paddingValues, Composer composer3, int i6) {
                            Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                            if ((i6 & 6) == 0) {
                                i6 |= composer3.changed(paddingValues) ? 4 : 2;
                            }
                            if ((i6 & 19) == 18 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1206241847, i6, -1, "com.robinhood.android.supportchat.thread.compose.CxChatScaffold.<anonymous> (CxChatComposable.kt:299)");
                            }
                            function3.invoke(paddingValues, composer3, Integer.valueOf(i6 & 14));
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composerStartRestartGroup, 54), composer2, 805306416, EnumC7081g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_2_VALUE);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    chatMode3 = chatMode4;
                    function05 = function072;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            function04 = function02;
            i5 = i2 & 16;
            if (i5 == 0) {
            }
            chatMode2 = chatMode;
            if ((i2 & 32) == 0) {
            }
            if ((74899 & i3) == 74898) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        function03 = function0;
        if ((i2 & 4) == 0) {
        }
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        function04 = function02;
        i5 = i2 & 16;
        if (i5 == 0) {
        }
        chatMode2 = chatMode;
        if ((i2 & 32) == 0) {
        }
        if ((74899 & i3) == 74898) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void CxChatToolBar(final CxChatViewState.TopBarState topBarState, final Function0<Unit> function0, final Function0<Unit> function02, final ChatMode chatMode, final boolean z, Composer composer, final int i) {
        int i2;
        WindowInsets windowInsets;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-311390001);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerStartRestartGroup.changed(topBarState) : composerStartRestartGroup.changedInstance(topBarState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function02) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(chatMode) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changed(z) ? 16384 : 8192;
        }
        if ((i2 & 9363) != 9362 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-311390001, i2, -1, "com.robinhood.android.supportchat.thread.compose.CxChatToolBar (CxChatComposable.kt:311)");
            }
            boolean zBooleanValue = ((Boolean) composerStartRestartGroup.consume(BannerVisibility.getLocalBannerVisible())).booleanValue();
            composerStartRestartGroup.startReplaceGroup(1401930667);
            if (zBooleanValue) {
                windowInsets = WindowInsetsKt.WindowInsets$default(0, 0, 0, 0, 13, null);
            } else {
                windowInsets = TopAppBarDefaults.INSTANCE.getWindowInsets(composerStartRestartGroup, TopAppBarDefaults.$stable);
            }
            WindowInsets windowInsets2 = windowInsets;
            composerStartRestartGroup.endReplaceGroup();
            composer2 = composerStartRestartGroup;
            BentoAppBarKt.m20573BentoAppBarSGdaT3c(ComposableLambda3.rememberComposableLambda(1551362556, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.supportchat.thread.compose.CxChatComposableKt.CxChatToolBar.1
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
                        ComposerKt.traceEventStart(1551362556, i3, -1, "com.robinhood.android.supportchat.thread.compose.CxChatToolBar.<anonymous> (CxChatComposable.kt:322)");
                    }
                    CxChatViewState.TopBarState topBarState2 = topBarState;
                    CxChatViewState.TopBarState.Loaded loaded = topBarState2 instanceof CxChatViewState.TopBarState.Loaded ? (CxChatViewState.TopBarState.Loaded) topBarState2 : null;
                    if (loaded == null) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    } else {
                        CxChatTopBar.CxChatTopBar(loaded.getTitle(), loaded.getAvatar(), loaded.getAvatarSliverColor(), null, CxChatComposableKt.toA11Description(chatMode, loaded.getAvatarStatus(), composer3, 0), loaded.getAvatarStatus(), loaded.getEndButtonStatus(), function02, composer3, 0, 8);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }
            }, composerStartRestartGroup, 54), PaddingKt.m5146paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21592getMediumD9Ej5fM(), 0.0f, 11, null), ComposableLambda3.rememberComposableLambda(-1602070960, true, new Function3<BentoAppBarScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.supportchat.thread.compose.CxChatComposableKt.CxChatToolBar.2
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer3, Integer num) {
                    invoke(bentoAppBarScope, composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(BentoAppBarScope BentoAppBar, Composer composer3, int i3) {
                    Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                    if ((i3 & 6) == 0) {
                        i3 |= (i3 & 8) == 0 ? composer3.changed(BentoAppBar) : composer3.changedInstance(BentoAppBar) ? 4 : 2;
                    }
                    if ((i3 & 19) == 18 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1602070960, i3, -1, "com.robinhood.android.supportchat.thread.compose.CxChatToolBar.<anonymous> (CxChatComposable.kt:336)");
                    }
                    if (!z || topBarState.getEndButtonStatus() == CxChatTopBar5.EndButtonStatus.Hidden) {
                        BentoAppBar.m20575BentoBackButtondrOMvmE(TestTag3.testTag(Modifier.INSTANCE, CryptoTransferSendSavedAddressComposableKt.TestTagBackButton), false, null, function0, composer3, (BentoAppBarScope.$stable << 12) | ((i3 << 12) & 57344), 6);
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), null, null, false, true, null, null, 0L, windowInsets2, composer2, 1573254, 0, 952);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.supportchat.thread.compose.CxChatComposableKt$$ExternalSyntheticLambda11
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CxChatComposableKt.CxChatToolBar$lambda$12(topBarState, function0, function02, chatMode, z, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String toA11Description(ChatMode chatMode, CxChatTopBar5.AvatarStatus avatarStatus, Composer composer, int i) {
        String strStringResource;
        composer.startReplaceGroup(-501371324);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-501371324, i, -1, "com.robinhood.android.supportchat.thread.compose.toA11Description (CxChatComposable.kt:350)");
        }
        String strStringResource2 = "";
        if (chatMode == null) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
            return "";
        }
        int i2 = WhenMappings.$EnumSwitchMapping$0[avatarStatus.ordinal()];
        if (i2 == 1) {
            composer.startReplaceGroup(1543380720);
            strStringResource2 = StringResources_androidKt.stringResource(C29104R.string.a11y_support_chat_user_online, composer, 0);
            composer.endReplaceGroup();
        } else if (i2 == 2) {
            composer.startReplaceGroup(1543505743);
            strStringResource2 = StringResources_androidKt.stringResource(C29104R.string.a11y_support_chat_user_offline, composer, 0);
            composer.endReplaceGroup();
        } else {
            if (i2 != 3) {
                composer.startReplaceGroup(-781499389);
                composer.endReplaceGroup();
                throw new NoWhenBranchMatchedException();
            }
            composer.startReplaceGroup(1543629092);
            composer.endReplaceGroup();
        }
        if (chatMode instanceof ChatMode.ChatbotChat) {
            composer.startReplaceGroup(-781486250);
            strStringResource = StringResources_androidKt.stringResource(C29104R.string.a11y_support_chat_chatbot, composer, 0);
            composer.endReplaceGroup();
        } else {
            if (!(chatMode instanceof ChatMode.AgentChat)) {
                composer.startReplaceGroup(-781487796);
                composer.endReplaceGroup();
                throw new NoWhenBranchMatchedException();
            }
            composer.startReplaceGroup(-781483276);
            strStringResource = StringResources_androidKt.stringResource(C29104R.string.a11y_support_chat_agent, composer, 0);
            composer.endReplaceGroup();
        }
        String str = strStringResource + " [" + strStringResource2 + "]";
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void CxChatSuccess(final CxChatDuxo cxChatDuxo, final CxChatViewState.Success success, final Event<CxChatEvent> event, final Function1<? super UiChatMessage.Regular, Unit> function1, final Function1<? super UiChatAction, Unit> function12, final Function2<? super ChatMode, ? super ChatbotSuggestedResponse, Unit> function2, final Function2<? super ChatMode, ? super String, Unit> function22, final Function0<Unit> function0, final Function1<? super String, Unit> function13, final Function0<Unit> function02, final ImagePicker imagePicker, final CameraUtils cameraUtils, final Function0<Unit> function03, final Function0<Unit> function04, final Function0<Unit> function05, final Function0<Unit> function06, final Function0<Unit> function07, final Function0<Unit> function08, final Function2<? super String, ? super Long, Unit> function23, final Function1<? super ChatMode, Unit> function14, final Function1<? super SelectionMenuRowModel, Unit> function15, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        int i5;
        int i6;
        Object obj;
        final ImagePicker imagePicker2;
        int i7;
        final CoroutineScope coroutineScope;
        SnapshotState snapshotState;
        boolean z;
        int i8;
        CropImageArgs cropImageArgs;
        Object obj2;
        SnapshotState snapshotState2;
        int i9;
        final Function0 function09;
        CropImageArgs cropImageArgs2;
        int i10;
        ActivityResultContracts$StartActivityForResult activityResultContracts$StartActivityForResult;
        final SnapshotState snapshotState3;
        SnapshotState snapshotState4;
        final SnapshotState snapshotState5;
        CXIssue.AgentChatType agentChatType;
        Composer composer2;
        boolean z2;
        CameraUtils cameraUtils2;
        EventConsumer<CxChatEvent> eventConsumerInvoke;
        EventConsumer<CxChatEvent> eventConsumerInvoke2;
        EventConsumer<CxChatEvent> eventConsumerInvoke3;
        EventConsumer<CxChatEvent> eventConsumerInvoke4;
        EventConsumer<CxChatEvent> eventConsumerInvoke5;
        EventConsumer<CxChatEvent> eventConsumerInvoke6;
        final CxChatDuxo cxChatDuxo2 = cxChatDuxo;
        Composer composerStartRestartGroup = composer.startRestartGroup(1010481261);
        if ((i & 6) == 0) {
            i4 = (composerStartRestartGroup.changedInstance(cxChatDuxo2) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i & 48) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(success) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i4 |= composerStartRestartGroup.changed(event) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(function1) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(function12) ? 16384 : 8192;
        }
        if ((i & 196608) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(function2) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(function22) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(function0) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(function13) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(function02) ? 536870912 : 268435456;
        }
        if ((i2 & 6) == 0) {
            i5 = i2 | ((i2 & 8) == 0 ? composerStartRestartGroup.changed(imagePicker) : composerStartRestartGroup.changedInstance(imagePicker) ? 4 : 2);
        } else {
            i5 = i2;
        }
        if ((i2 & 48) == 0) {
            i5 |= (i2 & 64) == 0 ? composerStartRestartGroup.changed(cameraUtils) : composerStartRestartGroup.changedInstance(cameraUtils) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i5 |= composerStartRestartGroup.changedInstance(function03) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i5 |= composerStartRestartGroup.changedInstance(function04) ? 2048 : 1024;
        }
        if ((i2 & 196608) == 0) {
            i5 |= composerStartRestartGroup.changedInstance(function06) ? 131072 : 65536;
        }
        if ((i2 & 1572864) == 0) {
            i5 |= composerStartRestartGroup.changedInstance(function07) ? 1048576 : 524288;
        }
        if ((i2 & 12582912) == 0) {
            i5 |= composerStartRestartGroup.changedInstance(function08) ? 8388608 : 4194304;
        }
        if ((i2 & 100663296) == 0) {
            i5 |= composerStartRestartGroup.changedInstance(function23) ? 67108864 : 33554432;
        }
        if ((i2 & 805306368) == 0) {
            i5 |= composerStartRestartGroup.changedInstance(function14) ? 536870912 : 268435456;
        }
        int i11 = i5;
        if ((i3 & 6) == 0) {
            i6 = i3 | (composerStartRestartGroup.changedInstance(function15) ? 4 : 2);
        } else {
            i6 = i3;
        }
        if ((i4 & 306783379) == 306783378 && (306775187 & i11) == 306775186 && (i6 & 3) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1010481261, i4, i11, "com.robinhood.android.supportchat.thread.compose.CxChatSuccess (CxChatComposable.kt:399)");
            }
            final Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            int i12 = i4;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = EffectsKt.createCompositionCoroutineScope(CoroutineContextImpl6.INSTANCE, composerStartRestartGroup);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final CoroutineScope coroutineScope2 = (CoroutineScope) objRememberedValue;
            final SheetState sheetStateRememberModalBottomSheetState = ModalBottomSheetKt.rememberModalBottomSheetState(true, null, composerStartRestartGroup, 6, 2);
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            final SnapshotState snapshotState6 = (SnapshotState) objRememberedValue2;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            SnapshotState snapshotState7 = (SnapshotState) objRememberedValue3;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue4 == companion.getEmpty()) {
                objRememberedValue4 = SnapshotState3.mutableStateOf$default(null, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            final SnapshotState snapshotState8 = (SnapshotState) objRememberedValue4;
            composerStartRestartGroup.endReplaceGroup();
            final CropImageArgs cropImageArgs3 = new CropImageArgs(ImagePicker.CropShape.RECTANGLE, null, null, ChatImageUtils.IMAGE_FILE_FINAL_SIZE_LIMIT_IN_BYTES, StringResources_androidKt.stringResource(C29104R.string.support_chat_image_cropper_confirm_button_text, composerStartRestartGroup, 0), false, 6, null);
            ActivityResultContracts$StartActivityForResult activityResultContracts$StartActivityForResult2 = new ActivityResultContracts$StartActivityForResult();
            composerStartRestartGroup.startReplaceGroup(-1224400529);
            int i13 = i11 & 14;
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(coroutineScope2) | composerStartRestartGroup.changedInstance(success) | (i13 == 4 || ((i11 & 8) != 0 && composerStartRestartGroup.changedInstance(imagePicker))) | composerStartRestartGroup.changedInstance(cxChatDuxo2);
            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue5 == companion.getEmpty()) {
                objRememberedValue5 = new Function1() { // from class: com.robinhood.android.supportchat.thread.compose.CxChatComposableKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        return CxChatComposableKt.CxChatSuccess$lambda$23$lambda$22(coroutineScope2, cxChatDuxo2, success, imagePicker, (ActivityResult) obj3);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            }
            composerStartRestartGroup.endReplaceGroup();
            final ActivityResultRegistry8 activityResultRegistry8RememberLauncherForActivityResult = ActivityResultRegistry3.rememberLauncherForActivityResult(activityResultContracts$StartActivityForResult2, (Function1) objRememberedValue5, composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceGroup(-1224400529);
            boolean zChangedInstance2 = (i13 == 4 || ((i11 & 8) != 0 && composerStartRestartGroup.changedInstance(imagePicker))) | composerStartRestartGroup.changedInstance(context) | composerStartRestartGroup.changedInstance(cropImageArgs3) | composerStartRestartGroup.changedInstance(activityResultRegistry8RememberLauncherForActivityResult) | composerStartRestartGroup.changedInstance(cxChatDuxo2);
            Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance2 || objRememberedValue6 == companion.getEmpty()) {
                imagePicker2 = imagePicker;
                i7 = i13;
                coroutineScope = coroutineScope2;
                snapshotState = snapshotState7;
                z = true;
                i8 = i12;
                obj = new Function0() { // from class: com.robinhood.android.supportchat.thread.compose.CxChatComposableKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return CxChatComposableKt.CxChatSuccess$lambda$25$lambda$24(imagePicker2, context, cropImageArgs3, activityResultRegistry8RememberLauncherForActivityResult, cxChatDuxo2);
                    }
                };
                cropImageArgs = cropImageArgs3;
                context = context;
                cxChatDuxo2 = cxChatDuxo2;
                composerStartRestartGroup.updateRememberedValue(obj);
            } else {
                coroutineScope = coroutineScope2;
                cropImageArgs = cropImageArgs3;
                imagePicker2 = imagePicker;
                obj = objRememberedValue6;
                snapshotState = snapshotState7;
                z = true;
                i8 = i12;
                i7 = i13;
            }
            Function0 function010 = (Function0) obj;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue7 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue7 == companion.getEmpty()) {
                objRememberedValue7 = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
            }
            final SnapshotState snapshotState9 = (SnapshotState) objRememberedValue7;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(5004770);
            Object objRememberedValue8 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue8 == companion.getEmpty()) {
                objRememberedValue8 = new Function0() { // from class: com.robinhood.android.supportchat.thread.compose.CxChatComposableKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return CxChatComposableKt.CxChatSuccess$lambda$30$lambda$29(snapshotState9);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
            }
            Function0 function011 = (Function0) objRememberedValue8;
            composerStartRestartGroup.endReplaceGroup();
            PermissionState permissionStateRememberPermissionState = PermissionState2.rememberPermissionState("android.permission.CAMERA", null, composerStartRestartGroup, 6, 2);
            ActivityResultContracts$StartActivityForResult activityResultContracts$StartActivityForResult3 = new ActivityResultContracts$StartActivityForResult();
            composerStartRestartGroup.startReplaceGroup(-1224400529);
            boolean zChangedInstance3 = composerStartRestartGroup.changedInstance(coroutineScope) | composerStartRestartGroup.changedInstance(success) | ((i7 == 4 || ((i11 & 8) != 0 && composerStartRestartGroup.changedInstance(imagePicker2))) ? z : false) | composerStartRestartGroup.changedInstance(cxChatDuxo2);
            int i14 = i11 & 112;
            boolean zChangedInstance4 = zChangedInstance3 | ((i14 == 32 || ((i11 & 64) != 0 && composerStartRestartGroup.changedInstance(cameraUtils))) ? z : false) | composerStartRestartGroup.changedInstance(context);
            Object objRememberedValue9 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance4 || objRememberedValue9 == companion.getEmpty()) {
                final Context context2 = context;
                snapshotState2 = snapshotState9;
                i9 = i11;
                function09 = function011;
                cropImageArgs2 = cropImageArgs;
                i10 = i14;
                activityResultContracts$StartActivityForResult = activityResultContracts$StartActivityForResult3;
                final ImagePicker imagePicker3 = imagePicker2;
                final CoroutineScope coroutineScope3 = coroutineScope;
                obj2 = new Function1() { // from class: com.robinhood.android.supportchat.thread.compose.CxChatComposableKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        return CxChatComposableKt.CxChatSuccess$lambda$32$lambda$31(coroutineScope3, cxChatDuxo2, success, imagePicker3, cameraUtils, context2, snapshotState8, (ActivityResult) obj3);
                    }
                };
                context = context2;
                snapshotState3 = snapshotState8;
                coroutineScope = coroutineScope3;
                composerStartRestartGroup.updateRememberedValue(obj2);
            } else {
                snapshotState2 = snapshotState9;
                i9 = i11;
                function09 = function011;
                cropImageArgs2 = cropImageArgs;
                i10 = i14;
                activityResultContracts$StartActivityForResult = activityResultContracts$StartActivityForResult3;
                obj2 = objRememberedValue9;
                snapshotState3 = snapshotState8;
            }
            composerStartRestartGroup.endReplaceGroup();
            final ActivityResultRegistry8 activityResultRegistry8RememberLauncherForActivityResult2 = ActivityResultRegistry3.rememberLauncherForActivityResult(activityResultContracts$StartActivityForResult, (Function1) obj2, composerStartRestartGroup, 0);
            ActivityResultContracts$StartActivityForResult activityResultContracts$StartActivityForResult4 = new ActivityResultContracts$StartActivityForResult();
            composerStartRestartGroup.startReplaceGroup(-1224400529);
            boolean zChangedInstance5 = composerStartRestartGroup.changedInstance(cxChatDuxo2) | composerStartRestartGroup.changedInstance(context) | composerStartRestartGroup.changedInstance(cropImageArgs2) | composerStartRestartGroup.changedInstance(activityResultRegistry8RememberLauncherForActivityResult2);
            Object objRememberedValue10 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance5 || objRememberedValue10 == companion.getEmpty()) {
                final Context context3 = context;
                final CxChatDuxo cxChatDuxo3 = cxChatDuxo2;
                final CropImageArgs cropImageArgs4 = cropImageArgs2;
                Function1 function16 = new Function1() { // from class: com.robinhood.android.supportchat.thread.compose.CxChatComposableKt$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        return CxChatComposableKt.CxChatSuccess$lambda$35$lambda$34(context3, cropImageArgs4, activityResultRegistry8RememberLauncherForActivityResult2, cxChatDuxo3, snapshotState3, (ActivityResult) obj3);
                    }
                };
                context = context3;
                cxChatDuxo2 = cxChatDuxo3;
                snapshotState4 = snapshotState3;
                composerStartRestartGroup.updateRememberedValue(function16);
                objRememberedValue10 = function16;
            } else {
                snapshotState4 = snapshotState3;
            }
            composerStartRestartGroup.endReplaceGroup();
            ActivityResultRegistry8 activityResultRegistry8RememberLauncherForActivityResult3 = ActivityResultRegistry3.rememberLauncherForActivityResult(activityResultContracts$StartActivityForResult4, (Function1) objRememberedValue10, composerStartRestartGroup, 0);
            ActivityResultContracts$RequestPermission activityResultContracts$RequestPermission = new ActivityResultContracts$RequestPermission();
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            boolean zChangedInstance6 = composerStartRestartGroup.changedInstance(cxChatDuxo2);
            Object objRememberedValue11 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance6 || objRememberedValue11 == companion.getEmpty()) {
                objRememberedValue11 = new Function1() { // from class: com.robinhood.android.supportchat.thread.compose.CxChatComposableKt$$ExternalSyntheticLambda8
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        return CxChatComposableKt.CxChatSuccess$lambda$37$lambda$36(function09, cxChatDuxo2, ((Boolean) obj3).booleanValue());
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue11);
            }
            composerStartRestartGroup.endReplaceGroup();
            ActivityResultRegistry8 activityResultRegistry8RememberLauncherForActivityResult4 = ActivityResultRegistry3.rememberLauncherForActivityResult(activityResultContracts$RequestPermission, (Function1) objRememberedValue11, composerStartRestartGroup, 0);
            ChatMode chatMode = success.getChatMode();
            if (event != null) {
                if ((event.getData() instanceof CxChatEvent.OpenDialog) && (eventConsumerInvoke6 = event.getGetEventConsumer().invoke()) != null) {
                    eventConsumerInvoke6.consume(event, new Function1() { // from class: com.robinhood.android.supportchat.thread.compose.CxChatComposableKt$CxChatSuccess$$inlined$consumeIfType$1
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Object obj3) {
                            m19169invoke(obj3);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m19169invoke(Object it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            CxChatComposableKt.CxChatSuccess$lambda$15(snapshotState6, true);
                        }
                    });
                }
                Unit unit = Unit.INSTANCE;
            }
            if (event != null) {
                if ((event.getData() instanceof CxChatEvent.DismissDialog) && (eventConsumerInvoke5 = event.getGetEventConsumer().invoke()) != null) {
                    eventConsumerInvoke5.consume(event, new Function1() { // from class: com.robinhood.android.supportchat.thread.compose.CxChatComposableKt$CxChatSuccess$$inlined$consumeIfType$2
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Object obj3) {
                            m19170invoke(obj3);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m19170invoke(Object it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            CxChatComposableKt.CxChatSuccess$lambda$15(snapshotState6, false);
                        }
                    });
                }
                Unit unit2 = Unit.INSTANCE;
            }
            if (event != null) {
                if ((event.getData() instanceof CxChatEvent.OpenBottomSheet) && (eventConsumerInvoke4 = event.getGetEventConsumer().invoke()) != null) {
                    eventConsumerInvoke4.consume(event, new Function1() { // from class: com.robinhood.android.supportchat.thread.compose.CxChatComposableKt$CxChatSuccess$$inlined$consumeIfType$3
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Object obj3) {
                            m19171invoke(obj3);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m19171invoke(Object it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new CxChatComposableKt$CxChatSuccess$3$1(sheetStateRememberModalBottomSheetState, null), 3, null);
                        }
                    });
                }
                Unit unit3 = Unit.INSTANCE;
            }
            if (event != null) {
                if ((event.getData() instanceof CxChatEvent.DismissBottomSheet) && (eventConsumerInvoke3 = event.getGetEventConsumer().invoke()) != null) {
                    eventConsumerInvoke3.consume(event, new Function1() { // from class: com.robinhood.android.supportchat.thread.compose.CxChatComposableKt$CxChatSuccess$$inlined$consumeIfType$4
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Object obj3) {
                            m19172invoke(obj3);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m19172invoke(Object it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new CxChatComposableKt$CxChatSuccess$4$1(sheetStateRememberModalBottomSheetState, null), 3, null);
                        }
                    });
                }
                Unit unit4 = Unit.INSTANCE;
            }
            if (event != null) {
                if (!(event.getData() instanceof CxChatEvent.ShowImageProcessingIndicator) || (eventConsumerInvoke2 = event.getGetEventConsumer().invoke()) == null) {
                    snapshotState5 = snapshotState;
                } else {
                    snapshotState5 = snapshotState;
                    eventConsumerInvoke2.consume(event, new Function1() { // from class: com.robinhood.android.supportchat.thread.compose.CxChatComposableKt$CxChatSuccess$$inlined$consumeIfType$5
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Object obj3) {
                            m19173invoke(obj3);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m19173invoke(Object it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            CxChatComposableKt.CxChatSuccess$lambda$18(snapshotState5, true);
                        }
                    });
                }
                Unit unit5 = Unit.INSTANCE;
            } else {
                snapshotState5 = snapshotState;
            }
            if (event != null) {
                if ((event.getData() instanceof CxChatEvent.HideImageProcessingIndicator) && (eventConsumerInvoke = event.getGetEventConsumer().invoke()) != null) {
                    eventConsumerInvoke.consume(event, new Function1() { // from class: com.robinhood.android.supportchat.thread.compose.CxChatComposableKt$CxChatSuccess$$inlined$consumeIfType$6
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Object obj3) {
                            m19174invoke(obj3);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m19174invoke(Object it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            CxChatComposableKt.CxChatSuccess$lambda$18(snapshotState5, false);
                        }
                    });
                }
                Unit unit6 = Unit.INSTANCE;
            }
            Screen.Name name = Screen.Name.CX_SUPPORT_CHAT_THREAD;
            String string2 = success.getInquiryId().toString();
            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
            Screen screen = new Screen(name, null, string2, null, 10, null);
            String string3 = success.getInquiryId().toString();
            Intrinsics.checkNotNullExpressionValue(string3, "toString(...)");
            if (chatMode instanceof ChatMode.AgentChat.SalesforceChat) {
                agentChatType = CXIssue.AgentChatType.SALESFORCE;
            } else if (chatMode instanceof ChatMode.AgentChat.TwilioChat) {
                agentChatType = CXIssue.AgentChatType.TWILIO;
            } else {
                if (!(chatMode instanceof ChatMode.ChatbotChat)) {
                    throw new NoWhenBranchMatchedException();
                }
                agentChatType = CXIssue.AgentChatType.UNKNOWN;
            }
            int i15 = i9;
            Context context4 = context;
            Function0 function012 = function09;
            int i16 = i10;
            CxChatDuxo cxChatDuxo4 = cxChatDuxo2;
            composer2 = composerStartRestartGroup;
            AutoLoggingCompositionLocals.EventLoggable(new UserInteractionEventDescriptor(null, screen, null, new com.robinhood.rosetta.eventlogging.Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, new CXIssue(string3, null, null, null, null, null, null, null, null, 0, null, null, null, null, null, null, null, 0, agentChatType, false, null, false, null, 8126462, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -262145, -1, -1, -1, -1, -1, 16383, null), null, null, 53, null), ComposableLambda3.rememberComposableLambda(-1870634856, true, new C291877(sheetStateRememberModalBottomSheetState, cxChatDuxo2, success, function1, function12, function2, function22, function0, function02, function13, function23, function14, event, function15, snapshotState5, function010, function012), composer2, 54), composer2, 48);
            composer2.startReplaceGroup(410235039);
            if (CxChatSuccess$lambda$14(snapshotState6)) {
                int i17 = i15 << 6;
                z2 = true;
                CxChatDialog.CxChatDialog(success.getDialogData(), null, function0, function010, function012, function03, function06, function04, function07, function08, null, composer2, ((i8 >> 15) & 896) | 24576 | ((i15 << 9) & 458752) | ((i15 << 3) & 3670016) | ((i15 << 12) & 29360128) | (234881024 & i17) | (i17 & 1879048192), 0, 1026);
            } else {
                z2 = true;
            }
            composer2.endReplaceGroup();
            Boolean boolValueOf = Boolean.valueOf(CxChatSuccess$lambda$27(snapshotState2));
            composer2.startReplaceGroup(-1224400529);
            boolean zChanged = composer2.changed(permissionStateRememberPermissionState);
            if (i16 != 32) {
                cameraUtils2 = cameraUtils;
                if ((i15 & 64) == 0 || !composer2.changedInstance(cameraUtils2)) {
                    z2 = false;
                }
            } else {
                cameraUtils2 = cameraUtils;
            }
            boolean zChangedInstance7 = zChanged | z2 | composer2.changedInstance(context4) | composer2.changedInstance(activityResultRegistry8RememberLauncherForActivityResult3) | composer2.changedInstance(cxChatDuxo4) | composer2.changedInstance(activityResultRegistry8RememberLauncherForActivityResult4);
            Object objRememberedValue12 = composer2.rememberedValue();
            if (zChangedInstance7 || objRememberedValue12 == companion.getEmpty()) {
                CxChatComposableKt$CxChatSuccess$8$1 cxChatComposableKt$CxChatSuccess$8$1 = new CxChatComposableKt$CxChatSuccess$8$1(permissionStateRememberPermissionState, cameraUtils2, context4, activityResultRegistry8RememberLauncherForActivityResult3, cxChatDuxo, activityResultRegistry8RememberLauncherForActivityResult4, snapshotState2, snapshotState4, null);
                composer2.updateRememberedValue(cxChatComposableKt$CxChatSuccess$8$1);
                objRememberedValue12 = cxChatComposableKt$CxChatSuccess$8$1;
            }
            composer2.endReplaceGroup();
            EffectsKt.LaunchedEffect(boolValueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue12, composer2, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.supportchat.thread.compose.CxChatComposableKt$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj3, Object obj4) {
                    return CxChatComposableKt.CxChatSuccess$lambda$45(cxChatDuxo, success, event, function1, function12, function2, function22, function0, function13, function02, imagePicker, cameraUtils, function03, function04, function05, function06, function07, function08, function23, function14, function15, i, i2, i3, (Composer) obj3, ((Integer) obj4).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void CxChatSuccess$lambda$15(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void CxChatSuccess$lambda$18(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CxChatSuccess$lambda$23$lambda$22(CoroutineScope coroutineScope, CxChatDuxo cxChatDuxo, CxChatViewState.Success success, ImagePicker imagePicker, ActivityResult result) {
        Intrinsics.checkNotNullParameter(result, "result");
        int resultCode = result.getResultCode();
        if (resultCode == -1) {
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new CxChatComposableKt$CxChatSuccess$imagePickerLauncher$1$1$1(result, success, imagePicker, cxChatDuxo, null), 3, null);
        } else if (resultCode == 2 || resultCode == 3) {
            cxChatDuxo.openImageErrorDialog();
        } else if (resultCode == 4) {
            cxChatDuxo.openFileSizeLimitDialog(true);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CxChatSuccess$lambda$25$lambda$24(ImagePicker imagePicker, Context context, CropImageArgs cropImageArgs, ActivityResultRegistry8 activityResultRegistry8, CxChatDuxo cxChatDuxo) {
        activityResultRegistry8.launch(ImagePicker.getImagePickerIntent$default(imagePicker, context, cropImageArgs, null, true, true, 4, null));
        cxChatDuxo.dismissBottomSheet();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void CxChatSuccess$lambda$28(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CxChatSuccess$lambda$30$lambda$29(SnapshotState snapshotState) {
        CxChatSuccess$lambda$28(snapshotState, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CxChatSuccess$lambda$32$lambda$31(CoroutineScope coroutineScope, CxChatDuxo cxChatDuxo, CxChatViewState.Success success, ImagePicker imagePicker, CameraUtils cameraUtils, Context context, SnapshotState snapshotState, ActivityResult result) {
        Intrinsics.checkNotNullParameter(result, "result");
        int resultCode = result.getResultCode();
        if (resultCode == -1) {
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new C29188x38dd84d(result, success, imagePicker, cxChatDuxo, cameraUtils, context, snapshotState, null), 3, null);
        } else if (resultCode == 2) {
            cxChatDuxo.openImageErrorDialog();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CxChatSuccess$lambda$35$lambda$34(Context context, CropImageArgs cropImageArgs, ActivityResultRegistry8 activityResultRegistry8, CxChatDuxo cxChatDuxo, SnapshotState snapshotState, ActivityResult result) {
        Intrinsics.checkNotNullParameter(result, "result");
        int resultCode = result.getResultCode();
        if (resultCode == -1) {
            Uri uriCxChatSuccess$lambda$20 = CxChatSuccess$lambda$20(snapshotState);
            if (uriCxChatSuccess$lambda$20 == null) {
                cxChatDuxo.openImageErrorDialog();
                return Unit.INSTANCE;
            }
            activityResultRegistry8.launch(CropImageActivity.INSTANCE.getIntent(context, uriCxChatSuccess$lambda$20, cropImageArgs));
        } else if (resultCode == 2 || resultCode == 3) {
            cxChatDuxo.openImageErrorDialog();
        } else if (resultCode == 4) {
            cxChatDuxo.openFileSizeLimitDialog(true);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CxChatSuccess$lambda$37$lambda$36(Function0 function0, CxChatDuxo cxChatDuxo, boolean z) {
        if (z) {
            function0.invoke();
        } else {
            cxChatDuxo.openCameraPermissionDialog();
        }
        return Unit.INSTANCE;
    }

    /* compiled from: CxChatComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.supportchat.thread.compose.CxChatComposableKt$CxChatSuccess$7 */
    static final class C291877 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ CxChatDuxo $duxo;
        final /* synthetic */ Event<CxChatEvent> $event;
        final /* synthetic */ Function2<String, Long, Unit> $fetchPreviousMessages;
        final /* synthetic */ Function1<ChatMode, Unit> $markAllMessagesAsRead;
        final /* synthetic */ Function0<Unit> $onCharacterLimitExceeded;
        final /* synthetic */ Function1<UiChatAction, Unit> $onClickAction;
        final /* synthetic */ Function0<Unit> $onClickImageIcon;
        final /* synthetic */ Function1<UiChatMessage.Regular, Unit> $onClickMessageBubble;
        final /* synthetic */ Function2<ChatMode, String, Unit> $onClickSend;
        final /* synthetic */ Function2<ChatMode, ChatbotSuggestedResponse, Unit> $onClickSuggestedResponse;
        final /* synthetic */ Function1<SelectionMenuRowModel, Unit> $onClickUserSelectionRow;
        final /* synthetic */ Function1<String, Unit> $onInputChanged;
        final /* synthetic */ Function0<Unit> $openImagePicker;
        final /* synthetic */ SheetState $sheetState;
        final /* synthetic */ SnapshotState<Boolean> $showImageProcessingIndicator$delegate;
        final /* synthetic */ Function0<Unit> $startCamera;
        final /* synthetic */ CxChatViewState.Success $state;

        /* JADX WARN: Multi-variable type inference failed */
        C291877(SheetState sheetState, CxChatDuxo cxChatDuxo, CxChatViewState.Success success, Function1<? super UiChatMessage.Regular, Unit> function1, Function1<? super UiChatAction, Unit> function12, Function2<? super ChatMode, ? super ChatbotSuggestedResponse, Unit> function2, Function2<? super ChatMode, ? super String, Unit> function22, Function0<Unit> function0, Function0<Unit> function02, Function1<? super String, Unit> function13, Function2<? super String, ? super Long, Unit> function23, Function1<? super ChatMode, Unit> function14, Event<CxChatEvent> event, Function1<? super SelectionMenuRowModel, Unit> function15, SnapshotState<Boolean> snapshotState, Function0<Unit> function03, Function0<Unit> function04) {
            this.$sheetState = sheetState;
            this.$duxo = cxChatDuxo;
            this.$state = success;
            this.$onClickMessageBubble = function1;
            this.$onClickAction = function12;
            this.$onClickSuggestedResponse = function2;
            this.$onClickSend = function22;
            this.$onClickImageIcon = function0;
            this.$onCharacterLimitExceeded = function02;
            this.$onInputChanged = function13;
            this.$fetchPreviousMessages = function23;
            this.$markAllMessagesAsRead = function14;
            this.$event = event;
            this.$onClickUserSelectionRow = function15;
            this.$showImageProcessingIndicator$delegate = snapshotState;
            this.$openImagePicker = function03;
            this.$startCamera = function04;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$2$lambda$1$lambda$0(Function2 function2, CxChatViewState.Success success) {
            function2.invoke(success.getContentState().getChatbotPageCursor(), success.getContentState().getAgentChatPageCursor());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            Function1<SelectionMenuRowModel, Unit> function1;
            Function0<Unit> function0;
            Function1<String, Unit> function12;
            final Function2<String, Long, Unit> function2;
            Modifier.Companion companion;
            Function0<Unit> function02;
            Function2<ChatMode, String, Unit> function22;
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1870634856, i, -1, "com.robinhood.android.supportchat.thread.compose.CxChatSuccess.<anonymous> (CxChatComposable.kt:582)");
            }
            Modifier.Companion companion2 = Modifier.INSTANCE;
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion2, 0.0f, 1, null);
            final CxChatViewState.Success success = this.$state;
            Function1<UiChatMessage.Regular, Unit> function13 = this.$onClickMessageBubble;
            Function1<UiChatAction, Unit> function14 = this.$onClickAction;
            Function2<ChatMode, ChatbotSuggestedResponse, Unit> function23 = this.$onClickSuggestedResponse;
            Function2<ChatMode, String, Unit> function24 = this.$onClickSend;
            Function0<Unit> function03 = this.$onClickImageIcon;
            Function0<Unit> function04 = this.$onCharacterLimitExceeded;
            Function1<String, Unit> function15 = this.$onInputChanged;
            Function2<String, Long, Unit> function25 = this.$fetchPreviousMessages;
            Function1<ChatMode, Unit> function16 = this.$markAllMessagesAsRead;
            Event<CxChatEvent> event = this.$event;
            Function1<SelectionMenuRowModel, Unit> function17 = this.$onClickUserSelectionRow;
            SnapshotState<Boolean> snapshotState = this.$showImageProcessingIndicator$delegate;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierFillMaxSize$default);
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            composer.startReplaceGroup(148988804);
            if (CxChatComposableKt.CxChatSuccess$lambda$17(snapshotState)) {
                long jM21425getFg0d7_KjU = BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21425getFg0d7_KjU();
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null);
                function1 = function17;
                function0 = function04;
                function2 = function25;
                function12 = function15;
                companion = companion2;
                function02 = function03;
                function22 = function24;
                BentoProgressBar2.m20697BentoIndeterminateProgressBareaDK9VM(modifierFillMaxWidth$default, false, jM21425getFg0d7_KjU, 0L, composer, 6, 10);
            } else {
                function1 = function17;
                function0 = function04;
                function12 = function15;
                function2 = function25;
                companion = companion2;
                function02 = function03;
                function22 = function24;
            }
            composer.endReplaceGroup();
            UUID inquiryId = success.getInquiryId();
            String initialInput = success.getInitialInput();
            ChatMode chatMode = success.getChatMode();
            CxChatViewState.ContentState contentState = success.getContentState();
            CxChatViewState.BottomControlState bottomControlState = success.getBottomControlState();
            composer.startReplaceGroup(-1633490746);
            boolean zChanged = composer.changed(function2) | composer.changedInstance(success);
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.supportchat.thread.compose.CxChatComposableKt$CxChatSuccess$7$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return CxChatComposableKt.C291877.invoke$lambda$2$lambda$1$lambda$0(function2, success);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            Modifier.Companion companion4 = companion;
            CxChatComposableKt.Content(inquiryId, initialInput, chatMode, contentState, bottomControlState, function13, function14, function23, function22, function02, function0, function12, (Function0) objRememberedValue, function16, event, function1, composer, 0, 0);
            composer.endNode();
            if (this.$sheetState.isVisible()) {
                Modifier modifierLogScreenTransitions$default = ModifiersKt.logScreenTransitions$default(companion4, null, 1, null);
                composer.startReplaceGroup(5004770);
                boolean zChangedInstance = composer.changedInstance(this.$duxo);
                final CxChatDuxo cxChatDuxo = this.$duxo;
                Object objRememberedValue2 = composer.rememberedValue();
                if (zChangedInstance || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new Function0() { // from class: com.robinhood.android.supportchat.thread.compose.CxChatComposableKt$CxChatSuccess$7$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return CxChatComposableKt.C291877.invoke$lambda$4$lambda$3(cxChatDuxo);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue2);
                }
                composer.endReplaceGroup();
                RhModalBottomSheet3.m12185RhModalBottomSheetcd68TDI((Function0) objRememberedValue2, modifierLogScreenTransitions$default, false, this.$sheetState, null, 0L, ComposableLambda3.rememberComposableLambda(909921508, true, new AnonymousClass3(this.$state, this.$duxo, this.$openImagePicker, this.$startCamera), composer, 54), composer, 1572864, 52);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$4$lambda$3(CxChatDuxo cxChatDuxo) {
            cxChatDuxo.dismissBottomSheet();
            return Unit.INSTANCE;
        }

        /* compiled from: CxChatComposable.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.supportchat.thread.compose.CxChatComposableKt$CxChatSuccess$7$3, reason: invalid class name */
        static final class AnonymousClass3 implements Function3<RhModalBottomSheet5, Composer, Integer, Unit> {
            final /* synthetic */ CxChatDuxo $duxo;
            final /* synthetic */ Function0<Unit> $openImagePicker;
            final /* synthetic */ Function0<Unit> $startCamera;
            final /* synthetic */ CxChatViewState.Success $state;

            AnonymousClass3(CxChatViewState.Success success, CxChatDuxo cxChatDuxo, Function0<Unit> function0, Function0<Unit> function02) {
                this.$state = success;
                this.$duxo = cxChatDuxo;
                this.$openImagePicker = function0;
                this.$startCamera = function02;
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(RhModalBottomSheet5 rhModalBottomSheet5, Composer composer, Integer num) {
                invoke(rhModalBottomSheet5, composer, num.intValue());
                return Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit invoke$lambda$1$lambda$0(CxChatDuxo cxChatDuxo, CxChatViewState.Success success, String str, UiChatMessage.Regular message) {
                Intrinsics.checkNotNullParameter(str, "<unused var>");
                Intrinsics.checkNotNullParameter(message, "message");
                cxChatDuxo.resendAgentChatUserMessage(success.getInquiryId(), success.getChatMode(), message);
                cxChatDuxo.dismissBottomSheet();
                return Unit.INSTANCE;
            }

            public final void invoke(RhModalBottomSheet5 RhModalBottomSheet, Composer composer, int i) {
                Intrinsics.checkNotNullParameter(RhModalBottomSheet, "$this$RhModalBottomSheet");
                if ((i & 17) == 16 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(909921508, i, -1, "com.robinhood.android.supportchat.thread.compose.CxChatSuccess.<anonymous>.<anonymous> (CxChatComposable.kt:626)");
                }
                CxChatBottomSheetData bottomSheetData = this.$state.getBottomSheetData();
                if (bottomSheetData instanceof CxChatBottomSheetData.ResendOptions) {
                    composer.startReplaceGroup(1933180979);
                    CxChatBottomSheetData.ResendOptions resendOptions = (CxChatBottomSheetData.ResendOptions) bottomSheetData;
                    composer.startReplaceGroup(-1633490746);
                    boolean zChangedInstance = composer.changedInstance(this.$duxo) | composer.changedInstance(this.$state);
                    final CxChatDuxo cxChatDuxo = this.$duxo;
                    final CxChatViewState.Success success = this.$state;
                    Object objRememberedValue = composer.rememberedValue();
                    if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function2() { // from class: com.robinhood.android.supportchat.thread.compose.CxChatComposableKt$CxChatSuccess$7$3$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return CxChatComposableKt.C291877.AnonymousClass3.invoke$lambda$1$lambda$0(cxChatDuxo, success, (String) obj, (UiChatMessage.Regular) obj2);
                            }
                        };
                        composer.updateRememberedValue(objRememberedValue);
                    }
                    Function2 function2 = (Function2) objRememberedValue;
                    composer.endReplaceGroup();
                    CxChatDuxo cxChatDuxo2 = this.$duxo;
                    composer.startReplaceGroup(5004770);
                    boolean zChangedInstance2 = composer.changedInstance(cxChatDuxo2);
                    Object objRememberedValue2 = composer.rememberedValue();
                    if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = new CxChatComposableKt$CxChatSuccess$7$3$2$1(cxChatDuxo2);
                        composer.updateRememberedValue(objRememberedValue2);
                    }
                    composer.endReplaceGroup();
                    CxChatResendOptionBottomSheet.CxChatResendOptionBottomSheet(resendOptions, function2, (Function0) ((KFunction) objRememberedValue2), composer, UiChatMessage.Regular.$stable);
                    composer.endReplaceGroup();
                } else if (Intrinsics.areEqual(bottomSheetData, CxChatBottomSheetData.ImageUpload.INSTANCE)) {
                    composer.startReplaceGroup(1933871969);
                    CxChatImageUploadBottomSheet.CxChatImageUploadBottomSheet(this.$openImagePicker, this.$startCamera, composer, 48);
                    composer.endReplaceGroup();
                } else if (Intrinsics.areEqual(bottomSheetData, CxChatBottomSheetData.None.INSTANCE)) {
                    composer.startReplaceGroup(1934135996);
                    composer.endReplaceGroup();
                } else {
                    composer.startReplaceGroup(1934155774);
                    composer.endReplaceGroup();
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Content(final UUID uuid, final String str, final ChatMode chatMode, final CxChatViewState.ContentState contentState, final CxChatViewState.BottomControlState bottomControlState, final Function1<? super UiChatMessage.Regular, Unit> function1, final Function1<? super UiChatAction, Unit> function12, final Function2<? super ChatMode, ? super ChatbotSuggestedResponse, Unit> function2, final Function2<? super ChatMode, ? super String, Unit> function22, final Function0<Unit> function0, final Function0<Unit> function02, final Function1<? super String, Unit> function13, final Function0<Unit> function03, final Function1<? super ChatMode, Unit> function14, final Event<CxChatEvent> event, final Function1<? super SelectionMenuRowModel, Unit> function15, Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        int i5;
        Function0<Unit> function04;
        Function1<? super ChatMode, Unit> function16;
        Event<CxChatEvent> event2;
        int i6;
        int i7;
        Object obj;
        Composer composerStartRestartGroup = composer.startRestartGroup(-834731881);
        if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(uuid) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(chatMode) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(contentState) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= (32768 & i) == 0 ? composerStartRestartGroup.changed(bottomControlState) : composerStartRestartGroup.changedInstance(bottomControlState) ? 16384 : 8192;
        }
        if ((i & 196608) == 0) {
            i4 = 196608;
            i3 |= composerStartRestartGroup.changedInstance(function1) ? 131072 : 65536;
        } else {
            i4 = 196608;
        }
        if ((i & 1572864) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function12) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function2) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function22) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function0) ? 536870912 : 268435456;
        }
        if ((i2 & 6) == 0) {
            i5 = i2 | (composerStartRestartGroup.changedInstance(function02) ? 4 : 2);
        } else {
            i5 = i2;
        }
        if ((i2 & 48) == 0) {
            i5 |= composerStartRestartGroup.changedInstance(function13) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            function04 = function03;
            i5 |= composerStartRestartGroup.changedInstance(function04) ? 256 : 128;
        } else {
            function04 = function03;
        }
        if ((i2 & 3072) == 0) {
            function16 = function14;
            i5 |= composerStartRestartGroup.changedInstance(function16) ? 2048 : 1024;
        } else {
            function16 = function14;
        }
        if ((i2 & 24576) == 0) {
            event2 = event;
            i5 |= composerStartRestartGroup.changed(event2) ? 16384 : 8192;
        } else {
            event2 = event;
        }
        if ((i2 & i4) == 0) {
            i5 |= composerStartRestartGroup.changedInstance(function15) ? 131072 : 65536;
        }
        int i8 = i5;
        if ((i3 & 306783379) == 306783378 && (74899 & i8) == 74898 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-834731881, i3, i8, "com.robinhood.android.supportchat.thread.compose.Content (CxChatComposable.kt:714)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            int i9 = i3;
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxSize$default);
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
            CxChatNoConnectionBanner.CxChatNoConnectionBanner(contentState.getHasInternetConnection(), SizeKt.fillMaxWidth$default(TestTag3.testTag(companion, "NoConnectionBanner"), 0.0f, 1, null), composerStartRestartGroup, 0, 0);
            int i10 = i9 & 14;
            int i11 = i9 >> 3;
            int i12 = i9 >> 6;
            int i13 = i8 << 12;
            CxChatMessageList.CxChatMessageList(uuid, chatMode, contentState, function1, function12, function2, function04, function16, Column5.weight$default(column6, TestTag3.testTag(companion, "MessageList"), 1.0f, false, 2, null), function15, composerStartRestartGroup, (i11 & 112) | i10 | (i11 & 896) | (i12 & 7168) | (57344 & i12) | (458752 & i12) | (3670016 & i13) | (29360128 & i13) | (i13 & 1879048192), 0);
            SupportChatBanner secondaryBanner = contentState.getSecondaryBanner();
            composerStartRestartGroup.startReplaceGroup(535628851);
            if (secondaryBanner == null) {
                i6 = i10;
                i7 = i12;
                obj = null;
            } else {
                int i14 = i10 | 384 | ((i9 >> 9) & 7168);
                i6 = i10;
                i7 = i12;
                obj = null;
                SupportChatThreadBanner2.SupportChatThreadBanner(uuid, secondaryBanner, false, function12, SizeKt.fillMaxWidth$default(PaddingKt.m5146paddingqDBjuR0$default(PaddingKt.m5144paddingVpY3zN4$default(TestTag3.testTag(companion, "SecondaryBanner"), BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21592getMediumD9Ej5fM(), 0.0f, 2, null), 0.0f, 0.0f, 0.0f, PrimitiveResources_androidKt.dimensionResource(C29104R.dimen.chat_banner_bottom_spacing, composerStartRestartGroup, 0), 7, null), 0.0f, 1, null), composerStartRestartGroup, i14, 0);
            }
            composerStartRestartGroup.endReplaceGroup();
            SupportChatBanner banner = contentState.getBanner();
            composerStartRestartGroup.startReplaceGroup(535647478);
            if (banner != null) {
                SupportChatThreadBanner2.SupportChatThreadBanner(uuid, banner, contentState.isSendingActionInput(), function12, SizeKt.fillMaxWidth$default(PaddingKt.m5146paddingqDBjuR0$default(PaddingKt.m5144paddingVpY3zN4$default(TestTag3.testTag(companion, "Banner"), BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21592getMediumD9Ej5fM(), 0.0f, 2, obj), 0.0f, 0.0f, 0.0f, PrimitiveResources_androidKt.dimensionResource(C29104R.dimen.chat_banner_bottom_spacing, composerStartRestartGroup, 0), 7, null), 0.0f, 1, obj), composerStartRestartGroup, i6 | ((i9 >> 9) & 7168), 0);
            }
            composerStartRestartGroup.endReplaceGroup();
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(TestTag3.testTag(companion, "BottomControls"), 0.0f, 1, obj);
            WindowInsets.Companion companion3 = WindowInsets.INSTANCE;
            Modifier modifierWindowInsetsPadding = WindowInsetsPadding6.windowInsetsPadding(modifierFillMaxWidth$default, WindowInsetsKt.m5186onlybOOhFvg(WindowInsetsKt.union(WindowInsets_androidKt.getIme(companion3, composerStartRestartGroup, 6), WindowInsets_androidKt.getNavigationBars(companion3, composerStartRestartGroup, 6)), WindowInsetsSides.INSTANCE.m5198getBottomJoeWqyM()));
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i15 = BentoTheme.$stable;
            Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(modifierWindowInsetsPadding, bentoTheme.getSpacing(composerStartRestartGroup, i15).m21592getMediumD9Ej5fM(), 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i15).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composerStartRestartGroup, i15).m21590getDefaultD9Ej5fM(), 2, null);
            int i16 = (i11 & EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE) | (i7 & 896) | ((i8 >> 3) & 7168) | ((i9 >> 12) & 57344);
            int i17 = i8 << 15;
            CxChatBottomControls2.CxChatBottomControls(str, chatMode, bottomControlState, event2, function22, function02, function13, function0, modifierM5146paddingqDBjuR0$default, 0, composerStartRestartGroup, i16 | (458752 & i17) | (i17 & 3670016) | (29360128 & i7), 512);
            composerStartRestartGroup = composerStartRestartGroup;
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.supportchat.thread.compose.CxChatComposableKt$$ExternalSyntheticLambda10
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return CxChatComposableKt.Content$lambda$49(uuid, str, chatMode, contentState, bottomControlState, function1, function12, function2, function22, function0, function02, function13, function03, function14, event, function15, i, i2, (Composer) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object extractImageData(Intent intent, ChatMode chatMode, ImagePicker imagePicker, Continuation<? super Either<Bitmap, ? extends File>> continuation) {
        C291911 c291911;
        if (continuation instanceof C291911) {
            c291911 = (C291911) continuation;
            int i = c291911.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c291911.label = i - Integer.MIN_VALUE;
            } else {
                c291911 = new C291911(continuation);
            }
        }
        Object objAwait = c291911.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c291911.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objAwait);
            if (chatMode instanceof ChatMode.AgentChat.SalesforceChat) {
                return Either2.asRight(CollectionsKt.first((List) imagePicker.extractImageFilesFromData(intent)));
            }
            if (chatMode instanceof ChatMode.AgentChat.TwilioChat) {
                Single<List<Bitmap>> singleExtractImagesFromResultIntent = imagePicker.extractImagesFromResultIntent(intent);
                c291911.label = 1;
                objAwait = RxAwait3.await(singleExtractImagesFromResultIntent, c291911);
                if (objAwait == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                throw new IllegalStateException(("Unexpected chat mode: " + chatMode + ", for sending image!").toString());
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objAwait);
        }
        Intrinsics.checkNotNullExpressionValue(objAwait, "await(...)");
        return Either2.asLeft(CollectionsKt.first((List) objAwait));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleMessageBubbleClick(CxChatDuxo cxChatDuxo, UUID uuid, UiChatMessage.Regular regular, ChatMode chatMode, Navigator navigator, Context context) {
        boolean zAreEqual = Intrinsics.areEqual(regular.getSendStatus(), UiChatMessage2.SendStatus.Failed.INSTANCE);
        if (regular instanceof UiChatMessage.Regular.Image) {
            resendUserImage(cxChatDuxo, uuid, (UiChatMessage.Regular.Image) regular, chatMode, navigator, context);
            return;
        }
        if (regular instanceof UiChatMessage.Regular.SelectionMessage) {
            UiChatMessage.Regular.SelectionMessage selectionMessage = (UiChatMessage.Regular.SelectionMessage) regular;
            String selectedId = selectionMessage.getSelectedId();
            if (selectedId != null) {
                cxChatDuxo.sendSelectionMenuSelection(uuid, chatMode, new SelectionMenuRowModel(selectedId, selectionMessage.getTitle(), selectionMessage.getSubtitle(), selectionMessage.getIconUrl(), selectionMessage.getTrailingContent()));
                return;
            }
            return;
        }
        if (regular instanceof UiChatMessage.Regular.Text) {
            if (chatMode instanceof ChatMode.ChatbotChat) {
                UiChatMessage.Regular.Text text = (UiChatMessage.Regular.Text) regular;
                cxChatDuxo.sendTextMessage(uuid, chatMode, text.getBody(), text.getLocalSid());
                return;
            } else if (chatMode instanceof ChatMode.AgentChat.SalesforceChat) {
                cxChatDuxo.resendAgentChatUserMessage(uuid, chatMode, regular);
                return;
            } else {
                if (!(chatMode instanceof ChatMode.AgentChat.TwilioChat)) {
                    throw new NoWhenBranchMatchedException();
                }
                String conversationSid = ((ChatMode.AgentChat.TwilioChat) chatMode).getConversationSid();
                if (conversationSid == null) {
                    return;
                }
                cxChatDuxo.openResendBottomSheet(conversationSid, regular);
                return;
            }
        }
        if (regular instanceof UiChatMessage.Regular.SuggestedResponseText) {
            if ((chatMode instanceof ChatMode.ChatbotChat) && zAreEqual) {
                UiChatMessage.Regular.SuggestedResponseText suggestedResponseText = (UiChatMessage.Regular.SuggestedResponseText) regular;
                cxChatDuxo.sendSuggestedResponseSelection(uuid, chatMode, suggestedResponseText.getSuggestedResponse(), suggestedResponseText.getLocalSid());
                return;
            }
            return;
        }
        if (regular instanceof UiChatMessage.Regular.Link) {
            HttpUrl url = ((UiChatMessage.Regular.Link) regular).getUrl();
            if (StringsKt.isHelpCenterUrl(url.getUrl())) {
                Navigator.DefaultImpls.showFragmentInStandaloneRdsActivity$default(navigator, context, new HelpCenterWebViewFragmentKey(url.getUrl()), false, false, false, false, null, false, null, null, 1012, null);
                return;
            } else {
                WebUtils.viewUrl$default(WebUtils.INSTANCE, context, url, 0, 4, null);
                return;
            }
        }
        if (!(regular instanceof UiChatMessage.Regular.Action) && !(regular instanceof UiChatMessage.Regular.Markdown) && !(regular instanceof UiChatMessage.Regular.TypingIndicator) && !(regular instanceof UiChatMessage.Regular.SelectionMenu) && !(regular instanceof UiChatMessage.Regular.MediaYouTube)) {
            throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleAction(CxChatDuxo cxChatDuxo, UUID uuid, UiChatAction uiChatAction, ChatMode chatMode, Navigator navigator, Context context) {
        if (uiChatAction instanceof UiChatAction.Deeplink) {
            Navigator.DefaultImpls.handleDeepLink$default(navigator, context, ((UiChatAction.Deeplink) uiChatAction).getUri(), Boolean.FALSE, null, false, null, 40, null);
            return;
        }
        if (uiChatAction instanceof UiChatAction.Cta) {
            UiChatAction.Cta cta = (UiChatAction.Cta) uiChatAction;
            cxChatDuxo.sendChatbotCta(chatMode, cta.getId(), cta.getLocalId());
        } else if (uiChatAction instanceof UiChatAction.Escalate) {
            cxChatDuxo.escalateToAgent(uuid, ((UiChatAction.Escalate) uiChatAction).getLocalId(), chatMode);
        } else if (uiChatAction instanceof UiChatAction.EndChat) {
            cxChatDuxo.endChat(uuid, ((UiChatAction.EndChat) uiChatAction).getLocalId(), chatMode);
        } else {
            if (!(uiChatAction instanceof UiChatAction.ResumeChat)) {
                throw new NoWhenBranchMatchedException();
            }
            cxChatDuxo.resumeChat(uuid, ((UiChatAction.ResumeChat) uiChatAction).getLocalId(), chatMode);
        }
    }

    private static final void resendUserImage(CxChatDuxo cxChatDuxo, UUID uuid, UiChatMessage.Regular.Image image, ChatMode chatMode, Navigator navigator, Context context) {
        UUID documentId;
        boolean zAreEqual = Intrinsics.areEqual(image.getSendStatus(), UiChatMessage2.SendStatus.Failed.INSTANCE);
        if (chatMode instanceof ChatMode.AgentChat.TwilioChat) {
            if (zAreEqual) {
                String conversationSid = ((ChatMode.AgentChat.TwilioChat) chatMode).getConversationSid();
                if (conversationSid == null) {
                    return;
                }
                cxChatDuxo.openResendBottomSheet(conversationSid, image);
                return;
            }
            UUID documentId2 = image.getDocumentId();
            if (documentId2 != null) {
                Navigator.DefaultImpls.showFragmentInStandaloneRdsActivity$default(navigator, context, new SupportChatImageViewerKey.IdentiSource(documentId2), false, true, false, false, null, false, null, null, 1012, null);
                return;
            }
            return;
        }
        if (!(chatMode instanceof ChatMode.AgentChat.SalesforceChat)) {
            if (!(chatMode instanceof ChatMode.ChatbotChat)) {
                throw new NoWhenBranchMatchedException();
            }
            if (zAreEqual || (documentId = image.getDocumentId()) == null) {
                return;
            }
            Navigator.DefaultImpls.showFragmentInStandaloneRdsActivity$default(navigator, context, new SupportChatImageViewerKey.IdentiSource(documentId), false, true, false, false, null, false, null, null, 1012, null);
            return;
        }
        if (zAreEqual) {
            cxChatDuxo.resendAgentChatUserMessage(uuid, chatMode, image);
            return;
        }
        Uri encryptedImageUri = image.getEncryptedImageUri();
        if (encryptedImageUri == null) {
            return;
        }
        Navigator.DefaultImpls.showFragmentInStandaloneRdsActivity$default(navigator, context, new SupportChatImageViewerKey.FileSource(Uri2.toFile(encryptedImageUri)), false, true, false, false, null, false, null, null, 1012, null);
    }
}
