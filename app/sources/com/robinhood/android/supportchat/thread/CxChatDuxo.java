package com.robinhood.android.supportchat.thread;

import android.graphics.Bitmap;
import android.net.ConnectivityManager;
import android.net.Uri;
import android.os.Parcelable;
import androidx.lifecycle.SavedStateHandle;
import com.adjust.sdk.network.ErrorCodes;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.api.docupload.DocUploadApi;
import com.robinhood.android.bitmap.BitmapStore;
import com.robinhood.android.supportchat.extensions.Bitmaps2;
import com.robinhood.android.supportchat.extensions.Throwables2;
import com.robinhood.android.supportchat.thread.CxChatDataState;
import com.robinhood.android.supportchat.thread.CxChatDuxo;
import com.robinhood.android.supportchat.thread.CxChatEvent;
import com.robinhood.android.supportchat.thread.compose.CxChatBottomSheetData;
import com.robinhood.android.supportchat.thread.compose.CxChatDialogData;
import com.robinhood.android.udf.BaseDuxo3;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.android.waitlist.spot.WaitlistAnimationConstants;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.experiments.Experiment;
import com.robinhood.experiments.ExperimentsProvider;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.models.api.p306v2.ApiExistingLiveCase;
import com.robinhood.models.api.p306v2.ApiUpdateSupportChatError;
import com.robinhood.models.api.pathfinder.messaging.ChatCurrentType;
import com.robinhood.models.p355ui.p356v2.ChatbotSession;
import com.robinhood.models.p355ui.p356v2.ChatbotSuggestedResponse;
import com.robinhood.models.p355ui.p356v2.SelectionMenuRowModel;
import com.robinhood.models.p355ui.p356v2.SelectionMenuState;
import com.robinhood.models.p355ui.p356v2.UpdateSupportChatError;
import com.robinhood.models.p355ui.pathfinder.contexts.UserViewStatePageContext;
import com.robinhood.models.p355ui.pathfinder.messaging.AgentChat;
import com.robinhood.models.p355ui.pathfinder.messaging.ChatMode;
import com.robinhood.models.p355ui.pathfinder.messaging.ChatbotChat;
import com.robinhood.models.p355ui.pathfinder.messaging.SupportChat;
import com.robinhood.models.supportchat.p353db.SocketChatMessage;
import com.robinhood.prefs.Installation;
import com.robinhood.shared.models.chat.common.UnsentInput;
import com.robinhood.shared.store.chat.common.InFlightMessageStore;
import com.robinhood.shared.support.contracts.CxChatFragmentKey;
import com.robinhood.shared.support.supportchat.p396ui.models.UiChatMessage;
import com.robinhood.store.data.store.chatbot.ChatbotStore;
import com.robinhood.store.supportchat.AgentChatSession;
import com.robinhood.store.supportchat.ChatImageUtils;
import com.robinhood.store.supportchat.SupportChatStore;
import com.robinhood.store.supportchat.salesforce.SalesforceChatStore;
import com.robinhood.store.supportchat.salesforce.SalesforceIdentiImageUploadExperiment;
import com.robinhood.utils.Either;
import com.robinhood.utils.coroutine.Flows3;
import com.robinhood.utils.extensions.Throwables;
import com.robinhood.utils.extensions.TypeToken;
import com.robinhood.utils.extensions.Types;
import com.robinhood.utils.http.MediaTypes;
import com.robinhood.utils.logging.CrashReporter;
import com.robinhood.utils.moshi.LazyMoshi;
import com.robinhood.utils.net.ActiveNetworkCounter;
import com.robinhood.utils.net.ActiveNetworkCounter2;
import com.squareup.moshi.JsonAdapter;
import io.reactivex.Single;
import java.io.File;
import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScope2;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Context7;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow2;
import kotlinx.coroutines.flow.SharedFlow4;
import kotlinx.coroutines.rx2.RxAwait3;
import kotlinx.coroutines.rx2.RxConvert;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.HttpException;
import retrofit2.Response;

/* compiled from: CxChatDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0080\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u0091\u00012\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005:\u0002\u0091\u0001By\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0019\u0012\u0006\u0010\u001a\u001a\u00020\u001b\u0012\u0006\u0010\u001c\u001a\u00020\u001d\u0012\u0006\u0010\u001e\u001a\u00020\u001f\u0012\u0006\u0010 \u001a\u00020!¢\u0006\u0004\b\"\u0010#J\b\u0010.\u001a\u00020/H\u0016J\b\u00100\u001a\u00020/H\u0016J\b\u00101\u001a\u00020/H\u0016J\u0006\u00102\u001a\u00020/J\u000e\u00103\u001a\u00020/2\u0006\u00104\u001a\u000205J\u0016\u00106\u001a\u00020/2\u0006\u00104\u001a\u000205H\u0082@¢\u0006\u0002\u00107J\u000e\u00108\u001a\u0004\u0018\u000109*\u00020-H\u0002J\u0016\u0010:\u001a\u00020/2\u0006\u0010;\u001a\u00020<H\u0082@¢\u0006\u0002\u0010=J\u0016\u0010>\u001a\u00020?2\u0006\u00104\u001a\u000205H\u0082@¢\u0006\u0002\u00107J\u0016\u0010@\u001a\u00020/2\u0006\u00104\u001a\u000205H\u0082@¢\u0006\u0002\u00107J\u0016\u0010A\u001a\u00020/2\u0006\u00104\u001a\u000205H\u0082@¢\u0006\u0002\u00107J\u0016\u0010B\u001a\u00020/2\u0006\u00104\u001a\u000205H\u0082@¢\u0006\u0002\u00107J\u0016\u0010C\u001a\u00020/2\u0006\u00104\u001a\u000205H\u0082@¢\u0006\u0002\u00107J\u0016\u0010D\u001a\u00020/2\u0006\u00104\u001a\u000205H\u0082@¢\u0006\u0002\u00107J\u000e\u0010E\u001a\u00020/2\u0006\u0010F\u001a\u00020GJ\u0012\u0010H\u001a\u00020/*\u00020GH\u0082@¢\u0006\u0002\u0010IJ3\u0010J\u001a\u00020/2\u0006\u00104\u001a\u0002052\u0006\u0010F\u001a\u00020G2\n\b\u0002\u0010K\u001a\u0004\u0018\u00010(2\n\b\u0002\u0010L\u001a\u0004\u0018\u00010M¢\u0006\u0002\u0010NJ:\u0010O\u001a\u00020/2\u0006\u0010F\u001a\u00020G2\n\b\u0002\u0010P\u001a\u0004\u0018\u0001052\n\b\u0002\u0010L\u001a\u0004\u0018\u00010M2\n\b\u0002\u0010K\u001a\u0004\u0018\u00010(H\u0082@¢\u0006\u0002\u0010QJ \u0010R\u001a\u00020<2\u0006\u0010S\u001a\u00020(2\b\u0010T\u001a\u0004\u0018\u00010MH\u0082@¢\u0006\u0002\u0010UJ \u0010V\u001a\u00020/2\u0006\u0010W\u001a\u0002052\b\u0010T\u001a\u0004\u0018\u00010(H\u0082@¢\u0006\u0002\u0010XJ\u001e\u0010Y\u001a\u00020/2\u0006\u00104\u001a\u0002052\u0006\u0010F\u001a\u00020G2\u0006\u0010Z\u001a\u00020[J*\u0010\\\u001a\u00020/2\u0006\u00104\u001a\u0002052\u0006\u0010F\u001a\u00020G2\u0006\u0010]\u001a\u00020^2\n\b\u0002\u0010_\u001a\u0004\u0018\u00010(J*\u0010`\u001a\u00020/2\u0006\u00104\u001a\u0002052\u0006\u0010F\u001a\u00020G2\u0006\u0010a\u001a\u00020(2\n\b\u0002\u0010b\u001a\u0004\u0018\u00010(J\u001e\u0010c\u001a\u00020/2\u0006\u00104\u001a\u0002052\u0006\u0010F\u001a\u00020G2\u0006\u0010a\u001a\u00020dJ\u0018\u0010e\u001a\u00020/2\u0006\u0010W\u001a\u0002052\u0006\u0010a\u001a\u00020dH\u0002J \u0010f\u001a\u00020/2\u0006\u00104\u001a\u0002052\u0006\u0010S\u001a\u00020(2\u0006\u0010a\u001a\u00020dH\u0002J2\u0010g\u001a\u00020/2\u0006\u00104\u001a\u0002052\u0006\u0010F\u001a\u00020G2\u0012\u0010h\u001a\u000e\u0012\u0004\u0012\u00020j\u0012\u0004\u0012\u00020k0i2\u0006\u0010l\u001a\u00020<J\u0018\u0010m\u001a\u00020<*\u000e\u0012\u0004\u0012\u00020j\u0012\u0004\u0012\u00020k0iH\u0002J\u0018\u0010n\u001a\u00020/2\u0006\u0010W\u001a\u0002052\u0006\u0010o\u001a\u00020kH\u0002J&\u0010p\u001a\u00020/2\u0006\u00104\u001a\u0002052\u0006\u0010S\u001a\u00020(2\u0006\u0010q\u001a\u00020jH\u0082@¢\u0006\u0002\u0010rJ\"\u0010s\u001a\u00020/2\u0006\u00104\u001a\u0002052\b\u0010t\u001a\u0004\u0018\u00010(2\b\u0010F\u001a\u0004\u0018\u00010GJ\"\u0010u\u001a\u00020/2\u0006\u00104\u001a\u0002052\b\u0010t\u001a\u0004\u0018\u00010(2\b\u0010F\u001a\u0004\u0018\u00010GJ \u0010v\u001a\u00020/2\u0006\u0010F\u001a\u00020G2\u0006\u0010w\u001a\u00020(2\b\u0010x\u001a\u0004\u0018\u00010(J\"\u0010y\u001a\u00020/2\u0006\u00104\u001a\u0002052\b\u0010t\u001a\u0004\u0018\u00010(2\b\u0010F\u001a\u0004\u0018\u00010GJ\u000e\u0010z\u001a\u00020/2\u0006\u0010{\u001a\u00020(J\u0006\u0010|\u001a\u00020/J\u0016\u0010}\u001a\u00020/2\u0006\u0010S\u001a\u00020(2\u0006\u0010a\u001a\u00020dJ\u0006\u0010~\u001a\u00020/J\u0006\u0010\u007f\u001a\u00020/J\u0007\u0010\u0080\u0001\u001a\u00020/J\u000f\u0010\u0081\u0001\u001a\u00020/2\u0006\u0010l\u001a\u00020<J\u0007\u0010\u0082\u0001\u001a\u00020/J\u0007\u0010\u0083\u0001\u001a\u00020/J\u0007\u0010\u0084\u0001\u001a\u00020/J\u0007\u0010\u0085\u0001\u001a\u00020/J\u0013\u0010\u0086\u0001\u001a\u00020/2\b\u0010\u0087\u0001\u001a\u00030\u0088\u0001H\u0002J \u0010\u0089\u0001\u001a\u00020/2\u0006\u0010q\u001a\u00020j2\u0006\u0010W\u001a\u000205H\u0082@¢\u0006\u0003\u0010\u008a\u0001J \u0010\u008b\u0001\u001a\u00020/*\u00030\u008c\u00012\u0010\b\u0002\u0010\u008d\u0001\u001a\t\u0012\u0004\u0012\u00020/0\u008e\u0001H\u0002J \u0010\u008f\u0001\u001a\u00020/*\u00030\u008c\u00012\u0010\b\u0002\u0010\u0090\u0001\u001a\t\u0012\u0004\u0012\u00020/0\u008e\u0001H\u0002R\u0014\u0010\f\u001a\u00020\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020!X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010&\u001a\b\u0012\u0004\u0012\u00020(0'X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010)\u001a\b\u0012\u0004\u0012\u00020+0*X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010,\u001a\b\u0012\u0004\u0012\u00020-0*X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0092\u0001"}, m3636d2 = {"Lcom/robinhood/android/supportchat/thread/CxChatDuxo;", "Lcom/robinhood/android/udf/BaseEventDuxo;", "Lcom/robinhood/android/supportchat/thread/CxChatDataState;", "Lcom/robinhood/android/supportchat/thread/CxChatViewState;", "Lcom/robinhood/android/supportchat/thread/CxChatEvent;", "Lcom/robinhood/android/udf/HasSavedState;", "stateProvider", "Lcom/robinhood/android/supportchat/thread/CxChatStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "moshi", "Lcom/robinhood/utils/moshi/LazyMoshi;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "supportChatStore", "Lcom/robinhood/store/supportchat/SupportChatStore;", "salesforceChatStore", "Lcom/robinhood/store/supportchat/salesforce/SalesforceChatStore;", "chatbotStore", "Lcom/robinhood/store/data/store/chatbot/ChatbotStore;", "inFlightMessageStore", "Lcom/robinhood/shared/store/chat/common/InFlightMessageStore;", "bitmapStore", "Lcom/robinhood/android/bitmap/BitmapStore;", "docUploadApi", "Lcom/robinhood/android/api/docupload/DocUploadApi;", "installation", "Lcom/robinhood/prefs/Installation;", "networkCounter", "Lcom/robinhood/utils/net/ActiveNetworkCounter;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "connectivityManager", "Landroid/net/ConnectivityManager;", "<init>", "(Lcom/robinhood/android/supportchat/thread/CxChatStateProvider;Lcom/robinhood/android/udf/DuxoBundle;Lcom/robinhood/utils/moshi/LazyMoshi;Landroidx/lifecycle/SavedStateHandle;Lcom/robinhood/store/supportchat/SupportChatStore;Lcom/robinhood/store/supportchat/salesforce/SalesforceChatStore;Lcom/robinhood/store/data/store/chatbot/ChatbotStore;Lcom/robinhood/shared/store/chat/common/InFlightMessageStore;Lcom/robinhood/android/bitmap/BitmapStore;Lcom/robinhood/android/api/docupload/DocUploadApi;Lcom/robinhood/prefs/Installation;Lcom/robinhood/utils/net/ActiveNetworkCounter;Lcom/robinhood/librobinhood/data/store/ExperimentsStore;Landroid/net/ConnectivityManager;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "inputFlow", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "", "errorResponseAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/robinhood/models/api/v2/ApiUpdateSupportChatError;", "existingLiveCaseAdapter", "Lcom/robinhood/models/api/v2/ApiExistingLiveCase;", "onCreate", "", "onStart", "onStop", "createSupportChat", "fetchSupportChat", "inquiryId", "Ljava/util/UUID;", "fetchSupportChatInternal", "(Ljava/util/UUID;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "toDialog", "Lcom/robinhood/android/supportchat/thread/compose/CxChatDialogData$CxChatExistingLiveCase;", "createSupportChatInternal", "isChatbot", "", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onSupportChatLoaded", "Lkotlinx/coroutines/Job;", "observeSupportChat", "observeUnsentMessages", "observeChatbotChat", "observeSalesforceAgentChat", "observeTwilioAgentChat", "setAllMessagesRead", "chatMode", "Lcom/robinhood/models/ui/pathfinder/messaging/ChatMode;", "markAllMessagesRead", "(Lcom/robinhood/models/ui/pathfinder/messaging/ChatMode;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchPreviousMessages", "chatbotChatCursor", "agentChatCursor", "", "(Ljava/util/UUID;Lcom/robinhood/models/ui/pathfinder/messaging/ChatMode;Ljava/lang/String;Ljava/lang/Long;)V", "fetchMessages", "chatbotId", "(Lcom/robinhood/models/ui/pathfinder/messaging/ChatMode;Ljava/util/UUID;Ljava/lang/Long;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchAgentChatTwilioMessages", "conversationSid", "cursor", "(Ljava/lang/String;Ljava/lang/Long;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchChatbotMessages", "conversationId", "(Ljava/util/UUID;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendSelectionMenuSelection", "row", "Lcom/robinhood/models/ui/v2/SelectionMenuRowModel;", "sendSuggestedResponseSelection", "suggestedResponse", "Lcom/robinhood/models/ui/v2/ChatbotSuggestedResponse;", "suggestedResponseLocalId", "sendTextMessage", "message", "messageLocalId", "resendAgentChatUserMessage", "Lcom/robinhood/shared/support/supportchat/ui/models/UiChatMessage$Regular;", "resendSalesforceChatUserMessage", "resendTwilioChatUserMessage", "sendImageMessage", "imageData", "Lcom/robinhood/utils/Either;", "Landroid/graphics/Bitmap;", "Ljava/io/File;", "fromImagePicker", "canSend", "sendImageMessageToSalesforce", "imageFile", "sendImageMessageToTwilio", "bitmap", "(Ljava/util/UUID;Ljava/lang/String;Landroid/graphics/Bitmap;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "endChat", "actionLocalId", "resumeChat", "sendChatbotCta", "actionId", "uiLocalId", "escalateToAgent", "onInputChanged", "input", "openImageUploadBottomSheet", "openResendBottomSheet", "dismissBottomSheet", "openEndChatConfirmationDialog", "openCharacterLimitErrorDialog", "openFileSizeLimitDialog", "openCameraPermissionDialog", "openImageErrorDialog", "openPushPromptDialog", "dismissDialog", "openDialog", "dialogData", "Lcom/robinhood/android/supportchat/thread/compose/CxChatDialogData;", "uploadImageToIdenti", "(Landroid/graphics/Bitmap;Ljava/util/UUID;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "handleOrThrow", "", "handle", "Lkotlin/Function0;", "showChatUpdateErrorAlertIfAvailable", "onErrorResponseUnavailable", "Companion", "feature-support-chat_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class CxChatDuxo extends BaseDuxo3<CxChatDataState, CxChatViewState, CxChatEvent> implements HasSavedState {
    private static final int CONCIERGE_EXISTING_LIVE_CASE_ERROR = 1;
    private static final String KEY_INQUIRY_ID = "inquiry_id";
    public static final int MESSAGE_NUM_PER_PAGE = 30;
    private static final long SIGNAL_TYPING_DEBOUNCE_THRESHOLD_MS = 3000;
    private final BitmapStore bitmapStore;
    private final ChatbotStore chatbotStore;
    private final ConnectivityManager connectivityManager;
    private final DocUploadApi docUploadApi;
    private final JsonAdapter<ApiUpdateSupportChatError> errorResponseAdapter;
    private final JsonAdapter<ApiExistingLiveCase> existingLiveCaseAdapter;
    private final ExperimentsStore experimentsStore;
    private final InFlightMessageStore inFlightMessageStore;
    private final SharedFlow2<String> inputFlow;
    private final Installation installation;
    private final ActiveNetworkCounter networkCounter;
    private final SalesforceChatStore salesforceChatStore;
    private final SavedStateHandle savedStateHandle;
    private final SupportChatStore supportChatStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: CxChatDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.supportchat.thread.CxChatDuxo", m3645f = "CxChatDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_BALANCE_BEAM_02_CIRCLE_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_FIRST_DEPOSIT_CIRCLE_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_01_VALUE}, m3647m = "createSupportChatInternal")
    /* renamed from: com.robinhood.android.supportchat.thread.CxChatDuxo$createSupportChatInternal$1 */
    static final class C291381 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C291381(Continuation<? super C291381> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CxChatDuxo.this.createSupportChatInternal(false, this);
        }
    }

    /* compiled from: CxChatDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.supportchat.thread.CxChatDuxo", m3645f = "CxChatDuxo.kt", m3646l = {558}, m3647m = "fetchAgentChatTwilioMessages")
    /* renamed from: com.robinhood.android.supportchat.thread.CxChatDuxo$fetchAgentChatTwilioMessages$1 */
    static final class C291451 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C291451(Continuation<? super C291451> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CxChatDuxo.this.fetchAgentChatTwilioMessages(null, null, this);
        }
    }

    /* compiled from: CxChatDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.supportchat.thread.CxChatDuxo", m3645f = "CxChatDuxo.kt", m3646l = {544, 553}, m3647m = "fetchMessages")
    /* renamed from: com.robinhood.android.supportchat.thread.CxChatDuxo$fetchMessages$1 */
    static final class C291461 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C291461(Continuation<? super C291461> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CxChatDuxo.this.fetchMessages(null, null, null, null, this);
        }
    }

    /* compiled from: CxChatDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.supportchat.thread.CxChatDuxo", m3645f = "CxChatDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_2_VALUE, 202}, m3647m = "fetchSupportChatInternal")
    /* renamed from: com.robinhood.android.supportchat.thread.CxChatDuxo$fetchSupportChatInternal$1 */
    static final class C291491 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C291491(Continuation<? super C291491> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CxChatDuxo.this.fetchSupportChatInternal(null, this);
        }
    }

    /* compiled from: CxChatDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.supportchat.thread.CxChatDuxo", m3645f = "CxChatDuxo.kt", m3646l = {1036}, m3647m = "uploadImageToIdenti")
    /* renamed from: com.robinhood.android.supportchat.thread.CxChatDuxo$uploadImageToIdenti$1 */
    static final class C291701 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C291701(Continuation<? super C291701> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CxChatDuxo.this.uploadImageToIdenti(null, null, this);
        }
    }

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CxChatDuxo(CxChatStateProvider stateProvider, DuxoBundle duxoBundle, LazyMoshi moshi, SavedStateHandle savedStateHandle, SupportChatStore supportChatStore, SalesforceChatStore salesforceChatStore, ChatbotStore chatbotStore, InFlightMessageStore inFlightMessageStore, BitmapStore bitmapStore, DocUploadApi docUploadApi, Installation installation, ActiveNetworkCounter networkCounter, ExperimentsStore experimentsStore, ConnectivityManager connectivityManager) {
        super(new CxChatDataState(null, null, null, null, false, null, null, null, null, null, 1023, null), stateProvider, duxoBundle);
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(supportChatStore, "supportChatStore");
        Intrinsics.checkNotNullParameter(salesforceChatStore, "salesforceChatStore");
        Intrinsics.checkNotNullParameter(chatbotStore, "chatbotStore");
        Intrinsics.checkNotNullParameter(inFlightMessageStore, "inFlightMessageStore");
        Intrinsics.checkNotNullParameter(bitmapStore, "bitmapStore");
        Intrinsics.checkNotNullParameter(docUploadApi, "docUploadApi");
        Intrinsics.checkNotNullParameter(installation, "installation");
        Intrinsics.checkNotNullParameter(networkCounter, "networkCounter");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(connectivityManager, "connectivityManager");
        this.savedStateHandle = savedStateHandle;
        this.supportChatStore = supportChatStore;
        this.salesforceChatStore = salesforceChatStore;
        this.chatbotStore = chatbotStore;
        this.inFlightMessageStore = inFlightMessageStore;
        this.bitmapStore = bitmapStore;
        this.docUploadApi = docUploadApi;
        this.installation = installation;
        this.networkCounter = networkCounter;
        this.experimentsStore = experimentsStore;
        this.connectivityManager = connectivityManager;
        this.inputFlow = SharedFlow4.MutableSharedFlow$default(0, 0, null, 7, null);
        Types types = Types.INSTANCE;
        this.errorResponseAdapter = moshi.adapter(new TypeToken<ApiUpdateSupportChatError>() { // from class: com.robinhood.android.supportchat.thread.CxChatDuxo$special$$inlined$getAdapter$1
        }.getType());
        this.existingLiveCaseAdapter = moshi.adapter(new TypeToken<ApiExistingLiveCase>() { // from class: com.robinhood.android.supportchat.thread.CxChatDuxo$special$$inlined$getAdapter$2
        }.getType());
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        Tuples2 tuples2M3642to;
        super.onCreate();
        Companion companion = INSTANCE;
        Parcelable args = companion.getArgs((HasSavedState) this);
        CxChatFragmentKey.NewChat newChat = args instanceof CxChatFragmentKey.NewChat ? (CxChatFragmentKey.NewChat) args : null;
        boolean zIsChatbot = newChat != null ? newChat.isChatbot() : false;
        CxChatFragmentKey cxChatFragmentKey = (CxChatFragmentKey) companion.getArgs((HasSavedState) this);
        if (cxChatFragmentKey instanceof CxChatFragmentKey.Pathfinder) {
            Parcelable args2 = companion.getArgs((HasSavedState) this);
            Intrinsics.checkNotNull(args2, "null cannot be cast to non-null type com.robinhood.shared.support.contracts.CxChatFragmentKey.Pathfinder");
            CxChatFragmentKey.Pathfinder pathfinder = (CxChatFragmentKey.Pathfinder) args2;
            tuples2M3642to = Tuples4.m3642to(pathfinder.getInquiryId(), ((UserViewStatePageContext.SupportChat) pathfinder.getPage().getTypeContext()).getContext().getSupportChat());
        } else if (cxChatFragmentKey instanceof CxChatFragmentKey.InquiryId) {
            Parcelable args3 = companion.getArgs((HasSavedState) this);
            Intrinsics.checkNotNull(args3, "null cannot be cast to non-null type com.robinhood.shared.support.contracts.CxChatFragmentKey.InquiryId");
            tuples2M3642to = Tuples4.m3642to(((CxChatFragmentKey.InquiryId) args3).getInquiryId(), null);
        } else {
            if (!(cxChatFragmentKey instanceof CxChatFragmentKey.NewChat)) {
                throw new NoWhenBranchMatchedException();
            }
            tuples2M3642to = Tuples4.m3642to(null, null);
        }
        UUID uuid = (UUID) tuples2M3642to.component1();
        getLifecycleScope().repeatOnLifecycle(LifecycleState.CREATED, new C291551((SupportChat) tuples2M3642to.component2(), this, null));
        getLifecycleScope().repeatOnLifecycle(LifecycleState.STARTED, new C291562(uuid, this, zIsChatbot, null));
    }

    /* compiled from: CxChatDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.supportchat.thread.CxChatDuxo$onCreate$1", m3645f = "CxChatDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.supportchat.thread.CxChatDuxo$onCreate$1 */
    static final class C291551 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ SupportChat $initialData;
        int label;
        final /* synthetic */ CxChatDuxo this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C291551(SupportChat supportChat, CxChatDuxo cxChatDuxo, Continuation<? super C291551> continuation) {
            super(2, continuation);
            this.$initialData = supportChat;
            this.this$0 = cxChatDuxo;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C291551(this.$initialData, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C291551) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            SupportChat supportChat = this.$initialData;
            if (supportChat != null) {
                SupportChatStore.saveSupportChat$default(this.this$0.supportChatStore, supportChat.getInquiryId(), supportChat, null, 4, null);
            }
            return Unit.INSTANCE;
        }
    }

    /* compiled from: CxChatDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.supportchat.thread.CxChatDuxo$onCreate$2", m3645f = "CxChatDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.supportchat.thread.CxChatDuxo$onCreate$2 */
    static final class C291562 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ UUID $inquiryId;
        final /* synthetic */ boolean $isChatbot;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ CxChatDuxo this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C291562(UUID uuid, CxChatDuxo cxChatDuxo, boolean z, Continuation<? super C291562> continuation) {
            super(2, continuation);
            this.$inquiryId = uuid;
            this.this$0 = cxChatDuxo;
            this.$isChatbot = z;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C291562 c291562 = new C291562(this.$inquiryId, this.this$0, this.$isChatbot, continuation);
            c291562.L$0 = obj;
            return c291562;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C291562) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: CxChatDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.supportchat.thread.CxChatDuxo$onCreate$2$1", m3645f = "CxChatDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_DEV_LOGS_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_SHARE_YOUR_DATA_VALUE, EnumC7081g.SDK_ASSET_CONNECTIVITY_WARNING_ILLUSTRATION_VALUE}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.supportchat.thread.CxChatDuxo$onCreate$2$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ UUID $inquiryId;
            final /* synthetic */ boolean $isChatbot;
            int label;
            final /* synthetic */ CxChatDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(UUID uuid, CxChatDuxo cxChatDuxo, boolean z, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$inquiryId = uuid;
                this.this$0 = cxChatDuxo;
                this.$isChatbot = z;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.$inquiryId, this.this$0, this.$isChatbot, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Code restructure failed: missing block: B:17:0x004f, code lost:
            
                if (r6.onSupportChatLoaded(r1, r5) == r0) goto L27;
             */
            /* JADX WARN: Code restructure failed: missing block: B:22:0x005e, code lost:
            
                if (r1.fetchSupportChatInternal(r6, r5) == r0) goto L27;
             */
            /* JADX WARN: Code restructure failed: missing block: B:26:0x006e, code lost:
            
                if (r6.createSupportChatInternal(r1, r5) == r0) goto L27;
             */
            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    if (this.$inquiryId != null && this.this$0.supportChatStore.getSupportChat(this.$inquiryId) != null) {
                        this.this$0.supportChatStore.refreshSupportChat(this.$inquiryId, true);
                        CxChatDuxo cxChatDuxo = this.this$0;
                        UUID uuid = this.$inquiryId;
                        this.label = 1;
                    } else {
                        UUID uuid2 = this.$inquiryId;
                        if (uuid2 != null) {
                            CxChatDuxo cxChatDuxo2 = this.this$0;
                            this.label = 2;
                        } else {
                            CxChatDuxo cxChatDuxo3 = this.this$0;
                            boolean z = this.$isChatbot;
                            this.label = 3;
                        }
                    }
                    return coroutine_suspended;
                }
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else if (i == 2) {
                    ResultKt.throwOnFailure(obj);
                    Unit unit = Unit.INSTANCE;
                } else {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    Unit unit2 = Unit.INSTANCE;
                }
                return Unit.INSTANCE;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(this.$inquiryId, this.this$0, this.$isChatbot, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass2(this.this$0, null), 3, null);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* compiled from: CxChatDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.supportchat.thread.CxChatDuxo$onCreate$2$2", m3645f = "CxChatDuxo.kt", m3646l = {150}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.supportchat.thread.CxChatDuxo$onCreate$2$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ CxChatDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(CxChatDuxo cxChatDuxo, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = cxChatDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass2(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow flowBuffer$default = Context7.buffer$default(RxConvert.asFlow(this.this$0.networkCounter.streamHasAvailableNetwork()), Integer.MAX_VALUE, null, 2, null);
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowBuffer$default, anonymousClass1, this) == coroutine_suspended) {
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

            /* compiled from: CxChatDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.supportchat.thread.CxChatDuxo$onCreate$2$2$1", m3645f = "CxChatDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.supportchat.thread.CxChatDuxo$onCreate$2$2$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Boolean, Continuation<? super Unit>, Object> {
                /* synthetic */ boolean Z$0;
                int label;
                final /* synthetic */ CxChatDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(CxChatDuxo cxChatDuxo, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = cxChatDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                    anonymousClass1.Z$0 = ((Boolean) obj).booleanValue();
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
                    return invoke(bool.booleanValue(), continuation);
                }

                public final Object invoke(boolean z, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(Boolean.valueOf(z), continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: CxChatDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/supportchat/thread/CxChatDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.supportchat.thread.CxChatDuxo$onCreate$2$2$1$1", m3645f = "CxChatDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.supportchat.thread.CxChatDuxo$onCreate$2$2$1$1, reason: invalid class name and collision with other inner class name */
                static final class C505571 extends ContinuationImpl7 implements Function2<CxChatDataState, Continuation<? super CxChatDataState>, Object> {
                    final /* synthetic */ boolean $it;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C505571(boolean z, Continuation<? super C505571> continuation) {
                        super(2, continuation);
                        this.$it = z;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C505571 c505571 = new C505571(this.$it, continuation);
                        c505571.L$0 = obj;
                        return c505571;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(CxChatDataState cxChatDataState, Continuation<? super CxChatDataState> continuation) {
                        return ((C505571) create(cxChatDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return CxChatDataState.copy$default((CxChatDataState) this.L$0, null, null, null, null, this.$it, null, null, null, null, null, ErrorCodes.IO_EXCEPTION, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new C505571(this.Z$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onStart() {
        super.onStart();
        ActiveNetworkCounter2.registerNetworkCallback(this.connectivityManager, this.networkCounter);
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onStop() {
        super.onStop();
        this.connectivityManager.unregisterNetworkCallback(this.networkCounter);
    }

    /* compiled from: CxChatDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.supportchat.thread.CxChatDuxo$createSupportChat$1", m3645f = "CxChatDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_CONSENT_HEADER_WEB3_DARK_APPEARANCE_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.supportchat.thread.CxChatDuxo$createSupportChat$1 */
    static final class C291371 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C291371(Continuation<? super C291371> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CxChatDuxo.this.new C291371(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C291371) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Parcelable args = CxChatDuxo.INSTANCE.getArgs((HasSavedState) CxChatDuxo.this);
                CxChatFragmentKey.NewChat newChat = args instanceof CxChatFragmentKey.NewChat ? (CxChatFragmentKey.NewChat) args : null;
                boolean zIsChatbot = newChat != null ? newChat.isChatbot() : false;
                CxChatDuxo cxChatDuxo = CxChatDuxo.this;
                this.label = 1;
                if (cxChatDuxo.createSupportChatInternal(zIsChatbot, this) == coroutine_suspended) {
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

    public final void createSupportChat() {
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C291371(null), 3, null);
    }

    /* compiled from: CxChatDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.supportchat.thread.CxChatDuxo$fetchSupportChat$1", m3645f = "CxChatDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_HEADER_NOT_LISTED_ERROR_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.supportchat.thread.CxChatDuxo$fetchSupportChat$1 */
    static final class C291481 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ UUID $inquiryId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C291481(UUID uuid, Continuation<? super C291481> continuation) {
            super(2, continuation);
            this.$inquiryId = uuid;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CxChatDuxo.this.new C291481(this.$inquiryId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C291481) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CxChatDuxo cxChatDuxo = CxChatDuxo.this;
                UUID uuid = this.$inquiryId;
                this.label = 1;
                if (cxChatDuxo.fetchSupportChatInternal(uuid, this) == coroutine_suspended) {
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

    public final void fetchSupportChat(UUID inquiryId) {
        Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C291481(inquiryId, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0077, code lost:
    
        if (onSupportChatLoaded(r7, r0) == r1) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object fetchSupportChatInternal(UUID uuid, Continuation<? super Unit> continuation) {
        C291491 c291491;
        Unit unit;
        if (continuation instanceof C291491) {
            c291491 = (C291491) continuation;
            int i = c291491.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c291491.label = i - Integer.MIN_VALUE;
            } else {
                c291491 = new C291491(continuation);
            }
        }
        Object obj = c291491.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c291491.label;
        try {
        } catch (Throwable th) {
            if ((th instanceof CancellationException) || !Throwables.isNetworkRelated(th)) {
                throw th;
            }
            applyMutation(new CxChatDuxo3(uuid, null));
            unit = null;
        }
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            applyMutation(new CxChatDuxo2(null));
            SupportChatStore supportChatStore = this.supportChatStore;
            c291491.L$0 = uuid;
            c291491.label = 1;
            if (supportChatStore.fetchSupportChat(uuid, c291491) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            uuid = (UUID) c291491.L$0;
            ResultKt.throwOnFailure(obj);
        }
        unit = Unit.INSTANCE;
        if (unit == null) {
            return Unit.INSTANCE;
        }
        c291491.L$0 = null;
        c291491.label = 2;
    }

    private final CxChatDialogData.CxChatExistingLiveCase toDialog(ApiExistingLiveCase apiExistingLiveCase) {
        if (apiExistingLiveCase.getErrorCode() != 1) {
            return null;
        }
        ApiExistingLiveCase.Cta primaryCta = apiExistingLiveCase.getAlertInfo().getPrimaryCta();
        return new CxChatDialogData.CxChatExistingLiveCase(apiExistingLiveCase.getAlertInfo().getTitle(), apiExistingLiveCase.getAlertInfo().getMessage(), primaryCta != null ? new CxChatDialogData.CxChatExistingLiveCase.PrimaryCta(primaryCta.getTitle(), primaryCta.getDeeplink()) : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x008d, code lost:
    
        if (onSupportChatLoaded(r14, r0) != r1) goto L72;
     */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object createSupportChatInternal(boolean z, Continuation<? super Unit> continuation) throws IOException {
        C291381 c291381;
        Response<?> response;
        ResponseBody responseBodyErrorBody;
        Object objM28550constructorimpl;
        if (continuation instanceof C291381) {
            c291381 = (C291381) continuation;
            int i = c291381.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c291381.label = i - Integer.MIN_VALUE;
            } else {
                c291381 = new C291381(continuation);
            }
        }
        Object objCreateSupportChat = c291381.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c291381.label;
        try {
        } catch (Throwable th) {
            if ((th instanceof CancellationException) || !Throwables.isNetworkRelated(th)) {
                throw th;
            }
            JsonAdapter<ApiExistingLiveCase> jsonAdapter = this.existingLiveCaseAdapter;
            HttpException httpException = th instanceof HttpException ? th : null;
            if (httpException != null && httpException.code() == 400 && (response = httpException.response()) != null && (responseBodyErrorBody = response.errorBody()) != null) {
                String strString = responseBodyErrorBody.string();
                try {
                    Result.Companion companion = Result.INSTANCE;
                    HttpException httpException2 = th;
                    objM28550constructorimpl = Result.m28550constructorimpl(jsonAdapter.fromJson(strString));
                } catch (Throwable th2) {
                    Result.Companion companion2 = Result.INSTANCE;
                    objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th2));
                }
                if (Result.m28555isFailureimpl(objM28550constructorimpl)) {
                    objM28550constructorimpl = null;
                }
                ApiExistingLiveCase apiExistingLiveCase = (ApiExistingLiveCase) objM28550constructorimpl;
                CxChatDialogData dialog = apiExistingLiveCase != null ? toDialog(apiExistingLiveCase) : null;
                if (dialog != null && apiExistingLiveCase.getErrorCode() == 1) {
                    openDialog(dialog);
                    return Unit.INSTANCE;
                }
                applyMutation(new C291403(null));
            }
        }
        if (i2 == 0) {
            ResultKt.throwOnFailure(objCreateSupportChat);
            UUID uuid = (UUID) getSavedStateHandle().get(KEY_INQUIRY_ID);
            if (uuid != null) {
                c291381.label = 1;
                if (onSupportChatLoaded(uuid, c291381) == coroutine_suspended) {
                }
                return Unit.INSTANCE;
            }
            applyMutation(new C291392(null));
            SupportChatStore supportChatStore = this.supportChatStore;
            c291381.label = 2;
            objCreateSupportChat = supportChatStore.createSupportChat(z, c291381);
            if (objCreateSupportChat != coroutine_suspended) {
                SupportChat supportChat = (SupportChat) objCreateSupportChat;
                SupportChatStore.saveSupportChat$default(this.supportChatStore, supportChat.getInquiryId(), supportChat, null, 4, null);
                UUID inquiryId = supportChat.getInquiryId();
                c291381.label = 3;
            }
            return coroutine_suspended;
        }
        if (i2 == 1) {
            ResultKt.throwOnFailure(objCreateSupportChat);
            return Unit.INSTANCE;
        }
        if (i2 != 2) {
            if (i2 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objCreateSupportChat);
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(objCreateSupportChat);
        SupportChat supportChat2 = (SupportChat) objCreateSupportChat;
        SupportChatStore.saveSupportChat$default(this.supportChatStore, supportChat2.getInquiryId(), supportChat2, null, 4, null);
        UUID inquiryId2 = supportChat2.getInquiryId();
        c291381.label = 3;
    }

    /* compiled from: CxChatDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/supportchat/thread/CxChatDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.supportchat.thread.CxChatDuxo$createSupportChatInternal$2", m3645f = "CxChatDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.supportchat.thread.CxChatDuxo$createSupportChatInternal$2 */
    static final class C291392 extends ContinuationImpl7 implements Function2<CxChatDataState, Continuation<? super CxChatDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C291392(Continuation<? super C291392> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C291392 c291392 = new C291392(continuation);
            c291392.L$0 = obj;
            return c291392;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CxChatDataState cxChatDataState, Continuation<? super CxChatDataState> continuation) {
            return ((C291392) create(cxChatDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return CxChatDataState.copy$default((CxChatDataState) this.L$0, CxChatDataState.InitialStatus.Loading.INSTANCE, null, null, null, false, null, null, null, null, null, 1022, null);
        }
    }

    /* compiled from: CxChatDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/supportchat/thread/CxChatDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.supportchat.thread.CxChatDuxo$createSupportChatInternal$3", m3645f = "CxChatDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.supportchat.thread.CxChatDuxo$createSupportChatInternal$3 */
    static final class C291403 extends ContinuationImpl7 implements Function2<CxChatDataState, Continuation<? super CxChatDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C291403(Continuation<? super C291403> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C291403 c291403 = new C291403(continuation);
            c291403.L$0 = obj;
            return c291403;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CxChatDataState cxChatDataState, Continuation<? super CxChatDataState> continuation) {
            return ((C291403) create(cxChatDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return CxChatDataState.copy$default((CxChatDataState) this.L$0, CxChatDataState.InitialStatus.FailedCreating.INSTANCE, null, null, null, false, null, null, null, null, null, 1022, null);
        }
    }

    /* compiled from: CxChatDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lkotlinx/coroutines/Job;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.supportchat.thread.CxChatDuxo$onSupportChatLoaded$2", m3645f = "CxChatDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.supportchat.thread.CxChatDuxo$onSupportChatLoaded$2 */
    static final class C291582 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Job>, Object> {
        final /* synthetic */ UUID $inquiryId;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C291582(UUID uuid, Continuation<? super C291582> continuation) {
            super(2, continuation);
            this.$inquiryId = uuid;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C291582 c291582 = CxChatDuxo.this.new C291582(this.$inquiryId, continuation);
            c291582.L$0 = obj;
            return c291582;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Job> continuation) {
            return ((C291582) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            CxChatDuxo.this.getSavedStateHandle().set(CxChatDuxo.KEY_INQUIRY_ID, this.$inquiryId);
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(CxChatDuxo.this, this.$inquiryId, null), 3, null);
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass2(CxChatDuxo.this, this.$inquiryId, null), 3, null);
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass3(CxChatDuxo.this, this.$inquiryId, null), 3, null);
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass4(CxChatDuxo.this, this.$inquiryId, null), 3, null);
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass5(CxChatDuxo.this, this.$inquiryId, null), 3, null);
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass6(CxChatDuxo.this, this.$inquiryId, null), 3, null);
            return BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass7(null), 3, null);
        }

        /* compiled from: CxChatDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.supportchat.thread.CxChatDuxo$onSupportChatLoaded$2$1", m3645f = "CxChatDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_WAIT_SOME_TIME_VALUE}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.supportchat.thread.CxChatDuxo$onSupportChatLoaded$2$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ UUID $inquiryId;
            int label;
            final /* synthetic */ CxChatDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(CxChatDuxo cxChatDuxo, UUID uuid, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = cxChatDuxo;
                this.$inquiryId = uuid;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, this.$inquiryId, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow<SupportChat> flowPollSupportChat = this.this$0.supportChatStore.pollSupportChat(this.$inquiryId);
                    this.label = 1;
                    if (FlowKt.collect(flowPollSupportChat, this) == coroutine_suspended) {
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

        /* compiled from: CxChatDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.supportchat.thread.CxChatDuxo$onSupportChatLoaded$2$2", m3645f = "CxChatDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_HEADER_SHIELD_VALUE}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.supportchat.thread.CxChatDuxo$onSupportChatLoaded$2$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ UUID $inquiryId;
            int label;
            final /* synthetic */ CxChatDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(CxChatDuxo cxChatDuxo, UUID uuid, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = cxChatDuxo;
                this.$inquiryId = uuid;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass2(this.this$0, this.$inquiryId, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    CxChatDuxo cxChatDuxo = this.this$0;
                    UUID uuid = this.$inquiryId;
                    this.label = 1;
                    if (cxChatDuxo.observeSupportChat(uuid, this) == coroutine_suspended) {
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

        /* compiled from: CxChatDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.supportchat.thread.CxChatDuxo$onSupportChatLoaded$2$3", m3645f = "CxChatDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_HEADER_ENABLE_TRANSFERS_VALUE}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.supportchat.thread.CxChatDuxo$onSupportChatLoaded$2$3, reason: invalid class name */
        static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ UUID $inquiryId;
            int label;
            final /* synthetic */ CxChatDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(CxChatDuxo cxChatDuxo, UUID uuid, Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
                this.this$0 = cxChatDuxo;
                this.$inquiryId = uuid;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass3(this.this$0, this.$inquiryId, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    CxChatDuxo cxChatDuxo = this.this$0;
                    UUID uuid = this.$inquiryId;
                    this.label = 1;
                    if (cxChatDuxo.observeChatbotChat(uuid, this) == coroutine_suspended) {
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

        /* compiled from: CxChatDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.supportchat.thread.CxChatDuxo$onSupportChatLoaded$2$4", m3645f = "CxChatDuxo.kt", m3646l = {271}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.supportchat.thread.CxChatDuxo$onSupportChatLoaded$2$4, reason: invalid class name */
        static final class AnonymousClass4 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ UUID $inquiryId;
            int label;
            final /* synthetic */ CxChatDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass4(CxChatDuxo cxChatDuxo, UUID uuid, Continuation<? super AnonymousClass4> continuation) {
                super(2, continuation);
                this.this$0 = cxChatDuxo;
                this.$inquiryId = uuid;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass4(this.this$0, this.$inquiryId, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    CxChatDuxo cxChatDuxo = this.this$0;
                    UUID uuid = this.$inquiryId;
                    this.label = 1;
                    if (cxChatDuxo.observeSalesforceAgentChat(uuid, this) == coroutine_suspended) {
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

        /* compiled from: CxChatDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.supportchat.thread.CxChatDuxo$onSupportChatLoaded$2$5", m3645f = "CxChatDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_SUCCESS_BRUSHSTROKE_VALUE}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.supportchat.thread.CxChatDuxo$onSupportChatLoaded$2$5, reason: invalid class name */
        static final class AnonymousClass5 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ UUID $inquiryId;
            int label;
            final /* synthetic */ CxChatDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass5(CxChatDuxo cxChatDuxo, UUID uuid, Continuation<? super AnonymousClass5> continuation) {
                super(2, continuation);
                this.this$0 = cxChatDuxo;
                this.$inquiryId = uuid;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass5(this.this$0, this.$inquiryId, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass5) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    CxChatDuxo cxChatDuxo = this.this$0;
                    UUID uuid = this.$inquiryId;
                    this.label = 1;
                    if (cxChatDuxo.observeTwilioAgentChat(uuid, this) == coroutine_suspended) {
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

        /* compiled from: CxChatDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.supportchat.thread.CxChatDuxo$onSupportChatLoaded$2$6", m3645f = "CxChatDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_DEBIT_CARD_OVERLAY_PIGGY_SOLID_VALUE}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.supportchat.thread.CxChatDuxo$onSupportChatLoaded$2$6, reason: invalid class name */
        static final class AnonymousClass6 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ UUID $inquiryId;
            int label;
            final /* synthetic */ CxChatDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass6(CxChatDuxo cxChatDuxo, UUID uuid, Continuation<? super AnonymousClass6> continuation) {
                super(2, continuation);
                this.this$0 = cxChatDuxo;
                this.$inquiryId = uuid;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass6(this.this$0, this.$inquiryId, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass6) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    CxChatDuxo cxChatDuxo = this.this$0;
                    UUID uuid = this.$inquiryId;
                    this.label = 1;
                    if (cxChatDuxo.observeUnsentMessages(uuid, this) == coroutine_suspended) {
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

        /* compiled from: CxChatDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.supportchat.thread.CxChatDuxo$onSupportChatLoaded$2$7", m3645f = "CxChatDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.supportchat.thread.CxChatDuxo$onSupportChatLoaded$2$7, reason: invalid class name */
        static final class AnonymousClass7 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;

            AnonymousClass7(Continuation<? super AnonymousClass7> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass7(continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass7) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object onSupportChatLoaded(UUID uuid, Continuation<? super Job> continuation) {
        return CoroutineScope2.coroutineScope(new C291582(uuid, null), continuation);
    }

    /* compiled from: CxChatDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.supportchat.thread.CxChatDuxo$observeSupportChat$2", m3645f = "CxChatDuxo.kt", m3646l = {288}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.supportchat.thread.CxChatDuxo$observeSupportChat$2 */
    static final class C291522 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ UUID $inquiryId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C291522(UUID uuid, Continuation<? super C291522> continuation) {
            super(2, continuation);
            this.$inquiryId = uuid;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CxChatDuxo.this.new C291522(this.$inquiryId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C291522) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow<SupportChat> flowStreamSupportChat = CxChatDuxo.this.supportChatStore.streamSupportChat(this.$inquiryId);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(CxChatDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowStreamSupportChat, anonymousClass1, this) == coroutine_suspended) {
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

        /* compiled from: CxChatDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "supportChat", "Lcom/robinhood/models/ui/pathfinder/messaging/SupportChat;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.supportchat.thread.CxChatDuxo$observeSupportChat$2$1", m3645f = "CxChatDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.supportchat.thread.CxChatDuxo$observeSupportChat$2$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<SupportChat, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ CxChatDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(CxChatDuxo cxChatDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = cxChatDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(SupportChat supportChat, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(supportChat, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: CxChatDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/supportchat/thread/CxChatDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.supportchat.thread.CxChatDuxo$observeSupportChat$2$1$1", m3645f = "CxChatDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.supportchat.thread.CxChatDuxo$observeSupportChat$2$1$1, reason: invalid class name and collision with other inner class name */
            static final class C505561 extends ContinuationImpl7 implements Function2<CxChatDataState, Continuation<? super CxChatDataState>, Object> {
                final /* synthetic */ SupportChat $supportChat;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C505561(SupportChat supportChat, Continuation<? super C505561> continuation) {
                    super(2, continuation);
                    this.$supportChat = supportChat;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C505561 c505561 = new C505561(this.$supportChat, continuation);
                    c505561.L$0 = obj;
                    return c505561;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CxChatDataState cxChatDataState, Continuation<? super CxChatDataState> continuation) {
                    return ((C505561) create(cxChatDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    CxChatDataState cxChatDataState = (CxChatDataState) this.L$0;
                    CxChatDataState.InitialStatus initialStatus = cxChatDataState.getInitialStatus();
                    CxChatDataState.InitialStatus.Success success = initialStatus instanceof CxChatDataState.InitialStatus.Success ? (CxChatDataState.InitialStatus.Success) initialStatus : null;
                    CxChatDataState.InitialChatType initialChatType = success != null ? success.getInitialChatType() : null;
                    SupportChat supportChat = this.$supportChat;
                    if (initialChatType == null) {
                        initialChatType = CxChatDataState2.toInitialChatType(supportChat);
                    }
                    return CxChatDataState.copy$default(cxChatDataState, new CxChatDataState.InitialStatus.Success(supportChat, initialChatType), null, null, null, false, null, null, null, null, null, 1022, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new C505561((SupportChat) this.L$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object observeSupportChat(UUID uuid, Continuation<? super Unit> continuation) {
        Object objCoroutineScope = CoroutineScope2.coroutineScope(new C291522(uuid, null), continuation);
        return objCoroutineScope == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCoroutineScope : Unit.INSTANCE;
    }

    /* compiled from: CxChatDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/shared/models/chat/common/UnsentInput;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.supportchat.thread.CxChatDuxo$observeUnsentMessages$2", m3645f = "CxChatDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.supportchat.thread.CxChatDuxo$observeUnsentMessages$2 */
    static final class C291542 extends ContinuationImpl7 implements Function2<ImmutableList<? extends UnsentInput>, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        C291542(Continuation<? super C291542> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C291542 c291542 = CxChatDuxo.this.new C291542(continuation);
            c291542.L$0 = obj;
            return c291542;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ImmutableList<? extends UnsentInput> immutableList, Continuation<? super Unit> continuation) {
            return ((C291542) create(immutableList, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: CxChatDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/supportchat/thread/CxChatDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.supportchat.thread.CxChatDuxo$observeUnsentMessages$2$1", m3645f = "CxChatDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.supportchat.thread.CxChatDuxo$observeUnsentMessages$2$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CxChatDataState, Continuation<? super CxChatDataState>, Object> {
            final /* synthetic */ ImmutableList<UnsentInput> $it;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass1(ImmutableList<? extends UnsentInput> immutableList, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$it = immutableList;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$it, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CxChatDataState cxChatDataState, Continuation<? super CxChatDataState> continuation) {
                return ((AnonymousClass1) create(cxChatDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return CxChatDataState.copy$default((CxChatDataState) this.L$0, null, null, null, null, false, this.$it, null, null, null, null, 991, null);
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                CxChatDuxo.this.applyMutation(new AnonymousClass1((ImmutableList) this.L$0, null));
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object observeUnsentMessages(UUID uuid, Continuation<? super Unit> continuation) {
        Object objCollectLatest = FlowKt.collectLatest(InFlightMessageStore.streamInFlightMessages$default(this.inFlightMessageStore, uuid, null, 2, null), new C291542(null), continuation);
        return objCollectLatest == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollectLatest : Unit.INSTANCE;
    }

    /* compiled from: CxChatDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.supportchat.thread.CxChatDuxo$observeChatbotChat$2", m3645f = "CxChatDuxo.kt", m3646l = {EnumC7081g.f2781x2ba65ba3}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.supportchat.thread.CxChatDuxo$observeChatbotChat$2 */
    static final class C291502 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ UUID $inquiryId;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C291502(UUID uuid, Continuation<? super C291502> continuation) {
            super(2, continuation);
            this.$inquiryId = uuid;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C291502 c291502 = CxChatDuxo.this.new C291502(this.$inquiryId, continuation);
            c291502.L$0 = obj;
            return c291502;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C291502) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            CoroutineScope coroutineScope;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope2 = (CoroutineScope) this.L$0;
                final Flow<SupportChat> flowStreamSupportChat = CxChatDuxo.this.supportChatStore.streamSupportChat(this.$inquiryId);
                Flow<Tuples2<? extends UUID, ? extends SupportChat>> flow = new Flow<Tuples2<? extends UUID, ? extends SupportChat>>() { // from class: com.robinhood.android.supportchat.thread.CxChatDuxo$observeChatbotChat$2$invokeSuspend$$inlined$mapNotNull$1
                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super Tuples2<? extends UUID, ? extends SupportChat>> flowCollector, Continuation continuation) {
                        Object objCollect = flowStreamSupportChat.collect(new AnonymousClass2(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.supportchat.thread.CxChatDuxo$observeChatbotChat$2$invokeSuspend$$inlined$mapNotNull$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.supportchat.thread.CxChatDuxo$observeChatbotChat$2$invokeSuspend$$inlined$mapNotNull$1$2", m3645f = "CxChatDuxo.kt", m3646l = {53}, m3647m = "emit")
                        /* renamed from: com.robinhood.android.supportchat.thread.CxChatDuxo$observeChatbotChat$2$invokeSuspend$$inlined$mapNotNull$1$2$1, reason: invalid class name */
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
                            UUID conversationId;
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
                                SupportChat supportChat = (SupportChat) obj;
                                ChatbotChat chatbotChat = supportChat.getChatbotChat();
                                Tuples2 tuples2M3642to = (chatbotChat == null || (conversationId = chatbotChat.getConversationId()) == null) ? null : Tuples4.m3642to(conversationId, supportChat);
                                if (tuples2M3642to != null) {
                                    anonymousClass1.label = 1;
                                    if (flowCollector.emit(tuples2M3642to, anonymousClass1) == coroutine_suspended) {
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
                this.L$0 = coroutineScope2;
                this.label = 1;
                Object objFirstOrNull = FlowKt.firstOrNull(flow, this);
                if (objFirstOrNull == coroutine_suspended) {
                    return coroutine_suspended;
                }
                coroutineScope = coroutineScope2;
                obj = objFirstOrNull;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                coroutineScope = (CoroutineScope) this.L$0;
                ResultKt.throwOnFailure(obj);
            }
            Tuples2 tuples2 = (Tuples2) obj;
            if (tuples2 == null) {
                return Unit.INSTANCE;
            }
            UUID uuid = (UUID) tuples2.component1();
            SupportChat supportChat = (SupportChat) tuples2.component2();
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(CxChatDuxo.this, uuid, null), 3, null);
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass2(CxChatDuxo.this, uuid, supportChat, null), 3, null);
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass3(CxChatDuxo.this, uuid, this.$inquiryId, null), 3, null);
            return Unit.INSTANCE;
        }

        /* compiled from: CxChatDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.supportchat.thread.CxChatDuxo$observeChatbotChat$2$1", m3645f = "CxChatDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_STEP_COMPLETE_VALUE}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.supportchat.thread.CxChatDuxo$observeChatbotChat$2$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ UUID $chatbotId;
            int label;
            final /* synthetic */ CxChatDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(CxChatDuxo cxChatDuxo, UUID uuid, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = cxChatDuxo;
                this.$chatbotId = uuid;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, this.$chatbotId, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow<Unit> flowPollSession = this.this$0.chatbotStore.pollSession(this.$chatbotId);
                    this.label = 1;
                    if (FlowKt.collect(flowPollSession, this) == coroutine_suspended) {
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

        /* compiled from: CxChatDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.supportchat.thread.CxChatDuxo$observeChatbotChat$2$2", m3645f = "CxChatDuxo.kt", m3646l = {331}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.supportchat.thread.CxChatDuxo$observeChatbotChat$2$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ UUID $chatbotId;
            final /* synthetic */ SupportChat $supportChat;
            int label;
            final /* synthetic */ CxChatDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(CxChatDuxo cxChatDuxo, UUID uuid, SupportChat supportChat, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = cxChatDuxo;
                this.$chatbotId = uuid;
                this.$supportChat = supportChat;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass2(this.this$0, this.$chatbotId, this.$supportChat, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                try {
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        CxChatDuxo cxChatDuxo = this.this$0;
                        UUID uuid = this.$chatbotId;
                        this.label = 1;
                        if (cxChatDuxo.fetchChatbotMessages(uuid, null, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                } catch (Throwable th) {
                    boolean z = this.$supportChat.getCurrentType() == ChatCurrentType.CHATBOT_CHAT;
                    ChatbotChat chatbotChat = this.$supportChat.getChatbotChat();
                    boolean zAreEqual = chatbotChat != null ? Intrinsics.areEqual(chatbotChat.getCanBeEscalated(), boxing.boxBoolean(true)) : false;
                    if (z && zAreEqual && Throwables.isNetworkRelated(th)) {
                        this.this$0.openDialog(CxChatDialogData.UnrecoverableChatbotError.INSTANCE);
                    } else {
                        CxChatDuxo.handleOrThrow$default(this.this$0, th, null, 1, null);
                    }
                }
                return Unit.INSTANCE;
            }
        }

        /* compiled from: CxChatDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.supportchat.thread.CxChatDuxo$observeChatbotChat$2$3", m3645f = "CxChatDuxo.kt", m3646l = {346}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.supportchat.thread.CxChatDuxo$observeChatbotChat$2$3, reason: invalid class name */
        static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ UUID $chatbotId;
            final /* synthetic */ UUID $inquiryId;
            int label;
            final /* synthetic */ CxChatDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(CxChatDuxo cxChatDuxo, UUID uuid, UUID uuid2, Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
                this.this$0 = cxChatDuxo;
                this.$chatbotId = uuid;
                this.$inquiryId = uuid2;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass3(this.this$0, this.$chatbotId, this.$inquiryId, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow<ChatbotSession> flowStreamSession = this.this$0.chatbotStore.streamSession(this.$chatbotId);
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$inquiryId, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowStreamSession, anonymousClass1, this) == coroutine_suspended) {
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

            /* compiled from: CxChatDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "chatbotChat", "Lcom/robinhood/models/ui/v2/ChatbotSession;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.supportchat.thread.CxChatDuxo$observeChatbotChat$2$3$1", m3645f = "CxChatDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.supportchat.thread.CxChatDuxo$observeChatbotChat$2$3$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<ChatbotSession, Continuation<? super Unit>, Object> {
                final /* synthetic */ UUID $inquiryId;
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ CxChatDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(CxChatDuxo cxChatDuxo, UUID uuid, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = cxChatDuxo;
                    this.$inquiryId = uuid;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$inquiryId, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(ChatbotSession chatbotSession, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(chatbotSession, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new C505531((ChatbotSession) this.L$0, !(r6.getExtraUserInputType() instanceof SelectionMenuState.SelectionMenu), this.$inquiryId, null));
                    return Unit.INSTANCE;
                }

                /* compiled from: CxChatDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/supportchat/thread/CxChatDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.supportchat.thread.CxChatDuxo$observeChatbotChat$2$3$1$1", m3645f = "CxChatDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                @SourceDebugExtension
                /* renamed from: com.robinhood.android.supportchat.thread.CxChatDuxo$observeChatbotChat$2$3$1$1, reason: invalid class name and collision with other inner class name */
                static final class C505531 extends ContinuationImpl7 implements Function2<CxChatDataState, Continuation<? super CxChatDataState>, Object> {
                    final /* synthetic */ ChatbotSession $chatbotChat;
                    final /* synthetic */ UUID $inquiryId;
                    final /* synthetic */ boolean $shouldClearHideMenu;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C505531(ChatbotSession chatbotSession, boolean z, UUID uuid, Continuation<? super C505531> continuation) {
                        super(2, continuation);
                        this.$chatbotChat = chatbotSession;
                        this.$shouldClearHideMenu = z;
                        this.$inquiryId = uuid;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C505531 c505531 = new C505531(this.$chatbotChat, this.$shouldClearHideMenu, this.$inquiryId, continuation);
                        c505531.L$0 = obj;
                        return c505531;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(CxChatDataState cxChatDataState, Continuation<? super CxChatDataState> continuation) {
                        return ((C505531) create(cxChatDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        Set<UUID> hideSelectionMenuForInquiry;
                        Set<UUID> setMinus;
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        CxChatDataState cxChatDataState = (CxChatDataState) this.L$0;
                        List<UnsentInput> pendingMessages = cxChatDataState.getPendingMessages();
                        boolean z = false;
                        if (!(pendingMessages instanceof Collection) || !pendingMessages.isEmpty()) {
                            Iterator<T> it = pendingMessages.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    break;
                                }
                                if (((UnsentInput) it.next()) instanceof UnsentInput.SuggestedResponse) {
                                    z = true;
                                    break;
                                }
                            }
                        }
                        ChatbotSession chatbotSession = this.$chatbotChat;
                        if (this.$shouldClearHideMenu) {
                            hideSelectionMenuForInquiry = SetsKt.minus(cxChatDataState.getHideSelectionMenuForInquiry(), this.$inquiryId);
                        } else {
                            hideSelectionMenuForInquiry = cxChatDataState.getHideSelectionMenuForInquiry();
                        }
                        Set<UUID> set = hideSelectionMenuForInquiry;
                        if (z) {
                            setMinus = cxChatDataState.getHideSuggestedResponsesForInquiry();
                        } else {
                            setMinus = SetsKt.minus(cxChatDataState.getHideSuggestedResponsesForInquiry(), this.$inquiryId);
                        }
                        return CxChatDataState.copy$default(cxChatDataState, null, null, chatbotSession, null, false, null, null, null, set, setMinus, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_SECOND_DEPOSIT_VALUE, null);
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object observeChatbotChat(UUID uuid, Continuation<? super Unit> continuation) {
        Object objCoroutineScope = CoroutineScope2.coroutineScope(new C291502(uuid, null), continuation);
        return objCoroutineScope == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCoroutineScope : Unit.INSTANCE;
    }

    /* compiled from: CxChatDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.supportchat.thread.CxChatDuxo$observeSalesforceAgentChat$2", m3645f = "CxChatDuxo.kt", m3646l = {374}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.supportchat.thread.CxChatDuxo$observeSalesforceAgentChat$2 */
    static final class C291512 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ UUID $inquiryId;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C291512(UUID uuid, Continuation<? super C291512> continuation) {
            super(2, continuation);
            this.$inquiryId = uuid;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C291512 c291512 = CxChatDuxo.this.new C291512(this.$inquiryId, continuation);
            c291512.L$0 = obj;
            return c291512;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C291512) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            CoroutineScope coroutineScope;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope2 = (CoroutineScope) this.L$0;
                final Flow<SupportChat> flowStreamSupportChat = CxChatDuxo.this.supportChatStore.streamSupportChat(this.$inquiryId);
                final Flow<AgentChat.AgentChatConversation.AgentChatSalesforceChat> flow = new Flow<AgentChat.AgentChatConversation.AgentChatSalesforceChat>() { // from class: com.robinhood.android.supportchat.thread.CxChatDuxo$observeSalesforceAgentChat$2$invokeSuspend$$inlined$mapNotNull$1
                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super AgentChat.AgentChatConversation.AgentChatSalesforceChat> flowCollector, Continuation continuation) {
                        Object objCollect = flowStreamSupportChat.collect(new AnonymousClass2(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.supportchat.thread.CxChatDuxo$observeSalesforceAgentChat$2$invokeSuspend$$inlined$mapNotNull$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.supportchat.thread.CxChatDuxo$observeSalesforceAgentChat$2$invokeSuspend$$inlined$mapNotNull$1$2", m3645f = "CxChatDuxo.kt", m3646l = {52}, m3647m = "emit")
                        /* renamed from: com.robinhood.android.supportchat.thread.CxChatDuxo$observeSalesforceAgentChat$2$invokeSuspend$$inlined$mapNotNull$1$2$1, reason: invalid class name */
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
                                AgentChat agentChat = ((SupportChat) obj).getAgentChat();
                                AgentChat.AgentChatConversation conversation = agentChat != null ? agentChat.getConversation() : null;
                                AgentChat.AgentChatConversation.AgentChatSalesforceChat agentChatSalesforceChat = conversation instanceof AgentChat.AgentChatConversation.AgentChatSalesforceChat ? (AgentChat.AgentChatConversation.AgentChatSalesforceChat) conversation : null;
                                if (agentChatSalesforceChat != null) {
                                    anonymousClass1.label = 1;
                                    if (flowCollector.emit(agentChatSalesforceChat, anonymousClass1) == coroutine_suspended) {
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
                Flow<UUID> flow2 = new Flow<UUID>() { // from class: com.robinhood.android.supportchat.thread.CxChatDuxo$observeSalesforceAgentChat$2$invokeSuspend$$inlined$mapNotNull$2
                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super UUID> flowCollector, Continuation continuation) {
                        Object objCollect = flow.collect(new AnonymousClass2(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.supportchat.thread.CxChatDuxo$observeSalesforceAgentChat$2$invokeSuspend$$inlined$mapNotNull$2$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.supportchat.thread.CxChatDuxo$observeSalesforceAgentChat$2$invokeSuspend$$inlined$mapNotNull$2$2", m3645f = "CxChatDuxo.kt", m3646l = {52}, m3647m = "emit")
                        /* renamed from: com.robinhood.android.supportchat.thread.CxChatDuxo$observeSalesforceAgentChat$2$invokeSuspend$$inlined$mapNotNull$2$2$1, reason: invalid class name */
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
                                UUID id = ((AgentChat.AgentChatConversation.AgentChatSalesforceChat) obj).getId();
                                if (id != null) {
                                    anonymousClass1.label = 1;
                                    if (flowCollector.emit(id, anonymousClass1) == coroutine_suspended) {
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
                this.L$0 = coroutineScope2;
                this.label = 1;
                Object objFirstOrNull = FlowKt.firstOrNull(flow2, this);
                if (objFirstOrNull == coroutine_suspended) {
                    return coroutine_suspended;
                }
                coroutineScope = coroutineScope2;
                obj = objFirstOrNull;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                coroutineScope = (CoroutineScope) this.L$0;
                ResultKt.throwOnFailure(obj);
            }
            UUID uuid = (UUID) obj;
            if (uuid != null) {
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(CxChatDuxo.this, uuid, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass2(CxChatDuxo.this, this.$inquiryId, uuid, null), 3, null);
                return Unit.INSTANCE;
            }
            return Unit.INSTANCE;
        }

        /* compiled from: CxChatDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.supportchat.thread.CxChatDuxo$observeSalesforceAgentChat$2$1", m3645f = "CxChatDuxo.kt", m3646l = {382}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.supportchat.thread.CxChatDuxo$observeSalesforceAgentChat$2$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ UUID $conversationId;
            int label;
            final /* synthetic */ CxChatDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(CxChatDuxo cxChatDuxo, UUID uuid, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = cxChatDuxo;
                this.$conversationId = uuid;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, this.$conversationId, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                try {
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        Flow flowThrottleLatest = Flows3.throttleLatest(FlowKt.drop(this.this$0.inputFlow, 1), 3000L);
                        C505541 c505541 = new C505541(this.this$0, this.$conversationId, null);
                        this.label = 1;
                        if (FlowKt.collectLatest(flowThrottleLatest, c505541, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                } catch (Throwable th) {
                    CxChatDuxo.handleOrThrow$default(this.this$0, th, null, 1, null);
                }
                return Unit.INSTANCE;
            }

            /* compiled from: CxChatDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.supportchat.thread.CxChatDuxo$observeSalesforceAgentChat$2$1$1", m3645f = "CxChatDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.supportchat.thread.CxChatDuxo$observeSalesforceAgentChat$2$1$1, reason: invalid class name and collision with other inner class name */
            static final class C505541 extends ContinuationImpl7 implements Function2<String, Continuation<? super Unit>, Object> {
                final /* synthetic */ UUID $conversationId;
                int label;
                final /* synthetic */ CxChatDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C505541(CxChatDuxo cxChatDuxo, UUID uuid, Continuation<? super C505541> continuation) {
                    super(2, continuation);
                    this.this$0 = cxChatDuxo;
                    this.$conversationId = uuid;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new C505541(this.this$0, this.$conversationId, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(String str, Continuation<? super Unit> continuation) {
                    return ((C505541) create(str, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.salesforceChatStore.sendTypingStatus(this.$conversationId);
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* compiled from: CxChatDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.supportchat.thread.CxChatDuxo$observeSalesforceAgentChat$2$2", m3645f = "CxChatDuxo.kt", m3646l = {WaitlistAnimationConstants.LEFT_YAW_START}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.supportchat.thread.CxChatDuxo$observeSalesforceAgentChat$2$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ UUID $conversationId;
            final /* synthetic */ UUID $inquiryId;
            int label;
            final /* synthetic */ CxChatDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(CxChatDuxo cxChatDuxo, UUID uuid, UUID uuid2, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = cxChatDuxo;
                this.$inquiryId = uuid;
                this.$conversationId = uuid2;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass2(this.this$0, this.$inquiryId, this.$conversationId, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                try {
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        Flow<AgentChatSession> flowStreamAgentChatSession = this.this$0.salesforceChatStore.streamAgentChatSession(this.$inquiryId, this.$conversationId);
                        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                        this.label = 1;
                        if (FlowKt.collectLatest(flowStreamAgentChatSession, anonymousClass1, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                } catch (Throwable th) {
                    CxChatDuxo.handleOrThrow$default(this.this$0, th, null, 1, null);
                }
                return Unit.INSTANCE;
            }

            /* compiled from: CxChatDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "agentChat", "Lcom/robinhood/store/supportchat/AgentChatSession;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.supportchat.thread.CxChatDuxo$observeSalesforceAgentChat$2$2$1", m3645f = "CxChatDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.supportchat.thread.CxChatDuxo$observeSalesforceAgentChat$2$2$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<AgentChatSession, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ CxChatDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(CxChatDuxo cxChatDuxo, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = cxChatDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(AgentChatSession agentChatSession, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(agentChatSession, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: CxChatDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/supportchat/thread/CxChatDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.supportchat.thread.CxChatDuxo$observeSalesforceAgentChat$2$2$1$1", m3645f = "CxChatDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.supportchat.thread.CxChatDuxo$observeSalesforceAgentChat$2$2$1$1, reason: invalid class name and collision with other inner class name */
                static final class C505551 extends ContinuationImpl7 implements Function2<CxChatDataState, Continuation<? super CxChatDataState>, Object> {
                    final /* synthetic */ AgentChatSession $agentChat;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C505551(AgentChatSession agentChatSession, Continuation<? super C505551> continuation) {
                        super(2, continuation);
                        this.$agentChat = agentChatSession;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C505551 c505551 = new C505551(this.$agentChat, continuation);
                        c505551.L$0 = obj;
                        return c505551;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(CxChatDataState cxChatDataState, Continuation<? super CxChatDataState> continuation) {
                        return ((C505551) create(cxChatDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return CxChatDataState.copy$default((CxChatDataState) this.L$0, null, null, null, this.$agentChat, false, null, null, null, null, null, 1015, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new C505551((AgentChatSession) this.L$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object observeSalesforceAgentChat(UUID uuid, Continuation<? super Unit> continuation) {
        Object objCoroutineScope = CoroutineScope2.coroutineScope(new C291512(uuid, null), continuation);
        return objCoroutineScope == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCoroutineScope : Unit.INSTANCE;
    }

    /* compiled from: CxChatDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.supportchat.thread.CxChatDuxo$observeTwilioAgentChat$2", m3645f = "CxChatDuxo.kt", m3646l = {415}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.supportchat.thread.CxChatDuxo$observeTwilioAgentChat$2 */
    static final class C291532 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ UUID $inquiryId;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C291532(UUID uuid, Continuation<? super C291532> continuation) {
            super(2, continuation);
            this.$inquiryId = uuid;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C291532 c291532 = CxChatDuxo.this.new C291532(this.$inquiryId, continuation);
            c291532.L$0 = obj;
            return c291532;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C291532) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            CoroutineScope coroutineScope;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope2 = (CoroutineScope) this.L$0;
                final Flow<SupportChat> flowStreamSupportChat = CxChatDuxo.this.supportChatStore.streamSupportChat(this.$inquiryId);
                final Flow<AgentChat.AgentChatConversation.AgentChatTwilioChat> flow = new Flow<AgentChat.AgentChatConversation.AgentChatTwilioChat>() { // from class: com.robinhood.android.supportchat.thread.CxChatDuxo$observeTwilioAgentChat$2$invokeSuspend$$inlined$mapNotNull$1
                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super AgentChat.AgentChatConversation.AgentChatTwilioChat> flowCollector, Continuation continuation) {
                        Object objCollect = flowStreamSupportChat.collect(new AnonymousClass2(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.supportchat.thread.CxChatDuxo$observeTwilioAgentChat$2$invokeSuspend$$inlined$mapNotNull$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.supportchat.thread.CxChatDuxo$observeTwilioAgentChat$2$invokeSuspend$$inlined$mapNotNull$1$2", m3645f = "CxChatDuxo.kt", m3646l = {52}, m3647m = "emit")
                        /* renamed from: com.robinhood.android.supportchat.thread.CxChatDuxo$observeTwilioAgentChat$2$invokeSuspend$$inlined$mapNotNull$1$2$1, reason: invalid class name */
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
                                AgentChat agentChat = ((SupportChat) obj).getAgentChat();
                                AgentChat.AgentChatConversation conversation = agentChat != null ? agentChat.getConversation() : null;
                                AgentChat.AgentChatConversation.AgentChatTwilioChat agentChatTwilioChat = conversation instanceof AgentChat.AgentChatConversation.AgentChatTwilioChat ? (AgentChat.AgentChatConversation.AgentChatTwilioChat) conversation : null;
                                if (agentChatTwilioChat != null) {
                                    anonymousClass1.label = 1;
                                    if (flowCollector.emit(agentChatTwilioChat, anonymousClass1) == coroutine_suspended) {
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
                Flow<String> flow2 = new Flow<String>() { // from class: com.robinhood.android.supportchat.thread.CxChatDuxo$observeTwilioAgentChat$2$invokeSuspend$$inlined$mapNotNull$2
                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super String> flowCollector, Continuation continuation) {
                        Object objCollect = flow.collect(new AnonymousClass2(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.supportchat.thread.CxChatDuxo$observeTwilioAgentChat$2$invokeSuspend$$inlined$mapNotNull$2$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.supportchat.thread.CxChatDuxo$observeTwilioAgentChat$2$invokeSuspend$$inlined$mapNotNull$2$2", m3645f = "CxChatDuxo.kt", m3646l = {52}, m3647m = "emit")
                        /* renamed from: com.robinhood.android.supportchat.thread.CxChatDuxo$observeTwilioAgentChat$2$invokeSuspend$$inlined$mapNotNull$2$2$1, reason: invalid class name */
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
                                String id = ((AgentChat.AgentChatConversation.AgentChatTwilioChat) obj).getId();
                                if (id != null) {
                                    anonymousClass1.label = 1;
                                    if (flowCollector.emit(id, anonymousClass1) == coroutine_suspended) {
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
                this.L$0 = coroutineScope2;
                this.label = 1;
                Object objFirstOrNull = FlowKt.firstOrNull(flow2, this);
                if (objFirstOrNull == coroutine_suspended) {
                    return coroutine_suspended;
                }
                coroutineScope = coroutineScope2;
                obj = objFirstOrNull;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                coroutineScope = (CoroutineScope) this.L$0;
                ResultKt.throwOnFailure(obj);
            }
            String str = (String) obj;
            if (str != null) {
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(CxChatDuxo.this, str, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass2(CxChatDuxo.this, str, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass3(CxChatDuxo.this, str, null), 3, null);
                return Unit.INSTANCE;
            }
            return Unit.INSTANCE;
        }

        /* compiled from: CxChatDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.supportchat.thread.CxChatDuxo$observeTwilioAgentChat$2$1", m3645f = "CxChatDuxo.kt", m3646l = {420}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.supportchat.thread.CxChatDuxo$observeTwilioAgentChat$2$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ String $conversationSid;
            int label;
            final /* synthetic */ CxChatDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(CxChatDuxo cxChatDuxo, String str, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = cxChatDuxo;
                this.$conversationSid = str;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, this.$conversationSid, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                try {
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        CxChatDuxo cxChatDuxo = this.this$0;
                        String str = this.$conversationSid;
                        this.label = 1;
                        if (cxChatDuxo.fetchAgentChatTwilioMessages(str, null, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                } catch (Throwable th) {
                    CxChatDuxo.handleOrThrow$default(this.this$0, th, null, 1, null);
                }
                return Unit.INSTANCE;
            }
        }

        /* compiled from: CxChatDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.supportchat.thread.CxChatDuxo$observeTwilioAgentChat$2$2", m3645f = "CxChatDuxo.kt", m3646l = {432}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.supportchat.thread.CxChatDuxo$observeTwilioAgentChat$2$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ String $conversationSid;
            int label;
            final /* synthetic */ CxChatDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(CxChatDuxo cxChatDuxo, String str, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = cxChatDuxo;
                this.$conversationSid = str;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass2(this.this$0, this.$conversationSid, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                try {
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        Flow flowThrottleLatest = Flows3.throttleLatest(FlowKt.drop(this.this$0.inputFlow, 1), 3000L);
                        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$conversationSid, null);
                        this.label = 1;
                        if (FlowKt.collectLatest(flowThrottleLatest, anonymousClass1, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                } catch (Throwable th) {
                    CxChatDuxo.handleOrThrow$default(this.this$0, th, null, 1, null);
                }
                return Unit.INSTANCE;
            }

            /* compiled from: CxChatDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.supportchat.thread.CxChatDuxo$observeTwilioAgentChat$2$2$1", m3645f = "CxChatDuxo.kt", m3646l = {433}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.supportchat.thread.CxChatDuxo$observeTwilioAgentChat$2$2$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<String, Continuation<? super Unit>, Object> {
                final /* synthetic */ String $conversationSid;
                int label;
                final /* synthetic */ CxChatDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(CxChatDuxo cxChatDuxo, String str, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = cxChatDuxo;
                    this.$conversationSid = str;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new AnonymousClass1(this.this$0, this.$conversationSid, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(String str, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(str, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.label;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        SupportChatStore supportChatStore = this.this$0.supportChatStore;
                        String str = this.$conversationSid;
                        this.label = 1;
                        if (supportChatStore.signalTyping(str, this) == coroutine_suspended) {
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
        }

        /* compiled from: CxChatDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.supportchat.thread.CxChatDuxo$observeTwilioAgentChat$2$3", m3645f = "CxChatDuxo.kt", m3646l = {453}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.supportchat.thread.CxChatDuxo$observeTwilioAgentChat$2$3, reason: invalid class name */
        static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ String $conversationSid;
            int label;
            final /* synthetic */ CxChatDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(CxChatDuxo cxChatDuxo, String str, Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
                this.this$0 = cxChatDuxo;
                this.$conversationSid = str;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass3(this.this$0, this.$conversationSid, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                try {
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        Flow flowOnEach = FlowKt.onEach(this.this$0.supportChatStore.streamAgentChatSession(this.$conversationSid), new AnonymousClass1(this.this$0, this.$conversationSid, null));
                        AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, null);
                        this.label = 1;
                        if (FlowKt.collectLatest(flowOnEach, anonymousClass2, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                } catch (Throwable th) {
                    CxChatDuxo.handleOrThrow$default(this.this$0, th, null, 1, null);
                }
                return Unit.INSTANCE;
            }

            /* compiled from: CxChatDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "session", "Lcom/robinhood/store/supportchat/AgentChatSession;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.supportchat.thread.CxChatDuxo$observeTwilioAgentChat$2$3$1", m3645f = "CxChatDuxo.kt", m3646l = {450}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.supportchat.thread.CxChatDuxo$observeTwilioAgentChat$2$3$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<AgentChatSession, Continuation<? super Unit>, Object> {
                final /* synthetic */ String $conversationSid;
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ CxChatDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(CxChatDuxo cxChatDuxo, String str, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = cxChatDuxo;
                    this.$conversationSid = str;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$conversationSid, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(AgentChatSession agentChatSession, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(agentChatSession, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.label;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        if (((AgentChatSession) this.L$0).getMessages().isEmpty()) {
                            CxChatDuxo cxChatDuxo = this.this$0;
                            String str = this.$conversationSid;
                            this.label = 1;
                            if (cxChatDuxo.fetchAgentChatTwilioMessages(str, null, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
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

            /* compiled from: CxChatDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "agentChat", "Lcom/robinhood/store/supportchat/AgentChatSession;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.supportchat.thread.CxChatDuxo$observeTwilioAgentChat$2$3$2", m3645f = "CxChatDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.supportchat.thread.CxChatDuxo$observeTwilioAgentChat$2$3$2, reason: invalid class name */
            static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<AgentChatSession, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ CxChatDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass2(CxChatDuxo cxChatDuxo, Continuation<? super AnonymousClass2> continuation) {
                    super(2, continuation);
                    this.this$0 = cxChatDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                    anonymousClass2.L$0 = obj;
                    return anonymousClass2;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(AgentChatSession agentChatSession, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass2) create(agentChatSession, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: CxChatDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/supportchat/thread/CxChatDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.supportchat.thread.CxChatDuxo$observeTwilioAgentChat$2$3$2$1", m3645f = "CxChatDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.supportchat.thread.CxChatDuxo$observeTwilioAgentChat$2$3$2$1, reason: invalid class name */
                static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CxChatDataState, Continuation<? super CxChatDataState>, Object> {
                    final /* synthetic */ AgentChatSession $agentChat;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass1(AgentChatSession agentChatSession, Continuation<? super AnonymousClass1> continuation) {
                        super(2, continuation);
                        this.$agentChat = agentChatSession;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$agentChat, continuation);
                        anonymousClass1.L$0 = obj;
                        return anonymousClass1;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(CxChatDataState cxChatDataState, Continuation<? super CxChatDataState> continuation) {
                        return ((AnonymousClass1) create(cxChatDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return CxChatDataState.copy$default((CxChatDataState) this.L$0, null, null, null, this.$agentChat, false, null, null, null, null, null, 1015, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new AnonymousClass1((AgentChatSession) this.L$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object observeTwilioAgentChat(UUID uuid, Continuation<? super Unit> continuation) {
        Object objCoroutineScope = CoroutineScope2.coroutineScope(new C291532(uuid, null), continuation);
        return objCoroutineScope == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCoroutineScope : Unit.INSTANCE;
    }

    /* compiled from: CxChatDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.supportchat.thread.CxChatDuxo$setAllMessagesRead$1", m3645f = "CxChatDuxo.kt", m3646l = {471}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.supportchat.thread.CxChatDuxo$setAllMessagesRead$1 */
    static final class C291691 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ ChatMode $chatMode;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C291691(ChatMode chatMode, Continuation<? super C291691> continuation) {
            super(2, continuation);
            this.$chatMode = chatMode;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CxChatDuxo.this.new C291691(this.$chatMode, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C291691) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    CxChatDuxo cxChatDuxo = CxChatDuxo.this;
                    ChatMode chatMode = this.$chatMode;
                    this.label = 1;
                    if (cxChatDuxo.markAllMessagesRead(chatMode, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
            } catch (Throwable th) {
                if (Throwables2.getShouldReport(th)) {
                    CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, th, false, null, 4, null);
                }
            }
            return Unit.INSTANCE;
        }
    }

    public final void setAllMessagesRead(ChatMode chatMode) {
        Intrinsics.checkNotNullParameter(chatMode, "chatMode");
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C291691(chatMode, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object markAllMessagesRead(ChatMode chatMode, Continuation<? super Unit> continuation) {
        Object allMessagesRead;
        if (chatMode instanceof ChatMode.AgentChat.SalesforceChat) {
            UUID conversationId = ((ChatMode.AgentChat.SalesforceChat) chatMode).getConversationId();
            if (conversationId != null) {
                this.salesforceChatStore.markAllMessagesRead(conversationId);
            }
        } else if (chatMode instanceof ChatMode.AgentChat.TwilioChat) {
            String conversationSid = ((ChatMode.AgentChat.TwilioChat) chatMode).getConversationSid();
            if (conversationSid != null && (allMessagesRead = this.supportChatStore.setAllMessagesRead(conversationSid, continuation)) == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                return allMessagesRead;
            }
        } else if (!(chatMode instanceof ChatMode.ChatbotChat)) {
            throw new NoWhenBranchMatchedException();
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void fetchPreviousMessages$default(CxChatDuxo cxChatDuxo, UUID uuid, ChatMode chatMode, String str, Long l, int i, Object obj) {
        if ((i & 4) != 0) {
            str = null;
        }
        if ((i & 8) != 0) {
            l = null;
        }
        cxChatDuxo.fetchPreviousMessages(uuid, chatMode, str, l);
    }

    /* compiled from: CxChatDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.supportchat.thread.CxChatDuxo$fetchPreviousMessages$1", m3645f = "CxChatDuxo.kt", m3646l = {515}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.supportchat.thread.CxChatDuxo$fetchPreviousMessages$1 */
    static final class C291471 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Long $agentChatCursor;
        final /* synthetic */ ChatMode $chatMode;
        final /* synthetic */ String $chatbotChatCursor;
        final /* synthetic */ UUID $inquiryId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C291471(UUID uuid, ChatMode chatMode, Long l, String str, Continuation<? super C291471> continuation) {
            super(2, continuation);
            this.$inquiryId = uuid;
            this.$chatMode = chatMode;
            this.$agentChatCursor = l;
            this.$chatbotChatCursor = str;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CxChatDuxo.this.new C291471(this.$inquiryId, this.$chatMode, this.$agentChatCursor, this.$chatbotChatCursor, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C291471) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: CxChatDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/supportchat/thread/CxChatDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.supportchat.thread.CxChatDuxo$fetchPreviousMessages$1$1", m3645f = "CxChatDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.supportchat.thread.CxChatDuxo$fetchPreviousMessages$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CxChatDataState, Continuation<? super CxChatDataState>, Object> {
            private /* synthetic */ Object L$0;
            int label;

            AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CxChatDataState cxChatDataState, Continuation<? super CxChatDataState> continuation) {
                return ((AnonymousClass1) create(cxChatDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return CxChatDataState.copy$default((CxChatDataState) this.L$0, null, CxChatDataState.UploadStatus.FetchPreviousMessages.INSTANCE, null, null, false, null, null, null, null, null, 1021, null);
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) throws Throwable {
            Throwable th;
            C291471 c291471;
            ChatbotChat chatbotChat;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    CxChatDuxo.this.applyMutation(new AnonymousClass1(null));
                    try {
                        SupportChat supportChat = CxChatDuxo.this.supportChatStore.getSupportChat(this.$inquiryId);
                        UUID conversationId = (supportChat == null || (chatbotChat = supportChat.getChatbotChat()) == null) ? null : chatbotChat.getConversationId();
                        CxChatDuxo cxChatDuxo = CxChatDuxo.this;
                        ChatMode chatMode = this.$chatMode;
                        Long l = this.$agentChatCursor;
                        String str = this.$chatbotChatCursor;
                        this.label = 1;
                        c291471 = this;
                        try {
                            if (cxChatDuxo.fetchMessages(chatMode, conversationId, l, str, c291471) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            th = th;
                            CxChatDuxo.handleOrThrow$default(CxChatDuxo.this, th, null, 1, null);
                            CxChatDuxo.this.applyMutation(new AnonymousClass2(null));
                            return Unit.INSTANCE;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        c291471 = this;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    c291471 = this;
                }
            } catch (Throwable th4) {
                th = th4;
                c291471 = this;
            }
            CxChatDuxo.this.applyMutation(new AnonymousClass2(null));
            return Unit.INSTANCE;
        }

        /* compiled from: CxChatDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/supportchat/thread/CxChatDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.supportchat.thread.CxChatDuxo$fetchPreviousMessages$1$2", m3645f = "CxChatDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.supportchat.thread.CxChatDuxo$fetchPreviousMessages$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<CxChatDataState, Continuation<? super CxChatDataState>, Object> {
            private /* synthetic */ Object L$0;
            int label;

            AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CxChatDataState cxChatDataState, Continuation<? super CxChatDataState> continuation) {
                return ((AnonymousClass2) create(cxChatDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return CxChatDataState.copy$default((CxChatDataState) this.L$0, null, CxChatDataState.UploadStatus.None.INSTANCE, null, null, false, null, null, null, null, null, 1021, null);
            }
        }
    }

    public final void fetchPreviousMessages(UUID inquiryId, ChatMode chatMode, String chatbotChatCursor, Long agentChatCursor) {
        Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
        Intrinsics.checkNotNullParameter(chatMode, "chatMode");
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C291471(inquiryId, chatMode, agentChatCursor, chatbotChatCursor, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0060, code lost:
    
        if (r10 == r1) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x007d, code lost:
    
        if (fetchChatbotMessages(r7, r9, r0) == r1) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object fetchMessages(ChatMode chatMode, UUID uuid, Long l, String str, Continuation<? super Unit> continuation) {
        C291461 c291461;
        if (continuation instanceof C291461) {
            c291461 = (C291461) continuation;
            int i = c291461.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c291461.label = i - Integer.MIN_VALUE;
            } else {
                c291461 = new C291461(continuation);
            }
        }
        Object objFetchAgentChatTwilioMessages = c291461.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c291461.label;
        boolean zBooleanValue = true;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objFetchAgentChatTwilioMessages);
            if (!(chatMode instanceof ChatMode.AgentChat.SalesforceChat)) {
                if (chatMode instanceof ChatMode.AgentChat.TwilioChat) {
                    String conversationSid = ((ChatMode.AgentChat.TwilioChat) chatMode).getConversationSid();
                    if (conversationSid != null) {
                        c291461.L$0 = uuid;
                        c291461.L$1 = str;
                        c291461.label = 1;
                        objFetchAgentChatTwilioMessages = fetchAgentChatTwilioMessages(conversationSid, l, c291461);
                    }
                    return coroutine_suspended;
                }
                if (!(chatMode instanceof ChatMode.ChatbotChat)) {
                    throw new NoWhenBranchMatchedException();
                }
            }
            if (zBooleanValue || uuid == null) {
                return Unit.INSTANCE;
            }
            c291461.L$0 = null;
            c291461.L$1 = null;
            c291461.label = 2;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objFetchAgentChatTwilioMessages);
                return Unit.INSTANCE;
            }
            str = (String) c291461.L$1;
            uuid = (UUID) c291461.L$0;
            ResultKt.throwOnFailure(objFetchAgentChatTwilioMessages);
        }
        zBooleanValue = ((Boolean) objFetchAgentChatTwilioMessages).booleanValue();
        if (zBooleanValue) {
        }
        return Unit.INSTANCE;
    }

    static /* synthetic */ Object fetchMessages$default(CxChatDuxo cxChatDuxo, ChatMode chatMode, UUID uuid, Long l, String str, Continuation continuation, int i, Object obj) {
        if ((i & 2) != 0) {
            uuid = null;
        }
        if ((i & 4) != 0) {
            l = null;
        }
        if ((i & 8) != 0) {
            str = null;
        }
        return cxChatDuxo.fetchMessages(chatMode, uuid, l, str, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object fetchAgentChatTwilioMessages(String str, Long l, Continuation<? super Boolean> continuation) {
        C291451 c291451;
        if (continuation instanceof C291451) {
            c291451 = (C291451) continuation;
            int i = c291451.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c291451.label = i - Integer.MIN_VALUE;
            } else {
                c291451 = new C291451(continuation);
            }
        }
        Object objFetchMessagesBefore = c291451.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c291451.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objFetchMessagesBefore);
            SupportChatStore supportChatStore = this.supportChatStore;
            c291451.label = 1;
            objFetchMessagesBefore = supportChatStore.fetchMessagesBefore(str, l, 30, c291451);
            if (objFetchMessagesBefore == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objFetchMessagesBefore);
        }
        return boxing.boxBoolean(((Number) objFetchMessagesBefore).intValue() < 30);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object fetchChatbotMessages(UUID uuid, String str, Continuation<? super Unit> continuation) {
        Object objFetchMessages$default = ChatbotStore.fetchMessages$default(this.chatbotStore, uuid, str, boxing.boxInt(30), null, continuation, 8, null);
        return objFetchMessages$default == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objFetchMessages$default : Unit.INSTANCE;
    }

    /* compiled from: CxChatDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.supportchat.thread.CxChatDuxo$sendSelectionMenuSelection$1", m3645f = "CxChatDuxo.kt", m3646l = {585}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.supportchat.thread.CxChatDuxo$sendSelectionMenuSelection$1 */
    static final class C291661 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ ChatMode $chatMode;
        final /* synthetic */ UUID $inquiryId;
        final /* synthetic */ SelectionMenuRowModel $row;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C291661(ChatMode chatMode, UUID uuid, SelectionMenuRowModel selectionMenuRowModel, Continuation<? super C291661> continuation) {
            super(2, continuation);
            this.$chatMode = chatMode;
            this.$inquiryId = uuid;
            this.$row = selectionMenuRowModel;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CxChatDuxo.this.new C291661(this.$chatMode, this.$inquiryId, this.$row, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C291661) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: CxChatDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/supportchat/thread/CxChatDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.supportchat.thread.CxChatDuxo$sendSelectionMenuSelection$1$1", m3645f = "CxChatDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.supportchat.thread.CxChatDuxo$sendSelectionMenuSelection$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CxChatDataState, Continuation<? super CxChatDataState>, Object> {
            private /* synthetic */ Object L$0;
            int label;

            AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CxChatDataState cxChatDataState, Continuation<? super CxChatDataState> continuation) {
                return ((AnonymousClass1) create(cxChatDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return CxChatDataState.copy$default((CxChatDataState) this.L$0, null, CxChatDataState.UploadStatus.SendChatbotUserMessage.INSTANCE, null, null, false, null, null, null, null, null, 1021, null);
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    CxChatDuxo.this.applyMutation(new AnonymousClass1(null));
                    CxChatDuxo.this.applyMutation(new AnonymousClass2(this.$inquiryId, null));
                    ChatMode chatMode = this.$chatMode;
                    ChatMode.ChatbotChat chatbotChat = chatMode instanceof ChatMode.ChatbotChat ? (ChatMode.ChatbotChat) chatMode : null;
                    if (chatbotChat != null) {
                        ChatbotStore chatbotStore = CxChatDuxo.this.chatbotStore;
                        UUID conversationId = chatbotChat.getConversationId();
                        UUID uuid = this.$inquiryId;
                        SelectionMenuRowModel selectionMenuRowModel = this.$row;
                        this.label = 1;
                        if (chatbotStore.sendSelection(uuid, conversationId, selectionMenuRowModel, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        throw new IllegalArgumentException("Given " + this.$chatMode + " isn't chatbot-chat mode");
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
            } catch (Exception e) {
                CxChatDuxo.this.handleOrThrow(e, new Function0() { // from class: com.robinhood.android.supportchat.thread.CxChatDuxo$sendSelectionMenuSelection$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Unit.INSTANCE;
                    }
                });
            }
            CxChatDuxo.this.applyMutation(new AnonymousClass4(null));
            return Unit.INSTANCE;
        }

        /* compiled from: CxChatDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/supportchat/thread/CxChatDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.supportchat.thread.CxChatDuxo$sendSelectionMenuSelection$1$2", m3645f = "CxChatDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.supportchat.thread.CxChatDuxo$sendSelectionMenuSelection$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<CxChatDataState, Continuation<? super CxChatDataState>, Object> {
            final /* synthetic */ UUID $inquiryId;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(UUID uuid, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.$inquiryId = uuid;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$inquiryId, continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CxChatDataState cxChatDataState, Continuation<? super CxChatDataState> continuation) {
                return ((AnonymousClass2) create(cxChatDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                CxChatDataState cxChatDataState = (CxChatDataState) this.L$0;
                return CxChatDataState.copy$default(cxChatDataState, null, null, null, null, false, null, null, null, SetsKt.plus(cxChatDataState.getHideSelectionMenuForInquiry(), this.$inquiryId), null, 767, null);
            }
        }

        /* compiled from: CxChatDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/supportchat/thread/CxChatDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.supportchat.thread.CxChatDuxo$sendSelectionMenuSelection$1$4", m3645f = "CxChatDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.supportchat.thread.CxChatDuxo$sendSelectionMenuSelection$1$4, reason: invalid class name */
        static final class AnonymousClass4 extends ContinuationImpl7 implements Function2<CxChatDataState, Continuation<? super CxChatDataState>, Object> {
            private /* synthetic */ Object L$0;
            int label;

            AnonymousClass4(Continuation<? super AnonymousClass4> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass4 anonymousClass4 = new AnonymousClass4(continuation);
                anonymousClass4.L$0 = obj;
                return anonymousClass4;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CxChatDataState cxChatDataState, Continuation<? super CxChatDataState> continuation) {
                return ((AnonymousClass4) create(cxChatDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return CxChatDataState.copy$default((CxChatDataState) this.L$0, null, CxChatDataState.UploadStatus.None.INSTANCE, null, null, false, null, null, null, null, null, 1021, null);
            }
        }
    }

    public final void sendSelectionMenuSelection(UUID inquiryId, ChatMode chatMode, SelectionMenuRowModel row) {
        Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
        Intrinsics.checkNotNullParameter(chatMode, "chatMode");
        Intrinsics.checkNotNullParameter(row, "row");
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C291661(chatMode, inquiryId, row, null), 3, null);
    }

    public static /* synthetic */ void sendSuggestedResponseSelection$default(CxChatDuxo cxChatDuxo, UUID uuid, ChatMode chatMode, ChatbotSuggestedResponse chatbotSuggestedResponse, String str, int i, Object obj) {
        if ((i & 8) != 0) {
            str = null;
        }
        cxChatDuxo.sendSuggestedResponseSelection(uuid, chatMode, chatbotSuggestedResponse, str);
    }

    /* compiled from: CxChatDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.supportchat.thread.CxChatDuxo$sendSuggestedResponseSelection$1", m3645f = "CxChatDuxo.kt", m3646l = {620}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.supportchat.thread.CxChatDuxo$sendSuggestedResponseSelection$1 */
    static final class C291671 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ ChatMode $chatMode;
        final /* synthetic */ UUID $inquiryId;
        final /* synthetic */ ChatbotSuggestedResponse $suggestedResponse;
        final /* synthetic */ String $suggestedResponseLocalId;
        int label;
        final /* synthetic */ CxChatDuxo this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C291671(ChatbotSuggestedResponse chatbotSuggestedResponse, CxChatDuxo cxChatDuxo, ChatMode chatMode, UUID uuid, String str, Continuation<? super C291671> continuation) {
            super(2, continuation);
            this.$suggestedResponse = chatbotSuggestedResponse;
            this.this$0 = cxChatDuxo;
            this.$chatMode = chatMode;
            this.$inquiryId = uuid;
            this.$suggestedResponseLocalId = str;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C291671(this.$suggestedResponse, this.this$0, this.$chatMode, this.$inquiryId, this.$suggestedResponseLocalId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C291671) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) throws Throwable {
            Throwable th;
            C291671 c291671;
            Exception exc;
            C291671 c2916712;
            CxChatDuxo cxChatDuxo;
            AnonymousClass3 anonymousClass3;
            C291671 c2916713;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                try {
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new AnonymousClass1(this.$suggestedResponse.getId(), this.$inquiryId, null));
                        try {
                            ChatMode chatMode = this.$chatMode;
                            ChatMode.ChatbotChat chatbotChat = chatMode instanceof ChatMode.ChatbotChat ? (ChatMode.ChatbotChat) chatMode : null;
                            try {
                                if (chatbotChat != null) {
                                    ChatbotStore chatbotStore = this.this$0.chatbotStore;
                                    UUID uuid = this.$inquiryId;
                                    UUID conversationId = chatbotChat.getConversationId();
                                    ChatbotSuggestedResponse chatbotSuggestedResponse = this.$suggestedResponse;
                                    String str = this.$suggestedResponseLocalId;
                                    this.label = 1;
                                    c2916713 = this;
                                    if (chatbotStore.sendPickedSuggestedResponse(uuid, conversationId, chatbotSuggestedResponse, str, c2916713) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                } else {
                                    throw new IllegalArgumentException("Given " + this.$chatMode + " isn't chatbot-chat mode");
                                }
                            } catch (Exception e) {
                                e = e;
                                exc = e;
                                c2916712.this$0.handleOrThrow(exc, new Function0() { // from class: com.robinhood.android.supportchat.thread.CxChatDuxo$sendSuggestedResponseSelection$1$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return Unit.INSTANCE;
                                    }
                                });
                                cxChatDuxo = c2916712.this$0;
                                anonymousClass3 = new AnonymousClass3(null);
                                cxChatDuxo.applyMutation(anonymousClass3);
                                return Unit.INSTANCE;
                            }
                        } catch (Exception e2) {
                            e = e2;
                            c2916712 = this;
                        } catch (Throwable th2) {
                            th = th2;
                            c291671 = this;
                            th = th;
                            c291671.this$0.applyMutation(new AnonymousClass3(null));
                            throw th;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        c2916713 = this;
                    }
                    cxChatDuxo = c2916713.this$0;
                    anonymousClass3 = new AnonymousClass3(null);
                } catch (Throwable th3) {
                    th = th3;
                }
            } catch (Exception e3) {
                exc = e3;
                c2916712 = this;
            } catch (Throwable th4) {
                th = th4;
                c291671 = this;
                c291671.this$0.applyMutation(new AnonymousClass3(null));
                throw th;
            }
            cxChatDuxo.applyMutation(anonymousClass3);
            return Unit.INSTANCE;
        }

        /* compiled from: CxChatDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/supportchat/thread/CxChatDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.supportchat.thread.CxChatDuxo$sendSuggestedResponseSelection$1$1", m3645f = "CxChatDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.supportchat.thread.CxChatDuxo$sendSuggestedResponseSelection$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CxChatDataState, Continuation<? super CxChatDataState>, Object> {
            final /* synthetic */ String $id;
            final /* synthetic */ UUID $inquiryId;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(String str, UUID uuid, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$id = str;
                this.$inquiryId = uuid;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$id, this.$inquiryId, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CxChatDataState cxChatDataState, Continuation<? super CxChatDataState> continuation) {
                return ((AnonymousClass1) create(cxChatDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                CxChatDataState cxChatDataState = (CxChatDataState) this.L$0;
                return CxChatDataState.copy$default(cxChatDataState, null, new CxChatDataState.UploadStatus.SendSuggestedResponse(this.$id), null, null, false, null, null, null, null, SetsKt.plus(cxChatDataState.getHideSuggestedResponsesForInquiry(), this.$inquiryId), 509, null);
            }
        }

        /* compiled from: CxChatDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/supportchat/thread/CxChatDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.supportchat.thread.CxChatDuxo$sendSuggestedResponseSelection$1$3", m3645f = "CxChatDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.supportchat.thread.CxChatDuxo$sendSuggestedResponseSelection$1$3, reason: invalid class name */
        static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<CxChatDataState, Continuation<? super CxChatDataState>, Object> {
            private /* synthetic */ Object L$0;
            int label;

            AnonymousClass3(Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(continuation);
                anonymousClass3.L$0 = obj;
                return anonymousClass3;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CxChatDataState cxChatDataState, Continuation<? super CxChatDataState> continuation) {
                return ((AnonymousClass3) create(cxChatDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return CxChatDataState.copy$default((CxChatDataState) this.L$0, null, CxChatDataState.UploadStatus.None.INSTANCE, null, null, false, null, null, null, null, null, 1021, null);
            }
        }
    }

    public final void sendSuggestedResponseSelection(UUID inquiryId, ChatMode chatMode, ChatbotSuggestedResponse suggestedResponse, String suggestedResponseLocalId) {
        Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
        Intrinsics.checkNotNullParameter(chatMode, "chatMode");
        Intrinsics.checkNotNullParameter(suggestedResponse, "suggestedResponse");
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C291671(suggestedResponse, this, chatMode, inquiryId, suggestedResponseLocalId, null), 3, null);
    }

    public static /* synthetic */ void sendTextMessage$default(CxChatDuxo cxChatDuxo, UUID uuid, ChatMode chatMode, String str, String str2, int i, Object obj) {
        if ((i & 8) != 0) {
            str2 = null;
        }
        cxChatDuxo.sendTextMessage(uuid, chatMode, str, str2);
    }

    /* compiled from: CxChatDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.supportchat.thread.CxChatDuxo$sendTextMessage$1", m3645f = "CxChatDuxo.kt", m3646l = {655}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.supportchat.thread.CxChatDuxo$sendTextMessage$1 */
    static final class C291681 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ ChatMode $chatMode;
        final /* synthetic */ UUID $inquiryId;
        final /* synthetic */ String $message;
        final /* synthetic */ String $messageLocalId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C291681(ChatMode chatMode, UUID uuid, String str, String str2, Continuation<? super C291681> continuation) {
            super(2, continuation);
            this.$chatMode = chatMode;
            this.$inquiryId = uuid;
            this.$message = str;
            this.$messageLocalId = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CxChatDuxo.this.new C291681(this.$chatMode, this.$inquiryId, this.$message, this.$messageLocalId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C291681) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) throws Throwable {
            C291681 c291681;
            Exception exc;
            ChatMode chatMode;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                try {
                    CxChatDuxo.this.submit(CxChatEvent.ClearInput.INSTANCE);
                    chatMode = this.$chatMode;
                } catch (Exception e) {
                    e = e;
                    c291681 = this;
                }
                try {
                    if (chatMode instanceof ChatMode.ChatbotChat) {
                        CxChatDuxo.this.applyMutation(new AnonymousClass1(null));
                        ChatbotStore chatbotStore = CxChatDuxo.this.chatbotStore;
                        UUID uuid = this.$inquiryId;
                        UUID conversationId = ((ChatMode.ChatbotChat) this.$chatMode).getConversationId();
                        String str = this.$message;
                        String str2 = this.$messageLocalId;
                        this.label = 1;
                        c291681 = this;
                        if (chatbotStore.sendUserMessage(uuid, conversationId, str, str2, c291681) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        c291681 = this;
                        if (chatMode instanceof ChatMode.AgentChat.SalesforceChat) {
                            UUID conversationId2 = ((ChatMode.AgentChat.SalesforceChat) chatMode).getConversationId();
                            if (conversationId2 != null) {
                                CxChatDuxo cxChatDuxo = CxChatDuxo.this;
                                cxChatDuxo.salesforceChatStore.sendTextMessage(conversationId2, c291681.$message);
                            }
                        } else {
                            if (!(chatMode instanceof ChatMode.AgentChat.TwilioChat)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            String conversationSid = ((ChatMode.AgentChat.TwilioChat) chatMode).getConversationSid();
                            if (conversationSid != null) {
                                CxChatDuxo cxChatDuxo2 = CxChatDuxo.this;
                                cxChatDuxo2.supportChatStore.sendTextMessage(c291681.$inquiryId, conversationSid, c291681.$message);
                            }
                        }
                    }
                } catch (Exception e2) {
                    e = e2;
                    exc = e;
                    CxChatDuxo.this.handleOrThrow(exc, new Function0() { // from class: com.robinhood.android.supportchat.thread.CxChatDuxo$sendTextMessage$1$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Unit.INSTANCE;
                        }
                    });
                    CxChatDuxo.this.applyMutation(new AnonymousClass5(null));
                    return Unit.INSTANCE;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                try {
                    ResultKt.throwOnFailure(obj);
                    c291681 = this;
                } catch (Exception e3) {
                    exc = e3;
                    c291681 = this;
                    CxChatDuxo.this.handleOrThrow(exc, new Function0() { // from class: com.robinhood.android.supportchat.thread.CxChatDuxo$sendTextMessage$1$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Unit.INSTANCE;
                        }
                    });
                    CxChatDuxo.this.applyMutation(new AnonymousClass5(null));
                    return Unit.INSTANCE;
                }
            }
            CxChatDuxo.this.applyMutation(new AnonymousClass5(null));
            return Unit.INSTANCE;
        }

        /* compiled from: CxChatDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/supportchat/thread/CxChatDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.supportchat.thread.CxChatDuxo$sendTextMessage$1$1", m3645f = "CxChatDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.supportchat.thread.CxChatDuxo$sendTextMessage$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CxChatDataState, Continuation<? super CxChatDataState>, Object> {
            private /* synthetic */ Object L$0;
            int label;

            AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CxChatDataState cxChatDataState, Continuation<? super CxChatDataState> continuation) {
                return ((AnonymousClass1) create(cxChatDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return CxChatDataState.copy$default((CxChatDataState) this.L$0, null, CxChatDataState.UploadStatus.SendChatbotUserMessage.INSTANCE, null, null, false, null, null, null, null, null, 1021, null);
            }
        }

        /* compiled from: CxChatDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/supportchat/thread/CxChatDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.supportchat.thread.CxChatDuxo$sendTextMessage$1$5", m3645f = "CxChatDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.supportchat.thread.CxChatDuxo$sendTextMessage$1$5, reason: invalid class name */
        static final class AnonymousClass5 extends ContinuationImpl7 implements Function2<CxChatDataState, Continuation<? super CxChatDataState>, Object> {
            private /* synthetic */ Object L$0;
            int label;

            AnonymousClass5(Continuation<? super AnonymousClass5> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass5 anonymousClass5 = new AnonymousClass5(continuation);
                anonymousClass5.L$0 = obj;
                return anonymousClass5;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CxChatDataState cxChatDataState, Continuation<? super CxChatDataState> continuation) {
                return ((AnonymousClass5) create(cxChatDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return CxChatDataState.copy$default((CxChatDataState) this.L$0, null, CxChatDataState.UploadStatus.None.INSTANCE, null, null, false, null, null, null, null, null, 1021, null);
            }
        }
    }

    public final void sendTextMessage(UUID inquiryId, ChatMode chatMode, String message, String messageLocalId) {
        Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
        Intrinsics.checkNotNullParameter(chatMode, "chatMode");
        Intrinsics.checkNotNullParameter(message, "message");
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C291681(chatMode, inquiryId, message, messageLocalId, null), 3, null);
    }

    public final void resendAgentChatUserMessage(UUID inquiryId, ChatMode chatMode, UiChatMessage.Regular message) {
        Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
        Intrinsics.checkNotNullParameter(chatMode, "chatMode");
        Intrinsics.checkNotNullParameter(message, "message");
        if (chatMode instanceof ChatMode.ChatbotChat) {
            throw new IllegalStateException("This resending method is not for chat-bot chat");
        }
        if (chatMode instanceof ChatMode.AgentChat.SalesforceChat) {
            UUID conversationId = ((ChatMode.AgentChat.SalesforceChat) chatMode).getConversationId();
            if (conversationId == null) {
                return;
            }
            resendSalesforceChatUserMessage(conversationId, message);
            return;
        }
        if (!(chatMode instanceof ChatMode.AgentChat.TwilioChat)) {
            throw new NoWhenBranchMatchedException();
        }
        String conversationSid = ((ChatMode.AgentChat.TwilioChat) chatMode).getConversationSid();
        if (conversationSid == null) {
            return;
        }
        resendTwilioChatUserMessage(inquiryId, conversationSid, message);
    }

    private final void resendSalesforceChatUserMessage(UUID conversationId, UiChatMessage.Regular message) {
        String localSid = message.getLocalSid();
        if (localSid == null) {
            return;
        }
        if (message instanceof UiChatMessage.Regular.Text) {
            this.salesforceChatStore.resendAnyMessage(conversationId, localSid);
        } else if (message instanceof UiChatMessage.Regular.Image) {
            this.salesforceChatStore.resendAnyMessage(conversationId, localSid);
        }
    }

    private final void resendTwilioChatUserMessage(UUID inquiryId, String conversationSid, UiChatMessage.Regular message) {
        String localSid = message.getLocalSid();
        if (localSid == null) {
            return;
        }
        if (message instanceof UiChatMessage.Regular.Text) {
            this.supportChatStore.resendTextMessage(inquiryId, conversationSid, localSid);
        } else if (message instanceof UiChatMessage.Regular.Image) {
            BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C291621(inquiryId, conversationSid, localSid, null), 3, null);
        }
    }

    /* compiled from: CxChatDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.supportchat.thread.CxChatDuxo$resendTwilioChatUserMessage$1", m3645f = "CxChatDuxo.kt", m3646l = {1096}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.supportchat.thread.CxChatDuxo$resendTwilioChatUserMessage$1 */
    static final class C291621 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $conversationSid;
        final /* synthetic */ UUID $inquiryId;
        final /* synthetic */ String $localMessageSid;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C291621(UUID uuid, String str, String str2, Continuation<? super C291621> continuation) {
            super(2, continuation);
            this.$inquiryId = uuid;
            this.$conversationSid = str;
            this.$localMessageSid = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CxChatDuxo.this.new C291621(this.$inquiryId, this.$conversationSid, this.$localMessageSid, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C291621) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Single<SocketChatMessage> singleResendImageMessage = CxChatDuxo.this.supportChatStore.resendImageMessage(this.$inquiryId, this.$conversationSid, this.$localMessageSid);
                    this.label = 1;
                    if (RxAwait3.await(singleResendImageMessage, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
            } catch (Throwable th) {
                final CxChatDuxo cxChatDuxo = CxChatDuxo.this;
                cxChatDuxo.handleOrThrow(th, new Function0() { // from class: com.robinhood.android.supportchat.thread.CxChatDuxo$resendTwilioChatUserMessage$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return CxChatDuxo.C291621.invokeSuspend$lambda$0(cxChatDuxo);
                    }
                });
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$0(CxChatDuxo cxChatDuxo) {
            cxChatDuxo.openImageErrorDialog();
            return Unit.INSTANCE;
        }
    }

    public final void sendImageMessage(UUID inquiryId, ChatMode chatMode, Either<Bitmap, ? extends File> imageData, boolean fromImagePicker) {
        Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
        Intrinsics.checkNotNullParameter(chatMode, "chatMode");
        Intrinsics.checkNotNullParameter(imageData, "imageData");
        if (canSend(imageData)) {
            BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C291651(chatMode, imageData, this, inquiryId, null), 3, null);
        } else {
            openFileSizeLimitDialog(fromImagePicker);
        }
    }

    /* compiled from: CxChatDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.supportchat.thread.CxChatDuxo$sendImageMessage$1", m3645f = "CxChatDuxo.kt", m3646l = {800, 805, 806, 821}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.supportchat.thread.CxChatDuxo$sendImageMessage$1 */
    static final class C291651 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ ChatMode $chatMode;
        final /* synthetic */ Either<Bitmap, File> $imageData;
        final /* synthetic */ UUID $inquiryId;
        Object L$0;
        Object L$1;
        int label;
        final /* synthetic */ CxChatDuxo this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C291651(ChatMode chatMode, Either<Bitmap, ? extends File> either, CxChatDuxo cxChatDuxo, UUID uuid, Continuation<? super C291651> continuation) {
            super(2, continuation);
            this.$chatMode = chatMode;
            this.$imageData = either;
            this.this$0 = cxChatDuxo;
            this.$inquiryId = uuid;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C291651(this.$chatMode, this.$imageData, this.this$0, this.$inquiryId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C291651) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:54:0x0101, code lost:
        
            if (r1.sendImageMessageToTwilio(r3, r13, r4, r12) == r0) goto L55;
         */
        /* JADX WARN: Removed duplicated region for block: B:35:0x009c A[Catch: all -> 0x0019, TryCatch #0 {all -> 0x0019, blocks: (B:8:0x0014, B:15:0x002d, B:46:0x00d3, B:18:0x003a, B:39:0x00b5, B:44:0x00cb, B:45:0x00d2, B:21:0x0047, B:33:0x0092, B:35:0x009c, B:24:0x004e, B:26:0x0054, B:28:0x005c, B:30:0x005f, B:47:0x00d9, B:49:0x00dd, B:51:0x00e5, B:53:0x00e8, B:56:0x0104, B:58:0x0108, B:59:0x010f, B:60:0x0110, B:61:0x0115), top: B:65:0x000a }] */
        /* JADX WARN: Removed duplicated region for block: B:39:0x00b5 A[Catch: all -> 0x0019, TryCatch #0 {all -> 0x0019, blocks: (B:8:0x0014, B:15:0x002d, B:46:0x00d3, B:18:0x003a, B:39:0x00b5, B:44:0x00cb, B:45:0x00d2, B:21:0x0047, B:33:0x0092, B:35:0x009c, B:24:0x004e, B:26:0x0054, B:28:0x005c, B:30:0x005f, B:47:0x00d9, B:49:0x00dd, B:51:0x00e5, B:53:0x00e8, B:56:0x0104, B:58:0x0108, B:59:0x010f, B:60:0x0110, B:61:0x0115), top: B:65:0x000a }] */
        /* JADX WARN: Removed duplicated region for block: B:44:0x00cb A[Catch: all -> 0x0019, TryCatch #0 {all -> 0x0019, blocks: (B:8:0x0014, B:15:0x002d, B:46:0x00d3, B:18:0x003a, B:39:0x00b5, B:44:0x00cb, B:45:0x00d2, B:21:0x0047, B:33:0x0092, B:35:0x009c, B:24:0x004e, B:26:0x0054, B:28:0x005c, B:30:0x005f, B:47:0x00d9, B:49:0x00dd, B:51:0x00e5, B:53:0x00e8, B:56:0x0104, B:58:0x0108, B:59:0x010f, B:60:0x0110, B:61:0x0115), top: B:65:0x000a }] */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Throwable {
            UUID conversationId;
            File file;
            File file2;
            UUID uuid;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
            } catch (Throwable th) {
                final CxChatDuxo cxChatDuxo = this.this$0;
                cxChatDuxo.handleOrThrow(th, new Function0() { // from class: com.robinhood.android.supportchat.thread.CxChatDuxo$sendImageMessage$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return CxChatDuxo.C291651.invokeSuspend$lambda$0(cxChatDuxo);
                    }
                });
            }
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                ChatMode chatMode = this.$chatMode;
                if (chatMode instanceof ChatMode.AgentChat.SalesforceChat) {
                    conversationId = ((ChatMode.AgentChat.SalesforceChat) chatMode).getConversationId();
                    if (conversationId == null) {
                        return Unit.INSTANCE;
                    }
                    Either<Bitmap, File> either = this.$imageData;
                    Intrinsics.checkNotNull(either, "null cannot be cast to non-null type com.robinhood.utils.Either.Right<java.io.File>");
                    file = (File) ((Either.Right) either).getValue();
                    Flow flowStreamStateFlow$default = ExperimentsProvider.DefaultImpls.streamStateFlow$default(this.this$0.experimentsStore, new Experiment[]{SalesforceIdentiImageUploadExperiment.INSTANCE}, false, null, 6, null);
                    this.L$0 = conversationId;
                    this.L$1 = file;
                    this.label = 1;
                    obj = FlowKt.firstOrNull(flowStreamStateFlow$default, this);
                    if (obj != coroutine_suspended) {
                        if (Intrinsics.areEqual(obj, boxing.boxBoolean(true))) {
                        }
                    }
                } else if (chatMode instanceof ChatMode.AgentChat.TwilioChat) {
                    String conversationSid = ((ChatMode.AgentChat.TwilioChat) chatMode).getConversationSid();
                    if (conversationSid == null) {
                        return Unit.INSTANCE;
                    }
                    CxChatDuxo cxChatDuxo2 = this.this$0;
                    UUID uuid2 = this.$inquiryId;
                    Either<Bitmap, File> either2 = this.$imageData;
                    Intrinsics.checkNotNull(either2, "null cannot be cast to non-null type com.robinhood.utils.Either.Left<android.graphics.Bitmap>");
                    Bitmap bitmap = (Bitmap) ((Either.Left) either2).getValue();
                    this.label = 4;
                } else {
                    if (chatMode instanceof ChatMode.ChatbotChat) {
                        throw new IllegalStateException("Sending image in chatbot chat is not supported");
                    }
                    throw new NoWhenBranchMatchedException();
                }
                return coroutine_suspended;
            }
            if (i == 1) {
                file = (File) this.L$1;
                conversationId = (UUID) this.L$0;
                ResultKt.throwOnFailure(obj);
                if (Intrinsics.areEqual(obj, boxing.boxBoolean(true))) {
                    Uri uriFromFile = Uri.fromFile(file);
                    BitmapStore bitmapStore = this.this$0.bitmapStore;
                    this.L$0 = conversationId;
                    this.L$1 = file;
                    this.label = 2;
                    obj = bitmapStore.readBitmapFromDisk(uriFromFile, this);
                    if (obj != coroutine_suspended) {
                        if (obj != null) {
                        }
                    }
                    return coroutine_suspended;
                }
            } else if (i == 2) {
                file = (File) this.L$1;
                conversationId = (UUID) this.L$0;
                ResultKt.throwOnFailure(obj);
                if (obj != null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                CxChatDuxo cxChatDuxo3 = this.this$0;
                this.L$0 = conversationId;
                this.L$1 = file;
                this.label = 3;
                if (cxChatDuxo3.uploadImageToIdenti((Bitmap) obj, conversationId, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                file2 = file;
                uuid = conversationId;
                conversationId = uuid;
                file = file2;
            } else {
                if (i != 3) {
                    if (i != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                file2 = (File) this.L$1;
                uuid = (UUID) this.L$0;
                ResultKt.throwOnFailure(obj);
                conversationId = uuid;
                file = file2;
            }
            this.this$0.sendImageMessageToSalesforce(conversationId, file);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$0(CxChatDuxo cxChatDuxo) {
            cxChatDuxo.openImageErrorDialog();
            return Unit.INSTANCE;
        }
    }

    private final boolean canSend(Either<Bitmap, ? extends File> either) {
        if (either instanceof Either.Left) {
            return Bitmaps2.canSend((Bitmap) ((Either.Left) either).getValue());
        }
        if (either instanceof Either.Right) {
            return Bitmaps2.canSend((File) ((Either.Right) either).getValue());
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sendImageMessageToSalesforce(UUID conversationId, File imageFile) {
        this.salesforceChatStore.sendImageMessage(conversationId, imageFile);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object sendImageMessageToTwilio(UUID uuid, String str, Bitmap bitmap, Continuation<? super Unit> continuation) {
        Object objAwait = RxAwait3.await(this.supportChatStore.sendImageMessage(uuid, str, bitmap), continuation);
        return objAwait == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objAwait : Unit.INSTANCE;
    }

    /* compiled from: CxChatDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.supportchat.thread.CxChatDuxo$endChat$1", m3645f = "CxChatDuxo.kt", m3646l = {881}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.supportchat.thread.CxChatDuxo$endChat$1 */
    static final class C291431 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $actionLocalId;
        final /* synthetic */ ChatMode $chatMode;
        final /* synthetic */ UUID $inquiryId;
        int label;
        final /* synthetic */ CxChatDuxo this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C291431(String str, CxChatDuxo cxChatDuxo, UUID uuid, ChatMode chatMode, Continuation<? super C291431> continuation) {
            super(2, continuation);
            this.$actionLocalId = str;
            this.this$0 = cxChatDuxo;
            this.$inquiryId = uuid;
            this.$chatMode = chatMode;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C291431(this.$actionLocalId, this.this$0, this.$inquiryId, this.$chatMode, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C291431) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            CxChatDuxo cxChatDuxo;
            AnonymousClass3 anonymousClass3;
            CxChatDataState.UploadStatus endChat;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                try {
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        if (this.$actionLocalId != null) {
                            endChat = new CxChatDataState.UploadStatus.Action.EndChat(this.$actionLocalId);
                        } else {
                            endChat = CxChatDataState.UploadStatus.CtaEndChat.INSTANCE;
                        }
                        this.this$0.applyMutation(new AnonymousClass1(endChat, null));
                        SupportChatStore supportChatStore = this.this$0.supportChatStore;
                        UUID uuid = this.$inquiryId;
                        ChatMode chatMode = this.$chatMode;
                        ChatCurrentType chatCurrentType = chatMode != null ? chatMode.toChatCurrentType() : null;
                        this.label = 1;
                        if (supportChatStore.endSupportChat(uuid, chatCurrentType, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    cxChatDuxo = this.this$0;
                    anonymousClass3 = new AnonymousClass3(null);
                } catch (Exception e) {
                    final CxChatDuxo cxChatDuxo2 = this.this$0;
                    cxChatDuxo2.showChatUpdateErrorAlertIfAvailable(e, new Function0() { // from class: com.robinhood.android.supportchat.thread.CxChatDuxo$endChat$1$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return CxChatDuxo.C291431.invokeSuspend$lambda$0(cxChatDuxo2);
                        }
                    });
                    cxChatDuxo = this.this$0;
                    anonymousClass3 = new AnonymousClass3(null);
                }
                cxChatDuxo.applyMutation(anonymousClass3);
                return Unit.INSTANCE;
            } catch (Throwable th) {
                this.this$0.applyMutation(new AnonymousClass3(null));
                throw th;
            }
        }

        /* compiled from: CxChatDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/supportchat/thread/CxChatDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.supportchat.thread.CxChatDuxo$endChat$1$1", m3645f = "CxChatDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.supportchat.thread.CxChatDuxo$endChat$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CxChatDataState, Continuation<? super CxChatDataState>, Object> {
            final /* synthetic */ CxChatDataState.UploadStatus $uploadStatus;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(CxChatDataState.UploadStatus uploadStatus, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$uploadStatus = uploadStatus;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$uploadStatus, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CxChatDataState cxChatDataState, Continuation<? super CxChatDataState> continuation) {
                return ((AnonymousClass1) create(cxChatDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return CxChatDataState.copy$default((CxChatDataState) this.L$0, null, this.$uploadStatus, null, null, false, null, null, null, null, null, 1021, null);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$0(CxChatDuxo cxChatDuxo) {
            cxChatDuxo.openDialog(CxChatDialogData.EndChatError.INSTANCE);
            return Unit.INSTANCE;
        }

        /* compiled from: CxChatDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/supportchat/thread/CxChatDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.supportchat.thread.CxChatDuxo$endChat$1$3", m3645f = "CxChatDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.supportchat.thread.CxChatDuxo$endChat$1$3, reason: invalid class name */
        static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<CxChatDataState, Continuation<? super CxChatDataState>, Object> {
            private /* synthetic */ Object L$0;
            int label;

            AnonymousClass3(Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(continuation);
                anonymousClass3.L$0 = obj;
                return anonymousClass3;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CxChatDataState cxChatDataState, Continuation<? super CxChatDataState> continuation) {
                return ((AnonymousClass3) create(cxChatDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return CxChatDataState.copy$default((CxChatDataState) this.L$0, null, CxChatDataState.UploadStatus.None.INSTANCE, null, null, false, null, null, null, null, null, 1021, null);
            }
        }
    }

    public final void endChat(UUID inquiryId, String actionLocalId, ChatMode chatMode) {
        Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C291431(actionLocalId, this, inquiryId, chatMode, null), 3, null);
    }

    /* compiled from: CxChatDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.supportchat.thread.CxChatDuxo$resumeChat$1", m3645f = "CxChatDuxo.kt", m3646l = {904}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.supportchat.thread.CxChatDuxo$resumeChat$1 */
    static final class C291631 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $actionLocalId;
        final /* synthetic */ ChatMode $chatMode;
        final /* synthetic */ UUID $inquiryId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C291631(UUID uuid, ChatMode chatMode, String str, Continuation<? super C291631> continuation) {
            super(2, continuation);
            this.$inquiryId = uuid;
            this.$chatMode = chatMode;
            this.$actionLocalId = str;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CxChatDuxo.this.new C291631(this.$inquiryId, this.$chatMode, this.$actionLocalId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C291631) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: CxChatDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/supportchat/thread/CxChatDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.supportchat.thread.CxChatDuxo$resumeChat$1$1", m3645f = "CxChatDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.supportchat.thread.CxChatDuxo$resumeChat$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CxChatDataState, Continuation<? super CxChatDataState>, Object> {
            final /* synthetic */ String $actionLocalId;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(String str, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$actionLocalId = str;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$actionLocalId, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CxChatDataState cxChatDataState, Continuation<? super CxChatDataState> continuation) {
                return ((AnonymousClass1) create(cxChatDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return CxChatDataState.copy$default((CxChatDataState) this.L$0, null, new CxChatDataState.UploadStatus.Action.ResumeChat(this.$actionLocalId), null, null, false, null, null, null, null, null, 1021, null);
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            CxChatDuxo cxChatDuxo;
            AnonymousClass2 anonymousClass2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                try {
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        CxChatDuxo.this.applyMutation(new AnonymousClass1(this.$actionLocalId, null));
                        SupportChatStore supportChatStore = CxChatDuxo.this.supportChatStore;
                        UUID uuid = this.$inquiryId;
                        ChatMode chatMode = this.$chatMode;
                        ChatCurrentType chatCurrentType = chatMode != null ? chatMode.toChatCurrentType() : null;
                        this.label = 1;
                        if (supportChatStore.resumeSupportChat(uuid, chatCurrentType, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    cxChatDuxo = CxChatDuxo.this;
                    anonymousClass2 = new AnonymousClass2(null);
                } catch (Exception e) {
                    CxChatDuxo.showChatUpdateErrorAlertIfAvailable$default(CxChatDuxo.this, e, null, 1, null);
                    cxChatDuxo = CxChatDuxo.this;
                    anonymousClass2 = new AnonymousClass2(null);
                }
                cxChatDuxo.applyMutation(anonymousClass2);
                return Unit.INSTANCE;
            } catch (Throwable th) {
                CxChatDuxo.this.applyMutation(new AnonymousClass2(null));
                throw th;
            }
        }

        /* compiled from: CxChatDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/supportchat/thread/CxChatDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.supportchat.thread.CxChatDuxo$resumeChat$1$2", m3645f = "CxChatDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.supportchat.thread.CxChatDuxo$resumeChat$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<CxChatDataState, Continuation<? super CxChatDataState>, Object> {
            private /* synthetic */ Object L$0;
            int label;

            AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CxChatDataState cxChatDataState, Continuation<? super CxChatDataState> continuation) {
                return ((AnonymousClass2) create(cxChatDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return CxChatDataState.copy$default((CxChatDataState) this.L$0, null, CxChatDataState.UploadStatus.None.INSTANCE, null, null, false, null, null, null, null, null, 1021, null);
            }
        }
    }

    public final void resumeChat(UUID inquiryId, String actionLocalId, ChatMode chatMode) {
        Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C291631(inquiryId, chatMode, actionLocalId, null), 3, null);
    }

    public final void sendChatbotCta(ChatMode chatMode, String actionId, String uiLocalId) {
        Intrinsics.checkNotNullParameter(chatMode, "chatMode");
        Intrinsics.checkNotNullParameter(actionId, "actionId");
        if (!(chatMode instanceof ChatMode.ChatbotChat)) {
            throw new IllegalArgumentException("Chatbot chat mode is required");
        }
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C291642(((ChatMode.ChatbotChat) chatMode).getConversationId(), actionId, uiLocalId, null), 3, null);
    }

    /* compiled from: CxChatDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.supportchat.thread.CxChatDuxo$sendChatbotCta$2", m3645f = "CxChatDuxo.kt", m3646l = {928}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.supportchat.thread.CxChatDuxo$sendChatbotCta$2 */
    static final class C291642 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $actionId;
        final /* synthetic */ UUID $conversationId;
        final /* synthetic */ String $uiLocalId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C291642(UUID uuid, String str, String str2, Continuation<? super C291642> continuation) {
            super(2, continuation);
            this.$conversationId = uuid;
            this.$actionId = str;
            this.$uiLocalId = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CxChatDuxo.this.new C291642(this.$conversationId, this.$actionId, this.$uiLocalId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C291642) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: CxChatDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/supportchat/thread/CxChatDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.supportchat.thread.CxChatDuxo$sendChatbotCta$2$1", m3645f = "CxChatDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.supportchat.thread.CxChatDuxo$sendChatbotCta$2$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CxChatDataState, Continuation<? super CxChatDataState>, Object> {
            final /* synthetic */ String $uiLocalId;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(String str, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$uiLocalId = str;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$uiLocalId, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CxChatDataState cxChatDataState, Continuation<? super CxChatDataState> continuation) {
                return ((AnonymousClass1) create(cxChatDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return CxChatDataState.copy$default((CxChatDataState) this.L$0, null, new CxChatDataState.UploadStatus.Action.SendCta(this.$uiLocalId), null, null, false, null, null, null, null, null, 1021, null);
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            CxChatDuxo cxChatDuxo;
            AnonymousClass2 anonymousClass2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                try {
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        CxChatDuxo.this.applyMutation(new AnonymousClass1(this.$uiLocalId, null));
                        ChatbotStore chatbotStore = CxChatDuxo.this.chatbotStore;
                        UUID uuid = this.$conversationId;
                        String str = this.$actionId;
                        this.label = 1;
                        if (chatbotStore.sendCta(uuid, str, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    cxChatDuxo = CxChatDuxo.this;
                    anonymousClass2 = new AnonymousClass2(null);
                } catch (Exception e) {
                    CxChatDuxo.showChatUpdateErrorAlertIfAvailable$default(CxChatDuxo.this, e, null, 1, null);
                    cxChatDuxo = CxChatDuxo.this;
                    anonymousClass2 = new AnonymousClass2(null);
                }
                cxChatDuxo.applyMutation(anonymousClass2);
                return Unit.INSTANCE;
            } catch (Throwable th) {
                CxChatDuxo.this.applyMutation(new AnonymousClass2(null));
                throw th;
            }
        }

        /* compiled from: CxChatDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/supportchat/thread/CxChatDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.supportchat.thread.CxChatDuxo$sendChatbotCta$2$2", m3645f = "CxChatDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.supportchat.thread.CxChatDuxo$sendChatbotCta$2$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<CxChatDataState, Continuation<? super CxChatDataState>, Object> {
            private /* synthetic */ Object L$0;
            int label;

            AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CxChatDataState cxChatDataState, Continuation<? super CxChatDataState> continuation) {
                return ((AnonymousClass2) create(cxChatDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return CxChatDataState.copy$default((CxChatDataState) this.L$0, null, CxChatDataState.UploadStatus.None.INSTANCE, null, null, false, null, null, null, null, null, 1021, null);
            }
        }
    }

    /* compiled from: CxChatDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.supportchat.thread.CxChatDuxo$escalateToAgent$1", m3645f = "CxChatDuxo.kt", m3646l = {953}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.supportchat.thread.CxChatDuxo$escalateToAgent$1 */
    static final class C291441 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $actionLocalId;
        final /* synthetic */ ChatMode $chatMode;
        final /* synthetic */ UUID $inquiryId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C291441(UUID uuid, ChatMode chatMode, String str, Continuation<? super C291441> continuation) {
            super(2, continuation);
            this.$inquiryId = uuid;
            this.$chatMode = chatMode;
            this.$actionLocalId = str;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CxChatDuxo.this.new C291441(this.$inquiryId, this.$chatMode, this.$actionLocalId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C291441) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: CxChatDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/supportchat/thread/CxChatDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.supportchat.thread.CxChatDuxo$escalateToAgent$1$1", m3645f = "CxChatDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.supportchat.thread.CxChatDuxo$escalateToAgent$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CxChatDataState, Continuation<? super CxChatDataState>, Object> {
            final /* synthetic */ String $actionLocalId;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(String str, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$actionLocalId = str;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$actionLocalId, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CxChatDataState cxChatDataState, Continuation<? super CxChatDataState> continuation) {
                return ((AnonymousClass1) create(cxChatDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return CxChatDataState.copy$default((CxChatDataState) this.L$0, null, new CxChatDataState.UploadStatus.Action.Escalate(this.$actionLocalId), null, null, false, null, null, null, null, null, 1021, null);
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            CxChatDuxo cxChatDuxo;
            AnonymousClass2 anonymousClass2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                try {
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        CxChatDuxo.this.applyMutation(new AnonymousClass1(this.$actionLocalId, null));
                        SupportChatStore supportChatStore = CxChatDuxo.this.supportChatStore;
                        UUID uuid = this.$inquiryId;
                        ChatMode chatMode = this.$chatMode;
                        ChatCurrentType chatCurrentType = chatMode != null ? chatMode.toChatCurrentType() : null;
                        this.label = 1;
                        if (supportChatStore.escalateToAgentChat(uuid, chatCurrentType, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    cxChatDuxo = CxChatDuxo.this;
                    anonymousClass2 = new AnonymousClass2(null);
                } catch (Exception e) {
                    CxChatDuxo.showChatUpdateErrorAlertIfAvailable$default(CxChatDuxo.this, e, null, 1, null);
                    cxChatDuxo = CxChatDuxo.this;
                    anonymousClass2 = new AnonymousClass2(null);
                }
                cxChatDuxo.applyMutation(anonymousClass2);
                return Unit.INSTANCE;
            } catch (Throwable th) {
                CxChatDuxo.this.applyMutation(new AnonymousClass2(null));
                throw th;
            }
        }

        /* compiled from: CxChatDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/supportchat/thread/CxChatDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.supportchat.thread.CxChatDuxo$escalateToAgent$1$2", m3645f = "CxChatDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.supportchat.thread.CxChatDuxo$escalateToAgent$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<CxChatDataState, Continuation<? super CxChatDataState>, Object> {
            private /* synthetic */ Object L$0;
            int label;

            AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CxChatDataState cxChatDataState, Continuation<? super CxChatDataState> continuation) {
                return ((AnonymousClass2) create(cxChatDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return CxChatDataState.copy$default((CxChatDataState) this.L$0, null, CxChatDataState.UploadStatus.None.INSTANCE, null, null, false, null, null, null, null, null, 1021, null);
            }
        }
    }

    public final void escalateToAgent(UUID inquiryId, String actionLocalId, ChatMode chatMode) {
        Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C291441(inquiryId, chatMode, actionLocalId, null), 3, null);
    }

    /* compiled from: CxChatDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.supportchat.thread.CxChatDuxo$onInputChanged$1", m3645f = "CxChatDuxo.kt", m3646l = {964}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.supportchat.thread.CxChatDuxo$onInputChanged$1 */
    static final class C291571 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $input;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C291571(String str, Continuation<? super C291571> continuation) {
            super(2, continuation);
            this.$input = str;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CxChatDuxo.this.new C291571(this.$input, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C291571) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                SharedFlow2 sharedFlow2 = CxChatDuxo.this.inputFlow;
                String str = this.$input;
                this.label = 1;
                if (sharedFlow2.emit(str, this) == coroutine_suspended) {
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

    public final void onInputChanged(String input) {
        Intrinsics.checkNotNullParameter(input, "input");
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C291571(input, null), 3, null);
    }

    /* compiled from: CxChatDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/supportchat/thread/CxChatDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.supportchat.thread.CxChatDuxo$openImageUploadBottomSheet$1", m3645f = "CxChatDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.supportchat.thread.CxChatDuxo$openImageUploadBottomSheet$1 */
    static final class C291601 extends ContinuationImpl7 implements Function2<CxChatDataState, Continuation<? super CxChatDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C291601(Continuation<? super C291601> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C291601 c291601 = new C291601(continuation);
            c291601.L$0 = obj;
            return c291601;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CxChatDataState cxChatDataState, Continuation<? super CxChatDataState> continuation) {
            return ((C291601) create(cxChatDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return CxChatDataState.copy$default((CxChatDataState) this.L$0, null, null, null, null, false, null, CxChatBottomSheetData.ImageUpload.INSTANCE, null, null, null, 959, null);
        }
    }

    public final void openImageUploadBottomSheet() {
        applyMutation(new C291601(null));
        submit(CxChatEvent.OpenBottomSheet.INSTANCE);
    }

    /* compiled from: CxChatDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/supportchat/thread/CxChatDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.supportchat.thread.CxChatDuxo$openResendBottomSheet$1", m3645f = "CxChatDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.supportchat.thread.CxChatDuxo$openResendBottomSheet$1 */
    static final class C291611 extends ContinuationImpl7 implements Function2<CxChatDataState, Continuation<? super CxChatDataState>, Object> {
        final /* synthetic */ String $conversationSid;
        final /* synthetic */ UiChatMessage.Regular $message;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C291611(String str, UiChatMessage.Regular regular, Continuation<? super C291611> continuation) {
            super(2, continuation);
            this.$conversationSid = str;
            this.$message = regular;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C291611 c291611 = new C291611(this.$conversationSid, this.$message, continuation);
            c291611.L$0 = obj;
            return c291611;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CxChatDataState cxChatDataState, Continuation<? super CxChatDataState> continuation) {
            return ((C291611) create(cxChatDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return CxChatDataState.copy$default((CxChatDataState) this.L$0, null, null, null, null, false, null, new CxChatBottomSheetData.ResendOptions(this.$conversationSid, this.$message), null, null, null, 959, null);
        }
    }

    public final void openResendBottomSheet(String conversationSid, UiChatMessage.Regular message) {
        Intrinsics.checkNotNullParameter(conversationSid, "conversationSid");
        Intrinsics.checkNotNullParameter(message, "message");
        applyMutation(new C291611(conversationSid, message, null));
        submit(CxChatEvent.OpenBottomSheet.INSTANCE);
    }

    /* compiled from: CxChatDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/supportchat/thread/CxChatDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.supportchat.thread.CxChatDuxo$dismissBottomSheet$1", m3645f = "CxChatDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.supportchat.thread.CxChatDuxo$dismissBottomSheet$1 */
    static final class C291411 extends ContinuationImpl7 implements Function2<CxChatDataState, Continuation<? super CxChatDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C291411(Continuation<? super C291411> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C291411 c291411 = new C291411(continuation);
            c291411.L$0 = obj;
            return c291411;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CxChatDataState cxChatDataState, Continuation<? super CxChatDataState> continuation) {
            return ((C291411) create(cxChatDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return CxChatDataState.copy$default((CxChatDataState) this.L$0, null, null, null, null, false, null, CxChatBottomSheetData.None.INSTANCE, null, null, null, 959, null);
        }
    }

    public final void dismissBottomSheet() {
        applyMutation(new C291411(null));
        submit(CxChatEvent.DismissBottomSheet.INSTANCE);
    }

    public final void openEndChatConfirmationDialog() {
        openDialog(CxChatDialogData.EndChat.INSTANCE);
    }

    public final void openCharacterLimitErrorDialog() {
        openDialog(CxChatDialogData.CharacterLimit.INSTANCE);
    }

    public final void openFileSizeLimitDialog(boolean fromImagePicker) {
        CxChatDialogData.ImageSizeLimit.Source source;
        if (fromImagePicker) {
            source = CxChatDialogData.ImageSizeLimit.Source.IMAGE_PICKER;
        } else {
            source = CxChatDialogData.ImageSizeLimit.Source.CAMERA;
        }
        openDialog(new CxChatDialogData.ImageSizeLimit(source));
    }

    public final void openCameraPermissionDialog() {
        openDialog(CxChatDialogData.CameraPermission.INSTANCE);
    }

    public final void openImageErrorDialog() {
        openDialog(CxChatDialogData.ImageError.INSTANCE);
    }

    public final void openPushPromptDialog() {
        openDialog(CxChatDialogData.PushPrompt.INSTANCE);
    }

    /* compiled from: CxChatDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/supportchat/thread/CxChatDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.supportchat.thread.CxChatDuxo$dismissDialog$1", m3645f = "CxChatDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.supportchat.thread.CxChatDuxo$dismissDialog$1 */
    static final class C291421 extends ContinuationImpl7 implements Function2<CxChatDataState, Continuation<? super CxChatDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C291421(Continuation<? super C291421> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C291421 c291421 = new C291421(continuation);
            c291421.L$0 = obj;
            return c291421;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CxChatDataState cxChatDataState, Continuation<? super CxChatDataState> continuation) {
            return ((C291421) create(cxChatDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return CxChatDataState.copy$default((CxChatDataState) this.L$0, null, null, null, null, false, null, null, CxChatDialogData.None.INSTANCE, null, null, 895, null);
        }
    }

    public final void dismissDialog() {
        applyMutation(new C291421(null));
        submit(CxChatEvent.DismissDialog.INSTANCE);
    }

    /* compiled from: CxChatDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/supportchat/thread/CxChatDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.supportchat.thread.CxChatDuxo$openDialog$1", m3645f = "CxChatDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.supportchat.thread.CxChatDuxo$openDialog$1 */
    static final class C291591 extends ContinuationImpl7 implements Function2<CxChatDataState, Continuation<? super CxChatDataState>, Object> {
        final /* synthetic */ CxChatDialogData $dialogData;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C291591(CxChatDialogData cxChatDialogData, Continuation<? super C291591> continuation) {
            super(2, continuation);
            this.$dialogData = cxChatDialogData;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C291591 c291591 = new C291591(this.$dialogData, continuation);
            c291591.L$0 = obj;
            return c291591;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CxChatDataState cxChatDataState, Continuation<? super CxChatDataState> continuation) {
            return ((C291591) create(cxChatDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return CxChatDataState.copy$default((CxChatDataState) this.L$0, null, null, null, null, false, null, null, this.$dialogData, null, null, 895, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void openDialog(CxChatDialogData dialogData) {
        applyMutation(new C291591(dialogData, null));
        submit(CxChatEvent.OpenDialog.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object uploadImageToIdenti(Bitmap bitmap, UUID uuid, Continuation<? super Unit> continuation) {
        C291701 c291701;
        if (continuation instanceof C291701) {
            c291701 = (C291701) continuation;
            int i = c291701.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c291701.label = i - Integer.MIN_VALUE;
            } else {
                c291701 = new C291701(continuation);
            }
        }
        C291701 c2917012 = c291701;
        Object obj = c2917012.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c2917012.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            submit(CxChatEvent.ShowImageProcessingIndicator.INSTANCE);
            String string2 = uuid.toString();
            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
            DocUploadApi docUploadApi = this.docUploadApi;
            RequestBody.Companion companion = RequestBody.INSTANCE;
            MediaTypes mediaTypes = MediaTypes.INSTANCE;
            RequestBody requestBodyCreate = companion.create(ChatImageUtils.IMG_REFERENCE_INSTANCE, mediaTypes.getTEXT_PLAIN());
            RequestBody requestBodyCreate2 = companion.create(string2, mediaTypes.getTEXT_PLAIN());
            ChatImageUtils chatImageUtils = ChatImageUtils.INSTANCE;
            List<MultipartBody.Part> listCreateThumbnailPart = chatImageUtils.createThumbnailPart(chatImageUtils.getTHUMBNAIL_SIZE_SET());
            MultipartBody.Part partCreateFileRequestBody = chatImageUtils.createFileRequestBody(bitmap);
            String strMo2745id = this.installation.mo2745id();
            c2917012.label = 1;
            if (docUploadApi.uploadGenericFile(requestBodyCreate2, requestBodyCreate, listCreateThumbnailPart, partCreateFileRequestBody, strMo2745id, c2917012) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        submit(CxChatEvent.HideImageProcessingIndicator.INSTANCE);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void handleOrThrow$default(final CxChatDuxo cxChatDuxo, Throwable th, Function0 function0, int i, Object obj) throws Throwable {
        if ((i & 1) != 0) {
            function0 = new Function0() { // from class: com.robinhood.android.supportchat.thread.CxChatDuxo$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return CxChatDuxo.handleOrThrow$lambda$5(this.f$0);
                }
            };
        }
        cxChatDuxo.handleOrThrow(th, function0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit handleOrThrow$lambda$5(CxChatDuxo cxChatDuxo) {
        cxChatDuxo.submit(CxChatEvent.GenericError.INSTANCE);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleOrThrow(Throwable th, Function0<Unit> function0) throws Throwable {
        Throwable th2;
        if (Throwables2.getShouldReport(th)) {
            th2 = th;
            CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, th2, true, null, 4, null);
        } else {
            th2 = th;
        }
        if (Throwables2.isHandleableException(th2)) {
            function0.invoke();
            return;
        }
        throw th2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void showChatUpdateErrorAlertIfAvailable$default(final CxChatDuxo cxChatDuxo, Throwable th, Function0 function0, int i, Object obj) throws Throwable {
        if ((i & 1) != 0) {
            function0 = new Function0() { // from class: com.robinhood.android.supportchat.thread.CxChatDuxo$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return CxChatDuxo.showChatUpdateErrorAlertIfAvailable$lambda$6(this.f$0);
                }
            };
        }
        cxChatDuxo.showChatUpdateErrorAlertIfAvailable(th, function0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showChatUpdateErrorAlertIfAvailable$lambda$6(CxChatDuxo cxChatDuxo) {
        cxChatDuxo.submit(CxChatEvent.GenericError.INSTANCE);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showChatUpdateErrorAlertIfAvailable(Throwable th, Function0<Unit> function0) throws Throwable {
        UpdateSupportChatError updateSupportChatErrorExtractChatUpdateAlert = Throwables2.extractChatUpdateAlert(th, this.errorResponseAdapter);
        if (updateSupportChatErrorExtractChatUpdateAlert != null) {
            openDialog(new CxChatDialogData.UpdateChatError(updateSupportChatErrorExtractChatUpdateAlert));
        } else {
            if (!Throwables2.isHandleableException(th)) {
                throw th;
            }
            function0.invoke();
        }
    }

    /* compiled from: CxChatDuxo.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0006\u001a\u00020\u00078\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\b\u0010\u0005R\u000e\u0010\t\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/supportchat/thread/CxChatDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/supportchat/thread/CxChatDuxo;", "Lcom/robinhood/shared/support/contracts/CxChatFragmentKey;", "<init>", "()V", "MESSAGE_NUM_PER_PAGE", "", "getMESSAGE_NUM_PER_PAGE$feature_support_chat_externalRelease$annotations", "KEY_INQUIRY_ID", "", "SIGNAL_TYPING_DEBOUNCE_THRESHOLD_MS", "", "CONCIERGE_EXISTING_LIVE_CASE_ERROR", "feature-support-chat_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<CxChatDuxo, CxChatFragmentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: getMESSAGE_NUM_PER_PAGE$feature_support_chat_externalRelease$annotations */
        public static /* synthetic */ void m2481xbc08299a() {
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public CxChatFragmentKey getArgs(SavedStateHandle savedStateHandle) {
            return (CxChatFragmentKey) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public CxChatFragmentKey getArgs(CxChatDuxo cxChatDuxo) {
            return (CxChatFragmentKey) DuxoCompanion.DefaultImpls.getArgs(this, cxChatDuxo);
        }
    }
}
