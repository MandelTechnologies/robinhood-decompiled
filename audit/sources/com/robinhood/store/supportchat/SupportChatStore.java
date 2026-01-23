package com.robinhood.store.supportchat;

import android.graphics.Bitmap;
import android.net.Uri;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.api.docupload.DocUploadApi;
import com.robinhood.android.api.supportchat.SupportChatApi;
import com.robinhood.android.bitmap.BitmapStore;
import com.robinhood.android.bitmap.ImageProcessingFailedException;
import com.robinhood.android.lib.conversations.ConversationHelper;
import com.robinhood.android.lib.conversations.TwilioManager;
import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.moria.network.PostEndpoint;
import com.robinhood.api.utils.extensions.NetworkThrowables;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.models.api.ErrorResponse;
import com.robinhood.models.api.GenericErrorResponse;
import com.robinhood.models.api.identi.ApiGenericDocument;
import com.robinhood.models.api.pathfinder.messaging.ApiSupportChat;
import com.robinhood.models.api.pathfinder.messaging.ApiSupportChatList;
import com.robinhood.models.api.pathfinder.messaging.ChatCurrentType;
import com.robinhood.models.api.pathfinder.messaging.CreateSupportChatRequest;
import com.robinhood.models.api.pathfinder.messaging.SupportChatOperationType;
import com.robinhood.models.api.simulatedreturns.ApiOptionSimulatedReturnsConfigurationV3Request;
import com.robinhood.models.p355ui.pathfinder.messaging.AgentChat;
import com.robinhood.models.p355ui.pathfinder.messaging.ChatbotChat;
import com.robinhood.models.p355ui.pathfinder.messaging.SupportChat;
import com.robinhood.models.p355ui.pathfinder.messaging.SupportChat2;
import com.robinhood.models.supportchat.p353db.SocketChatMessage;
import com.robinhood.prefs.Installation;
import com.robinhood.shared.models.chat.common.UnsentInput;
import com.robinhood.shared.models.chat.common.UnsentInputStatus;
import com.robinhood.shared.settings.contracts.NotificationSettings4FragmentKey;
import com.robinhood.shared.store.chat.common.ChatCache;
import com.robinhood.shared.store.chat.common.ChatCache2;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.store.supportchat.AgentChatEvent;
import com.robinhood.utils.extensions.SinglesAndroid;
import com.robinhood.utils.extensions.Throwables;
import com.robinhood.utils.http.MediaTypes;
import com.robinhood.utils.logging.CrashReporter;
import com.robinhood.utils.p408rx.ScopedSubscriptionKt;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Single;
import io.reactivex.SingleSource;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.schedulers.Schedulers;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlinx.collections.immutable.ImmutableMap;
import kotlinx.collections.immutable.ImmutableMap3;
import kotlinx.collections.immutable.extensions2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Context7;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow2;
import kotlinx.coroutines.flow.StateFlow4;
import kotlinx.coroutines.rx2.RxConvert;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import p479j$.time.Instant;
import retrofit2.HttpException;
import retrofit2.Response;

/* compiled from: SupportChatStore.kt */
@Metadata(m3635d1 = {"\u0000\u0094\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u0088\u00012\u00020\u0001:\u0004\u0087\u0001\u0088\u0001BA\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J \u0010/\u001a\u00020\u00142\u0006\u00100\u001a\u00020\u001a2\b\u00101\u001a\u0004\u0018\u000102H\u0086@¢\u0006\u0002\u00103J \u00104\u001a\u00020\u00142\u0006\u00100\u001a\u00020\u001a2\b\u00101\u001a\u0004\u0018\u000102H\u0086@¢\u0006\u0002\u00103J \u00105\u001a\u00020\u00142\u0006\u00100\u001a\u00020\u001a2\b\u00101\u001a\u0004\u0018\u000102H\u0086@¢\u0006\u0002\u00103J(\u00106\u001a\u00020\u00142\u0006\u00100\u001a\u00020\u001a2\u0006\u00107\u001a\u0002082\b\u00101\u001a\u0004\u0018\u000102H\u0082@¢\u0006\u0002\u00109J\u0018\u0010:\u001a\u00020\u00142\u0006\u00100\u001a\u00020\u001a2\b\b\u0002\u0010;\u001a\u00020<J\u0018\u0010=\u001a\u00020#2\b\b\u0002\u0010>\u001a\u00020<H\u0086@¢\u0006\u0002\u0010?J\u0016\u0010@\u001a\u00020\u00142\u0006\u00100\u001a\u00020\u001aH\u0086@¢\u0006\u0002\u0010AJ\u000e\u0010B\u001a\u00020\u0014H\u0086@¢\u0006\u0002\u0010CJ\u0006\u0010D\u001a\u00020<J\u0006\u0010E\u001a\u00020<J*\u0010F\u001a\u00020G2\u0006\u0010H\u001a\u00020I2\n\b\u0002\u0010J\u001a\u0004\u0018\u00010)2\u0006\u0010K\u001a\u00020GH\u0086@¢\u0006\u0002\u0010LJ'\u0010M\u001a\u00020\u00142\u0006\u00100\u001a\u00020\u001a2\u0006\u0010N\u001a\u00020#2\n\b\u0002\u0010O\u001a\u0004\u0018\u00010)¢\u0006\u0002\u0010PJ(\u0010Q\u001a\u00020\u00142\f\u0010R\u001a\b\u0012\u0004\u0012\u00020#0S2\n\b\u0002\u0010O\u001a\u0004\u0018\u00010)H\u0082@¢\u0006\u0002\u0010TJ\u0014\u0010U\u001a\b\u0012\u0004\u0012\u00020#0V2\u0006\u00100\u001a\u00020\u001aJ\u0012\u0010W\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0S0VJ\u0010\u0010X\u001a\u0004\u0018\u00010#2\u0006\u00100\u001a\u00020\u001aJ\u0014\u0010Y\u001a\b\u0012\u0004\u0012\u00020#0V2\u0006\u00100\u001a\u00020\u001aJ\u0012\u0010Z\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0S0VJ\f\u0010_\u001a\b\u0012\u0004\u0012\u00020)0VJ\u0014\u0010`\u001a\b\u0012\u0004\u0012\u00020a0V2\u0006\u0010H\u001a\u00020IJ\u000e\u0010b\u001a\u00020c2\u0006\u00100\u001a\u00020\u001aJ\u0012\u0010d\u001a\b\u0012\u0004\u0012\u00020e0V*\u00020fH\u0002J\u0012\u0010g\u001a\b\u0012\u0004\u0012\u00020h0V*\u00020fH\u0002J\u0012\u0010i\u001a\b\u0012\u0004\u0012\u00020j0V*\u00020fH\u0002J\u0016\u0010k\u001a\u00020\u00142\u0006\u0010H\u001a\u00020IH\u0086@¢\u0006\u0002\u0010lJ\u0016\u0010m\u001a\u00020\u00142\u0006\u0010H\u001a\u00020IH\u0086@¢\u0006\u0002\u0010lJ\u001e\u0010n\u001a\u00020\u00142\u0006\u0010o\u001a\u00020\u001a2\u0006\u0010H\u001a\u00020I2\u0006\u0010p\u001a\u00020IJ\u001e\u0010q\u001a\u00020\u00142\u0006\u0010o\u001a\u00020\u001a2\u0006\u0010H\u001a\u00020I2\u0006\u0010r\u001a\u00020IJ2\u0010s\u001a\u00020\u00142\u0006\u0010H\u001a\u00020I2\u0006\u0010t\u001a\u00020u2\u0018\u0010v\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020I\u0012\u0004\u0012\u00020y0x0wH\u0002J$\u0010z\u001a\b\u0012\u0004\u0012\u00020|0{2\u0006\u0010o\u001a\u00020\u001a2\u0006\u0010H\u001a\u00020I2\u0006\u0010}\u001a\u00020~J$\u0010\u007f\u001a\b\u0012\u0004\u0012\u00020|0{2\u0006\u0010o\u001a\u00020\u001a2\u0006\u0010H\u001a\u00020I2\u0006\u0010r\u001a\u00020IJB\u0010\u0080\u0001\u001a\b\u0012\u0004\u0012\u00020|0{2\u0006\u0010H\u001a\u00020I2\u0007\u0010t\u001a\u00030\u0081\u00012\u0006\u0010}\u001a\u00020~2\u0018\u0010v\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020I\u0012\u0004\u0012\u00020y0x0wH\u0002J,\u0010\u0082\u0001\u001a\u00020\u00142\u0007\u0010\u0083\u0001\u001a\u00020I2\u0018\u0010v\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020I\u0012\u0004\u0012\u00020y0x0wH\u0002J\u0013\u0010\u0084\u0001\u001a\u00020\u00142\b\u0010\u0085\u0001\u001a\u00030\u0086\u0001H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00150\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u0018\u001a\u0014\u0012\u0004\u0012\u00020\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u001b0\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u001c\u001a\u0014\u0012\u0004\u0012\u00020\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u001b0\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u001e\u001a\u0014\u0012\u0004\u0012\u00020\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u001b0\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R-\u0010 \u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020#0\"0!8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b$\u0010%R-\u0010(\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020)0\"0!8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b+\u0010'\u001a\u0004\b*\u0010%R#\u0010,\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010)0!8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b.\u0010'\u001a\u0004\b-\u0010%R \u0010[\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0S0\\X\u0082\u0004¢\u0006\b\n\u0000\u0012\u0004\b]\u0010^¨\u0006\u0089\u0001"}, m3636d2 = {"Lcom/robinhood/store/supportchat/SupportChatStore;", "Lcom/robinhood/store/Store;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "supportChatApi", "Lcom/robinhood/android/api/supportchat/SupportChatApi;", "twilioManager", "Lcom/robinhood/android/lib/conversations/TwilioManager;", "docUploadApi", "Lcom/robinhood/android/api/docupload/DocUploadApi;", "chatCache", "Lcom/robinhood/shared/store/chat/common/ChatCache;", "bitmapStore", "Lcom/robinhood/android/bitmap/BitmapStore;", "installation", "Lcom/robinhood/prefs/Installation;", "<init>", "(Lcom/robinhood/store/StoreBundle;Lcom/robinhood/android/api/supportchat/SupportChatApi;Lcom/robinhood/android/lib/conversations/TwilioManager;Lcom/robinhood/android/api/docupload/DocUploadApi;Lcom/robinhood/shared/store/chat/common/ChatCache;Lcom/robinhood/android/bitmap/BitmapStore;Lcom/robinhood/prefs/Installation;)V", "postSupportChatEndpoint", "Lcom/robinhood/android/moria/network/PostEndpoint;", "", "Lcom/robinhood/models/api/pathfinder/messaging/ApiSupportChat;", "postSupportChatChatbotEndpoint", "Lcom/robinhood/models/api/pathfinder/messaging/CreateSupportChatRequest;", "getSupportChatEndpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "Ljava/util/UUID;", "Lretrofit2/Response;", "getSupportChatListEndpoint", "Lcom/robinhood/models/api/pathfinder/messaging/ApiSupportChatList;", "supportChatPostEndpoint", "Lcom/robinhood/store/supportchat/SupportChatStore$SupportChatPostParam;", "supportChatsFlow", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lkotlinx/collections/immutable/ImmutableMap;", "Lcom/robinhood/models/ui/pathfinder/messaging/SupportChat;", "getSupportChatsFlow", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "supportChatsFlow$delegate", "Lkotlin/Lazy;", "supportChatPollingIntervalsFlow", "", "getSupportChatPollingIntervalsFlow", "supportChatPollingIntervalsFlow$delegate", "supportChatListPollingIntervalFlow", "getSupportChatListPollingIntervalFlow", "supportChatListPollingIntervalFlow$delegate", "escalateToAgentChat", "inquiryId", "chatType", "Lcom/robinhood/models/api/pathfinder/messaging/ChatCurrentType;", "(Ljava/util/UUID;Lcom/robinhood/models/api/pathfinder/messaging/ChatCurrentType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "endSupportChat", "resumeSupportChat", "updateSupportChat", "operationType", "Lcom/robinhood/models/api/pathfinder/messaging/SupportChatOperationType;", "(Ljava/util/UUID;Lcom/robinhood/models/api/pathfinder/messaging/SupportChatOperationType;Lcom/robinhood/models/api/pathfinder/messaging/ChatCurrentType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "refreshSupportChat", "force", "", "createSupportChat", "isChatbot", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchSupportChat", "(Ljava/util/UUID;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "refreshSupportChatList", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "hasAnySupportChat", "hasAnyActiveSupportChat", "fetchMessagesBefore", "", "conversationSid", "", ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_INDEX, "count", "(Ljava/lang/String;Ljava/lang/Long;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveSupportChat", "supportChat", "pollingIntervalMs", "(Ljava/util/UUID;Lcom/robinhood/models/ui/pathfinder/messaging/SupportChat;Ljava/lang/Long;)V", "saveSupportChats", "chats", "", "(Ljava/util/List;Ljava/lang/Long;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "streamSupportChat", "Lkotlinx/coroutines/flow/Flow;", "streamSupportChatList", "getSupportChat", "pollSupportChat", "pollSupportChatList", "pollSupportChatListStream", "Lkotlinx/coroutines/flow/SharedFlow;", "getPollSupportChatListStream$annotations", "()V", "streamUnreadMessageCount", "streamAgentChatSession", "Lcom/robinhood/store/supportchat/AgentChatSession;", "markSupportChatAsShown", "Lkotlinx/coroutines/Job;", "streamSocketMessages", "Lcom/robinhood/store/supportchat/AgentChatEvent$Message;", "Lcom/robinhood/android/lib/conversations/ConversationHelper;", "streamTypingStatus", "Lcom/robinhood/store/supportchat/AgentChatEvent$Typing;", "streamLastAgentReadMessageMetadata", "Lcom/robinhood/store/supportchat/AgentChatEvent$LastAgentReadMessageData;", "signalTyping", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setAllMessagesRead", "sendTextMessage", "id", "inputText", "resendTextMessage", "localMessageSid", "sendTextMessageInternal", "unsentInput", "Lcom/robinhood/shared/models/chat/common/UnsentInput$Text;", "cachedUnsentInputItem", "Lcom/robinhood/shared/store/chat/common/ChatCache$Item;", "", "Lcom/robinhood/shared/models/chat/common/UnsentInput;", "sendImageMessage", "Lio/reactivex/Single;", "Lcom/robinhood/models/supportchat/db/SocketChatMessage;", "bitmap", "Landroid/graphics/Bitmap;", "resendImageMessage", "sendImageMessageInternal", "Lcom/robinhood/shared/models/chat/common/UnsentInput$Image;", "startMessageSendingTimer", "localSid", "deleteUnsentImage", "uri", "Landroid/net/Uri;", "SupportChatPostParam", "Companion", "lib-store-support-chat_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class SupportChatStore extends Store {
    private static final long SUPPORT_CHAT_LIST_POLL_INTERVAL_S = 30;
    private static final long SUPPORT_CHAT_POLL_INTERVAL_MS = 15000;
    private final BitmapStore bitmapStore;
    private final ChatCache chatCache;
    private final DocUploadApi docUploadApi;
    private final Endpoint<UUID, Response<ApiSupportChat>> getSupportChatEndpoint;
    private final Endpoint<Unit, Response<ApiSupportChatList>> getSupportChatListEndpoint;
    private final Installation installation;
    private final SharedFlow<List<SupportChat>> pollSupportChatListStream;
    private final PostEndpoint<CreateSupportChatRequest, ApiSupportChat> postSupportChatChatbotEndpoint;
    private final PostEndpoint<Unit, ApiSupportChat> postSupportChatEndpoint;
    private final SupportChatApi supportChatApi;

    /* renamed from: supportChatListPollingIntervalFlow$delegate, reason: from kotlin metadata */
    private final Lazy supportChatListPollingIntervalFlow;

    /* renamed from: supportChatPollingIntervalsFlow$delegate, reason: from kotlin metadata */
    private final Lazy supportChatPollingIntervalsFlow;
    private final PostEndpoint<SupportChatPostParam, Response<ApiSupportChat>> supportChatPostEndpoint;

    /* renamed from: supportChatsFlow$delegate, reason: from kotlin metadata */
    private final Lazy supportChatsFlow;
    private final TwilioManager twilioManager;

    /* compiled from: SupportChatStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ChatCurrentType.values().length];
            try {
                iArr[ChatCurrentType.CHATBOT_CHAT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ChatCurrentType.AGENT_CHAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: SupportChatStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.store.supportchat.SupportChatStore", m3645f = "SupportChatStore.kt", m3646l = {EnumC7081g.SDK_ASSET_CASH_ICON_CIRCLE_VALUE, EnumC7081g.SDK_ASSET_ICON_INLINE_LIGHTNING_DARK_APPEARANCE_VALUE}, m3647m = "createSupportChat")
    /* renamed from: com.robinhood.store.supportchat.SupportChatStore$createSupportChat$1 */
    static final class C415941 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C415941(Continuation<? super C415941> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SupportChatStore.this.createSupportChat(false, this);
        }
    }

    /* compiled from: SupportChatStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.store.supportchat.SupportChatStore", m3645f = "SupportChatStore.kt", m3646l = {355, 356}, m3647m = "fetchMessagesBefore")
    /* renamed from: com.robinhood.store.supportchat.SupportChatStore$fetchMessagesBefore$1 */
    static final class C415951 extends ContinuationImpl {
        int I$0;
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C415951(Continuation<? super C415951> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SupportChatStore.this.fetchMessagesBefore(null, null, 0, this);
        }
    }

    /* compiled from: SupportChatStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.store.supportchat.SupportChatStore", m3645f = "SupportChatStore.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_CONSUMER_REPORT_DARK_APPEARANCE_VALUE}, m3647m = "fetchSupportChat")
    /* renamed from: com.robinhood.store.supportchat.SupportChatStore$fetchSupportChat$1 */
    static final class C415961 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C415961(Continuation<? super C415961> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SupportChatStore.this.fetchSupportChat(null, this);
        }
    }

    /* compiled from: SupportChatStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.store.supportchat.SupportChatStore", m3645f = "SupportChatStore.kt", m3646l = {332}, m3647m = "refreshSupportChatList")
    /* renamed from: com.robinhood.store.supportchat.SupportChatStore$refreshSupportChatList$1 */
    static final class C415981 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C415981(Continuation<? super C415981> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SupportChatStore.this.refreshSupportChatList(this);
        }
    }

    /* compiled from: SupportChatStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.store.supportchat.SupportChatStore", m3645f = "SupportChatStore.kt", m3646l = {390, 393}, m3647m = "saveSupportChats")
    /* renamed from: com.robinhood.store.supportchat.SupportChatStore$saveSupportChats$1 */
    static final class C415991 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C415991(Continuation<? super C415991> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SupportChatStore.this.saveSupportChats(null, null, this);
        }
    }

    /* compiled from: SupportChatStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.store.supportchat.SupportChatStore", m3645f = "SupportChatStore.kt", m3646l = {614, 846}, m3647m = "setAllMessagesRead")
    /* renamed from: com.robinhood.store.supportchat.SupportChatStore$setAllMessagesRead$1 */
    static final class C416051 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C416051(Continuation<? super C416051> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SupportChatStore.this.setAllMessagesRead(null, this);
        }
    }

    /* compiled from: SupportChatStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.store.supportchat.SupportChatStore", m3645f = "SupportChatStore.kt", m3646l = {608}, m3647m = "signalTyping")
    /* renamed from: com.robinhood.store.supportchat.SupportChatStore$signalTyping$1 */
    static final class C416061 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C416061(Continuation<? super C416061> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SupportChatStore.this.signalTyping(null, this);
        }
    }

    /* compiled from: SupportChatStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.store.supportchat.SupportChatStore", m3645f = "SupportChatStore.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_SEND_DEPOSIT_AUTHORIZATION_HEADER_VALUE}, m3647m = "updateSupportChat")
    /* renamed from: com.robinhood.store.supportchat.SupportChatStore$updateSupportChat$1 */
    static final class C416091 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C416091(Continuation<? super C416091> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SupportChatStore.this.updateSupportChat(null, null, null, this);
        }
    }

    private static /* synthetic */ void getPollSupportChatListStream$annotations() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SupportChatStore(StoreBundle storeBundle, SupportChatApi supportChatApi, TwilioManager twilioManager, DocUploadApi docUploadApi, ChatCache chatCache, BitmapStore bitmapStore, Installation installation) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        Intrinsics.checkNotNullParameter(supportChatApi, "supportChatApi");
        Intrinsics.checkNotNullParameter(twilioManager, "twilioManager");
        Intrinsics.checkNotNullParameter(docUploadApi, "docUploadApi");
        Intrinsics.checkNotNullParameter(chatCache, "chatCache");
        Intrinsics.checkNotNullParameter(bitmapStore, "bitmapStore");
        Intrinsics.checkNotNullParameter(installation, "installation");
        this.supportChatApi = supportChatApi;
        this.twilioManager = twilioManager;
        this.docUploadApi = docUploadApi;
        this.chatCache = chatCache;
        this.bitmapStore = bitmapStore;
        this.installation = installation;
        PostEndpoint.Companion companion = PostEndpoint.INSTANCE;
        this.postSupportChatEndpoint = companion.create(new SupportChatStore$postSupportChatEndpoint$1(this, null), new SupportChatStore$postSupportChatEndpoint$2(this, null));
        this.postSupportChatChatbotEndpoint = companion.create(new SupportChatStore$postSupportChatChatbotEndpoint$1(this, null), new SupportChatStore$postSupportChatChatbotEndpoint$2(this, null));
        Endpoint.Companion companion2 = Endpoint.INSTANCE;
        this.getSupportChatEndpoint = Endpoint.Companion.createWithParams$default(companion2, new SupportChatStore$getSupportChatEndpoint$1(this, null), getLogoutKillswitch(), new SupportChatStore$getSupportChatEndpoint$2(this, null), storeBundle.getClock(), null, 16, null);
        this.getSupportChatListEndpoint = Endpoint.Companion.createWithParams$default(companion2, new SupportChatStore$getSupportChatListEndpoint$1(this, null), getLogoutKillswitch(), new SupportChatStore$getSupportChatListEndpoint$2(this, null), storeBundle.getClock(), null, 16, null);
        this.supportChatPostEndpoint = companion.createWithParams(new SupportChatStore$supportChatPostEndpoint$1(this, null), new SupportChatStore$supportChatPostEndpoint$2(this, null));
        this.supportChatsFlow = LazyKt.lazy(new Function0() { // from class: com.robinhood.store.supportchat.SupportChatStore$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SupportChatStore.supportChatsFlow_delegate$lambda$0();
            }
        });
        this.supportChatPollingIntervalsFlow = LazyKt.lazy(new Function0() { // from class: com.robinhood.store.supportchat.SupportChatStore$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SupportChatStore.supportChatPollingIntervalsFlow_delegate$lambda$1();
            }
        });
        this.supportChatListPollingIntervalFlow = LazyKt.lazy(new Function0() { // from class: com.robinhood.store.supportchat.SupportChatStore$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SupportChatStore.supportChatListPollingIntervalFlow_delegate$lambda$2();
            }
        });
        this.pollSupportChatListStream = FlowKt.shareIn(FlowKt.transformLatest(getSupportChatListPollingIntervalFlow(), new SupportChatStore$special$$inlined$flatMapLatest$1(null, this)), getStoreScope(), SharingStarted.INSTANCE.WhileSubscribed(3000L, 0L), 1);
    }

    private final StateFlow2<ImmutableMap<UUID, SupportChat>> getSupportChatsFlow() {
        return (StateFlow2) this.supportChatsFlow.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final StateFlow2 supportChatsFlow_delegate$lambda$0() {
        return StateFlow4.MutableStateFlow(extensions2.persistentMapOf());
    }

    private final StateFlow2<ImmutableMap<UUID, Long>> getSupportChatPollingIntervalsFlow() {
        return (StateFlow2) this.supportChatPollingIntervalsFlow.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final StateFlow2 supportChatPollingIntervalsFlow_delegate$lambda$1() {
        return StateFlow4.MutableStateFlow(extensions2.persistentMapOf());
    }

    private final StateFlow2<Long> getSupportChatListPollingIntervalFlow() {
        return (StateFlow2) this.supportChatListPollingIntervalFlow.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final StateFlow2 supportChatListPollingIntervalFlow_delegate$lambda$2() {
        return StateFlow4.MutableStateFlow(null);
    }

    public final Object escalateToAgentChat(UUID uuid, ChatCurrentType chatCurrentType, Continuation<? super Unit> continuation) {
        Object objUpdateSupportChat = updateSupportChat(uuid, SupportChatOperationType.ESCALATE, chatCurrentType, continuation);
        return objUpdateSupportChat == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objUpdateSupportChat : Unit.INSTANCE;
    }

    public final Object endSupportChat(UUID uuid, ChatCurrentType chatCurrentType, Continuation<? super Unit> continuation) {
        Object objUpdateSupportChat = updateSupportChat(uuid, SupportChatOperationType.END, chatCurrentType, continuation);
        return objUpdateSupportChat == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objUpdateSupportChat : Unit.INSTANCE;
    }

    public final Object resumeSupportChat(UUID uuid, ChatCurrentType chatCurrentType, Continuation<? super Unit> continuation) {
        Object objUpdateSupportChat = updateSupportChat(uuid, SupportChatOperationType.REQUEUE, chatCurrentType, continuation);
        return objUpdateSupportChat == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objUpdateSupportChat : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object updateSupportChat(UUID uuid, SupportChatOperationType supportChatOperationType, ChatCurrentType chatCurrentType, Continuation<? super Unit> continuation) {
        C416091 c416091;
        if (continuation instanceof C416091) {
            c416091 = (C416091) continuation;
            int i = c416091.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c416091.label = i - Integer.MIN_VALUE;
            } else {
                c416091 = new C416091(continuation);
            }
        }
        C416091 c4160912 = c416091;
        Object objPost$default = c4160912.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c4160912.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objPost$default);
                PostEndpoint<SupportChatPostParam, Response<ApiSupportChat>> postEndpoint = this.supportChatPostEndpoint;
                SupportChatPostParam supportChatPostParam = new SupportChatPostParam(uuid, supportChatOperationType);
                c4160912.L$0 = supportChatOperationType;
                c4160912.L$1 = chatCurrentType;
                c4160912.label = 1;
                objPost$default = PostEndpoint.DefaultImpls.post$default(postEndpoint, supportChatPostParam, null, c4160912, 2, null);
                if (objPost$default == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                chatCurrentType = (ChatCurrentType) c4160912.L$1;
                supportChatOperationType = (SupportChatOperationType) c4160912.L$0;
                ResultKt.throwOnFailure(objPost$default);
            }
            Response response = (Response) objPost$default;
            if (!response.isSuccessful()) {
                throw new HttpException(response);
            }
            return Unit.INSTANCE;
        } catch (Throwable th) {
            if (Throwables.isNetworkRelated(th)) {
                ErrorResponse errorResponseExtractErrorResponse = NetworkThrowables.extractErrorResponse(th);
                GenericErrorResponse genericErrorResponse = errorResponseExtractErrorResponse instanceof GenericErrorResponse ? (GenericErrorResponse) errorResponseExtractErrorResponse : null;
                CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, new SupportChatNetworkExceptions("Updating SupportChat with operation \"" + supportChatOperationType.getServerValue() + "\" has failed. Status: " + Throwables.getHttpStatusCode(th) + ", Message: " + (genericErrorResponse != null ? genericErrorResponse.getErrorMessage() : null) + ", Type: " + (chatCurrentType != null ? chatCurrentType.getServerValue() : null)), false, null, 4, null);
                throw th;
            }
            throw th;
        }
    }

    public static /* synthetic */ void refreshSupportChat$default(SupportChatStore supportChatStore, UUID uuid, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        supportChatStore.refreshSupportChat(uuid, z);
    }

    public final void refreshSupportChat(UUID inquiryId, boolean force) {
        Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
        Endpoint.DefaultImpls.refresh$default(this.getSupportChatEndpoint, inquiryId, force, null, 4, null);
    }

    public static /* synthetic */ Object createSupportChat$default(SupportChatStore supportChatStore, boolean z, Continuation continuation, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return supportChatStore.createSupportChat(z, continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x004f, code lost:
    
        if (r9 == r0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0067, code lost:
    
        if (r9 == r0) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object createSupportChat(boolean z, Continuation<? super SupportChat> continuation) {
        C415941 c415941;
        if (continuation instanceof C415941) {
            c415941 = (C415941) continuation;
            int i = c415941.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c415941.label = i - Integer.MIN_VALUE;
            } else {
                c415941 = new C415941(continuation);
            }
        }
        C415941 c4159412 = c415941;
        Object objPost$default = c4159412.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c4159412.label;
        if (i2 != 0) {
            if (i2 == 1) {
                ResultKt.throwOnFailure(objPost$default);
                return SupportChat2.toUiModel((ApiSupportChat) objPost$default);
            }
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objPost$default);
            return SupportChat2.toUiModel((ApiSupportChat) objPost$default);
        }
        ResultKt.throwOnFailure(objPost$default);
        if (z) {
            PostEndpoint<CreateSupportChatRequest, ApiSupportChat> postEndpoint = this.postSupportChatChatbotEndpoint;
            CreateSupportChatRequest createSupportChatRequest = new CreateSupportChatRequest(true);
            c4159412.label = 1;
            objPost$default = PostEndpoint.DefaultImpls.post$default(postEndpoint, createSupportChatRequest, null, c4159412, 2, null);
        } else {
            PostEndpoint<Unit, ApiSupportChat> postEndpoint2 = this.postSupportChatEndpoint;
            Unit unit = Unit.INSTANCE;
            c4159412.label = 2;
            objPost$default = PostEndpoint.DefaultImpls.post$default(postEndpoint2, unit, null, c4159412, 2, null);
        }
        return coroutine_suspended;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object fetchSupportChat(UUID uuid, Continuation<? super Unit> continuation) {
        C415961 c415961;
        if (continuation instanceof C415961) {
            c415961 = (C415961) continuation;
            int i = c415961.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c415961.label = i - Integer.MIN_VALUE;
            } else {
                c415961 = new C415961(continuation);
            }
        }
        C415961 c4159612 = c415961;
        Object objForceFetch$default = c4159612.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c4159612.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objForceFetch$default);
            Endpoint<UUID, Response<ApiSupportChat>> endpoint = this.getSupportChatEndpoint;
            c4159612.label = 1;
            objForceFetch$default = Endpoint.DefaultImpls.forceFetch$default(endpoint, uuid, null, c4159612, 2, null);
            if (objForceFetch$default == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objForceFetch$default);
        }
        Response response = (Response) objForceFetch$default;
        if (!response.isSuccessful()) {
            throw new HttpException(response);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object refreshSupportChatList(Continuation<? super Unit> continuation) {
        C415981 c415981;
        if (continuation instanceof C415981) {
            c415981 = (C415981) continuation;
            int i = c415981.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c415981.label = i - Integer.MIN_VALUE;
            } else {
                c415981 = new C415981(continuation);
            }
        }
        C415981 c4159812 = c415981;
        Object objForceFetch$default = c4159812.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c4159812.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objForceFetch$default);
            Endpoint<Unit, Response<ApiSupportChatList>> endpoint = this.getSupportChatListEndpoint;
            Unit unit = Unit.INSTANCE;
            c4159812.label = 1;
            objForceFetch$default = Endpoint.DefaultImpls.forceFetch$default(endpoint, unit, null, c4159812, 2, null);
            if (objForceFetch$default == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objForceFetch$default);
        }
        Response response = (Response) objForceFetch$default;
        if (!response.isSuccessful()) {
            throw new HttpException(response);
        }
        return Unit.INSTANCE;
    }

    public final boolean hasAnySupportChat() {
        return !getSupportChatsFlow().getValue().isEmpty();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean hasAnyActiveSupportChat() {
        boolean zBooleanValue;
        ImmutableMap<UUID, SupportChat> value = getSupportChatsFlow().getValue();
        if (value.isEmpty()) {
            return false;
        }
        Iterator<Map.Entry<UUID, SupportChat>> it = value.entrySet().iterator();
        while (it.hasNext()) {
            SupportChat value2 = it.next().getValue();
            int i = WhenMappings.$EnumSwitchMapping$0[value2.getCurrentType().ordinal()];
            if (i == 1) {
                ChatbotChat chatbotChat = value2.getChatbotChat();
                if (chatbotChat == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                Boolean canBeEscalated = chatbotChat.getCanBeEscalated();
                if (canBeEscalated != null) {
                    zBooleanValue = canBeEscalated.booleanValue();
                }
            } else if (i != 2) {
                zBooleanValue = false;
            } else {
                AgentChat agentChat = value2.getAgentChat();
                if (agentChat == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                zBooleanValue = agentChat.isActive();
            }
            if (zBooleanValue) {
                return true;
            }
        }
        return false;
    }

    public static /* synthetic */ Object fetchMessagesBefore$default(SupportChatStore supportChatStore, String str, Long l, int i, Continuation continuation, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            l = null;
        }
        return supportChatStore.fetchMessagesBefore(str, l, i, continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0060, code lost:
    
        if (r9 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object fetchMessagesBefore(String str, Long l, int i, Continuation<? super Integer> continuation) {
        C415951 c415951;
        if (continuation instanceof C415951) {
            c415951 = (C415951) continuation;
            int i2 = c415951.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c415951.label = i2 - Integer.MIN_VALUE;
            } else {
                c415951 = new C415951(continuation);
            }
        }
        Object objFirst = c415951.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = c415951.label;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objFirst);
            Flow<ConversationHelper> conversationHelperFlow = this.twilioManager.getConversationHelperFlow(str);
            c415951.L$0 = l;
            c415951.I$0 = i;
            c415951.label = 1;
            objFirst = FlowKt.first(conversationHelperFlow, c415951);
            if (objFirst != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i3 != 1) {
            if (i3 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objFirst);
            return boxing.boxInt(((List) objFirst).size());
        }
        i = c415951.I$0;
        l = (Long) c415951.L$0;
        ResultKt.throwOnFailure(objFirst);
        c415951.L$0 = null;
        c415951.label = 2;
        objFirst = ((ConversationHelper) objFirst).getMessagesBefore(l, i, c415951);
    }

    public static /* synthetic */ void saveSupportChat$default(SupportChatStore supportChatStore, UUID uuid, SupportChat supportChat, Long l, int i, Object obj) {
        if ((i & 4) != 0) {
            l = null;
        }
        supportChatStore.saveSupportChat(uuid, supportChat, l);
    }

    public final void saveSupportChat(UUID inquiryId, SupportChat supportChat, Long pollingIntervalMs) {
        ImmutableMap<UUID, SupportChat> value;
        ImmutableMap<UUID, Long> value2;
        Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
        Intrinsics.checkNotNullParameter(supportChat, "supportChat");
        StateFlow2<ImmutableMap<UUID, SupportChat>> supportChatsFlow = getSupportChatsFlow();
        do {
            value = supportChatsFlow.getValue();
        } while (!supportChatsFlow.compareAndSet(value, extensions2.toPersistentMap(MapsKt.plus(MapsKt.toMutableMap(value), Tuples4.m3642to(inquiryId, supportChat)))));
        if (pollingIntervalMs != null) {
            long jLongValue = pollingIntervalMs.longValue();
            StateFlow2<ImmutableMap<UUID, Long>> supportChatPollingIntervalsFlow = getSupportChatPollingIntervalsFlow();
            do {
                value2 = supportChatPollingIntervalsFlow.getValue();
            } while (!supportChatPollingIntervalsFlow.compareAndSet(value2, extensions2.toPersistentMap(MapsKt.plus(MapsKt.toMutableMap(value2), Tuples4.m3642to(inquiryId, Long.valueOf(jLongValue))))));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x009a, code lost:
    
        if (r9.emit(r7, r0) == r1) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object saveSupportChats(List<SupportChat> list, Long l, Continuation<? super Unit> continuation) {
        C415991 c415991;
        if (continuation instanceof C415991) {
            c415991 = (C415991) continuation;
            int i = c415991.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c415991.label = i - Integer.MIN_VALUE;
            } else {
                c415991 = new C415991(continuation);
            }
        }
        Object obj = c415991.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c415991.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            List<SupportChat> list2 = list;
            LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(list2, 10)), 16));
            for (Object obj2 : list2) {
                linkedHashMap.put(((SupportChat) obj2).getInquiryId(), obj2);
            }
            ImmutableMap3 persistentMap = extensions2.toPersistentMap(linkedHashMap);
            StateFlow2<ImmutableMap<UUID, SupportChat>> supportChatsFlow = getSupportChatsFlow();
            c415991.L$0 = l;
            c415991.label = 1;
            if (supportChatsFlow.emit(persistentMap, c415991) != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return Unit.INSTANCE;
        }
        l = (Long) c415991.L$0;
        ResultKt.throwOnFailure(obj);
        if (l != null) {
            long jLongValue = l.longValue();
            StateFlow2<Long> supportChatListPollingIntervalFlow = getSupportChatListPollingIntervalFlow();
            Long lBoxLong = boxing.boxLong(jLongValue);
            c415991.L$0 = null;
            c415991.label = 2;
        }
        return Unit.INSTANCE;
    }

    static /* synthetic */ Object saveSupportChats$default(SupportChatStore supportChatStore, List list, Long l, Continuation continuation, int i, Object obj) {
        if ((i & 2) != 0) {
            l = null;
        }
        return supportChatStore.saveSupportChats(list, l, continuation);
    }

    public final Flow<SupportChat> streamSupportChat(final UUID inquiryId) {
        Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
        final StateFlow2<ImmutableMap<UUID, SupportChat>> supportChatsFlow = getSupportChatsFlow();
        return FlowKt.distinctUntilChanged(new Flow<SupportChat>() { // from class: com.robinhood.store.supportchat.SupportChatStore$streamSupportChat$$inlined$mapNotNull$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super SupportChat> flowCollector, Continuation continuation) {
                Object objCollect = supportChatsFlow.collect(new C415872(flowCollector, inquiryId), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.store.supportchat.SupportChatStore$streamSupportChat$$inlined$mapNotNull$1$2 */
            public static final class C415872<T> implements FlowCollector {
                final /* synthetic */ UUID $inquiryId$inlined;
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.store.supportchat.SupportChatStore$streamSupportChat$$inlined$mapNotNull$1$2", m3645f = "SupportChatStore.kt", m3646l = {52}, m3647m = "emit")
                /* renamed from: com.robinhood.store.supportchat.SupportChatStore$streamSupportChat$$inlined$mapNotNull$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return C415872.this.emit(null, this);
                    }
                }

                public C415872(FlowCollector flowCollector, UUID uuid) {
                    this.$this_unsafeFlow = flowCollector;
                    this.$inquiryId$inlined = uuid;
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
                        V v = ((ImmutableMap) obj).get(this.$inquiryId$inlined);
                        if (v != 0) {
                            anonymousClass1.label = 1;
                            if (flowCollector.emit(v, anonymousClass1) == coroutine_suspended) {
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
        });
    }

    public final Flow<List<SupportChat>> streamSupportChatList() {
        final StateFlow2<ImmutableMap<UUID, SupportChat>> supportChatsFlow = getSupportChatsFlow();
        return new Flow<List<? extends SupportChat>>() { // from class: com.robinhood.store.supportchat.SupportChatStore$streamSupportChatList$$inlined$map$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super List<? extends SupportChat>> flowCollector, Continuation continuation) {
                Object objCollect = supportChatsFlow.collect(new C415882(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.store.supportchat.SupportChatStore$streamSupportChatList$$inlined$map$1$2 */
            public static final class C415882<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.store.supportchat.SupportChatStore$streamSupportChatList$$inlined$map$1$2", m3645f = "SupportChatStore.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.store.supportchat.SupportChatStore$streamSupportChatList$$inlined$map$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return C415882.this.emit(null, this);
                    }
                }

                public C415882(FlowCollector flowCollector) {
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
                        List list = CollectionsKt.toList(CollectionsKt.sortedWith(((ImmutableMap) obj).values(), 
                        /*  JADX ERROR: Method code generation error
                            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0049: INVOKE (r5v6 'list' java.util.List) = 
                              (wrap:java.util.List:0x0043: INVOKE 
                              (wrap:java.lang.Iterable:0x0038: INVOKE 
                              (wrap:kotlinx.collections.immutable.ImmutableMap:0x0036: CHECK_CAST (kotlinx.collections.immutable.ImmutableMap) (r5v0 'obj' java.lang.Object))
                             INTERFACE call: java.util.Map.values():java.util.Collection A[MD:():java.util.Collection<V> (c), WRAPPED] (LINE:51))
                              (wrap:java.util.Comparator:0x0040: CONSTRUCTOR  A[MD:():void (m), WRAPPED] (LINE:1068) call: com.robinhood.store.supportchat.SupportChatStore$streamSupportChatList$lambda$11$$inlined$sortedByDescending$1.<init>():void type: CONSTRUCTOR)
                             STATIC call: kotlin.collections.CollectionsKt.sortedWith(java.lang.Iterable, java.util.Comparator):java.util.List A[MD:<T>:(java.lang.Iterable<? extends T>, java.util.Comparator<? super T>):java.util.List<T> (m), WRAPPED] (LINE:1068))
                             STATIC call: kotlin.collections.CollectionsKt.toList(java.lang.Iterable):java.util.List A[DECLARE_VAR, MD:<T>:(java.lang.Iterable<? extends T>):java.util.List<T> (m)] (LINE:54) in method: com.robinhood.store.supportchat.SupportChatStore$streamSupportChatList$$inlined$map$1.2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object, file: classes12.dex
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                            	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                            	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:298)
                            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:277)
                            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:410)
                            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
                            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.robinhood.store.supportchat.SupportChatStore$streamSupportChatList$lambda$11$$inlined$sortedByDescending$1, state: NOT_LOADED
                            	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:306)
                            	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:807)
                            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:145)
                            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:121)
                            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
                            	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:1143)
                            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:910)
                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:422)
                            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:145)
                            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:121)
                            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
                            	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:1143)
                            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:910)
                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:422)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
                            	... 21 more
                            */
                        /*
                            this = this;
                            boolean r0 = r6 instanceof com.robinhood.store.supportchat.SupportChatStore$streamSupportChatList$$inlined$map$1.C415882.AnonymousClass1
                            if (r0 == 0) goto L13
                            r0 = r6
                            com.robinhood.store.supportchat.SupportChatStore$streamSupportChatList$$inlined$map$1$2$1 r0 = (com.robinhood.store.supportchat.SupportChatStore$streamSupportChatList$$inlined$map$1.C415882.AnonymousClass1) r0
                            int r1 = r0.label
                            r2 = -2147483648(0xffffffff80000000, float:-0.0)
                            r3 = r1 & r2
                            if (r3 == 0) goto L13
                            int r1 = r1 - r2
                            r0.label = r1
                            goto L18
                        L13:
                            com.robinhood.store.supportchat.SupportChatStore$streamSupportChatList$$inlined$map$1$2$1 r0 = new com.robinhood.store.supportchat.SupportChatStore$streamSupportChatList$$inlined$map$1$2$1
                            r0.<init>(r6)
                        L18:
                            java.lang.Object r6 = r0.result
                            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                            int r2 = r0.label
                            r3 = 1
                            if (r2 == 0) goto L31
                            if (r2 != r3) goto L29
                            kotlin.ResultKt.throwOnFailure(r6)
                            goto L56
                        L29:
                            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                            r5.<init>(r6)
                            throw r5
                        L31:
                            kotlin.ResultKt.throwOnFailure(r6)
                            kotlinx.coroutines.flow.FlowCollector r6 = r4.$this_unsafeFlow
                            kotlinx.collections.immutable.ImmutableMap r5 = (kotlinx.collections.immutable.ImmutableMap) r5
                            java.util.Collection r5 = r5.values()
                            java.lang.Iterable r5 = (java.lang.Iterable) r5
                            com.robinhood.store.supportchat.SupportChatStore$streamSupportChatList$lambda$11$$inlined$sortedByDescending$1 r2 = new com.robinhood.store.supportchat.SupportChatStore$streamSupportChatList$lambda$11$$inlined$sortedByDescending$1
                            r2.<init>()
                            java.util.List r5 = kotlin.collections.CollectionsKt.sortedWith(r5, r2)
                            java.lang.Iterable r5 = (java.lang.Iterable) r5
                            java.util.List r5 = kotlin.collections.CollectionsKt.toList(r5)
                            r0.label = r3
                            java.lang.Object r5 = r6.emit(r5, r0)
                            if (r5 != r1) goto L56
                            return r1
                        L56:
                            kotlin.Unit r5 = kotlin.Unit.INSTANCE
                            return r5
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.robinhood.store.supportchat.SupportChatStore$streamSupportChatList$$inlined$map$1.C415882.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                    }
                }
            };
        }

        public final SupportChat getSupportChat(UUID inquiryId) {
            Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
            return getSupportChatsFlow().getValue().get(inquiryId);
        }

        public final Flow<SupportChat> pollSupportChat(final UUID inquiryId) {
            Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
            final StateFlow2<ImmutableMap<UUID, Long>> supportChatPollingIntervalsFlow = getSupportChatPollingIntervalsFlow();
            return FlowKt.transformLatest(FlowKt.distinctUntilChanged(new Flow<Long>() { // from class: com.robinhood.store.supportchat.SupportChatStore$pollSupportChat$$inlined$map$1
                @Override // kotlinx.coroutines.flow.Flow
                public Object collect(FlowCollector<? super Long> flowCollector, Continuation continuation) {
                    Object objCollect = supportChatPollingIntervalsFlow.collect(new C415822(flowCollector, inquiryId), continuation);
                    return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                }

                /* compiled from: Emitters.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.store.supportchat.SupportChatStore$pollSupportChat$$inlined$map$1$2 */
                public static final class C415822<T> implements FlowCollector {
                    final /* synthetic */ UUID $inquiryId$inlined;
                    final /* synthetic */ FlowCollector $this_unsafeFlow;

                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @DebugMetadata(m3644c = "com.robinhood.store.supportchat.SupportChatStore$pollSupportChat$$inlined$map$1$2", m3645f = "SupportChatStore.kt", m3646l = {50}, m3647m = "emit")
                    /* renamed from: com.robinhood.store.supportchat.SupportChatStore$pollSupportChat$$inlined$map$1$2$1, reason: invalid class name */
                    public static final class AnonymousClass1 extends ContinuationImpl {
                        Object L$0;
                        int label;
                        /* synthetic */ Object result;

                        public AnonymousClass1(Continuation continuation) {
                            super(continuation);
                        }

                        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                        public final Object invokeSuspend(Object obj) {
                            this.result = obj;
                            this.label |= Integer.MIN_VALUE;
                            return C415822.this.emit(null, this);
                        }
                    }

                    public C415822(FlowCollector flowCollector, UUID uuid) {
                        this.$this_unsafeFlow = flowCollector;
                        this.$inquiryId$inlined = uuid;
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
                            V v = ((ImmutableMap) obj).get(this.$inquiryId$inlined);
                            anonymousClass1.label = 1;
                            if (flowCollector.emit(v, anonymousClass1) == coroutine_suspended) {
                                return coroutine_suspended;
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
            }), new SupportChatStore$pollSupportChat$$inlined$flatMapLatest$1(null, this, inquiryId));
        }

        public final Flow<List<SupportChat>> pollSupportChatList() {
            return this.pollSupportChatListStream;
        }

        public final Flow<Long> streamUnreadMessageCount() {
            final Flow<List<SupportChat>> flowPollSupportChatList = pollSupportChatList();
            return FlowKt.transformLatest(FlowKt.distinctUntilChanged(new Flow<List<? extends String>>() { // from class: com.robinhood.store.supportchat.SupportChatStore$streamUnreadMessageCount$$inlined$map$1
                @Override // kotlinx.coroutines.flow.Flow
                public Object collect(FlowCollector<? super List<? extends String>> flowCollector, Continuation continuation) {
                    Object objCollect = flowPollSupportChatList.collect(new C415922(flowCollector), continuation);
                    return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                }

                /* compiled from: Emitters.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.store.supportchat.SupportChatStore$streamUnreadMessageCount$$inlined$map$1$2 */
                public static final class C415922<T> implements FlowCollector {
                    final /* synthetic */ FlowCollector $this_unsafeFlow;

                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @DebugMetadata(m3644c = "com.robinhood.store.supportchat.SupportChatStore$streamUnreadMessageCount$$inlined$map$1$2", m3645f = "SupportChatStore.kt", m3646l = {50}, m3647m = "emit")
                    /* renamed from: com.robinhood.store.supportchat.SupportChatStore$streamUnreadMessageCount$$inlined$map$1$2$1, reason: invalid class name */
                    public static final class AnonymousClass1 extends ContinuationImpl {
                        Object L$0;
                        int label;
                        /* synthetic */ Object result;

                        public AnonymousClass1(Continuation continuation) {
                            super(continuation);
                        }

                        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                        public final Object invokeSuspend(Object obj) {
                            this.result = obj;
                            this.label |= Integer.MIN_VALUE;
                            return C415922.this.emit(null, this);
                        }
                    }

                    public C415922(FlowCollector flowCollector) {
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
                            ArrayList arrayList = new ArrayList();
                            Iterator<T> it = ((List) obj).iterator();
                            while (it.hasNext()) {
                                AgentChat agentChat = ((SupportChat) it.next()).getAgentChat();
                                if (agentChat != null) {
                                    arrayList.add(agentChat);
                                }
                            }
                            ArrayList arrayList2 = new ArrayList();
                            for (T t : arrayList) {
                                if (((AgentChat) t).isActive()) {
                                    arrayList2.add(t);
                                }
                            }
                            ArrayList arrayList3 = new ArrayList();
                            Iterator<T> it2 = arrayList2.iterator();
                            while (it2.hasNext()) {
                                String conversationSid = ((AgentChat) it2.next()).getConversationSid();
                                if (conversationSid != null) {
                                    arrayList3.add(conversationSid);
                                }
                            }
                            anonymousClass1.label = 1;
                            if (flowCollector.emit(arrayList3, anonymousClass1) == coroutine_suspended) {
                                return coroutine_suspended;
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
            }), new C41591xa4b4055d(null, this));
        }

        public final Flow<AgentChatSession> streamAgentChatSession(String conversationSid) {
            Intrinsics.checkNotNullParameter(conversationSid, "conversationSid");
            return FlowKt.scan(FlowKt.transformLatest(this.twilioManager.getConversationHelperFlow(conversationSid), new SupportChatStore$streamAgentChatSession$$inlined$flatMapLatest$1(null, this)), new AgentChatSession(null, false, null, null, null, 31, null), new C416072(null));
        }

        /* compiled from: SupportChatStore.kt */
        @Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/store/supportchat/AgentChatSession;", "previousSession", "newEvent", "Lcom/robinhood/store/supportchat/AgentChatEvent;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.store.supportchat.SupportChatStore$streamAgentChatSession$2", m3645f = "SupportChatStore.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.store.supportchat.SupportChatStore$streamAgentChatSession$2 */
        static final class C416072 extends ContinuationImpl7 implements Function3<AgentChatSession, AgentChatEvent, Continuation<? super AgentChatSession>, Object> {
            /* synthetic */ Object L$0;
            /* synthetic */ Object L$1;
            int label;

            C416072(Continuation<? super C416072> continuation) {
                super(3, continuation);
            }

            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(AgentChatSession agentChatSession, AgentChatEvent agentChatEvent, Continuation<? super AgentChatSession> continuation) {
                C416072 c416072 = new C416072(continuation);
                c416072.L$0 = agentChatSession;
                c416072.L$1 = agentChatEvent;
                return c416072.invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return ((AgentChatSession) this.L$0).accept$lib_store_support_chat_externalRelease((AgentChatEvent) this.L$1);
            }
        }

        /* compiled from: SupportChatStore.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.store.supportchat.SupportChatStore$markSupportChatAsShown$1", m3645f = "SupportChatStore.kt", m3646l = {571}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.store.supportchat.SupportChatStore$markSupportChatAsShown$1 */
        static final class C415971 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ UUID $inquiryId;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C415971(UUID uuid, Continuation<? super C415971> continuation) {
                super(2, continuation);
                this.$inquiryId = uuid;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return SupportChatStore.this.new C415971(this.$inquiryId, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C415971) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                try {
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        SupportChatStore supportChatStore = SupportChatStore.this;
                        UUID uuid = this.$inquiryId;
                        SupportChatOperationType supportChatOperationType = SupportChatOperationType.IMPRESSION;
                        this.label = 1;
                        if (supportChatStore.updateSupportChat(uuid, supportChatOperationType, null, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                } catch (Throwable th) {
                    CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, th, false, null, 6, null);
                }
                return Unit.INSTANCE;
            }
        }

        public final Job markSupportChatAsShown(UUID inquiryId) {
            Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
            return BuildersKt__Builders_commonKt.launch$default(getStoreScope(), null, null, new C415971(inquiryId, null), 3, null);
        }

        /* compiled from: SupportChatStore.kt */
        @Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u0006\u0010\u0005\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Ljava/util/SortedMap;", "", "Lcom/robinhood/models/supportchat/db/SocketChatMessage;", NotificationSettings4FragmentKey.SETTINGS_MESSAGES, "newMessage"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.store.supportchat.SupportChatStore$streamSocketMessages$1", m3645f = "SupportChatStore.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.store.supportchat.SupportChatStore$streamSocketMessages$1 */
        static final class C416081 extends ContinuationImpl7 implements Function3<SortedMap<Long, SocketChatMessage>, SocketChatMessage, Continuation<? super SortedMap<Long, SocketChatMessage>>, Object> {
            /* synthetic */ Object L$0;
            /* synthetic */ Object L$1;
            int label;

            C416081(Continuation<? super C416081> continuation) {
                super(3, continuation);
            }

            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(SortedMap<Long, SocketChatMessage> sortedMap, SocketChatMessage socketChatMessage, Continuation<? super SortedMap<Long, SocketChatMessage>> continuation) {
                C416081 c416081 = new C416081(continuation);
                c416081.L$0 = sortedMap;
                c416081.L$1 = socketChatMessage;
                return c416081.invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                SortedMap sortedMap = (SortedMap) this.L$0;
                SocketChatMessage socketChatMessage = (SocketChatMessage) this.L$1;
                sortedMap.put(boxing.boxLong(socketChatMessage.getIndex()), socketChatMessage);
                return sortedMap;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Flow<AgentChatEvent.Message> streamSocketMessages(ConversationHelper conversationHelper) {
            final Flow flowScan = FlowKt.scan(conversationHelper.streamMessages(), MapsKt.sortedMapOf(new Tuples2[0]), new C416081(null));
            return new Flow<AgentChatEvent.Message>() { // from class: com.robinhood.store.supportchat.SupportChatStore$streamSocketMessages$$inlined$map$1
                @Override // kotlinx.coroutines.flow.Flow
                public Object collect(FlowCollector<? super AgentChatEvent.Message> flowCollector, Continuation continuation) {
                    Object objCollect = flowScan.collect(new C415862(flowCollector), continuation);
                    return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                }

                /* compiled from: Emitters.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.store.supportchat.SupportChatStore$streamSocketMessages$$inlined$map$1$2 */
                public static final class C415862<T> implements FlowCollector {
                    final /* synthetic */ FlowCollector $this_unsafeFlow;

                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @DebugMetadata(m3644c = "com.robinhood.store.supportchat.SupportChatStore$streamSocketMessages$$inlined$map$1$2", m3645f = "SupportChatStore.kt", m3646l = {50}, m3647m = "emit")
                    /* renamed from: com.robinhood.store.supportchat.SupportChatStore$streamSocketMessages$$inlined$map$1$2$1, reason: invalid class name */
                    public static final class AnonymousClass1 extends ContinuationImpl {
                        Object L$0;
                        int label;
                        /* synthetic */ Object result;

                        public AnonymousClass1(Continuation continuation) {
                            super(continuation);
                        }

                        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                        public final Object invokeSuspend(Object obj) {
                            this.result = obj;
                            this.label |= Integer.MIN_VALUE;
                            return C415862.this.emit(null, this);
                        }
                    }

                    public C415862(FlowCollector flowCollector) {
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
                            Collection collectionValues = ((SortedMap) obj).values();
                            Intrinsics.checkNotNullExpressionValue(collectionValues, "<get-values>(...)");
                            AgentChatEvent.Message message = new AgentChatEvent.Message(CollectionsKt.toList(collectionValues));
                            anonymousClass1.label = 1;
                            if (flowCollector.emit(message, anonymousClass1) == coroutine_suspended) {
                                return coroutine_suspended;
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
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Flow<AgentChatEvent.Typing> streamTypingStatus(ConversationHelper conversationHelper) {
            final Flow flowBuffer$default = Context7.buffer$default(RxConvert.asFlow(conversationHelper.streamTyping()), Integer.MAX_VALUE, null, 2, null);
            return new Flow<AgentChatEvent.Typing>() { // from class: com.robinhood.store.supportchat.SupportChatStore$streamTypingStatus$$inlined$map$1
                @Override // kotlinx.coroutines.flow.Flow
                public Object collect(FlowCollector<? super AgentChatEvent.Typing> flowCollector, Continuation continuation) {
                    Object objCollect = flowBuffer$default.collect(new C415902(flowCollector), continuation);
                    return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                }

                /* compiled from: Emitters.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.store.supportchat.SupportChatStore$streamTypingStatus$$inlined$map$1$2 */
                public static final class C415902<T> implements FlowCollector {
                    final /* synthetic */ FlowCollector $this_unsafeFlow;

                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @DebugMetadata(m3644c = "com.robinhood.store.supportchat.SupportChatStore$streamTypingStatus$$inlined$map$1$2", m3645f = "SupportChatStore.kt", m3646l = {50}, m3647m = "emit")
                    /* renamed from: com.robinhood.store.supportchat.SupportChatStore$streamTypingStatus$$inlined$map$1$2$1, reason: invalid class name */
                    public static final class AnonymousClass1 extends ContinuationImpl {
                        Object L$0;
                        int label;
                        /* synthetic */ Object result;

                        public AnonymousClass1(Continuation continuation) {
                            super(continuation);
                        }

                        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                        public final Object invokeSuspend(Object obj) {
                            this.result = obj;
                            this.label |= Integer.MIN_VALUE;
                            return C415902.this.emit(null, this);
                        }
                    }

                    public C415902(FlowCollector flowCollector) {
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
                            AgentChatEvent.Typing typing = new AgentChatEvent.Typing(((Boolean) obj).booleanValue());
                            anonymousClass1.label = 1;
                            if (flowCollector.emit(typing, anonymousClass1) == coroutine_suspended) {
                                return coroutine_suspended;
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
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Flow<AgentChatEvent.LastAgentReadMessageData> streamLastAgentReadMessageMetadata(ConversationHelper conversationHelper) {
            final Flow flowBuffer$default = Context7.buffer$default(RxConvert.asFlow(conversationHelper.streamLastAgentReadMessageData()), Integer.MAX_VALUE, null, 2, null);
            return new Flow<AgentChatEvent.LastAgentReadMessageData>() { // from class: com.robinhood.store.supportchat.SupportChatStore$streamLastAgentReadMessageMetadata$$inlined$map$1
                @Override // kotlinx.coroutines.flow.Flow
                public Object collect(FlowCollector<? super AgentChatEvent.LastAgentReadMessageData> flowCollector, Continuation continuation) {
                    Object objCollect = flowBuffer$default.collect(new AnonymousClass2(flowCollector), continuation);
                    return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                }

                /* compiled from: Emitters.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.store.supportchat.SupportChatStore$streamLastAgentReadMessageMetadata$$inlined$map$1$2, reason: invalid class name */
                public static final class AnonymousClass2<T> implements FlowCollector {
                    final /* synthetic */ FlowCollector $this_unsafeFlow;

                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @DebugMetadata(m3644c = "com.robinhood.store.supportchat.SupportChatStore$streamLastAgentReadMessageMetadata$$inlined$map$1$2", m3645f = "SupportChatStore.kt", m3646l = {50}, m3647m = "emit")
                    /* renamed from: com.robinhood.store.supportchat.SupportChatStore$streamLastAgentReadMessageMetadata$$inlined$map$1$2$1, reason: invalid class name */
                    public static final class AnonymousClass1 extends ContinuationImpl {
                        Object L$0;
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
                            Tuples2 tuples2 = (Tuples2) obj;
                            AgentChatEvent.LastAgentReadMessageData lastAgentReadMessageData = new AgentChatEvent.LastAgentReadMessageData(((Number) tuples2.component1()).longValue(), (Instant) tuples2.component2());
                            anonymousClass1.label = 1;
                            if (flowCollector.emit(lastAgentReadMessageData, anonymousClass1) == coroutine_suspended) {
                                return coroutine_suspended;
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
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object signalTyping(String str, Continuation<? super Unit> continuation) {
            C416061 c416061;
            if (continuation instanceof C416061) {
                c416061 = (C416061) continuation;
                int i = c416061.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c416061.label = i - Integer.MIN_VALUE;
                } else {
                    c416061 = new C416061(continuation);
                }
            }
            Object objFirstOrNull = c416061.result;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = c416061.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(objFirstOrNull);
                Flow<ConversationHelper> conversationHelperFlow = this.twilioManager.getConversationHelperFlow(str);
                c416061.label = 1;
                objFirstOrNull = FlowKt.firstOrNull(conversationHelperFlow, c416061);
                if (objFirstOrNull == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objFirstOrNull);
            }
            ConversationHelper conversationHelper = (ConversationHelper) objFirstOrNull;
            if (conversationHelper != null) {
                conversationHelper.signalTyping();
            }
            return Unit.INSTANCE;
        }

        /* JADX WARN: Code restructure failed: missing block: B:24:0x005a, code lost:
        
            if (kotlinx.coroutines.rx2.RxAwait3.await(r6, r0) == r1) goto L25;
         */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object setAllMessagesRead(String str, Continuation<? super Unit> continuation) {
            C416051 c416051;
            if (continuation instanceof C416051) {
                c416051 = (C416051) continuation;
                int i = c416051.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c416051.label = i - Integer.MIN_VALUE;
                } else {
                    c416051 = new C416051(continuation);
                }
            }
            Object objFirstOrNull = c416051.result;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = c416051.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(objFirstOrNull);
                Flow<ConversationHelper> conversationHelperFlow = this.twilioManager.getConversationHelperFlow(str);
                c416051.label = 1;
                objFirstOrNull = FlowKt.firstOrNull(conversationHelperFlow, c416051);
                if (objFirstOrNull != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objFirstOrNull);
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(objFirstOrNull);
            ConversationHelper conversationHelper = (ConversationHelper) objFirstOrNull;
            if (conversationHelper != null && (r6 = conversationHelper.setAllMessagesRead()) != null) {
                c416051.label = 2;
            } else {
                return Unit.INSTANCE;
            }
        }

        public final void sendTextMessage(UUID id, String conversationSid, String inputText) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(conversationSid, "conversationSid");
            Intrinsics.checkNotNullParameter(inputText, "inputText");
            ChatCache.Item<Map<String, UnsentInput>> unsentInputsItem = this.chatCache.getUnsentInputsItem(id);
            String string2 = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
            UnsentInputStatus unsentInputStatus = UnsentInputStatus.SENDING;
            Instant instantNow = Instant.now();
            Intrinsics.checkNotNullExpressionValue(instantNow, "now(...)");
            UnsentInput.Text text = new UnsentInput.Text(string2, unsentInputStatus, instantNow, inputText);
            startMessageSendingTimer(string2, unsentInputsItem);
            sendTextMessageInternal(conversationSid, text, unsentInputsItem);
        }

        public final void resendTextMessage(UUID id, String conversationSid, String localMessageSid) {
            UnsentInput unsentInput;
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(conversationSid, "conversationSid");
            Intrinsics.checkNotNullParameter(localMessageSid, "localMessageSid");
            ChatCache.Item<Map<String, UnsentInput>> unsentInputsItem = this.chatCache.getUnsentInputsItem(id);
            Map<String, UnsentInput> map = unsentInputsItem.get();
            if (map == null || (unsentInput = map.get(localMessageSid)) == null) {
                return;
            }
            UnsentInput unsentInputUpdateSendStatus = unsentInput.updateSendStatus(UnsentInputStatus.RESENDING);
            Intrinsics.checkNotNull(unsentInputUpdateSendStatus, "null cannot be cast to non-null type com.robinhood.shared.models.chat.common.UnsentInput.Text");
            sendTextMessageInternal(conversationSid, (UnsentInput.Text) unsentInputUpdateSendStatus, unsentInputsItem);
        }

        private final void sendTextMessageInternal(final String conversationSid, final UnsentInput.Text unsentInput, final ChatCache.Item<Map<String, UnsentInput>> cachedUnsentInputItem) {
            Single singleFlatMap = Single.fromCallable(new Callable() { // from class: com.robinhood.store.supportchat.SupportChatStore.sendTextMessageInternal.1
                @Override // java.util.concurrent.Callable
                public /* bridge */ /* synthetic */ Object call() {
                    call();
                    return Unit.INSTANCE;
                }

                @Override // java.util.concurrent.Callable
                public final void call() {
                    ChatCache2.save(cachedUnsentInputItem, unsentInput);
                }
            }).subscribeOn(AndroidSchedulers.mainThread()).flatMapObservable(new Function() { // from class: com.robinhood.store.supportchat.SupportChatStore.sendTextMessageInternal.2
                @Override // io.reactivex.functions.Function
                public final ObservableSource<? extends ConversationHelper> apply(Unit it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    return SupportChatStore.this.twilioManager.getConversationHelper(conversationSid);
                }
            }).firstOrError().flatMap(new Function() { // from class: com.robinhood.store.supportchat.SupportChatStore.sendTextMessageInternal.3
                @Override // io.reactivex.functions.Function
                public final SingleSource<? extends SocketChatMessage> apply(ConversationHelper it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    return it.sendTextMessage(unsentInput.getInput(), unsentInput.getLocalSid());
                }
            });
            Intrinsics.checkNotNullExpressionValue(singleFlatMap, "flatMap(...)");
            ScopedSubscriptionKt.subscribeIn(SinglesAndroid.observeOnMainThread(singleFlatMap), getStoreScope(), new Function1() { // from class: com.robinhood.store.supportchat.SupportChatStore$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return SupportChatStore.sendTextMessageInternal$lambda$28(cachedUnsentInputItem, unsentInput, (SocketChatMessage) obj);
                }
            }, (Function1<? super Throwable, Unit>) new Function1() { // from class: com.robinhood.store.supportchat.SupportChatStore$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return SupportChatStore.sendTextMessageInternal$lambda$29(cachedUnsentInputItem, unsentInput, (Throwable) obj);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit sendTextMessageInternal$lambda$28(ChatCache.Item item, UnsentInput.Text text, SocketChatMessage socketChatMessage) {
            ChatCache2.remove(item, text.getLocalSid());
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit sendTextMessageInternal$lambda$29(ChatCache.Item item, UnsentInput.Text text, Throwable t) {
            Intrinsics.checkNotNullParameter(t, "t");
            CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, t, false, null, 4, null);
            ChatCache2.save(item, text.updateSendStatus(UnsentInputStatus.FAILED));
            return Unit.INSTANCE;
        }

        public final Single<SocketChatMessage> sendImageMessage(UUID id, final String conversationSid, final Bitmap bitmap) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(conversationSid, "conversationSid");
            Intrinsics.checkNotNullParameter(bitmap, "bitmap");
            final String string2 = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
            final ChatCache.Item<Map<String, UnsentInput>> unsentInputsItem = this.chatCache.getUnsentInputsItem(id);
            Single<SocketChatMessage> singleDoOnSubscribe = RxFactory.DefaultImpls.rxSingle$default(this, null, new SupportChatStore$sendImageMessage$sendImageSingle$1(this, bitmap, null), 1, null).map(new Function() { // from class: com.robinhood.store.supportchat.SupportChatStore$sendImageMessage$sendImageSingle$2
                @Override // io.reactivex.functions.Function
                public final UnsentInput.Image apply(Uri it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    String str = string2;
                    UnsentInputStatus unsentInputStatus = UnsentInputStatus.SENDING;
                    Instant instantNow = Instant.now();
                    Intrinsics.checkNotNullExpressionValue(instantNow, "now(...)");
                    return new UnsentInput.Image(str, unsentInputStatus, instantNow, null, bitmap.getWidth(), bitmap.getHeight(), it);
                }
            }).subscribeOn(Schedulers.m3346io()).flatMap(new Function() { // from class: com.robinhood.store.supportchat.SupportChatStore$sendImageMessage$sendImageSingle$3
                @Override // io.reactivex.functions.Function
                public final SingleSource<? extends SocketChatMessage> apply(UnsentInput.Image unsentInput) {
                    Intrinsics.checkNotNullParameter(unsentInput, "unsentInput");
                    return this.this$0.sendImageMessageInternal(conversationSid, unsentInput, bitmap, unsentInputsItem);
                }
            }).doOnSubscribe(new Consumer() { // from class: com.robinhood.store.supportchat.SupportChatStore$sendImageMessage$sendImageSingle$4
                @Override // io.reactivex.functions.Consumer
                public final void accept(Disposable disposable) {
                    this.this$0.startMessageSendingTimer(string2, unsentInputsItem);
                }
            });
            Intrinsics.checkNotNullExpressionValue(singleDoOnSubscribe, "doOnSubscribe(...)");
            return singleDoOnSubscribe;
        }

        public final Single<SocketChatMessage> resendImageMessage(UUID id, final String conversationSid, String localMessageSid) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(conversationSid, "conversationSid");
            Intrinsics.checkNotNullParameter(localMessageSid, "localMessageSid");
            final ChatCache.Item<Map<String, UnsentInput>> unsentInputsItem = this.chatCache.getUnsentInputsItem(id);
            Map<String, UnsentInput> map = unsentInputsItem.get();
            UnsentInput unsentInput = map != null ? map.get(localMessageSid) : null;
            final UnsentInput.Image image = unsentInput instanceof UnsentInput.Image ? (UnsentInput.Image) unsentInput : null;
            if (image == null) {
                Single<SocketChatMessage> singleError = Single.error(new ImageProcessingFailedException("Matching unsent input does not exist!"));
                Intrinsics.checkNotNullExpressionValue(singleError, "error(...)");
                return singleError;
            }
            Uri encryptedImageUri = image.getEncryptedImageUri();
            if (encryptedImageUri == null) {
                Single<SocketChatMessage> singleError2 = Single.error(new IllegalArgumentException("Image URI is null!"));
                Intrinsics.checkNotNullExpressionValue(singleError2, "error(...)");
                return singleError2;
            }
            Single<SocketChatMessage> singleFlatMap = RxFactory.DefaultImpls.rxSingle$default(this, null, new SupportChatStore$resendImageMessage$sendImageSingle$1(this, encryptedImageUri, null), 1, null).subscribeOn(Schedulers.m3346io()).flatMap(new Function() { // from class: com.robinhood.store.supportchat.SupportChatStore$resendImageMessage$sendImageSingle$2
                @Override // io.reactivex.functions.Function
                public final SingleSource<? extends SocketChatMessage> apply(Bitmap bitmap) {
                    Intrinsics.checkNotNullParameter(bitmap, "bitmap");
                    return this.this$0.sendImageMessageInternal(conversationSid, UnsentInput.Image.copy$default(image, null, UnsentInputStatus.RESENDING, null, null, 0, 0, null, 125, null), bitmap, unsentInputsItem);
                }
            });
            Intrinsics.checkNotNullExpressionValue(singleFlatMap, "flatMap(...)");
            return singleFlatMap;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Single<SocketChatMessage> sendImageMessageInternal(final String conversationSid, final UnsentInput.Image unsentInput, final Bitmap bitmap, final ChatCache.Item<Map<String, UnsentInput>> cachedUnsentInputItem) {
            final String localSid = unsentInput.getLocalSid();
            Single singleFlatMap = Single.fromCallable(new Callable() { // from class: com.robinhood.store.supportchat.SupportChatStore$sendImageMessageInternal$sendImageSingle$1
                @Override // java.util.concurrent.Callable
                public /* bridge */ /* synthetic */ Object call() {
                    call();
                    return Unit.INSTANCE;
                }

                @Override // java.util.concurrent.Callable
                public final void call() {
                    ChatCache2.save(cachedUnsentInputItem, unsentInput);
                }
            }).subscribeOn(AndroidSchedulers.mainThread()).observeOn(Schedulers.m3346io()).flatMap(new Function() { // from class: com.robinhood.store.supportchat.SupportChatStore$sendImageMessageInternal$sendImageSingle$2

                /* compiled from: SupportChatStore.kt */
                @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Ljava/util/UUID;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.store.supportchat.SupportChatStore$sendImageMessageInternal$sendImageSingle$2$1", m3645f = "SupportChatStore.kt", m3646l = {764}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.store.supportchat.SupportChatStore$sendImageMessageInternal$sendImageSingle$2$1 */
                static final class C416001 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super UUID>, Object> {
                    final /* synthetic */ Bitmap $bitmap;
                    final /* synthetic */ String $conversationSid;
                    int label;
                    final /* synthetic */ SupportChatStore this$0;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C416001(SupportChatStore supportChatStore, String str, Bitmap bitmap, Continuation<? super C416001> continuation) {
                        super(2, continuation);
                        this.this$0 = supportChatStore;
                        this.$conversationSid = str;
                        this.$bitmap = bitmap;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        return new C416001(this.this$0, this.$conversationSid, this.$bitmap, continuation);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super UUID> continuation) {
                        return ((C416001) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i = this.label;
                        if (i == 0) {
                            ResultKt.throwOnFailure(obj);
                            DocUploadApi docUploadApi = this.this$0.docUploadApi;
                            RequestBody.Companion companion = RequestBody.INSTANCE;
                            MediaTypes mediaTypes = MediaTypes.INSTANCE;
                            RequestBody requestBodyCreate = companion.create(ChatImageUtils.IMG_REFERENCE_INSTANCE, mediaTypes.getTEXT_PLAIN());
                            RequestBody requestBodyCreate2 = companion.create(this.$conversationSid, mediaTypes.getTEXT_PLAIN());
                            ChatImageUtils chatImageUtils = ChatImageUtils.INSTANCE;
                            List<MultipartBody.Part> listCreateThumbnailPart = chatImageUtils.createThumbnailPart(chatImageUtils.getTHUMBNAIL_SIZE_SET());
                            MultipartBody.Part partCreateFileRequestBody = chatImageUtils.createFileRequestBody(this.$bitmap);
                            String strMo2745id = this.this$0.installation.mo2745id();
                            this.label = 1;
                            obj = docUploadApi.uploadGenericFile(requestBodyCreate2, requestBodyCreate, listCreateThumbnailPart, partCreateFileRequestBody, strMo2745id, this);
                            if (obj == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } else {
                            if (i != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj);
                        }
                        return ((ApiGenericDocument) obj).getId();
                    }
                }

                @Override // io.reactivex.functions.Function
                public final SingleSource<? extends UUID> apply(Unit it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    SupportChatStore supportChatStore = this.this$0;
                    return RxFactory.DefaultImpls.rxSingle$default(supportChatStore, null, new C416001(supportChatStore, conversationSid, bitmap, null), 1, null);
                }
            });
            Intrinsics.checkNotNullExpressionValue(singleFlatMap, "flatMap(...)");
            Single<SocketChatMessage> singleCache = SinglesAndroid.observeOnMainThread(singleFlatMap).doOnSuccess(new Consumer() { // from class: com.robinhood.store.supportchat.SupportChatStore$sendImageMessageInternal$sendImageSingle$3
                @Override // io.reactivex.functions.Consumer
                public final void accept(UUID uuid) {
                    Map<String, UnsentInput> map = cachedUnsentInputItem.get();
                    Object obj = map != null ? (UnsentInput) map.get(localSid) : null;
                    UnsentInput.Image image = obj instanceof UnsentInput.Image ? (UnsentInput.Image) obj : null;
                    if (image != null) {
                        ChatCache2.save(cachedUnsentInputItem, UnsentInput.Image.copy$default(image, null, null, null, uuid, 0, 0, null, 119, null));
                    }
                }
            }).flatMap(new Function() { // from class: com.robinhood.store.supportchat.SupportChatStore$sendImageMessageInternal$sendImageSingle$4
                @Override // io.reactivex.functions.Function
                public final SingleSource<? extends SocketChatMessage> apply(final UUID documentId) {
                    Intrinsics.checkNotNullParameter(documentId, "documentId");
                    Single<ConversationHelper> singleFirstOrError = this.this$0.twilioManager.getConversationHelper(conversationSid).firstOrError();
                    final Bitmap bitmap2 = bitmap;
                    final String str = localSid;
                    return singleFirstOrError.flatMap(new Function() { // from class: com.robinhood.store.supportchat.SupportChatStore$sendImageMessageInternal$sendImageSingle$4.1
                        @Override // io.reactivex.functions.Function
                        public final SingleSource<? extends SocketChatMessage> apply(ConversationHelper it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            UUID uuid = documentId;
                            Intrinsics.checkNotNull(uuid);
                            return it.sendImageMessage(uuid, bitmap2.getWidth(), bitmap2.getHeight(), str);
                        }
                    });
                }
            }).cache();
            Intrinsics.checkNotNull(singleCache);
            ScopedSubscriptionKt.subscribeIn(singleCache, getStoreScope(), new Function1() { // from class: com.robinhood.store.supportchat.SupportChatStore$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return SupportChatStore.sendImageMessageInternal$lambda$31(unsentInput, cachedUnsentInputItem, localSid, this, (SocketChatMessage) obj);
                }
            }, (Function1<? super Throwable, Unit>) new Function1() { // from class: com.robinhood.store.supportchat.SupportChatStore$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return SupportChatStore.sendImageMessageInternal$lambda$33(cachedUnsentInputItem, localSid, (Throwable) obj);
                }
            });
            return singleCache;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit sendImageMessageInternal$lambda$31(UnsentInput.Image image, ChatCache.Item item, String str, SupportChatStore supportChatStore, SocketChatMessage socketChatMessage) {
            Uri encryptedImageUri = image.getEncryptedImageUri();
            if (encryptedImageUri != null) {
                supportChatStore.deleteUnsentImage(encryptedImageUri);
            }
            ChatCache2.remove(item, str);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit sendImageMessageInternal$lambda$33(ChatCache.Item item, String str, Throwable it) {
            Intrinsics.checkNotNullParameter(it, "it");
            Map map = (Map) item.get();
            UnsentInput unsentInput = map != null ? (UnsentInput) map.get(str) : null;
            if (unsentInput != null) {
                ChatCache2.save(item, unsentInput.updateSendStatus(UnsentInputStatus.FAILED));
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void startMessageSendingTimer(final String localSid, final ChatCache.Item<Map<String, UnsentInput>> cachedUnsentInputItem) {
            Observable<Long> observableTimer = Observable.timer(3L, TimeUnit.SECONDS, AndroidSchedulers.mainThread());
            Intrinsics.checkNotNullExpressionValue(observableTimer, "timer(...)");
            ScopedSubscriptionKt.subscribeIn(observableTimer, getStoreScope(), new Function1() { // from class: com.robinhood.store.supportchat.SupportChatStore$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return SupportChatStore.startMessageSendingTimer$lambda$35(cachedUnsentInputItem, localSid, (Long) obj);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit startMessageSendingTimer$lambda$35(ChatCache.Item item, String str, Long l) {
            UnsentInput unsentInput;
            Map map = (Map) item.get();
            if (map != null && (unsentInput = (UnsentInput) map.get(str)) != null && unsentInput.getStatus() == UnsentInputStatus.SENDING) {
                ChatCache2.save(item, unsentInput.updateSendStatus(UnsentInputStatus.SENDING_LONG));
            }
            return Unit.INSTANCE;
        }

        private final void deleteUnsentImage(Uri uri) {
            this.bitmapStore.deleteBitmapsFromDisk(uri);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: SupportChatStore.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/store/supportchat/SupportChatStore$SupportChatPostParam;", "", "inquiryId", "Ljava/util/UUID;", "operationType", "Lcom/robinhood/models/api/pathfinder/messaging/SupportChatOperationType;", "<init>", "(Ljava/util/UUID;Lcom/robinhood/models/api/pathfinder/messaging/SupportChatOperationType;)V", "getInquiryId", "()Ljava/util/UUID;", "getOperationType", "()Lcom/robinhood/models/api/pathfinder/messaging/SupportChatOperationType;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "lib-store-support-chat_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final /* data */ class SupportChatPostParam {
            private final UUID inquiryId;
            private final SupportChatOperationType operationType;

            public static /* synthetic */ SupportChatPostParam copy$default(SupportChatPostParam supportChatPostParam, UUID uuid, SupportChatOperationType supportChatOperationType, int i, Object obj) {
                if ((i & 1) != 0) {
                    uuid = supportChatPostParam.inquiryId;
                }
                if ((i & 2) != 0) {
                    supportChatOperationType = supportChatPostParam.operationType;
                }
                return supportChatPostParam.copy(uuid, supportChatOperationType);
            }

            /* renamed from: component1, reason: from getter */
            public final UUID getInquiryId() {
                return this.inquiryId;
            }

            /* renamed from: component2, reason: from getter */
            public final SupportChatOperationType getOperationType() {
                return this.operationType;
            }

            public final SupportChatPostParam copy(UUID inquiryId, SupportChatOperationType operationType) {
                Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
                Intrinsics.checkNotNullParameter(operationType, "operationType");
                return new SupportChatPostParam(inquiryId, operationType);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof SupportChatPostParam)) {
                    return false;
                }
                SupportChatPostParam supportChatPostParam = (SupportChatPostParam) other;
                return Intrinsics.areEqual(this.inquiryId, supportChatPostParam.inquiryId) && this.operationType == supportChatPostParam.operationType;
            }

            public int hashCode() {
                return (this.inquiryId.hashCode() * 31) + this.operationType.hashCode();
            }

            public String toString() {
                return "SupportChatPostParam(inquiryId=" + this.inquiryId + ", operationType=" + this.operationType + ")";
            }

            public SupportChatPostParam(UUID inquiryId, SupportChatOperationType operationType) {
                Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
                Intrinsics.checkNotNullParameter(operationType, "operationType");
                this.inquiryId = inquiryId;
                this.operationType = operationType;
            }

            public final UUID getInquiryId() {
                return this.inquiryId;
            }

            public final SupportChatOperationType getOperationType() {
                return this.operationType;
            }
        }
    }
