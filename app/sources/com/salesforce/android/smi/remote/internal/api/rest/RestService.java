package com.salesforce.android.smi.remote.internal.api.rest;

import com.adjust.sdk.network.ErrorCodes;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.salesforce.android.smi.common.api.Result;
import com.salesforce.android.smi.common.internal.util.Throttle;
import com.salesforce.android.smi.database.ConversationStore;
import com.salesforce.android.smi.database.DeviceRegistrationStore;
import com.salesforce.android.smi.network.api.rest.QueryDirection;
import com.salesforce.android.smi.network.data.domain.conversation.Conversation;
import com.salesforce.android.smi.network.data.domain.conversation.CoreConversation;
import com.salesforce.android.smi.network.data.domain.conversationEntry.ConversationEntry;
import com.salesforce.android.smi.network.data.domain.conversationEntry.ConversationEntryStatus;
import com.salesforce.android.smi.network.data.domain.conversationEntry.CoreConversationEntry;
import com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.ConversationEntryType;
import com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.EntryPayload;
import com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.EntryPayloadExt;
import com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.Message;
import com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.NetworkError;
import com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.message.component.attachment.FileAsset;
import com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.message.format.MessageFormat;
import com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.message.format.StaticContentFormat;
import com.salesforce.android.smi.network.data.domain.prechat.PreChatField;
import com.salesforce.android.smi.remote.internal.api.AbstractHttpService;
import com.salesforce.android.smi.remote.internal.api.authorization.AuthorizationService;
import com.salesforce.android.smi.remote.internal.api.rest.RestService;
import com.salesforce.android.smi.remote.internal.api.rest.interceptors.CreateConversationInterceptor;
import com.salesforce.android.smi.remote.internal.api.rest.interceptors.DeviceRegistrationInterceptor;
import com.salesforce.android.smi.remote.internal.api.rest.interceptors.RetryInterceptor;
import com.salesforce.android.smi.remote.internal.dto.request.ConversationsQuery;
import com.salesforce.android.smi.remote.internal.dto.request.CreateConversationRequest;
import com.salesforce.android.smi.remote.internal.dto.request.FileEntryRequest;
import com.salesforce.android.smi.remote.internal.dto.request.QueryConversationEntriesRequest;
import com.salesforce.android.smi.remote.internal.dto.request.QueryConversationsRequest;
import com.salesforce.android.smi.remote.internal.dto.request.RegisterDeviceRequest;
import com.salesforce.android.smi.remote.internal.dto.request.TypingStartedIndicatorRequest;
import com.salesforce.android.smi.remote.internal.dto.request.acknowledgement.AcknowledgementEntry;
import com.salesforce.android.smi.remote.internal.dto.request.acknowledgement.ReadAcknowledgeEntriesRequest;
import com.salesforce.android.smi.remote.internal.dto.response.ConversationEntriesQueryResponse;
import com.salesforce.android.smi.remote.internal.dto.response.ConversationEntrySerializedPayloadResponse;
import com.salesforce.android.smi.remote.internal.dto.response.InternalCoreConversation;
import com.salesforce.android.smi.remote.internal.util.FileUtils;
import com.salesforce.android.smi.remote.internal.util.LocaleUtil;
import com.squareup.moshi.JsonAdapter;
import java.io.File;
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
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
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.OkHttpClient;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.Response;
import retrofit2.converter.moshi.MoshiConverterFactory;

/* compiled from: RestService.kt */
@Metadata(m3635d1 = {"\u0000\u0092\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 x2\u00020\u0001:\u0001xBW\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J&\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0082@¢\u0006\u0004\b \u0010!J$\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\"0\r2\u0006\u0010\u0014\u001a\u00020\u0013H\u0082@¢\u0006\u0004\b#\u0010$J\u001b\u0010(\u001a\u00060&j\u0002`'2\u0006\u0010%\u001a\u00020\u0004H\u0002¢\u0006\u0004\b(\u0010)J=\u0010/\u001a\b\u0012\u0004\u0012\u00028\u00000.\"\u0004\b\u0000\u0010*2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e2\u0012\u0010-\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00028\u00000,H\u0002¢\u0006\u0004\b/\u00100J>\u00107\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u000206050.2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u00102\u001a\u0002012\n\b\u0002\u00104\u001a\u0004\u0018\u000103H\u0086@¢\u0006\u0004\b7\u00108JD\u0010<\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c050.2\u0006\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u00102\u001a\u0002012\n\b\u0002\u00109\u001a\u0004\u0018\u0001032\b\b\u0002\u0010;\u001a\u00020:H\u0086@¢\u0006\u0004\b<\u0010=J\u001e\u0010>\u001a\b\u0012\u0004\u0012\u0002060.2\u0006\u0010\u0014\u001a\u00020\u0013H\u0086@¢\u0006\u0004\b>\u0010$J\u001e\u0010?\u001a\b\u0012\u0004\u0012\u00020\u001c0.2\u0006\u0010\u001d\u001a\u00020\u001cH\u0086@¢\u0006\u0004\b?\u0010@J\u001e\u0010C\u001a\b\u0012\u0004\u0012\u00020B0.2\u0006\u0010A\u001a\u00020\u0004H\u0086@¢\u0006\u0004\bC\u0010DJ&\u0010G\u001a\b\u0012\u0004\u0012\u00020F0.2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010E\u001a\u00020\u0004H\u0086@¢\u0006\u0004\bG\u0010HJ&\u0010I\u001a\b\u0012\u0004\u0012\u00020F0.2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010E\u001a\u00020\u0004H\u0086@¢\u0006\u0004\bI\u0010HJ\u001e\u0010J\u001a\b\u0012\u0004\u0012\u00020F0.2\u0006\u0010\u0014\u001a\u00020\u0013H\u0086@¢\u0006\u0004\bJ\u0010$J\r\u0010K\u001a\u00020F¢\u0006\u0004\bK\u0010LJ\u0016\u0010M\u001a\b\u0012\u0004\u0012\u00020&0.H\u0086@¢\u0006\u0004\bM\u0010NJ\u0016\u0010O\u001a\b\u0012\u0004\u0012\u00020F0.H\u0086@¢\u0006\u0004\bO\u0010NJ\u0016\u0010P\u001a\b\u0012\u0004\u0012\u00020F0.H\u0086@¢\u0006\u0004\bP\u0010NR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010QR\u0014\u0010\u0006\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010QR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010RR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010SR \u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010TR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010UR\u001c\u0010X\u001a\n W*\u0004\u0018\u00010V0V8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010YR\u0014\u0010[\u001a\u00020Z8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b[\u0010\\R\u0014\u0010^\u001a\u00020]8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b^\u0010_R\u0014\u0010a\u001a\u00020`8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\ba\u0010bR\u0014\u0010d\u001a\u00020c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bd\u0010eR\u0014\u0010g\u001a\u00020f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bg\u0010hR\u001a\u0010k\u001a\b\u0012\u0004\u0012\u00020j0i8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bk\u0010lR8\u0010o\u001a&\u0012\f\u0012\n W*\u0004\u0018\u00010n0n W*\u0012\u0012\f\u0012\n W*\u0004\u0018\u00010n0n\u0018\u00010m0m8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bo\u0010pR \u0010r\u001a\u000e\u0012\u0004\u0012\u00020F\u0012\u0004\u0012\u00020F0q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\br\u0010sR \u0010u\u001a\u000e\u0012\u0004\u0012\u00020t\u0012\u0004\u0012\u00020F0q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bu\u0010sR\"\u0010w\u001a\u000e\u0012\u0004\u0012\u00020v\u0012\u0004\u0012\u00020F0q8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bw\u0010s¨\u0006y"}, m3636d2 = {"Lcom/salesforce/android/smi/remote/internal/api/rest/RestService;", "Lcom/salesforce/android/smi/remote/internal/api/AbstractHttpService;", "Ljava/net/URL;", "baseUrl", "", "channelAddressId", "developerName", "Lcom/salesforce/android/smi/database/DeviceRegistrationStore;", "deviceRegistrationStore", "Lcom/salesforce/android/smi/database/ConversationStore;", "conversationStore", "Lcom/salesforce/android/smi/remote/internal/api/authorization/AuthorizationService;", "authorizationService", "", "remoteLocaleMap", "Lkotlinx/coroutines/CoroutineDispatcher;", "ioDispatcher", "<init>", "(Ljava/net/URL;Ljava/lang/String;Ljava/lang/String;Lcom/salesforce/android/smi/database/DeviceRegistrationStore;Lcom/salesforce/android/smi/database/ConversationStore;Lcom/salesforce/android/smi/remote/internal/api/authorization/AuthorizationService;Ljava/util/Map;Lkotlinx/coroutines/CoroutineDispatcher;)V", "Ljava/util/UUID;", "conversationId", "Lcom/salesforce/android/smi/remote/internal/dto/response/ConversationEntrySerializedPayloadResponse;", "entryResponse", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/CoreConversationEntry;", "handleEntryPayload", "(Ljava/util/UUID;Lcom/salesforce/android/smi/remote/internal/dto/response/ConversationEntrySerializedPayloadResponse;)Lcom/salesforce/android/smi/network/data/domain/conversationEntry/CoreConversationEntry;", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/attachment/FileAsset;", "fileAsset", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/ConversationEntry;", "conversationEntry", "Lretrofit2/Response;", "Lokhttp3/ResponseBody;", "sendFileAttachment", "(Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/attachment/FileAsset;Lcom/salesforce/android/smi/network/data/domain/conversationEntry/ConversationEntry;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "getRoutingAttributes", "(Ljava/util/UUID;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deviceToken", "Lcom/salesforce/android/smi/remote/internal/dto/request/RegisterDeviceRequest;", "Lcom/salesforce/android/smi/remote/internal/dto/request/DeviceRegistration;", "mapDeviceTokenToRequest", "(Ljava/lang/String;)Lcom/salesforce/android/smi/remote/internal/dto/request/RegisterDeviceRequest;", "T", "response", "Lkotlin/Function1;", "success", "Lcom/salesforce/android/smi/common/api/Result;", "handleResponse", "(Lretrofit2/Response;Lkotlin/jvm/functions/Function1;)Lcom/salesforce/android/smi/common/api/Result;", "", "limit", "", "olderThanTimestamp", "", "Lcom/salesforce/android/smi/network/data/domain/conversation/Conversation;", "getConversations", "(Ljava/util/UUID;ILjava/lang/Long;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "timestamp", "Lcom/salesforce/android/smi/network/api/rest/QueryDirection;", "comparison", "getConversationEntries", "(Ljava/util/UUID;ILjava/lang/Long;Lcom/salesforce/android/smi/network/api/rest/QueryDirection;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createConversation", "sendMessage", "(Lcom/salesforce/android/smi/network/data/domain/conversationEntry/ConversationEntry;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "url", "Ljava/io/InputStream;", "fetchAttachment", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "conversationEntryId", "", "sendDeliveryAck", "(Ljava/util/UUID;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendReadAck", "sendTypingEvent", "resetTypingThrottle", "()V", "registerDevice", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deregisterDevice", "deviceRegistrationResult", "Ljava/lang/String;", "Lcom/salesforce/android/smi/database/DeviceRegistrationStore;", "Lcom/salesforce/android/smi/database/ConversationStore;", "Ljava/util/Map;", "Lkotlinx/coroutines/CoroutineDispatcher;", "Ljava/util/logging/Logger;", "kotlin.jvm.PlatformType", "logger", "Ljava/util/logging/Logger;", "Lcom/salesforce/android/smi/remote/internal/api/rest/interceptors/RetryInterceptor;", "retryInterceptor", "Lcom/salesforce/android/smi/remote/internal/api/rest/interceptors/RetryInterceptor;", "Lcom/salesforce/android/smi/remote/internal/api/rest/interceptors/DeviceRegistrationInterceptor;", "deviceRegistrationInterceptor", "Lcom/salesforce/android/smi/remote/internal/api/rest/interceptors/DeviceRegistrationInterceptor;", "Lcom/salesforce/android/smi/remote/internal/api/rest/interceptors/CreateConversationInterceptor;", "createConversationInterceptor", "Lcom/salesforce/android/smi/remote/internal/api/rest/interceptors/CreateConversationInterceptor;", "Lokhttp3/OkHttpClient;", "httpClient", "Lokhttp3/OkHttpClient;", "Lcom/salesforce/android/smi/remote/internal/api/rest/RestApi;", "api", "Lcom/salesforce/android/smi/remote/internal/api/rest/RestApi;", "", "Lcom/salesforce/android/smi/remote/internal/dto/request/acknowledgement/AcknowledgementEntry;", "deliveryAckList", "Ljava/util/List;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/EntryPayload;", "networkConversationEntryPayloadAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/salesforce/android/smi/common/internal/util/Throttle;", "sendDeliveryAckThrottled", "Lcom/salesforce/android/smi/common/internal/util/Throttle;", "Lcom/salesforce/android/smi/remote/internal/dto/request/acknowledgement/ReadAcknowledgeEntriesRequest;", "sendReadAckThrottled", "Lcom/salesforce/android/smi/remote/internal/dto/request/TypingStartedIndicatorRequest;", "sendTypingEventThrottled", "Companion", "remote_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class RestService extends AbstractHttpService {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String TAG = RestService.class.getName();
    private final RestApi api;
    private final String channelAddressId;
    private final ConversationStore conversationStore;
    private final CreateConversationInterceptor createConversationInterceptor;
    private final List<AcknowledgementEntry> deliveryAckList;
    private final String developerName;
    private final DeviceRegistrationInterceptor deviceRegistrationInterceptor;
    private final DeviceRegistrationStore deviceRegistrationStore;
    private final OkHttpClient httpClient;
    private final CoroutineDispatcher ioDispatcher;
    private final Logger logger;
    private final JsonAdapter<EntryPayload> networkConversationEntryPayloadAdapter;
    private final Map<String, String> remoteLocaleMap;
    private final RetryInterceptor retryInterceptor;
    private final Throttle<Unit, Unit> sendDeliveryAckThrottled;
    private final Throttle<ReadAcknowledgeEntriesRequest, Unit> sendReadAckThrottled;
    private Throttle<TypingStartedIndicatorRequest, Unit> sendTypingEventThrottled;

    /* compiled from: RestService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.salesforce.android.smi.remote.internal.api.rest.RestService", m3645f = "RestService.kt", m3646l = {351}, m3647m = "deviceRegistrationResult")
    /* renamed from: com.salesforce.android.smi.remote.internal.api.rest.RestService$deviceRegistrationResult$1 */
    static final class C423341 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C423341(Continuation<? super C423341> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestService.this.deviceRegistrationResult(this);
        }
    }

    /* compiled from: RestService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.salesforce.android.smi.remote.internal.api.rest.RestService", m3645f = "RestService.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_WARNING_EXIT_SPOT_SOLID_VALUE}, m3647m = "fetchAttachment")
    /* renamed from: com.salesforce.android.smi.remote.internal.api.rest.RestService$fetchAttachment$1 */
    static final class C423351 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C423351(Continuation<? super C423351> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestService.this.fetchAttachment(null, this);
        }
    }

    /* compiled from: RestService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.salesforce.android.smi.remote.internal.api.rest.RestService", m3645f = "RestService.kt", m3646l = {EnumC7081g.SDK_ASSET_HEADER_REPORT_SHARED_VALUE}, m3647m = "getRoutingAttributes")
    /* renamed from: com.salesforce.android.smi.remote.internal.api.rest.RestService$getRoutingAttributes$1 */
    static final class C423381 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C423381(Continuation<? super C423381> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestService.this.getRoutingAttributes(null, this);
        }
    }

    /* compiled from: RestService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.salesforce.android.smi.remote.internal.api.rest.RestService", m3645f = "RestService.kt", m3646l = {256}, m3647m = "sendFileAttachment")
    /* renamed from: com.salesforce.android.smi.remote.internal.api.rest.RestService$sendFileAttachment$1 */
    static final class C423411 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C423411(Continuation<? super C423411> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestService.this.sendFileAttachment(null, null, this);
        }
    }

    /* compiled from: RestService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.salesforce.android.smi.remote.internal.api.rest.RestService", m3645f = "RestService.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_BALANCE_BEAM_02_CIRCLE_VALUE}, m3647m = "sendMessage")
    /* renamed from: com.salesforce.android.smi.remote.internal.api.rest.RestService$sendMessage$1 */
    static final class C423421 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        C423421(Continuation<? super C423421> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestService.this.sendMessage(null, this);
        }
    }

    public /* synthetic */ RestService(URL url, String str, String str2, DeviceRegistrationStore deviceRegistrationStore, ConversationStore conversationStore, AuthorizationService authorizationService, Map map, CoroutineDispatcher coroutineDispatcher, DefaultConstructorMarker defaultConstructorMarker) {
        this(url, str, str2, deviceRegistrationStore, conversationStore, authorizationService, map, coroutineDispatcher);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ConversationEntry sendMessage$lambda$5(ConversationEntry conversationEntry, ResponseBody it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return conversationEntry;
    }

    private RestService(URL url, String str, String str2, DeviceRegistrationStore deviceRegistrationStore, ConversationStore conversationStore, AuthorizationService authorizationService, Map<String, String> map, CoroutineDispatcher coroutineDispatcher) throws SecurityException {
        this.channelAddressId = str;
        this.developerName = str2;
        this.deviceRegistrationStore = deviceRegistrationStore;
        this.conversationStore = conversationStore;
        this.remoteLocaleMap = map;
        this.ioDispatcher = coroutineDispatcher;
        this.logger = Logger.getLogger(TAG);
        RetryInterceptor retryInterceptorCreate$default = RetryInterceptor.Companion.create$default(RetryInterceptor.INSTANCE, 0, 0, 3, null);
        this.retryInterceptor = retryInterceptorCreate$default;
        DeviceRegistrationInterceptor deviceRegistrationInterceptorCreate = DeviceRegistrationInterceptor.INSTANCE.create(this);
        this.deviceRegistrationInterceptor = deviceRegistrationInterceptorCreate;
        CreateConversationInterceptor createConversationInterceptorCreate = CreateConversationInterceptor.INSTANCE.create(this);
        this.createConversationInterceptor = createConversationInterceptorCreate;
        OkHttpClient okHttpClientBuild = getOkHttpClientBuilder().addInterceptor(getLoggingInterceptor()).addInterceptor(authorizationService.getAuthorizationInterceptor()).addInterceptor(deviceRegistrationInterceptorCreate).addInterceptor(createConversationInterceptorCreate).addInterceptor(retryInterceptorCreate$default).build();
        this.httpClient = okHttpClientBuild;
        Object objCreate = getRetrofitBuilder().baseUrl(url).addConverterFactory(MoshiConverterFactory.create(getMoshi())).client(okHttpClientBuild).build().create(RestApi.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
        this.api = (RestApi) objCreate;
        this.deliveryAckList = new ArrayList();
        this.networkConversationEntryPayloadAdapter = getMoshi().adapter(EntryPayload.class);
        Throttle.Companion factory = Throttle.INSTANCE;
        this.sendDeliveryAckThrottled = factory.latest(1000L, new RestService2(this, null));
        this.sendReadAckThrottled = factory.latest(1000L, new RestService3(this, null));
        this.sendTypingEventThrottled = factory.first(4500L, new RestService4(this, null));
    }

    /* compiled from: RestService.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001*\u00020\u0004H\n"}, m3636d2 = {"<anonymous>", "Lcom/salesforce/android/smi/common/api/Result;", "", "Lcom/salesforce/android/smi/network/data/domain/conversation/CoreConversation;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.salesforce.android.smi.remote.internal.api.rest.RestService$getConversations$3", m3645f = "RestService.kt", m3646l = {107}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.salesforce.android.smi.remote.internal.api.rest.RestService$getConversations$3 */
    static final class C423373 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Result<? extends List<? extends CoreConversation>>>, Object> {
        final /* synthetic */ UUID $conversationId;
        final /* synthetic */ int $limit;
        final /* synthetic */ Long $olderThanTimestamp;
        Object L$0;
        int label;
        final /* synthetic */ RestService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C423373(UUID uuid, int i, RestService restService, Long l, Continuation<? super C423373> continuation) {
            super(2, continuation);
            this.$conversationId = uuid;
            this.$limit = i;
            this.this$0 = restService;
            this.$olderThanTimestamp = l;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C423373(this.$conversationId, this.$limit, this.this$0, this.$olderThanTimestamp, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends List<? extends CoreConversation>>> continuation) {
            return invoke2(coroutineScope, (Continuation<? super Result<? extends List<CoreConversation>>>) continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Result<? extends List<CoreConversation>>> continuation) {
            return ((C423373) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object objQueryConversations;
            QueryConversationsRequest queryConversationsRequest;
            List<InternalCoreConversation> conversations;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    int i2 = this.$conversationId != null ? 1 : this.$limit;
                    this.this$0.logger.log(Level.INFO, "Fetching conversations: " + this.$conversationId + ", " + this.$limit + ", " + this.$olderThanTimestamp);
                    QueryConversationsRequest queryConversationsRequest2 = new QueryConversationsRequest(i2, this.$conversationId, this.$olderThanTimestamp);
                    RestApi restApi = this.this$0.api;
                    this.L$0 = queryConversationsRequest2;
                    this.label = 1;
                    objQueryConversations = restApi.queryConversations(queryConversationsRequest2, this);
                    if (objQueryConversations == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    queryConversationsRequest = queryConversationsRequest2;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    queryConversationsRequest = (QueryConversationsRequest) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    objQueryConversations = obj;
                }
                ConversationsQuery conversationsQuery = (ConversationsQuery) objQueryConversations;
                this.this$0.logger.log(Level.INFO, "Response conversations: " + CollectionsKt.joinToString$default(conversationsQuery.getConversations(), null, null, null, 0, null, new Function1() { // from class: com.salesforce.android.smi.remote.internal.api.rest.RestService$getConversations$3$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return RestService.C423373.invokeSuspend$lambda$1((InternalCoreConversation) obj2);
                    }
                }, 31, null));
                if (queryConversationsRequest.getLimit() == 1) {
                    InternalCoreConversation internalCoreConversation = (InternalCoreConversation) CollectionsKt.firstOrNull((List) conversationsQuery.getConversations());
                    if (internalCoreConversation == null || (conversations = CollectionsKt.listOf(internalCoreConversation)) == null) {
                        conversations = CollectionsKt.emptyList();
                    }
                } else {
                    conversations = conversationsQuery.getConversations();
                }
                boolean zIsEmpty = conversations.isEmpty();
                if (zIsEmpty) {
                    return Result.Empty.INSTANCE;
                }
                if (zIsEmpty) {
                    throw new NoWhenBranchMatchedException();
                }
                List<InternalCoreConversation> list = conversations;
                RestService restService = this.this$0;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((InternalCoreConversation) it.next()).toCoreConversation$remote_release(restService.developerName));
                }
                return new Result.Success(arrayList);
            } catch (Exception e) {
                this.this$0.logger.log(Level.WARNING, "Response conversations: " + e.getMessage());
                return new Result.Error(e);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final CharSequence invokeSuspend$lambda$1(InternalCoreConversation internalCoreConversation) {
            String string2 = internalCoreConversation.getIdentifier().toString();
            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
            return string2;
        }
    }

    public final Object getConversations(UUID uuid, int i, Long l, Continuation<? super Result<? extends List<? extends Conversation>>> continuation) {
        return BuildersKt.withContext(this.ioDispatcher, new C423373(uuid, i, this, l, null), continuation);
    }

    /* compiled from: RestService.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001*\u00020\u0004H\n"}, m3636d2 = {"<anonymous>", "Lcom/salesforce/android/smi/common/api/Result;", "", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/ConversationEntry;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.salesforce.android.smi.remote.internal.api.rest.RestService$getConversationEntries$2", m3645f = "RestService.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_PERSON_VALUE}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.salesforce.android.smi.remote.internal.api.rest.RestService$getConversationEntries$2 */
    static final class C423362 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Result<? extends List<? extends ConversationEntry>>>, Object> {
        final /* synthetic */ QueryDirection $comparison;
        final /* synthetic */ UUID $conversationId;
        final /* synthetic */ int $limit;
        final /* synthetic */ Long $timestamp;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C423362(UUID uuid, int i, Long l, QueryDirection queryDirection, Continuation<? super C423362> continuation) {
            super(2, continuation);
            this.$conversationId = uuid;
            this.$limit = i;
            this.$timestamp = l;
            this.$comparison = queryDirection;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return RestService.this.new C423362(this.$conversationId, this.$limit, this.$timestamp, this.$comparison, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends List<? extends ConversationEntry>>> continuation) {
            return ((C423362) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Logger logger = RestService.this.logger;
                    Level level = Level.INFO;
                    logger.log(level, "Fetching conversationEntries: " + this.$conversationId + ", " + this.$limit + ", " + this.$timestamp + ", " + this.$comparison);
                    QueryConversationEntriesRequest queryConversationEntriesRequest = new QueryConversationEntriesRequest(this.$limit, null, this.$timestamp, this.$comparison, 2, null);
                    RestService.this.logger.log(level, queryConversationEntriesRequest.toString());
                    RestApi restApi = RestService.this.api;
                    UUID uuid = this.$conversationId;
                    this.label = 1;
                    obj = restApi.queryConversationEntries(queryConversationEntriesRequest, uuid, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                ConversationEntriesQueryResponse conversationEntriesQueryResponse = (ConversationEntriesQueryResponse) obj;
                RestService.this.logger.log(Level.INFO, "Response conversationEntries: " + CollectionsKt.joinToString$default(conversationEntriesQueryResponse.getConversationEntries(), null, null, null, 0, null, new Function1() { // from class: com.salesforce.android.smi.remote.internal.api.rest.RestService$getConversationEntries$2$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return RestService.C423362.invokeSuspend$lambda$0((ConversationEntrySerializedPayloadResponse) obj2);
                    }
                }, 31, null));
                List<ConversationEntrySerializedPayloadResponse> conversationEntries = conversationEntriesQueryResponse.getConversationEntries();
                ArrayList<ConversationEntrySerializedPayloadResponse> arrayList = new ArrayList();
                for (Object obj2 : conversationEntries) {
                    if (((ConversationEntrySerializedPayloadResponse) obj2).getEntryType() != ConversationEntryType.UnknownEntry) {
                        arrayList.add(obj2);
                    }
                }
                RestService restService = RestService.this;
                UUID uuid2 = this.$conversationId;
                ArrayList arrayList2 = new ArrayList();
                for (ConversationEntrySerializedPayloadResponse conversationEntrySerializedPayloadResponse : arrayList) {
                    restService.logger.log(Level.INFO, "Deserializing entry: " + conversationEntrySerializedPayloadResponse.getEntryType());
                    CoreConversationEntry coreConversationEntryHandleEntryPayload = restService.handleEntryPayload(uuid2, conversationEntrySerializedPayloadResponse);
                    if (coreConversationEntryHandleEntryPayload != null) {
                        arrayList2.add(coreConversationEntryHandleEntryPayload);
                    }
                }
                RestService.this.logger.log(Level.WARNING, "Returning result of size: " + arrayList2.size());
                return arrayList2.isEmpty() ? Result.Empty.INSTANCE : new Result.Success(arrayList2);
            } catch (Exception e) {
                RestService.this.logger.log(Level.WARNING, "Response conversationEntries: " + e.getMessage());
                return new Result.Error(e);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final CharSequence invokeSuspend$lambda$0(ConversationEntrySerializedPayloadResponse conversationEntrySerializedPayloadResponse) {
            return conversationEntrySerializedPayloadResponse.getEntryType().name();
        }
    }

    public final Object getConversationEntries(UUID uuid, int i, Long l, QueryDirection queryDirection, Continuation<? super Result<? extends List<? extends ConversationEntry>>> continuation) {
        return BuildersKt.withContext(this.ioDispatcher, new C423362(uuid, i, l, queryDirection, null), continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CoreConversationEntry handleEntryPayload(UUID conversationId, ConversationEntrySerializedPayloadResponse entryResponse) {
        try {
            EntryPayload entryPayloadFromJson = this.networkConversationEntryPayloadAdapter.fromJson(entryResponse.getPayload());
            if (entryPayloadFromJson == null) {
                return null;
            }
            this.logger.log(Level.INFO, "Deserializing payload for: " + entryResponse.getEntryType());
            if (entryPayloadFromJson instanceof EntryPayload.ParticipantChangedPayload) {
                EntryPayload.ParticipantChangedPayload participantChangedPayloadFilterInvalid = EntryPayloadExt.filterInvalid((EntryPayload.ParticipantChangedPayload) entryPayloadFromJson);
                if (participantChangedPayloadFilterInvalid != null) {
                    return entryResponse.toCoreConversationEntry$remote_release(conversationId, participantChangedPayloadFilterInvalid, ConversationEntryStatus.Delivered);
                }
                return null;
            }
            return entryResponse.toCoreConversationEntry$remote_release(conversationId, entryPayloadFromJson, ConversationEntryStatus.Delivered);
        } catch (Exception e) {
            this.logger.log(Level.WARNING, e.getMessage());
            return CoreConversationEntry.copy$default(entryResponse.toCoreConversationEntry$remote_release(conversationId, new EntryPayload.UnknownEntryPayload(entryResponse.getIdentifier()), ConversationEntryStatus.Delivered), null, null, null, null, ConversationEntryType.UnknownEntry, null, null, 0L, null, null, ErrorCodes.IO_EXCEPTION, null);
        }
    }

    /* compiled from: RestService.kt */
    @Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/salesforce/android/smi/common/api/Result;", "Lcom/salesforce/android/smi/network/data/domain/conversation/CoreConversation;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.salesforce.android.smi.remote.internal.api.rest.RestService$createConversation$2", m3645f = "RestService.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_ARROW_RIGHT_DOWN_VALUE, 200, 201}, m3647m = "invokeSuspend")
    /* renamed from: com.salesforce.android.smi.remote.internal.api.rest.RestService$createConversation$2 */
    static final class C423322 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Result<? extends CoreConversation>>, Object> {
        final /* synthetic */ UUID $conversationId;
        Object L$0;
        Object L$1;
        int label;
        final /* synthetic */ RestService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C423322(UUID uuid, RestService restService, Continuation<? super C423322> continuation) {
            super(2, continuation);
            this.$conversationId = uuid;
            this.this$0 = restService;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C423322(this.$conversationId, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends CoreConversation>> continuation) {
            return invoke2(coroutineScope, (Continuation<? super Result<CoreConversation>>) continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Result<CoreConversation>> continuation) {
            return ((C423322) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:29:0x0095  */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            UUID uuid;
            String str;
            CoreConversation coreConversation$remote_release;
            ConversationStore conversationStore;
            CoreConversation coreConversation;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    uuid = this.$conversationId;
                    str = this.this$0.channelAddressId;
                    RestService restService = this.this$0;
                    UUID uuid2 = this.$conversationId;
                    this.L$0 = uuid;
                    this.L$1 = str;
                    this.label = 1;
                    obj = restService.getRoutingAttributes(uuid2, this);
                    if (obj == coroutine_suspended) {
                    }
                    return coroutine_suspended;
                }
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        coreConversation = (CoreConversation) this.L$0;
                        ResultKt.throwOnFailure(obj);
                        return new Result.Success(coreConversation);
                    }
                    ResultKt.throwOnFailure(obj);
                    coreConversation$remote_release = ((InternalCoreConversation) obj).toCoreConversation$remote_release(this.this$0.developerName);
                    conversationStore = this.this$0.conversationStore;
                    this.L$0 = coreConversation$remote_release;
                    this.label = 3;
                    if (conversationStore.save(coreConversation$remote_release, this) != coroutine_suspended) {
                        coreConversation = coreConversation$remote_release;
                        return new Result.Success(coreConversation);
                    }
                    return coroutine_suspended;
                }
                str = (String) this.L$1;
                uuid = (UUID) this.L$0;
                ResultKt.throwOnFailure(obj);
                CreateConversationRequest createConversationRequest = new CreateConversationRequest(uuid, str, (Map) obj, LocaleUtil.getLanguageTagOrDefault$default(LocaleUtil.INSTANCE, this.this$0.remoteLocaleMap, null, 1, null));
                RestApi restApi = this.this$0.api;
                this.L$0 = null;
                this.L$1 = null;
                this.label = 2;
                obj = restApi.createConversation(createConversationRequest, this);
                if (obj != coroutine_suspended) {
                    coreConversation$remote_release = ((InternalCoreConversation) obj).toCoreConversation$remote_release(this.this$0.developerName);
                    conversationStore = this.this$0.conversationStore;
                    this.L$0 = coreConversation$remote_release;
                    this.label = 3;
                    if (conversationStore.save(coreConversation$remote_release, this) != coroutine_suspended) {
                    }
                }
                return coroutine_suspended;
            } catch (Exception e) {
                return new Result.Error(e);
            }
        }
    }

    public final Object createConversation(UUID uuid, Continuation<? super Result<? extends Conversation>> continuation) {
        return BuildersKt.withContext(this.ioDispatcher, new C423322(uuid, this, null), continuation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:56:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v2, types: [com.salesforce.android.smi.remote.internal.api.rest.RestService$sendMessage$1, kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object sendMessage(final ConversationEntry conversationEntry, Continuation<? super Result<? extends ConversationEntry>> continuation) throws Exception {
        RestService c423421;
        EntryPayload payload;
        RestService restService;
        ConversationEntry conversationEntry2;
        EntryPayload.MessagePayload messagePayload;
        RestService restService2;
        RestService restService3;
        Response<ResponseBody> response;
        if (continuation instanceof C423421) {
            C423421 c4234212 = (C423421) continuation;
            int i = c4234212.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c4234212.label = i - Integer.MIN_VALUE;
                c423421 = c4234212;
            } else {
                c423421 = new C423421(continuation);
            }
        }
        Object objSendMessage = c423421.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c423421.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objSendMessage);
                try {
                    payload = conversationEntry.getPayload();
                    if (payload instanceof EntryPayload.MessagePayload) {
                        ((EntryPayload.MessagePayload) payload).setNewMessagingSession(boxing.boxBoolean(conversationEntry.getError() instanceof NetworkError.ExpectationFailedError));
                        ((EntryPayload.MessagePayload) payload).setLanguage(LocaleUtil.getLanguageTagOrDefault$default(LocaleUtil.INSTANCE, this.remoteLocaleMap, null, 1, null));
                        if (Intrinsics.areEqual(((EntryPayload.MessagePayload) payload).getIsNewMessagingSession(), boxing.boxBoolean(true))) {
                            EntryPayload.MessagePayload messagePayload2 = (EntryPayload.MessagePayload) payload;
                            UUID conversationId = conversationEntry.getConversationId();
                            c423421.L$0 = this;
                            c423421.L$1 = conversationEntry;
                            c423421.L$2 = payload;
                            c423421.L$3 = messagePayload2;
                            c423421.label = 1;
                            Object routingAttributes = getRoutingAttributes(conversationId, c423421);
                            if (routingAttributes != coroutine_suspended) {
                                conversationEntry2 = conversationEntry;
                                messagePayload = messagePayload2;
                                objSendMessage = routingAttributes;
                                restService2 = this;
                                messagePayload.setRoutingAttributes((Map) objSendMessage);
                                conversationEntry = conversationEntry2;
                                restService = restService2;
                            }
                            return coroutine_suspended;
                        }
                        restService = this;
                    } else {
                        return new Result.Error(new Exception("Conversation Entry was not of type Message"));
                    }
                } catch (Exception e) {
                    e = e;
                    c423421 = this;
                    c423421.logger.log(Level.WARNING, "Send Message Failed: " + e.getMessage());
                    return new Result.Error(e);
                }
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        conversationEntry = (ConversationEntry) c423421.L$1;
                        restService3 = (RestService) c423421.L$0;
                        ResultKt.throwOnFailure(objSendMessage);
                        response = (Response) objSendMessage;
                        return restService3.handleResponse(response, new Function1() { // from class: com.salesforce.android.smi.remote.internal.api.rest.RestService$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return RestService.sendMessage$lambda$5(conversationEntry, (ResponseBody) obj);
                            }
                        });
                    }
                    conversationEntry = (ConversationEntry) c423421.L$1;
                    restService3 = (RestService) c423421.L$0;
                    ResultKt.throwOnFailure(objSendMessage);
                    response = (Response) objSendMessage;
                    if (response != null) {
                        return restService3.handleResponse(response, new Function1() { // from class: com.salesforce.android.smi.remote.internal.api.rest.RestService$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return RestService.sendMessage$lambda$5(conversationEntry, (ResponseBody) obj);
                            }
                        });
                    }
                    throw new Exception("Missing attachment file. Please send new attachment.");
                }
                messagePayload = (EntryPayload.MessagePayload) c423421.L$3;
                payload = (EntryPayload) c423421.L$2;
                conversationEntry2 = (ConversationEntry) c423421.L$1;
                RestService restService4 = (RestService) c423421.L$0;
                try {
                    ResultKt.throwOnFailure(objSendMessage);
                    restService2 = restService4;
                    messagePayload.setRoutingAttributes((Map) objSendMessage);
                    conversationEntry = conversationEntry2;
                    restService = restService2;
                } catch (Exception e2) {
                    e = e2;
                    c423421 = restService4;
                    c423421.logger.log(Level.WARNING, "Send Message Failed: " + e.getMessage());
                    return new Result.Error(e);
                }
            }
            MessageFormat content = ((EntryPayload.MessagePayload) payload).getAbstractMessage().getContent();
            if (content instanceof StaticContentFormat.AttachmentsFormat) {
                FileAsset fileAsset = (FileAsset) CollectionsKt.firstOrNull((List) ((StaticContentFormat.AttachmentsFormat) content).getAttachments());
                if (fileAsset != null) {
                    if (fileAsset.getFile() == null) {
                        fileAsset = null;
                    }
                    if (fileAsset != null) {
                        c423421.L$0 = restService;
                        c423421.L$1 = conversationEntry;
                        c423421.L$2 = null;
                        c423421.L$3 = null;
                        c423421.label = 2;
                        objSendMessage = restService.sendFileAttachment(fileAsset, conversationEntry, c423421);
                        if (objSendMessage != coroutine_suspended) {
                            restService3 = restService;
                            response = (Response) objSendMessage;
                            if (response != null) {
                            }
                            throw new Exception("Missing attachment file. Please send new attachment.");
                        }
                    }
                }
                throw new Exception("Missing attachment file. Please send new attachment.");
            }
            RestApi restApi = restService.api;
            Message abstractMessage = ((EntryPayload.MessagePayload) payload).getAbstractMessage();
            UUID conversationId2 = conversationEntry.getConversationId();
            c423421.L$0 = restService;
            c423421.L$1 = conversationEntry;
            c423421.L$2 = null;
            c423421.L$3 = null;
            c423421.label = 3;
            objSendMessage = restApi.sendMessage(abstractMessage, conversationId2, c423421);
            if (objSendMessage != coroutine_suspended) {
                restService3 = restService;
                response = (Response) objSendMessage;
                return restService3.handleResponse(response, new Function1() { // from class: com.salesforce.android.smi.remote.internal.api.rest.RestService$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return RestService.sendMessage$lambda$5(conversationEntry, (ResponseBody) obj);
                    }
                });
            }
            return coroutine_suspended;
        } catch (Exception e3) {
            e = e3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object sendFileAttachment(FileAsset fileAsset, ConversationEntry conversationEntry, Continuation<? super Response<ResponseBody>> continuation) throws Exception {
        C423411 c423411;
        if (continuation instanceof C423411) {
            c423411 = (C423411) continuation;
            int i = c423411.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c423411.label = i - Integer.MIN_VALUE;
            } else {
                c423411 = new C423411(continuation);
            }
        }
        Object objCreateFileAttachmentEntry = c423411.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c423411.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objCreateFileAttachmentEntry);
            EntryPayload payload = conversationEntry.getPayload();
            EntryPayload.MessagePayload messagePayload = payload instanceof EntryPayload.MessagePayload ? (EntryPayload.MessagePayload) payload : null;
            if (messagePayload != null) {
                byte[] fileToByteArray = FileUtils.INSTANCE.readFileToByteArray(fileAsset.getFile());
                if (fileToByteArray != null) {
                    String entryId = conversationEntry.getEntryId();
                    String id = fileAsset.getId();
                    String channelAddressIdentifier = messagePayload.getChannelAddressIdentifier();
                    MessageFormat content = messagePayload.getAbstractMessage().getContent();
                    StaticContentFormat.AttachmentsFormat attachmentsFormat = content instanceof StaticContentFormat.AttachmentsFormat ? (StaticContentFormat.AttachmentsFormat) content : null;
                    FileEntryRequest fileEntryRequest = new FileEntryRequest(entryId, id, channelAddressIdentifier, attachmentsFormat != null ? attachmentsFormat.getText() : null, null, messagePayload.getRoutingAttributes(), LocaleUtil.getLanguageTagOrDefault$default(LocaleUtil.INSTANCE, this.remoteLocaleMap, null, 1, null), messagePayload.getIsNewMessagingSession(), 16, null);
                    RestApi restApi = this.api;
                    RequestBody.Companion companion = RequestBody.INSTANCE;
                    String json = getMoshi().adapter(FileEntryRequest.class).toJson(fileEntryRequest);
                    Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
                    MediaType.Companion companion2 = MediaType.INSTANCE;
                    RequestBody requestBodyCreate = companion.create(json, companion2.parse("application/json"));
                    MultipartBody.Part.Companion companion3 = MultipartBody.Part.INSTANCE;
                    File file = fileAsset.getFile();
                    MultipartBody.Part partCreateFormData = companion3.createFormData("fileData", file != null ? file.getName() : null, RequestBody.Companion.create$default(companion, fileToByteArray, companion2.parse(fileAsset.getMimeType()), 0, 0, 6, (Object) null));
                    UUID conversationId = conversationEntry.getConversationId();
                    c423411.label = 1;
                    objCreateFileAttachmentEntry = restApi.createFileAttachmentEntry(requestBodyCreate, partCreateFormData, conversationId, c423411);
                    if (objCreateFileAttachmentEntry == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                throw new Exception("Cannot make request because file data is empty.");
            }
            throw new Exception("Conversation Entry was not of type Message");
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(objCreateFileAttachmentEntry);
        Response response = (Response) objCreateFileAttachmentEntry;
        if (response != null) {
            return response;
        }
        throw new Exception("Cannot make request because file data is empty.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getRoutingAttributes(UUID uuid, Continuation<? super Map<String, ? extends Object>> continuation) {
        C423381 c423381;
        List<PreChatField> listEmptyList;
        if (continuation instanceof C423381) {
            c423381 = (C423381) continuation;
            int i = c423381.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c423381.label = i - Integer.MIN_VALUE;
            } else {
                c423381 = new C423381(continuation);
            }
        }
        Object obj = c423381.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c423381.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            ConversationStore conversationStore = this.conversationStore;
            c423381.label = 1;
            obj = conversationStore.read(uuid, c423381);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        Conversation conversation = (Conversation) obj;
        if (conversation == null || (listEmptyList = conversation.getPreChatFields()) == null) {
            listEmptyList = CollectionsKt.emptyList();
        }
        List<PreChatField> list = listEmptyList;
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(list, 10)), 16));
        for (PreChatField preChatField : list) {
            Tuples2 tuples2M3642to = Tuples4.m3642to(preChatField.getName(), preChatField.getUserInput());
            linkedHashMap.put(tuples2M3642to.getFirst(), tuples2M3642to.getSecond());
        }
        return linkedHashMap;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object fetchAttachment(String str, Continuation<? super Result<? extends InputStream>> continuation) {
        C423351 c423351;
        RestService restService;
        RestService restService2;
        if (continuation instanceof C423351) {
            c423351 = (C423351) continuation;
            int i = c423351.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c423351.label = i - Integer.MIN_VALUE;
            } else {
                c423351 = new C423351(continuation);
            }
        }
        Object objFetchAttachment = c423351.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c423351.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objFetchAttachment);
            try {
                RestApi restApi = this.api;
                c423351.L$0 = this;
                c423351.L$1 = this;
                c423351.label = 1;
                objFetchAttachment = restApi.fetchAttachment(str, c423351);
                if (objFetchAttachment == coroutine_suspended) {
                    return coroutine_suspended;
                }
                restService2 = this;
                restService = restService2;
            } catch (Exception e) {
                e = e;
                restService = this;
                restService.logger.log(Level.WARNING, "Fetch Attachment Failed: " + e.getMessage());
                return new Result.Error(e);
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            restService2 = (RestService) c423351.L$1;
            restService = (RestService) c423351.L$0;
            try {
                ResultKt.throwOnFailure(objFetchAttachment);
            } catch (Exception e2) {
                e = e2;
                restService.logger.log(Level.WARNING, "Fetch Attachment Failed: " + e.getMessage());
                return new Result.Error(e);
            }
        }
        return restService2.handleResponse((Response) objFetchAttachment, new Function1() { // from class: com.salesforce.android.smi.remote.internal.api.rest.RestService$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RestService.fetchAttachment$lambda$9((ResponseBody) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InputStream fetchAttachment$lambda$9(ResponseBody it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.byteStream();
    }

    public final Object sendDeliveryAck(UUID uuid, String str, Continuation<? super Result<Unit>> continuation) {
        this.deliveryAckList.add(new AcknowledgementEntry(str, uuid));
        return this.sendDeliveryAckThrottled.async(Unit.INSTANCE, continuation);
    }

    public final Object sendReadAck(UUID uuid, String str, Continuation<? super Result<Unit>> continuation) {
        return this.sendReadAckThrottled.async(new ReadAcknowledgeEntriesRequest(str, uuid), continuation);
    }

    public final Object sendTypingEvent(UUID uuid, Continuation<? super Result<Unit>> continuation) {
        return this.sendTypingEventThrottled.async(new TypingStartedIndicatorRequest(uuid, null, null, 6, null), continuation);
    }

    public final void resetTypingThrottle() {
        this.sendTypingEventThrottled.reset();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final RegisterDeviceRequest mapDeviceTokenToRequest(String deviceToken) {
        boolean z = deviceToken.length() > 0;
        if (z) {
            return new RegisterDeviceRequest.RegisterPushNotificationsRequest(deviceToken, null, 2, null);
        }
        if (z) {
            throw new NoWhenBranchMatchedException();
        }
        return new RegisterDeviceRequest.RegisterCapabilitiesRequest(null, 1, null);
    }

    /* compiled from: RestService.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\f\u0012\b\u0012\u00060\u0002j\u0002`\u00030\u0001*\u00020\u0004H\n"}, m3636d2 = {"<anonymous>", "Lcom/salesforce/android/smi/common/api/Result;", "Lcom/salesforce/android/smi/remote/internal/dto/request/RegisterDeviceRequest;", "Lcom/salesforce/android/smi/remote/internal/dto/request/DeviceRegistration;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.salesforce.android.smi.remote.internal.api.rest.RestService$registerDevice$2", m3645f = "RestService.kt", m3646l = {EnumC7081g.SDK_ASSET_BANK_ICON_CIRCLE_LIGHT_VALUE, EnumC7081g.SDK_ASSET_ICON_CHECKMARK_WITH_CIRCLE_VALUE, EnumC7081g.SDK_ASSET_ICON_REPORT_VALUE, EnumC7081g.SDK_ASSET_ICON_UPLOAD_VALUE, EnumC7081g.SDK_ASSET_HEADER_CONNECT_WITH_PLAID_DARK_APPEARANCE_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.salesforce.android.smi.remote.internal.api.rest.RestService$registerDevice$2 */
    static final class C423392 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Result<? extends RegisterDeviceRequest>>, Object> {
        Object L$0;
        Object L$1;
        int label;

        C423392(Continuation<? super C423392> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return RestService.this.new C423392(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends RegisterDeviceRequest>> continuation) {
            return ((C423392) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:44:0x00b0  */
        /* JADX WARN: Removed duplicated region for block: B:45:0x00b1  */
        /* JADX WARN: Removed duplicated region for block: B:49:0x00c4  */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            RestService restService;
            RegisterDeviceRequest registerDeviceRequest;
            DeviceRegistrationStore deviceRegistrationStore;
            RestService restService2;
            DeviceRegistrationStore deviceRegistrationStore2;
            RegisterDeviceRequest registerDeviceRequest2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    DeviceRegistrationStore deviceRegistrationStore3 = RestService.this.deviceRegistrationStore;
                    this.label = 1;
                    obj = deviceRegistrationStore3.readUnregistered(this);
                    if (obj == coroutine_suspended) {
                    }
                    return coroutine_suspended;
                }
                if (i != 1) {
                    if (i != 2 && i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            registerDeviceRequest2 = (RegisterDeviceRequest) this.L$0;
                            ResultKt.throwOnFailure(obj);
                            return new Result.Success(registerDeviceRequest2);
                        }
                        registerDeviceRequest = (RegisterDeviceRequest) this.L$1;
                        restService2 = (RestService) this.L$0;
                        ResultKt.throwOnFailure(obj);
                        deviceRegistrationStore2 = restService2.deviceRegistrationStore;
                        this.L$0 = registerDeviceRequest;
                        this.L$1 = null;
                        this.label = 5;
                        if (deviceRegistrationStore2.updateCapabilityVersion(this) != coroutine_suspended) {
                        }
                        return coroutine_suspended;
                    }
                    registerDeviceRequest = (RegisterDeviceRequest) this.L$1;
                    restService = (RestService) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    deviceRegistrationStore = restService.deviceRegistrationStore;
                    this.L$0 = restService;
                    this.L$1 = registerDeviceRequest;
                    this.label = 4;
                    if (deviceRegistrationStore.updateStatusRegistered(this) != coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    restService2 = restService;
                    deviceRegistrationStore2 = restService2.deviceRegistrationStore;
                    this.L$0 = registerDeviceRequest;
                    this.L$1 = null;
                    this.label = 5;
                    if (deviceRegistrationStore2.updateCapabilityVersion(this) != coroutine_suspended) {
                        registerDeviceRequest2 = registerDeviceRequest;
                        return new Result.Success(registerDeviceRequest2);
                    }
                    return coroutine_suspended;
                }
                ResultKt.throwOnFailure(obj);
                String str = (String) obj;
                if (str != null) {
                    RestService restService3 = RestService.this;
                    RegisterDeviceRequest registerDeviceRequestMapDeviceTokenToRequest = restService3.mapDeviceTokenToRequest(str);
                    if (registerDeviceRequestMapDeviceTokenToRequest instanceof RegisterDeviceRequest.RegisterPushNotificationsRequest) {
                        this.L$0 = restService3;
                        this.L$1 = registerDeviceRequestMapDeviceTokenToRequest;
                        this.label = 2;
                        if (restService3.api.registerDevice((RegisterDeviceRequest.RegisterPushNotificationsRequest) registerDeviceRequestMapDeviceTokenToRequest, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        restService = restService3;
                        registerDeviceRequest = registerDeviceRequestMapDeviceTokenToRequest;
                    } else if (registerDeviceRequestMapDeviceTokenToRequest instanceof RegisterDeviceRequest.RegisterCapabilitiesRequest) {
                        this.L$0 = restService3;
                        this.L$1 = registerDeviceRequestMapDeviceTokenToRequest;
                        this.label = 3;
                        if (restService3.api.registerDeviceCapabilities((RegisterDeviceRequest.RegisterCapabilitiesRequest) registerDeviceRequestMapDeviceTokenToRequest, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        restService = restService3;
                        registerDeviceRequest = registerDeviceRequestMapDeviceTokenToRequest;
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                    deviceRegistrationStore = restService.deviceRegistrationStore;
                    this.L$0 = restService;
                    this.L$1 = registerDeviceRequest;
                    this.label = 4;
                    if (deviceRegistrationStore.updateStatusRegistered(this) != coroutine_suspended) {
                    }
                } else {
                    return Result.Empty.INSTANCE;
                }
            } catch (Exception e) {
                RestService.this.logger.log(Level.WARNING, e.getMessage());
                return new Result.Error(e);
            }
        }
    }

    public final Object registerDevice(Continuation<? super Result<? extends RegisterDeviceRequest>> continuation) {
        return BuildersKt.withContext(this.ioDispatcher, new C423392(null), continuation);
    }

    /* compiled from: RestService.kt */
    @Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/salesforce/android/smi/common/api/Result;", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.salesforce.android.smi.remote.internal.api.rest.RestService$deregisterDevice$2", m3645f = "RestService.kt", m3646l = {340, 341, 342}, m3647m = "invokeSuspend")
    /* renamed from: com.salesforce.android.smi.remote.internal.api.rest.RestService$deregisterDevice$2 */
    static final class C423332 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Result<? extends Unit>>, Object> {
        Object L$0;
        int label;

        C423332(Continuation<? super C423332> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return RestService.this.new C423332(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends Unit>> continuation) {
            return invoke2(coroutineScope, (Continuation<? super Result<Unit>>) continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Result<Unit>> continuation) {
            return ((C423332) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:27:0x0061, code lost:
        
            if (r6 != r0) goto L29;
         */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            RestService restService;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    DeviceRegistrationStore deviceRegistrationStore = RestService.this.deviceRegistrationStore;
                    String str = RestService.this.developerName;
                    this.label = 1;
                    obj = deviceRegistrationStore.read(str, this);
                    if (obj == coroutine_suspended) {
                    }
                    return coroutine_suspended;
                }
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        if (i != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        Result result = (Result) obj;
                        return result == null ? Result.Empty.INSTANCE : result;
                    }
                    restService = (RestService) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    this.L$0 = null;
                    this.label = 3;
                    obj = restService.deviceRegistrationResult(this);
                }
                if (((String) obj) != null) {
                    restService = RestService.this;
                    DeviceRegistrationStore deviceRegistrationStore2 = restService.deviceRegistrationStore;
                    this.L$0 = restService;
                    this.label = 2;
                    if (deviceRegistrationStore2.delete(this) != coroutine_suspended) {
                        this.L$0 = null;
                        this.label = 3;
                        obj = restService.deviceRegistrationResult(this);
                    }
                    return coroutine_suspended;
                }
            } catch (Exception e) {
                RestService.this.logger.log(Level.WARNING, e.getMessage());
                return new Result.Error(e);
            }
        }
    }

    public final Object deregisterDevice(Continuation<? super Result<Unit>> continuation) {
        return BuildersKt.withContext(this.ioDispatcher, new C423332(null), continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object deviceRegistrationResult(Continuation<? super Result<Unit>> continuation) {
        C423341 c423341;
        if (continuation instanceof C423341) {
            c423341 = (C423341) continuation;
            int i = c423341.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c423341.label = i - Integer.MIN_VALUE;
            } else {
                c423341 = new C423341(continuation);
            }
        }
        Object objRegisterDevice = c423341.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c423341.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objRegisterDevice);
            c423341.label = 1;
            objRegisterDevice = registerDevice(c423341);
            if (objRegisterDevice == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objRegisterDevice);
        }
        Result result = (Result) objRegisterDevice;
        if (result instanceof Result.Success) {
            return new Result.Success(Unit.INSTANCE);
        }
        Result.Empty empty = Result.Empty.INSTANCE;
        if (Intrinsics.areEqual(result, empty)) {
            return empty;
        }
        if (result instanceof Result.Error) {
            return new Result.Error(((Result.Error) result).getException());
        }
        Result.Loading loading = Result.Loading.INSTANCE;
        if (Intrinsics.areEqual(result, loading)) {
            return loading;
        }
        throw new NoWhenBranchMatchedException();
    }

    private final <T> Result<T> handleResponse(Response<ResponseBody> response, Function1<? super ResponseBody, ? extends T> success) {
        boolean zIsSuccessful = response.isSuccessful();
        if (zIsSuccessful) {
            ResponseBody responseBodyBody = response.body();
            return responseBodyBody != null ? new Result.Success(success.invoke(responseBodyBody)) : Result.Empty.INSTANCE;
        }
        if (zIsSuccessful) {
            throw new NoWhenBranchMatchedException();
        }
        return new Result.Error(NetworkError.INSTANCE.fromCode(convertErrorBody(response.errorBody()), Integer.valueOf(response.code())));
    }

    /* compiled from: RestService.kt */
    @Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JX\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u001cR\u0018\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u0005X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0007R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000¨\u0006\u001d"}, m3636d2 = {"Lcom/salesforce/android/smi/remote/internal/api/rest/RestService$Companion;", "", "<init>", "()V", "TAG", "", "kotlin.jvm.PlatformType", "Ljava/lang/String;", "CONTENT_TYPE_JSON", "FILE_DATA", "THROTTLE_DELAY_ACK", "", "THROTTLE_DELAY_TYPING", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/salesforce/android/smi/remote/internal/api/rest/RestService;", "baseUrl", "Ljava/net/URL;", "channelAddressId", "developerName", "deviceRegistrationStore", "Lcom/salesforce/android/smi/database/DeviceRegistrationStore;", "conversationStore", "Lcom/salesforce/android/smi/database/ConversationStore;", "authorizationService", "Lcom/salesforce/android/smi/remote/internal/api/authorization/AuthorizationService;", "remoteLocaleMap", "", "ioDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "remote_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public static /* synthetic */ RestService create$default(Companion companion, URL url, String str, String str2, DeviceRegistrationStore deviceRegistrationStore, ConversationStore conversationStore, AuthorizationService authorizationService, Map map, CoroutineDispatcher coroutineDispatcher, int i, Object obj) {
            if ((i & 2) != 0) {
                str = null;
            }
            return companion.create(url, str, str2, deviceRegistrationStore, conversationStore, authorizationService, map, (i & 128) != 0 ? Dispatchers.getIO() : coroutineDispatcher);
        }

        public final RestService create(URL baseUrl, String channelAddressId, String developerName, DeviceRegistrationStore deviceRegistrationStore, ConversationStore conversationStore, AuthorizationService authorizationService, Map<String, String> remoteLocaleMap, CoroutineDispatcher ioDispatcher) {
            Intrinsics.checkNotNullParameter(baseUrl, "baseUrl");
            Intrinsics.checkNotNullParameter(developerName, "developerName");
            Intrinsics.checkNotNullParameter(deviceRegistrationStore, "deviceRegistrationStore");
            Intrinsics.checkNotNullParameter(conversationStore, "conversationStore");
            Intrinsics.checkNotNullParameter(authorizationService, "authorizationService");
            Intrinsics.checkNotNullParameter(remoteLocaleMap, "remoteLocaleMap");
            Intrinsics.checkNotNullParameter(ioDispatcher, "ioDispatcher");
            return new RestService(baseUrl, channelAddressId, developerName, deviceRegistrationStore, conversationStore, authorizationService, remoteLocaleMap, ioDispatcher, null);
        }
    }
}
