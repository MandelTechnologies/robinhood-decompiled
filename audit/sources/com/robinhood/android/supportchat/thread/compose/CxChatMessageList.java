package com.robinhood.android.supportchat.thread.compose;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
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
import androidx.compose.material.pullrefresh.PullRefresh;
import androidx.compose.material.pullrefresh.PullRefreshIndicator2;
import androidx.compose.material.pullrefresh.PullRefreshState;
import androidx.compose.material.pullrefresh.PullRefreshState4;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.supportchat.thread.CxChatViewState;
import com.robinhood.compose.bento.component.TopBarScrollState3;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.models.p355ui.p356v2.ChatbotSuggestedResponse;
import com.robinhood.models.p355ui.p356v2.SelectionMenuRowModel;
import com.robinhood.models.p355ui.pathfinder.messaging.ChatMode;
import com.robinhood.shared.settings.contracts.NotificationSettings4FragmentKey;
import com.robinhood.shared.support.supportchat.p396ui.ChatMessageComposable;
import com.robinhood.shared.support.supportchat.p396ui.ChatMessagePaddings;
import com.robinhood.shared.support.supportchat.p396ui.models.UiChatAction;
import com.robinhood.shared.support.supportchat.p396ui.models.UiChatMessage;
import com.robinhood.utils.compose.keyboard.KeyboardState;
import com.robinhood.utils.compose.keyboard.KeyboardState2;
import com.robinhood.utils.logging.CrashReporter;
import com.robinhood.utils.logging.EventMetadata;
import com.robinhood.utils.logging.SentryTeam;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: CxChatMessageList.kt */
@Metadata(m3635d1 = {"\u0000\u0080\u0001\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\u001aÅ\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\t2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00010\t2\u0018\u0010\r\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00010\u000e2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00010\u00112!\u0010\u0012\u001a\u001d\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00020\u00010\t2\b\b\u0002\u0010\u0015\u001a\u00020\u00162!\u0010\u0017\u001a\u001d\u0012\u0013\u0012\u00110\u0018¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u00020\u00010\tH\u0007¢\u0006\u0002\u0010\u001a\u001au\u0010\u001b\u001a\u00020\u0001*\u00020\u001c2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d2\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\t2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00010\t2!\u0010\u0017\u001a\u001d\u0012\u0013\u0012\u00110\u0018¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u00020\u00010\tH\u0002\u001a\u001a\u0010\u001f\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u001e0 2\u0006\u0010\u0004\u001a\u00020\u0005H\u0002\u001a\u0016\u0010!\u001a\u00020\"2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001e0 H\u0002\u001a\f\u0010#\u001a\u00020\"*\u00020\u001eH\u0002\u001aF\u0010$\u001a\u00020\u0001*\u00020\u001c2\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u000f0\u001d2\b\u0010%\u001a\u0004\u0018\u00010\"2\u0018\u0010\r\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00010\u000eH\u0002\u001a\u0016\u0010&\u001a\u00020\u00012\u0006\u0010'\u001a\u00020(H\u0082@¢\u0006\u0002\u0010)\"\u000e\u0010*\u001a\u00020+X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010,\u001a\u00020+X\u0082T¢\u0006\u0002\n\u0000¨\u0006-²\u0006\n\u0010.\u001a\u00020/X\u008a\u0084\u0002"}, m3636d2 = {"CxChatMessageList", "", "inquiryId", "Ljava/util/UUID;", "chatMode", "Lcom/robinhood/models/ui/pathfinder/messaging/ChatMode;", "contentState", "Lcom/robinhood/android/supportchat/thread/CxChatViewState$ContentState;", "onClickMessageBubble", "Lkotlin/Function1;", "Lcom/robinhood/shared/support/supportchat/ui/models/UiChatMessage$Regular;", "onClickAction", "Lcom/robinhood/shared/support/supportchat/ui/models/UiChatAction;", "onClickSuggestedResponse", "Lkotlin/Function2;", "Lcom/robinhood/models/ui/v2/ChatbotSuggestedResponse;", "fetchPreviousMessages", "Lkotlin/Function0;", "markAllMessagesAsRead", "Lkotlin/ParameterName;", "name", "modifier", "Landroidx/compose/ui/Modifier;", "onClickUserSelectionRow", "Lcom/robinhood/models/ui/v2/SelectionMenuRowModel;", "row", "(Ljava/util/UUID;Lcom/robinhood/models/ui/pathfinder/messaging/ChatMode;Lcom/robinhood/android/supportchat/thread/CxChatViewState$ContentState;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", NotificationSettings4FragmentKey.SETTINGS_MESSAGES, "Landroidx/compose/foundation/lazy/LazyListScope;", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/shared/support/supportchat/ui/models/UiChatMessage;", "detectKeyConflicts", "", "printMessages", "", "key", "selections", "selectedSuggestedResponseId", "scrollToBottom", "listState", "Landroidx/compose/foundation/lazy/LazyListState;", "(Landroidx/compose/foundation/lazy/LazyListState;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "SuggestedResponseVerticalSpacing", "", "SuggestedResponseStartSpacing", "feature-support-chat_externalRelease", "keyboardState", "Lcom/robinhood/utils/compose/keyboard/KeyboardState;"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.supportchat.thread.compose.CxChatMessageListKt, reason: use source file name */
/* loaded from: classes9.dex */
public final class CxChatMessageList {
    private static final int SuggestedResponseStartSpacing = 85;
    private static final int SuggestedResponseVerticalSpacing = 12;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CxChatMessageList$lambda$8(UUID uuid, ChatMode chatMode, CxChatViewState.ContentState contentState, Function1 function1, Function1 function12, Function2 function2, Function0 function0, Function1 function13, Modifier modifier, Function1 function14, int i, int i2, Composer composer, int i3) {
        CxChatMessageList(uuid, chatMode, contentState, function1, function12, function2, function0, function13, modifier, function14, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0332  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0337  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x034a  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x034d  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0366  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0380  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0383  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x03a5  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x03d8  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x03f0  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x03fb  */
    /* JADX WARN: Removed duplicated region for block: B:189:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CxChatMessageList(final UUID inquiryId, final ChatMode chatMode, final CxChatViewState.ContentState contentState, final Function1<? super UiChatMessage.Regular, Unit> onClickMessageBubble, final Function1<? super UiChatAction, Unit> onClickAction, final Function2<? super ChatMode, ? super ChatbotSuggestedResponse, Unit> onClickSuggestedResponse, final Function0<Unit> fetchPreviousMessages, Function1<? super ChatMode, Unit> markAllMessagesAsRead, Modifier modifier, final Function1<? super SelectionMenuRowModel, Unit> onClickUserSelectionRow, Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        Modifier modifier2;
        int i5;
        boolean zIsFetchingPreviousMessages;
        ImmutableList<UiChatMessage> messages;
        final ImmutableList<ChatbotSuggestedResponse> chatbotSuggestedResponses;
        LazyListState lazyListStateRememberLazyListState;
        PullRefreshState pullRefreshStateM5675rememberPullRefreshStateUuyPYSY;
        SnapshotState4<KeyboardState> snapshotState4RememberKeyboardState;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Modifier modifier3;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        Modifier.Companion companion;
        BentoTheme bentoTheme;
        int i6;
        boolean zChangedInstance;
        Object objRememberedValue;
        final ImmutableList<UiChatMessage> immutableList;
        PullRefreshState pullRefreshState;
        boolean z;
        int i7;
        Modifier modifier4;
        Modifier.Companion companion2;
        boolean z2;
        BentoTheme bentoTheme2;
        int i8;
        boolean zChanged;
        Object objRememberedValue2;
        final Function1<? super ChatMode, Unit> function1;
        boolean z3;
        boolean zChanged2;
        Object objRememberedValue3;
        boolean zChanged3;
        Object objRememberedValue4;
        final Modifier modifier5;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        int i9;
        Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
        Intrinsics.checkNotNullParameter(chatMode, "chatMode");
        Intrinsics.checkNotNullParameter(contentState, "contentState");
        Intrinsics.checkNotNullParameter(onClickMessageBubble, "onClickMessageBubble");
        Intrinsics.checkNotNullParameter(onClickAction, "onClickAction");
        Intrinsics.checkNotNullParameter(onClickSuggestedResponse, "onClickSuggestedResponse");
        Intrinsics.checkNotNullParameter(fetchPreviousMessages, "fetchPreviousMessages");
        Intrinsics.checkNotNullParameter(markAllMessagesAsRead, "markAllMessagesAsRead");
        Intrinsics.checkNotNullParameter(onClickUserSelectionRow, "onClickUserSelectionRow");
        Composer composerStartRestartGroup = composer.startRestartGroup(-662091130);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(inquiryId) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(chatMode) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(contentState) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onClickMessageBubble) ? 2048 : 1024;
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onClickAction) ? 16384 : 8192;
        }
        int i10 = i3;
        if ((i2 & 32) != 0) {
            i4 = i10 | 196608;
        } else if ((i & 196608) == 0) {
            i4 = i10 | (composerStartRestartGroup.changedInstance(onClickSuggestedResponse) ? 131072 : 65536);
        } else {
            i4 = i10;
        }
        if ((i2 & 64) != 0) {
            i4 |= 1572864;
        } else if ((i & 1572864) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(fetchPreviousMessages) ? 1048576 : 524288;
        }
        if ((i2 & 128) != 0) {
            i4 |= 12582912;
        } else if ((i & 12582912) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(markAllMessagesAsRead) ? 8388608 : 4194304;
        }
        int i11 = i2 & 256;
        if (i11 != 0) {
            i4 |= 100663296;
            modifier2 = modifier;
        } else {
            modifier2 = modifier;
            if ((i & 100663296) == 0) {
                i4 |= composerStartRestartGroup.changed(modifier2) ? 67108864 : 33554432;
            }
        }
        if ((i2 & 512) == 0) {
            i9 = (805306368 & i) == 0 ? composerStartRestartGroup.changedInstance(onClickUserSelectionRow) ? 536870912 : 268435456 : 805306368;
            i5 = i4;
            if ((306783379 & i5) == 306783378 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier6 = i11 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-662091130, i5, -1, "com.robinhood.android.supportchat.thread.compose.CxChatMessageList (CxChatMessageList.kt:56)");
                }
                zIsFetchingPreviousMessages = contentState.isFetchingPreviousMessages();
                messages = contentState.getMessages();
                chatbotSuggestedResponses = contentState.getChatbotSuggestedResponses();
                lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                pullRefreshStateM5675rememberPullRefreshStateUuyPYSY = PullRefreshState4.m5675rememberPullRefreshStateUuyPYSY(zIsFetchingPreviousMessages, fetchPreviousMessages, 0.0f, 0.0f, composerStartRestartGroup, (i5 >> 15) & 112, 12);
                snapshotState4RememberKeyboardState = KeyboardState2.rememberKeyboardState(composerStartRestartGroup, 0);
                Modifier modifierPullRefresh$default = PullRefresh.pullRefresh$default(modifier6, pullRefreshStateM5675rememberPullRefreshStateUuyPYSY, false, 2, null);
                Alignment.Companion companion3 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getTopStart(), false);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierPullRefresh$default);
                ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion4.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.useNode();
                } else {
                    composerStartRestartGroup.createNode(constructor);
                }
                composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                modifier3 = modifier6;
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion4.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion4.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion4.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion4.getSetModifier());
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                companion = Modifier.INSTANCE;
                Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
                bentoTheme = BentoTheme.INSTANCE;
                i6 = BentoTheme.$stable;
                PaddingValues paddingValuesM5136PaddingValuesYgX7TsA = PaddingKt.m5136PaddingValuesYgX7TsA(bentoTheme.getSpacing(composerStartRestartGroup, i6).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composerStartRestartGroup, i6).m21590getDefaultD9Ej5fM());
                composerStartRestartGroup.startReplaceGroup(-1224400529);
                zChangedInstance = ((i5 & 7168) != 2048) | composerStartRestartGroup.changedInstance(inquiryId) | composerStartRestartGroup.changedInstance(chatMode) | composerStartRestartGroup.changedInstance(messages) | ((57344 & i5) != 16384) | ((1879048192 & i5) != 536870912) | composerStartRestartGroup.changedInstance(chatbotSuggestedResponses) | composerStartRestartGroup.changedInstance(contentState) | ((458752 & i5) != 131072);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    immutableList = messages;
                    pullRefreshState = pullRefreshStateM5675rememberPullRefreshStateUuyPYSY;
                    z = zIsFetchingPreviousMessages;
                    i7 = i5;
                    modifier4 = modifier3;
                    companion2 = companion;
                    z2 = true;
                    bentoTheme2 = bentoTheme;
                    i8 = i6;
                    Function1 function12 = new Function1() { // from class: com.robinhood.android.supportchat.thread.compose.CxChatMessageListKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return CxChatMessageList.CxChatMessageList$lambda$4$lambda$3$lambda$2(inquiryId, chatMode, immutableList, onClickMessageBubble, onClickUserSelectionRow, chatbotSuggestedResponses, contentState, onClickSuggestedResponse, onClickAction, (LazyListScope) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(function12);
                    objRememberedValue = function12;
                } else {
                    immutableList = messages;
                    pullRefreshState = pullRefreshStateM5675rememberPullRefreshStateUuyPYSY;
                    z = zIsFetchingPreviousMessages;
                    i7 = i5;
                    modifier4 = modifier3;
                    companion2 = companion;
                    z2 = true;
                    bentoTheme2 = bentoTheme;
                    i8 = i6;
                }
                composerStartRestartGroup.endReplaceGroup();
                LazyDslKt.LazyColumn(modifierFillMaxSize$default, lazyListStateRememberLazyListState, paddingValuesM5136PaddingValuesYgX7TsA, false, null, null, null, false, null, (Function1) objRememberedValue, composerStartRestartGroup, 6, 504);
                PullRefreshIndicator2.m5671PullRefreshIndicatorjB83MbM(z, pullRefreshState, boxScopeInstance.align(TestTag3.testTag(companion2, "RefreshProgressBar"), companion3.getTopCenter()), bentoTheme2.getColors(composerStartRestartGroup, i8).m21371getBg0d7_KjU(), bentoTheme2.getColors(composerStartRestartGroup, i8).m21425getFg0d7_KjU(), false, composerStartRestartGroup, PullRefreshState.$stable << 3, 32);
                composerStartRestartGroup.endNode();
                UiChatMessage uiChatMessage = (UiChatMessage) CollectionsKt.lastOrNull((List) immutableList);
                String sid = uiChatMessage == null ? uiChatMessage.getSid() : null;
                composerStartRestartGroup.startReplaceGroup(-1746271574);
                zChanged = composerStartRestartGroup.changed(lazyListStateRememberLazyListState) | ((i7 & 29360128) != 8388608 ? z2 : false) | composerStartRestartGroup.changedInstance(chatMode);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (!zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    function1 = markAllMessagesAsRead;
                    objRememberedValue2 = new CxChatMessageList2(lazyListStateRememberLazyListState, function1, chatMode, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                } else {
                    function1 = markAllMessagesAsRead;
                }
                composerStartRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(sid, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, 0);
                z3 = contentState.getBanner() == null ? z2 : false;
                Boolean boolValueOf = Boolean.valueOf(z3);
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                zChanged2 = composerStartRestartGroup.changed(z3) | composerStartRestartGroup.changed(lazyListStateRememberLazyListState);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (!zChanged2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue3 = new CxChatMessageList3(z3, lazyListStateRememberLazyListState, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(boolValueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue3, composerStartRestartGroup, 0);
                KeyboardState keyboardStateCxChatMessageList$lambda$0 = CxChatMessageList$lambda$0(snapshotState4RememberKeyboardState);
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                zChanged3 = composerStartRestartGroup.changed(snapshotState4RememberKeyboardState) | composerStartRestartGroup.changed(lazyListStateRememberLazyListState);
                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (!zChanged3 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue4 = new CxChatMessageList4(lazyListStateRememberLazyListState, snapshotState4RememberKeyboardState, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                }
                composerStartRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(keyboardStateCxChatMessageList$lambda$0, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue4, composerStartRestartGroup, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier5 = modifier4;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier5 = modifier2;
                function1 = markAllMessagesAsRead;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.supportchat.thread.compose.CxChatMessageListKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return CxChatMessageList.CxChatMessageList$lambda$8(inquiryId, chatMode, contentState, onClickMessageBubble, onClickAction, onClickSuggestedResponse, fetchPreviousMessages, function1, modifier5, onClickUserSelectionRow, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i4 |= i9;
        i5 = i4;
        if ((306783379 & i5) == 306783378) {
            if (i11 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            zIsFetchingPreviousMessages = contentState.isFetchingPreviousMessages();
            messages = contentState.getMessages();
            chatbotSuggestedResponses = contentState.getChatbotSuggestedResponses();
            lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
            pullRefreshStateM5675rememberPullRefreshStateUuyPYSY = PullRefreshState4.m5675rememberPullRefreshStateUuyPYSY(zIsFetchingPreviousMessages, fetchPreviousMessages, 0.0f, 0.0f, composerStartRestartGroup, (i5 >> 15) & 112, 12);
            snapshotState4RememberKeyboardState = KeyboardState2.rememberKeyboardState(composerStartRestartGroup, 0);
            Modifier modifierPullRefresh$default2 = PullRefresh.pullRefresh$default(modifier6, pullRefreshStateM5675rememberPullRefreshStateUuyPYSY, false, 2, null);
            Alignment.Companion companion32 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion32.getTopStart(), false);
            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierPullRefresh$default2);
            ComposeUiNode.Companion companion42 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor2 = companion42.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
            }
            composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            modifier3 = modifier6;
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy2, companion42.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion42.getSetResolvedCompositionLocals());
            setCompositeKeyHash = companion42.getSetCompositeKeyHash();
            if (!composerM6388constructorimpl.getInserting()) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion42.getSetModifier());
                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                companion = Modifier.INSTANCE;
                Modifier modifierFillMaxSize$default2 = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
                bentoTheme = BentoTheme.INSTANCE;
                i6 = BentoTheme.$stable;
                PaddingValues paddingValuesM5136PaddingValuesYgX7TsA2 = PaddingKt.m5136PaddingValuesYgX7TsA(bentoTheme.getSpacing(composerStartRestartGroup, i6).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composerStartRestartGroup, i6).m21590getDefaultD9Ej5fM());
                composerStartRestartGroup.startReplaceGroup(-1224400529);
                zChangedInstance = ((i5 & 7168) != 2048) | composerStartRestartGroup.changedInstance(inquiryId) | composerStartRestartGroup.changedInstance(chatMode) | composerStartRestartGroup.changedInstance(messages) | ((57344 & i5) != 16384) | ((1879048192 & i5) != 536870912) | composerStartRestartGroup.changedInstance(chatbotSuggestedResponses) | composerStartRestartGroup.changedInstance(contentState) | ((458752 & i5) != 131072);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance) {
                    immutableList = messages;
                    pullRefreshState = pullRefreshStateM5675rememberPullRefreshStateUuyPYSY;
                    z = zIsFetchingPreviousMessages;
                    i7 = i5;
                    modifier4 = modifier3;
                    companion2 = companion;
                    z2 = true;
                    bentoTheme2 = bentoTheme;
                    i8 = i6;
                    Function1 function122 = new Function1() { // from class: com.robinhood.android.supportchat.thread.compose.CxChatMessageListKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return CxChatMessageList.CxChatMessageList$lambda$4$lambda$3$lambda$2(inquiryId, chatMode, immutableList, onClickMessageBubble, onClickUserSelectionRow, chatbotSuggestedResponses, contentState, onClickSuggestedResponse, onClickAction, (LazyListScope) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(function122);
                    objRememberedValue = function122;
                    composerStartRestartGroup.endReplaceGroup();
                    LazyDslKt.LazyColumn(modifierFillMaxSize$default2, lazyListStateRememberLazyListState, paddingValuesM5136PaddingValuesYgX7TsA2, false, null, null, null, false, null, (Function1) objRememberedValue, composerStartRestartGroup, 6, 504);
                    PullRefreshIndicator2.m5671PullRefreshIndicatorjB83MbM(z, pullRefreshState, boxScopeInstance2.align(TestTag3.testTag(companion2, "RefreshProgressBar"), companion32.getTopCenter()), bentoTheme2.getColors(composerStartRestartGroup, i8).m21371getBg0d7_KjU(), bentoTheme2.getColors(composerStartRestartGroup, i8).m21425getFg0d7_KjU(), false, composerStartRestartGroup, PullRefreshState.$stable << 3, 32);
                    composerStartRestartGroup.endNode();
                    UiChatMessage uiChatMessage2 = (UiChatMessage) CollectionsKt.lastOrNull((List) immutableList);
                    if (uiChatMessage2 == null) {
                    }
                    composerStartRestartGroup.startReplaceGroup(-1746271574);
                    zChanged = composerStartRestartGroup.changed(lazyListStateRememberLazyListState) | ((i7 & 29360128) != 8388608 ? z2 : false) | composerStartRestartGroup.changedInstance(chatMode);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        function1 = markAllMessagesAsRead;
                        objRememberedValue2 = new CxChatMessageList2(lazyListStateRememberLazyListState, function1, chatMode, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        composerStartRestartGroup.endReplaceGroup();
                        EffectsKt.LaunchedEffect(sid, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, 0);
                        if (contentState.getBanner() == null) {
                        }
                        Boolean boolValueOf2 = Boolean.valueOf(z3);
                        composerStartRestartGroup.startReplaceGroup(-1633490746);
                        zChanged2 = composerStartRestartGroup.changed(z3) | composerStartRestartGroup.changed(lazyListStateRememberLazyListState);
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (!zChanged2) {
                            objRememberedValue3 = new CxChatMessageList3(z3, lazyListStateRememberLazyListState, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                            composerStartRestartGroup.endReplaceGroup();
                            EffectsKt.LaunchedEffect(boolValueOf2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue3, composerStartRestartGroup, 0);
                            KeyboardState keyboardStateCxChatMessageList$lambda$02 = CxChatMessageList$lambda$0(snapshotState4RememberKeyboardState);
                            composerStartRestartGroup.startReplaceGroup(-1633490746);
                            zChanged3 = composerStartRestartGroup.changed(snapshotState4RememberKeyboardState) | composerStartRestartGroup.changed(lazyListStateRememberLazyListState);
                            objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                            if (!zChanged3) {
                                objRememberedValue4 = new CxChatMessageList4(lazyListStateRememberLazyListState, snapshotState4RememberKeyboardState, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                                composerStartRestartGroup.endReplaceGroup();
                                EffectsKt.LaunchedEffect(keyboardStateCxChatMessageList$lambda$02, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue4, composerStartRestartGroup, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                modifier5 = modifier4;
                            }
                        }
                    }
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CxChatMessageList$lambda$4$lambda$3$lambda$2(UUID uuid, ChatMode chatMode, ImmutableList immutableList, Function1 function1, Function1 function12, ImmutableList immutableList2, CxChatViewState.ContentState contentState, Function2 function2, final Function1 function13, LazyListScope LazyColumn) {
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        messages(LazyColumn, uuid, chatMode, immutableList, function1, new Function1() { // from class: com.robinhood.android.supportchat.thread.compose.CxChatMessageListKt$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CxChatMessageList.CxChatMessageList$lambda$4$lambda$3$lambda$2$lambda$1(function13, (UiChatAction) obj);
            }
        }, function12);
        selections(LazyColumn, chatMode, immutableList2, contentState.getSelectedSuggestedResponseId(), function2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final KeyboardState CxChatMessageList$lambda$0(SnapshotState4<? extends KeyboardState> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CxChatMessageList$lambda$4$lambda$3$lambda$2$lambda$1(Function1 function1, UiChatAction action) {
        Intrinsics.checkNotNullParameter(action, "action");
        function1.invoke(action);
        return Unit.INSTANCE;
    }

    private static final void messages(LazyListScope lazyListScope, final UUID uuid, ChatMode chatMode, final ImmutableList<? extends UiChatMessage> immutableList, final Function1<? super UiChatMessage.Regular, Unit> function1, final Function1<? super UiChatAction, Unit> function12, final Function1<? super SelectionMenuRowModel, Unit> function13) {
        detectKeyConflicts(immutableList, chatMode);
        final Function2 function2 = new Function2() { // from class: com.robinhood.android.supportchat.thread.compose.CxChatMessageListKt$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return CxChatMessageList.messages$lambda$9(((Integer) obj).intValue(), (UiChatMessage) obj2);
            }
        };
        lazyListScope.items(immutableList.size(), new Function1<Integer, Object>() { // from class: com.robinhood.android.supportchat.thread.compose.CxChatMessageListKt$messages$$inlined$itemsIndexed$default$1
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
        }, new Function1<Integer, Object>() { // from class: com.robinhood.android.supportchat.thread.compose.CxChatMessageListKt$messages$$inlined$itemsIndexed$default$2
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
        }, ComposableLambda3.composableLambdaInstance(-1091073711, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.robinhood.android.supportchat.thread.compose.CxChatMessageListKt$messages$$inlined$itemsIndexed$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(4);
            }

            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
                invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
                return Unit.INSTANCE;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public final void invoke(LazyItemScope lazyItemScope, int i, Composer composer, int i2) {
                int i3;
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
                UiChatMessage uiChatMessage = (UiChatMessage) immutableList.get(i);
                composer.startReplaceGroup(-209921555);
                int i4 = i - 1;
                ChatMessageComposable.ChatMessageComposable(uuid, uiChatMessage, uiChatMessage.getSenderType(), function1, function12, ChatMessagePaddings.chatMessageVerticalPadding(TestTag3.testTag(Modifier.INSTANCE, CxChatComposableTestTag.Message.indexedTestTag(i)), i, CollectionsKt.getLastIndex(immutableList), uiChatMessage, i4 >= 0 ? (UiChatMessage) immutableList.get(i4) : null), function13, composer, UiChatMessage.$stable << 3, 0);
                composer.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object messages$lambda$9(int i, UiChatMessage message) {
        Intrinsics.checkNotNullParameter(message, "message");
        return key(message);
    }

    private static final void detectKeyConflicts(List<? extends UiChatMessage> list, ChatMode chatMode) {
        List arrayList;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (UiChatMessage uiChatMessage : list) {
            String strKey = key(uiChatMessage);
            if (!linkedHashMap.containsKey(strKey)) {
                linkedHashMap.put(strKey, uiChatMessage);
            } else {
                Object obj = linkedHashMap.get(strKey);
                if (obj == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                UiChatMessage uiChatMessage2 = (UiChatMessage) obj;
                List list2 = (List) linkedHashMap2.get(strKey);
                if (list2 == null || (arrayList = CollectionsKt.toMutableList((Collection) list2)) == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(uiChatMessage2);
                arrayList.add(uiChatMessage);
                linkedHashMap2.put(strKey, arrayList);
            }
        }
        if (linkedHashMap2.isEmpty()) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("In " + chatMode + ", conflicting keys are found in:");
        sb.append('\n');
        for (Map.Entry entry : linkedHashMap2.entrySet()) {
            String str = (String) entry.getKey();
            List list3 = (List) entry.getValue();
            sb.append("Key: " + str + ", [");
            sb.append('\n');
            sb.append(printMessages(list3));
            sb.append('\n');
            sb.append("]");
            sb.append('\n');
        }
        sb.append("If you are using LazyColumn/Row please make sure you provide a unique key for each item.");
        CrashReporter.INSTANCE.reportNonFatal(new IllegalArgumentException(sb.toString()), true, new EventMetadata(SentryTeam.SUPPORT_X, MapsKt.mapOf(Tuples4.m3642to("feature", "support_chat")), null, 4, null));
    }

    private static final void selections(LazyListScope lazyListScope, final ChatMode chatMode, final ImmutableList<ChatbotSuggestedResponse> immutableList, final String str, final Function2<? super ChatMode, ? super ChatbotSuggestedResponse, Unit> function2) {
        final boolean z = str == null;
        lazyListScope.items(immutableList.size(), null, new Function1<Integer, Object>() { // from class: com.robinhood.android.supportchat.thread.compose.CxChatMessageListKt$selections$$inlined$itemsIndexed$default$2
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
        }, ComposableLambda3.composableLambdaInstance(-1091073711, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.robinhood.android.supportchat.thread.compose.CxChatMessageListKt$selections$$inlined$itemsIndexed$default$3
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
                final ChatbotSuggestedResponse chatbotSuggestedResponse = (ChatbotSuggestedResponse) immutableList.get(i);
                composer.startReplaceGroup(652343789);
                Modifier.Companion companion = Modifier.INSTANCE;
                Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(TestTag3.testTag(companion, CxChatComposableTestTag.SuggestedResponseRow.indexedTestTag(i)), 0.0f, 1, null), C2002Dp.m7995constructorimpl(85), C2002Dp.m7995constructorimpl(i == 0 ? 0 : 12), 0.0f, 0.0f, 12, null);
                MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getEnd(), Alignment.INSTANCE.getTop(), composer, 6);
                int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierM5146paddingqDBjuR0$default);
                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion2.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                Row6 row6 = Row6.INSTANCE;
                boolean zAreEqual = Intrinsics.areEqual(str, chatbotSuggestedResponse.getId());
                Modifier modifierTestTag = TestTag3.testTag(companion, CxChatComposableTestTag.SuggestedResponseChip.indexedTestTag(i));
                boolean z2 = z;
                composer.startReplaceGroup(-1746271574);
                boolean zChanged = composer.changed(function2) | composer.changedInstance(chatMode) | composer.changedInstance(chatbotSuggestedResponse);
                Object objRememberedValue = composer.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    final Function2 function22 = function2;
                    final ChatMode chatMode2 = chatMode;
                    objRememberedValue = new Function0<Unit>() { // from class: com.robinhood.android.supportchat.thread.compose.CxChatMessageListKt$selections$1$1$1$1
                        @Override // kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            function22.invoke(chatMode2, chatbotSuggestedResponse);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceGroup();
                CxChatSuggestedResponse3.CxChatSuggestedResponse(chatbotSuggestedResponse, z2, zAreEqual, (Function0) objRememberedValue, modifierTestTag, composer, 0, 0);
                composer.endNode();
                composer.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
    }

    private static final String printMessages(List<? extends UiChatMessage> list) {
        return CollectionsKt.joinToString$default(list, ",\n", null, null, 0, null, new Function1() { // from class: com.robinhood.android.supportchat.thread.compose.CxChatMessageListKt$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CxChatMessageList.printMessages$lambda$12((UiChatMessage) obj);
            }
        }, 30, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence printMessages$lambda$12(UiChatMessage message) {
        Intrinsics.checkNotNullParameter(message, "message");
        if (message instanceof UiChatMessage.Regular) {
            return "Regular: { sid: " + message.getSid() + ", localSid: " + message.getLocalSid() + ", ts: " + message.getDateCreated() + ", sender: " + message.getSenderType() + " }";
        }
        if (message instanceof UiChatMessage.Metadata) {
            return "Metadata:  { sid: " + message.getSid() + ", localSid: " + message.getLocalSid() + ", ts: " + message.getDateCreated() + " }";
        }
        if (!(message instanceof UiChatMessage.Unknown)) {
            throw new NoWhenBranchMatchedException();
        }
        return "Unknown: " + message;
    }

    private static final String key(UiChatMessage uiChatMessage) {
        String localSid = uiChatMessage.getLocalSid();
        if (localSid == null && (localSid = uiChatMessage.getSid()) == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        return localSid + "-" + uiChatMessage.getDateCreated();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object scrollToBottom(LazyListState lazyListState, Continuation<? super Unit> continuation) {
        int totalItemsCount = lazyListState.getLayoutInfo().getTotalItemsCount() - 1;
        if (TopBarScrollState3.getCanBeScrolled(lazyListState) && totalItemsCount >= 0) {
            Object objAnimateScrollToItem$default = LazyListState.animateScrollToItem$default(lazyListState, totalItemsCount, 0, continuation, 2, null);
            return objAnimateScrollToItem$default == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objAnimateScrollToItem$default : Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }
}
